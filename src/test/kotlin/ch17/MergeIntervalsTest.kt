package ch17

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MergeIntervalsTest : StringSpec({

    val mergeIntervals = MergeIntervals()

    "솔루션1" {
        val result = mergeIntervals.solution1(
            arrayOf(
                intArrayOf(1, 3),
                intArrayOf(8, 11),
                intArrayOf(2, 6),
                intArrayOf(15, 18)
            )
        )

        result shouldBe arrayOf(
            intArrayOf(1, 6),
            intArrayOf(8, 11),
            intArrayOf(15, 18)
        )
    }

    "솔루션2" {
        val result = mergeIntervals.solution2(
            arrayOf(
                intArrayOf(1, 3),
                intArrayOf(8, 11),
                intArrayOf(2, 6),
                intArrayOf(15, 18)
            )
        )

        result shouldBe arrayOf(
            intArrayOf(1, 6),
            intArrayOf(8, 11),
            intArrayOf(15, 18)
        )
    }


})
