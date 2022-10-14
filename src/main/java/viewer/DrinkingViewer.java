package viewer;

public class DrinkingViewer {

    public void printDrinkingDetails (String drinkerName, String supplierName, double capacityOfDrinker,
                                      double volumeOfLiquid) {
        System.out.println("Drinker : " + drinkerName + " have capacity to drink : " + capacityOfDrinker );
        System.out.println("Supplier : " + supplierName + " have volume of liquid to be drinked :" + volumeOfLiquid);
    }
}
