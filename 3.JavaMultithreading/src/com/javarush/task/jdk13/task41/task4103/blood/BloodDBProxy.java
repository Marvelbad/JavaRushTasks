package com.javarush.task.jdk13.task41.task4103.blood;

import com.javarush.task.jdk13.task41.task4103.security.SecuritySystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class BloodDBProxy implements DB {
    private final SecuritySystem security;
    private BloodDB db;
    private final BloodSample denied = new BloodSample(0, "access", "denied", null, null, null);

    //Caching for id
    private final Map<Integer, BloodSample> cachedById = new HashMap<>();

    //Caching for requests
    private final Map<String, List<BloodSample>> cachedByRequestMap = new HashMap<>();

    public BloodDBProxy() {
        security = new SecuritySystem();

        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        String password = scanner.nextLine();

        security.authorize(login, password);
        if (security.isAuthorized()) {
            db = new BloodDB();
        } else {
            System.out.println("Wrong login or password");
        }
    }


    @Override
    public BloodSample getById(int id) {
        if (security.isAuthorized()) {
            return db.getById(id);
        } else {
            return denied;
        }
    }

    @Override
    public List<BloodSample> find(String request) {
        if (security.isAuthorized()) {
            return db.find(request);
        } else {
            return List.of(denied);
        }
    }

    //Caching method for id
    public BloodSample getByIdCache(int id) {
        if (!security.isAuthorized()) {
            return denied;
        }
        if (cachedById.containsKey(id)) {
            return cachedById.get(id);
        }
        BloodSample sample = db.getById(id);
        cachedById.put(id, sample);
        return sample;
    }

    //Caching method for request
    public List<BloodSample> findWithCache(String request) {
        if (!security.isAuthorized()) {
            return List.of(denied);
        }
        if (cachedByRequestMap.containsKey(request)) {
            return cachedByRequestMap.get(request);
        }
        List<BloodSample> result = db.find(request);
        cachedByRequestMap.put(request, result);
        return result;
    }
}