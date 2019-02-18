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

public class CoffeeMakerTestsAnswer {
    private CoffeeMaker coffeeMaker;
    private InOrder orderVerifier;


    @Mock
    CoffeeGrinder mockCoffeeGrinder;

    @Mock
    CoffeeMachine mockCoffeeMachine;

    @Before
    public void setUp() {
        // arrange - this set up will create mocks for each test
        MockitoAnnotations.initMocks(this);
        coffeeMaker = new CoffeeMaker(mockCoffeeGrinder, mockCoffeeMachine);
        orderVerifier = inOrder(mockCoffeeGrinder, mockCoffeeMachine);
    }


    @Test
    public void MakeCoffee_ShouldCallGrindBeans() {
        // simple test - check that grind beans is called
        // act
        coffeeMaker.makeCoffee();
        // assert
        verify(mockCoffeeGrinder, times(1)).grindBeans();
    }

    @Test
    public void MakeCoffee_ShouldCallCoffeeMethodsInCorrectOrder() {
        // more complex test to test all methods in order
        // act
        coffeeMaker.makeCoffee();
        // assert
        orderVerifier.verify(mockCoffeeGrinder, times(1)).grindBeans();
        orderVerifier.verify(mockCoffeeMachine, times(1)).addGroundsToFilter();
        orderVerifier.verify(mockCoffeeMachine, times(1)).boilWater();
        orderVerifier.verify(mockCoffeeMachine, times(1)).pourWaterThroughFilterIntoCup();
    }
}
