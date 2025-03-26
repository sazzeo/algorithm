package ch01

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class ValidPalindromeTest : StringSpec({
    val test = ValidPalindrome()
    "문자열 뒤집기 테스트" {
        test.isPalindrome3("A man, a plan, a canal: Panama") shouldBe true
        test.isPalindrome3("race a car") shouldBe false
    }

})
