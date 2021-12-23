package play.types

import org.junit.jupiter.api.Test

@Suppress("UNUSED_VARIABLE")
class WithArrays {

    @Test
    fun primitiveTypeArrays() {
        val array = intArrayOf(1) // [ 1 ]
        val array2 = IntArray(3) { 0 } // [ 0, 0, 0 ]
        val array3 = IntArray(3) { it } // [ 0, 1, 2 ]
    }

    @Test
    fun simpleArrays() {
        val array = Array(3) { "$it" } // [ "0", "1", "2" ]
        val array2 = arrayOf("first", "second") // [ "first", "second" ]
    }

    @Test
    fun iterateElementsInArray() {
        val array = Array(3) { "$it" } // [ "0", "1", "2" ]

        for (element in array) {
            println(element)
        }
    }

    @Test
    fun iterateElementsInArrayWithIndices() {
        val array = Array(3) { "$it" } // [ "0", "1", "2" ]

        for ((index, element) in array.withIndex()) {
            println("$index: $element")
        }
    }
}