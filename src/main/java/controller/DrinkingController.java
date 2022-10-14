package controller;

import model.Consumer;
import model.Supplier;
import viewer.DrinkingViewer;

public class DrinkingController {
    Consumer man;
    Supplier bottle;
    DrinkingViewer viewer;

    public DrinkingController(Consumer man, Supplier bottle, DrinkingViewer viewer) {
        this.man = man;
        this.bottle = bottle;
        this.viewer = viewer;
    }

    public void drinkLiquid (double liquidToBeDrinkFromBottle) throws NotEnoughLiquidException, NotEnoughCapacityException,
            NegativeLiquidToBeDrinkException {
        if (liquidToBeDrinkFromBottle>bottle.getVolume()) {
            throw new NotEnoughLiquidException();
        } else if (liquidToBeDrinkFromBottle>man.getCapacityLeft()) {
            throw new NotEnoughCapacityException();
        } else if (liquidToBeDrinkFromBottle<0) {
            throw new NegativeLiquidToBeDrinkException();
        }
        bottle.setVolume(bottle.getVolume()-liquidToBeDrinkFromBottle);
        man.setVolume(man.getVolume()+liquidToBeDrinkFromBottle);
    }

    public void updateView () {
        viewer.printDrinkingDetails(man.getName(), bottle.getName(), man.getCapacityLeft(), bottle.getVolume());
    }

}
