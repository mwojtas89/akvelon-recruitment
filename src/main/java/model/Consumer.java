package model;

import controller.NotEnoughCapacityException;

public interface Consumer {
    String getName();
    double getCapacity();
    double getVolume();
    double getCapacityLeft();
    void setCapacity(double capacity);
    void setVolume(double volume) throws NotEnoughCapacityException;
    void setName(String name);

}
