package model;

public interface Supplier {
    String getName();
    double getCapacity();
    double getVolume();
    void setCapacity(double capacity);
    void setVolume(double volume);
    void setName(String name);
}

