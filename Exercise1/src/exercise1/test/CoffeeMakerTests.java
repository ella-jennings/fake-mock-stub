package exercise1.test;
import exercise1.src.CoffeeGrinder;
import exercise1.src.CoffeeMachine;
import exercise1.src.CoffeeMaker;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

public class CoffeeMakerTests {
    private CoffeeMaker coffeeMaker;
    private InOrder orderVerifier;



    @Test
    public void MakeCoffee_ShouldCallGrindBeans() {
        // simple test - check that grind beans is called
        // arrange
        // act
        // assert
    }

    @Test
    public void MakeCoffee_ShouldCallCoffeeMethodsInCorrectOrder() {
        // more complex test to test all methods in order
        // arrange
        // act
        // assert
    }
}
