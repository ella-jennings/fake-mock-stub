package Exercise1Test;
import Exercise1.CoffeeGrinder;
import Exercise1.CoffeeMaker;
import org.junit.Test;
import org.mockito.InOrder;

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
