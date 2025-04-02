package ch01

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class ReverseStringTest : StringSpec({
    val test = ReverseString()

    "solution1" {
        val s = charArrayOf('a', 'b', 'c', 'd', 'e','f')
        test.solution2(s)
        s shouldBe charArrayOf('f','e','d','c','b','a')
    }

})
