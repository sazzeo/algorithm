package ch17

import datatype.ListNode

// 64번
class MergeSort {

    private fun mergeTwoSort(l1: ListNode?, l2: ListNode?): ListNode? {
        var node1 = l1
        var node2 = l2

        if (node1 == null) return node2
        if (node2 == null) return node1

        //swap 하기
        if (node1.`val` > node2.`val`) {
            node1 = node2.also { node2 = node1 }
        }
        node1.next = mergeTwoSort(node1.next, node2)
        return node1
    }

    fun sortList(head: ListNode?): ListNode? {
        if (head?.next == null) return head

        var half: ListNode? = null

        var slow: ListNode = head
        var fast: ListNode? = head

        while (fast?.next != null) {
            half = slow
            slow = slow.next!!
            fast = fast.next!!.next
        }
        half?.next = null

        val l1 = sortList(head)
        val l2 = sortList(slow)

        return mergeTwoSort(l1, l2)
    }

}
