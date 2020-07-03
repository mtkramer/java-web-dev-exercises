package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;
import static org.junit.Assert.*;

public class CarTest {

    Car test_car = new Car("Toyota", "Prius", 10, 50);

    @Test
    public void emptyTest(){
        assertEquals(10,10,.001);
    }
    @Test
    public void testInitialGasTank() {
        assertEquals(10, test_car.getGasTankLevel(), .001);
    }
    @Test
    public void testInitialGasTankIsLow(){
        assertFalse(test_car.getGasTankLevel() < 10);
    }
    @Test
    public void testInitialGasTankNotEmpty(){
        assertTrue(test_car.getGasTankLevel() > 0);
    }
    @Test
    public void testTankAfterDrivingWithinRange(){
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), .001);
    }
    @Test
    public void testTankAfterDrivingOutOfRange(){
        test_car.drive(501);
        assertFalse(test_car.getGasTankLevel() != 0.0);
    }
    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException() {
        test_car.addGas(5);
        fail("Shouldn't get here, car cannot have more gas in tank than the size of the tank");
    }

}
