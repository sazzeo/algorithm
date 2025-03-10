package datatype

class ListNode(
    val value: Int = Int.MAX_VALUE,
    var next: ListNode? = null,
) {
    companion object {
        fun createList(vararg values: Int): ListNode {
            val head = ListNode(values[0])
            var prev = head

            for (i in 1..values.lastIndex) {
                prev.next = ListNode(values[i])
                prev = prev.next!!
            }
            return head
        }
    }

}
