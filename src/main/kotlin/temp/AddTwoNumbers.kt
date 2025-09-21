package temp

import datatype.ListNode

//100자리 숫자는 표현이 안됨
object AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode, l2: ListNode): ListNode {
        var result = ListNode.createNode()
        var nextSum = 0;
        var l1Node: ListNode? = l1
        var l2Node: ListNode? = l2
        var resultNode = result

        while (l1Node != null || l2Node != null || nextSum == 1) {
            var sum = (l1Node?.`val` ?: 0) + (l2Node?.`val` ?: 0) + nextSum

            if (sum > 9) {
                nextSum = 1
                sum = sum - 10
            } else {
                nextSum = 0
            }

            resultNode.`val` = sum

            l1Node = l1Node?.next
            l2Node = l2Node?.next
            if(l1Node == null && l2Node == null && nextSum != 1) {
                break
            }

            resultNode.next = ListNode.createNode()
            resultNode = resultNode.next!!
        }

        return result
    }
}