package model;

import controller.NotEnoughCapacityException;

public interface Supplier {
    String getName();
    double getCapacity();
    double getVolume();
    void setCapacity(double capacity);
    void setVolume(double volume) throws NotEnoughCapacityException;
    void setName(String name);
}

