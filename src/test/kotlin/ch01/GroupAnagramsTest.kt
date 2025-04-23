package ch01

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class GroupAnagramsTest : StringSpec({

    "test1" {
        GroupAnagrams.groupAnagrams(
            arrayOf("eat","tea","tan","ate","nat","bat")
        )
    }

})
