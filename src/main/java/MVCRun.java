import controller.DrinkingController;
import model.Bottle;
import model.Consumer;
import model.Man;
import model.Supplier;
import viewer.DrinkingViewer;

public class MVCRun {
    public static void main(String[] args) {
        Consumer man = retriveManFromDatabase();
        Supplier bottle = retriveBottleFromDatabase();
        DrinkingViewer viewer = new DrinkingViewer();

        DrinkingController dk = new DrinkingController(man, bottle, viewer);
        dk.updateView();
        try {
            dk.drinkLiquid(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        dk.updateView();


    }

    public static Consumer retriveManFromDatabase () {
        Consumer man = new Man();
        man.setName("Mateusz");
        man.setCapacity(2);
        try {
            man.setVolume(1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return man;
    }

    public static Supplier retriveBottleFromDatabase () {
        Supplier bottle = new Bottle();
        bottle.setName("CocaCola");
        bottle.setCapacity(2);
        try {
            bottle.setVolume(2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return bottle;
    }
}
