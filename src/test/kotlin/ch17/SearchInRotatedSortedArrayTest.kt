package ch17

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class SearchInRotatedSortedArrayTest : StringSpec({

    "test1" {
        SearchInRotatedSortedArray.search(intArrayOf(4,5,6,7,0,1,2) , 0)
    }
})
