package sample

fun addAndReplace(miniCodes: Array<Int>, originalCodes: Array<Int>): Array<Int> {
    originalCodes[miniCodes[3]] = originalCodes[miniCodes[1]].plus(originalCodes[miniCodes[2]])
    return originalCodes
}

fun multiplyAndReplace(miniCodes: Array<Int>, originalCodes: Array<Int>): Array<Int> {
    originalCodes[miniCodes[3]] = originalCodes[miniCodes[1]].times(originalCodes[miniCodes[2]])
    return originalCodes
}

fun doOperation(codes: Array<Int>): Array<Int> {
    var i = 0
    loop@ do {
        val miniCodes = codes.withIndex().groupBy({it.index / 4}).map { it.value.map { it.value } }
        val miniCode = miniCodes[i]
        when(miniCode[0]) {
            1 -> addAndReplace(miniCode.toIntArray().toTypedArray(), codes)
            2 -> multiplyAndReplace(miniCode.toIntArray().toTypedArray(), codes)
            99 -> break@loop
            else -> break@loop
        }
        i++
    } while (i < miniCodes.size)
    return codes
}

fun main() {
    val miniCodes = arrayOf(1,12,2,3,1,1,2,3,1,3,4,3,1
        ,5,0,3,2,6,1,19,1,5,19,23,1,13,23,27,
        1,6,27,31,2,31,13,35,1,9,35,39,2,39,13
        ,43,1,43,10,47,1,47,13,51,2,13,51,55,1,55
        ,9,59,1,59,5,63,1,6,63,67,1,13,67,71,2,71,
        10,75,1,6,75,79,1,79,10,83,1,5,83,87,2,10,
        87,91,1,6,91,95,1,9,95,99,1,99,9,103,2,103,
        10,107,1,5,107,111,1,9,111,115,2,13,115,119,
        1,119,10,123,1,123,10,127,2,127,10,131,1,5,
        131,135,1,10,135,139,1,139,2,143,1,6,143,0,99,2,14,0,0)
    val actual = doOperation(miniCodes)
    println(actual[0])
}
