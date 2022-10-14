package controller;

import model.Bottle;
import model.Consumer;
import model.Man;
import model.Supplier;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import viewer.DrinkingViewer;

import static org.junit.jupiter.api.Assertions.*;

class DrinkingControllerTest {

    @Test
    void drinkLiquid() {
        //Given
        Consumer man = new Man();
        Supplier bottle = new Bottle();
        DrinkingViewer dv = new DrinkingViewer();

        man.setName("Mateusz");
        man.setCapacity(10);
        try {
            man.setVolume(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        bottle.setName("CocaCola");
        bottle.setCapacity(2);
        try {
            bottle.setVolume(2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //When
        DrinkingController dc = new DrinkingController(man, bottle, dv);
        try {
            dc.drinkLiquid(2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //Then
        Assertions.assertEquals(0, bottle.getVolume());
        Assertions.assertEquals(3, man.getVolume());
    }

    @Test
    void shouldThrowNotEnoughtCapacityException () {
        //Given
        Consumer man = new Man();
        Supplier bottle = new Bottle();
        man.setCapacity(2);
        bottle.setCapacity(2);
        //When&Then
        try {
            man.setVolume(3);
        } catch (Exception e) {
            Assertions.assertEquals(NotEnoughCapacityException.class, e.getClass());
        }
        try {
            bottle.setVolume(3);
        } catch (Exception e) {
            Assertions.assertEquals(NotEnoughCapacityException.class, e.getClass());
        }
    }

    @Test
    void shouldThrowNotEnoughLiquidException () {
        //Given
        Consumer man = new Man();
        Supplier bottle = new Bottle();
        DrinkingViewer dv = new DrinkingViewer();


        man.setCapacity(10);
        bottle.setCapacity(3);
        try {
            bottle.setVolume(3);
        } catch (Exception e){

        }
        //When & Then
        DrinkingController dc = new DrinkingController(man, bottle, dv);
        try {
            dc.drinkLiquid(4);
        } catch (Exception e) {
            Assertions.assertEquals(NotEnoughLiquidException.class, e.getClass());
        }
    }

    @Test
    void shouldThrowNegativeLiquidException () {
        //Given
        Consumer man = new Man();
        Supplier bottle = new Bottle();
        DrinkingViewer dv = new DrinkingViewer();

        //When & Then
        DrinkingController dc = new DrinkingController(man, bottle, dv);
        try {
            dc.drinkLiquid(-2);
        } catch (Exception e) {
            Assertions.assertEquals(NegativeLiquidToBeDrinkException.class, e.getClass());
        }
    }
}