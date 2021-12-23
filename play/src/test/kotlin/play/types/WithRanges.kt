package play.types

import org.junit.jupiter.api.Test

@Suppress("KotlinConstantConditions", "UNUSED_VARIABLE")
class WithRanges {

    @Test
    fun ranges() {
        val fromOneToTen = 1..10
        val fromOneToTenWithStep2 = 1..10 step 2

        val fromTenDownToOne = 10 downTo 1
        val fromTenDownToOneWithStep2 = 10 downTo 1 step 2

        val isOneInRange = 1 in 0..5
        val isOneNotInRange = 1 !in 0..5
    }

    @Test
    fun loopWithRanges() {
        for (i in 1..5) {
            println(i)
        }

        for (i in 5 downTo 1 step 2) {
            println(i)
        }
    }
}