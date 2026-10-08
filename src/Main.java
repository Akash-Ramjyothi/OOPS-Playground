public class Main {
    public static void main(String[] args) {
        SmartKitchen kitchen = new SmartKitchen();

        kitchen.getDishWasher().setHasWorkToDo();
        kitchen.getDishWasher().doDishes();
        kitchen.getIceBox().orderFood();
        kitchen.getBrewMaster().brewCoffee();
    }
}