package temp

import datatype.ListNode
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class ReverseListTest : StringSpec({

    "solution1" {
        var result = ReverseList.reverseList(ListNode.createNode(1, 2, 3, 4, 5));
        result shouldBe ListNode.createNode(5, 4, 3, 2, 1)
    }

})
