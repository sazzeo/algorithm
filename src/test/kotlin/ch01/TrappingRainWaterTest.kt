package ch01

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class TrappingRainWaterTest : StringSpec({

    "test" {
        val res = TrappingRainWater.trap(intArrayOf(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1))
        res shouldBe 6
    }
})