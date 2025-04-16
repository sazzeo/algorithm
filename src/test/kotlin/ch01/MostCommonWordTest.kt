package ch01

import ch01.MostCommonWord
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class MostCommonWordTest : StringSpec({


    "가장 빈번한 숫자 찾기1" {
        val res = MostCommonWord.mostCommonWord2(
            "Bob hit a ball, the hit BALL flew far after it was hit.",
            arrayOf("hit")
        )

        res shouldBe "ball"
    }

    "가장 빈번한 숫자 찾기2" {
        val res = MostCommonWord.mostCommonWord2(
            "..Bob hit a ball, the hit BALL flew far after it was hit.",
            arrayOf("hit")
        )

        res shouldBe "ball"
    }

    "가장 빈번한 숫자 찾기3" {
        val res = MostCommonWord.mostCommonWord2(
            "Bob",
            arrayOf()
        )

        res shouldBe "bob"
    }

})
