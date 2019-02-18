package exercise1.src;

public class CoffeeMaker {
    private CoffeeGrinder coffeeGrinder;
    private CoffeeMachine coffeeMachine;

    public CoffeeMaker(CoffeeGrinder coffeeGrinder, CoffeeMachine coffeeMachine) {
        this.coffeeGrinder = coffeeGrinder;
        this.coffeeMachine = coffeeMachine;
    }

    public void makeCoffee(){
        // don't kill me I don't drink coffee!
        coffeeGrinder.grindBeans();
        coffeeMachine.addGroundsToFilter();
        coffeeMachine.boilWater();
        coffeeMachine.pourWaterThroughFilterIntoCup();
    }
}
