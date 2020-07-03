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


    //TODO: gasTankLevel is accurate after driving within tank range
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception

}
