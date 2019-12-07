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
}
