package temp

import datatype.ListNode
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class OddEvenListTest : StringSpec({

    "test1" {
        var result = OddEvenList.oddEvenList(ListNode.createNode(1, 2, 3, 4, 5, 6));
        result shouldBe ListNode.createNode(1, 3, 5, 2, 4, 6)
    }

    "test2" {
        var result = OddEvenList.oddEvenList(ListNode.createNode());
        result shouldBe ListNode.createNode()
    }

    "test_1" {
        var result = OddEvenList.oddEvenList2(ListNode.createNode(1, 2, 3, 4, 5, 6));
        result shouldBe ListNode.createNode(1, 3, 5, 2, 4, 6)
    }

})
