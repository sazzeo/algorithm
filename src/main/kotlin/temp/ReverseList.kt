package temp

import datatype.ListNode

object ReverseList {
    fun reverseList(head: ListNode?): ListNode? {
        var origin = head
        var result : ListNode? = null
        while (origin != null) {
            val node = ListNode.createNode(origin.`val`)
            node.next = result
            origin = origin.next
            result = node
        }

        return result
    }
}