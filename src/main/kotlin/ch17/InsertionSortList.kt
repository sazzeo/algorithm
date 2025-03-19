package ch17

import datatype.ListNode

class InsertionSortList {
    fun solution1(head: ListNode?): ListNode? {
        //비교할 노드
        var node = head
        val parent = ListNode.createList()
        //정렬을 끝낸 대상을 가리키는 포인터
        var p = node
        while (node != null) {
            while (p?.next != null && p.next!!.`val` < node.`val`) {
                p = p.next
            }
            val pNext = p!!.next
            val headNext = node.next
            p.next = node
            node.next = pNext
            node = headNext
            if (node != null && p.`val` > node.`val`) {
                p = parent
            }
        }

        return parent.next
    }
}
