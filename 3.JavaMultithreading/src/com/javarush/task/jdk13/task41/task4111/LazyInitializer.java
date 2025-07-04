package com.javarush.task.jdk13.task41.task4111;

public class LazyInitializer implements Entity {
    private int id;
    private VeryHeavyEntity entity;

    public LazyInitializer(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String find(String query) {
        if (entity == null) {
            entity = VeryHeavyEntity.load(id);
        }
        return entity.find(query);
    }
}
