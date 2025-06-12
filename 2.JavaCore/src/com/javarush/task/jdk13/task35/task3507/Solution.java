package com.javarush.task.jdk13.task35.task3507;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/* 
Collections & Generics
*/

public class Solution {

    public static void main(String[] args) {
        HashMap<Object, Integer> map = newHashMap(newArrayList("first", "second"), newArrayList(1, 2));
        System.out.println(map);

        HashMap<String, Integer> hashMap = newHashMap(new ArrayList<>(newHashSet("first", "second")), new ArrayList<>(newHashSet(1, 2)));
        System.out.println(hashMap);
    }

    public static <T> ArrayList<T> newArrayList(T... elements) {
        return new ArrayList<>(Arrays.asList(elements));
    }

    public static <T> HashSet<T> newHashSet(T... elements) {
        return new HashSet<>(Arrays.asList(elements));
    }

    public static <K, V> HashMap<K, V> newHashMap(List<? extends K> keys, List<? extends V> values) {
        HashMap<K, V> result = new HashMap<>();
        if (keys.size() != values.size()) {
            throw new IllegalArgumentException("Error");
        }
        for (int i = 0; i < keys.size(); i++) {
            result.put(keys.get(i), values.get(i));
        }
        return result;
    }

    public static <K, V> HashMap<K, V> newHashmapStreamApi(List<? extends K> keys, List<? extends V> values) {
        if (keys.size() != values.size()) {
            throw new IllegalArgumentException("Error");
        }
        return IntStream.range(0, keys.size())
                .boxed()
                .collect(Collectors.toMap(
                        keys::get,
                        values::get,
                        (v1, v2) -> v1, //если встретишь одинаковый ключ, оставь первое значение (v1), второе (v2) — проигнорируй
                        HashMap::new
                ));
    }
}