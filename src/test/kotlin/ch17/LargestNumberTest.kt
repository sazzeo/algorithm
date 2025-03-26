package ch17

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class LargestNumberTest : StringSpec({

    val test = LargestNumber()
    "sort" {
        test.largestNumber(intArrayOf(3, 30, 34, 5, 9)) shouldBe "9534330"
    }


})