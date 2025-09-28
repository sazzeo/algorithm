package temp

import datatype.ListNode
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class SwapPairsTest : StringSpec({

    "test" {
        var result = SwapPairs.swapPairs(ListNode.createNode(1, 2, 3, 4, 5, 6));
        result shouldBe ListNode.createNode(2, 1, 4, 3, 6, 5)
    }

})
