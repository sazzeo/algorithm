package ch17

import datatype.ListNode

// 66번
class InsertionSortList {

    fun solution1(head: ListNode?): ListNode? {
        head?.next ?: return null

        var current = head // 5 -> 2 -> 7 -> 1 -> null

        val orderedListDummyHead = ListNode() // -100 -> null
        //정렬을 끝낸 대상을 가리키는 포인터
        var prev = orderedListDummyHead // -100 -> null
        while (current != null) {
            while (prev.next != null && prev.next!!.`val` < current.`val`) {
                prev = prev.next!!
            }

            val headNext = current.next
            current.next = prev.next
            prev.next = current
            current = headNext

            //최적화를 위한 코드
            if (current != null && prev.`val` > current.`val`) {
                prev = orderedListDummyHead
            }
        }

        return orderedListDummyHead.next
    }
}
