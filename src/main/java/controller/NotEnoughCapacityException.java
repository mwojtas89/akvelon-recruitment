package controller;

public class NotEnoughCapacityException extends Exception{
    @Override
    public String getMessage() {
        return "Not enough capacity to drink providen amount of liquid";
    }
}
