package model;

public interface Consumer {
    String getName();
    double getCapacity();
    double getVolume();
    double getCapacityLeft();
    void setCapacity(double capacity);
    void setVolume(double volume);
    void setName(String name);

}
