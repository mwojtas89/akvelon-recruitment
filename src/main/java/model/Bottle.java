package model;

import controller.NotEnoughCapacityException;

public class Bottle implements Supplier{
    private double capacity;
    private double volume;
    private String name;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getCapacity() {
        return capacity;
    }

    @Override
    public double getVolume() {
        return volume;
    }

    @Override
    public void setCapacity(double capacity) {
        this.capacity=capacity;
    }

    @Override
    public void setVolume(double volume) throws NotEnoughCapacityException {
        if(capacity<volume) {
            throw new NotEnoughCapacityException();
        }
        this.volume=volume;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }
}
