package sample

import kotlin.test.Test
import kotlin.test.assertEquals

class IntCodeProgramTest {

    @Test
    fun shouldAddTheFirstSecondPlacesAndPlaceItInThirdPlaceIfOpcodeIs1() {
        val miniCodes = arrayOf(1,0,0,0)
        val actual = addAndReplace(miniCodes, miniCodes)
        assertEquals(actual[0], 2)
        assertEquals(actual[1], 0)
        assertEquals(actual[2], 0)
        assertEquals(actual[3], 0)
    }

    @Test
    fun shouldMultiplyTheFirstSecondPlacesAndPlaceItInThirdPlaceIfOpcodeIs2() {
        val miniCodes = arrayOf(1,0,0,0)
        val actual = multiplyAndReplace(miniCodes, miniCodes)
        assertEquals(actual[0], 1)
        assertEquals(actual[1], 0)
        assertEquals(actual[2], 0)
        assertEquals(actual[3], 0)
    }

    @Test
    fun shouldDoOperationBasedOnOpcodeInputSet1() {
        val miniCodes = arrayOf(1,0,0,0,99)
        val actual = doOperation(miniCodes)
        assertEquals(actual[0], 2)
        assertEquals(actual[1], 0)
        assertEquals(actual[2], 0)
        assertEquals(actual[3], 0)
        assertEquals(actual[4], 99)
    }

    @Test
    fun shouldDoOperationBasedOnOpcodeInputSet2() {
        val miniCodes = arrayOf(2,3,0,3,99)
        val actual = doOperation(miniCodes)
        assertEquals(actual[0], 2)
        assertEquals(actual[1], 3)
        assertEquals(actual[2], 0)
        assertEquals(actual[3], 6)
        assertEquals(actual[4], 99)
    }

    @Test
    fun shouldDoOperationBasedOnOpcodeInputSet3() {
        val miniCodes = arrayOf(2,4,4,5,99,0)
        val actual = doOperation(miniCodes)
        assertEquals(actual[0], 2)
        assertEquals(actual[1], 4)
        assertEquals(actual[2], 4)
        assertEquals(actual[3], 5)
        assertEquals(actual[4], 99)
        assertEquals(actual[5], 9801)
    }

    @Test
    fun shouldDoOperationBasedOnOpcodeInputSet4() {
        val miniCodes = arrayOf(1,1,1,4,99,5,6,0,99)
        val actual = doOperation(miniCodes)
        assertEquals(actual[0], 30)
        assertEquals(actual[1], 1)
        assertEquals(actual[2], 1)
        assertEquals(actual[3], 4)
        assertEquals(actual[4], 2)
        assertEquals(actual[5], 5)
        assertEquals(actual[6], 6)
        assertEquals(actual[7], 0)
        assertEquals(actual[8], 99)
    }
}
