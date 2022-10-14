package model;

import controller.NotEnoughCapacityException;

public class Man implements Consumer{
    private double capacity;                  //capacity in litres
    private double volume;
    private double capacityLeft;
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
        this.capacityLeft=capacity;
    }

    @Override
    public void setVolume(double volume) throws NotEnoughCapacityException {
        if (capacity<volume) {
            throw new NotEnoughCapacityException();
        }
        this.volume=volume;
        this.capacityLeft=capacity-volume;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public double getCapacityLeft() {
        return capacityLeft;
    }
}
