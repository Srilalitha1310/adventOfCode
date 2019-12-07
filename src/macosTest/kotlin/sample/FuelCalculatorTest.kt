package sample

import kotlin.test.Test
import kotlin.test.assertEquals

class FuelCalculatorTest {

    @Test
    fun shouldCalculateFuelFromGivenMass() {
        var mass = 12
        val expected = 2
        val actual = calculateFuel(mass)
        assertEquals(expected, actual)
    }

    @Test
    fun shouldCalculateFuelForTheGivenMass14() {
        var mass = 14
        val expected = 2
        val actual = calculateFuel(mass)
        assertEquals(expected, actual)
    }

    @Test
    fun shouldCalculateFuelForTheGivenMass1969() {
        var mass = 1969
        val expected = 654
        val actual = calculateFuel(mass)
        assertEquals(expected, actual)
    }

    @Test
    fun shouldCalculateFuelForTheGivenMass100756() {
        var mass = 100756
        val expected = 33583
        val actual = calculateFuel(mass)
        assertEquals(expected, actual)
    }

    @Test
    fun shouldCalculateFuelForTheGivenMass142388() {
        var mass = 142388
        val expected = 47460
        val actual = calculateFuel(mass)
        assertEquals(expected, actual)
    }

    @Test
    fun shouldCalculateRecurrentFuelForTheGivenMass14() {
        var mass = 14
        val expected = 2
        val actual = calculateRecurrentFuel(mass)
        print(actual)
        assertEquals(expected, actual)
    }

    @Test
    fun shouldCalculateRecurrentFuelForTheGivenMass1969() {
        sum = 0
        var mass = 1969
        val expected = 966
        val actual = calculateRecurrentFuel(mass)
        print(actual)
        assertEquals(expected, actual)
    }

    @Test
    fun shouldCalculateRecurrentFuelForTheGivenMass100756() {
        sum = 0
        var mass = 100756
        val expected = 50346
        val actual = calculateRecurrentFuel(mass)
        print(actual)
        assertEquals(expected, actual)
    }
}
