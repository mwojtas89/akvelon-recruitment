package controller;

public class NotEnoughLiquidException extends Exception{
    @Override
    public String getMessage() {
        return "There is not enough liquid";
    }
}
