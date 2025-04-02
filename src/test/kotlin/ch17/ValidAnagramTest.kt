package ch17

import ch01.ReverseString
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class ValidAnagramTest : StringSpec({
    val test = ValidAnagram()

    "solution1" {
        test.isAnagram2("abc" ,"bca") shouldBe true

    }


})
