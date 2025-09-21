package temp

import datatype.ListNode
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class AddTwoNumbersTest : StringSpec({

//    Input: l1 = [2,4,3,4], l2 = [5,6,4,4]
//    Output: [7,0,8]
//    Explanation: 342 + 465 = 807
    "solution1" {
        val l1 = ListNode.createNode(2, 4, 3)
        val l2 = ListNode.createNode(5, 6, 4)
        val result = AddTwoNumbers.addTwoNumbers(l1, l2)

        result shouldBe ListNode.createNode(7, 0, 8)
    }

//    Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//    Output: [8,9,9,9,0,0,0,1]
    "solution2" {
        val l1 = ListNode.createNode(9,9,9,9,9,9,9)
        val l2 = ListNode.createNode(9,9,9,9)
        val result = AddTwoNumbers.addTwoNumbers(l1, l2)

        result shouldBe ListNode.createNode(8,9,9,9,0,0,0,1)
    }

//1,2,3,4,5
    "test1" {
        val list = ListNode.createNode()
        list.`val` = 1;
        list.next = ListNode.createNode(2)
        list.next?.next = ListNode.createNode(3)
        list.next?.next?.next = ListNode.createNode(4)
        list.next?.next?.next?.next = ListNode.createNode(5)
        list shouldBe ListNode.createNode(1, 2, 3, 4, 5)
    }

    "test2" {
        val list = listOf(1,2,3,4,5)
        var next: ListNode? = null
        val result = ListNode.createNode()
        for (l in list) {
//            next.`val` = l;
//            next = result.next


        }

        result.`val` = 1;
        result.next = ListNode.createNode(2)
        result.next?.next = ListNode.createNode(3)
        result.next?.next?.next = ListNode.createNode(4)
        result.next?.next?.next?.next = ListNode.createNode(5)
        result shouldBe ListNode.createNode(1, 2, 3, 4, 5)
    }
})
