package ch17

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Assertions.*

class BestTimeToBuyAndSellStockTest : StringSpec({

    "test" {
        val result = BestTimeToBuyAndSellStock.maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))
        result shouldBe 5
    }

})