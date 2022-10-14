package controller;

public class NegativeLiquidToBeDrinkException extends Exception{
    @Override
    public String getMessage() {
        return "Please provide not negative amount of liquid to be drinked";
    }
}
