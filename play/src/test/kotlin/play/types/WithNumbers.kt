package play.types

import org.junit.jupiter.api.Test


@Suppress("UNUSED_VARIABLE")
class WithNumbers {

    @Test
    fun printByteMinMaxValue() {
        val x: Byte = 1

        val minValue = Byte.MIN_VALUE
        val maxValue = Byte.MAX_VALUE

        println("Byte minValue: $minValue, Byte maxValue: $maxValue")
    }

    @Test
    fun printShortMinMaxValue() {
        val x: Short = 1

        val minValue = Short.MIN_VALUE
        val maxValue = Short.MAX_VALUE

        println("Short minValue: $minValue, Short maxValue: $maxValue")
    }

    @Test
    fun printIntMinMaxValue() {
        val x: Int = 1
        val y = 1 // Int
        val hex = 0x0F // Int (15)
        val binary = 0b1111 // Int (15)
        val bitwiseOperation = (1 shl 2) and 0x0F // Int (4)

        val minValue = Int.MIN_VALUE
        val maxValue = Int.MAX_VALUE

        println("Int minValue: $minValue, Int maxValue: $maxValue")
    }

    @Test
    fun printLongMinMaxValue() {
        val x: Long = 1
        val y = 1L // Long
        val z = 1_000_000_000L // Long

        val minValue = Long.MIN_VALUE
        val maxValue = Long.MAX_VALUE

        println("Long minValue: $minValue, Long maxValue: $maxValue")
    }

    @Test
    fun printFloatMinMaxValue() {
        val x: Float = 1.0f
        val y = .0f // Float

        val minValue = Float.MIN_VALUE
        val maxValue = Float.MAX_VALUE

        println("Float minValue: $minValue, Float maxValue: $maxValue")
    }

    @Test
    fun printDoubleMinMaxValue() {
        val x: Double = 1.0
        val y = .0 // Double
        val z = 1.0E10 // Double (1.0 * 10^15)

        val minValue = Double.MIN_VALUE
        val maxValue = Double.MAX_VALUE

        println("Double minValue: $minValue, Double maxValue: $maxValue")
    }
}