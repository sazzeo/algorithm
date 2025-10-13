package temp

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class ValidParenthesesTest : StringSpec({

    "test" {
        val result = ValidParentheses.isValid("()[]{}")
        result shouldBe true
    }

    "test2" {
        val result = ValidParentheses.isValid("(]")
        result shouldBe false
    }


    "test3" {
        val result = ValidParentheses.isValid("([])")
        result shouldBe true
    }


    "test4" {
        val result = ValidParentheses.isValid("([)]")
        result shouldBe false
    }
})