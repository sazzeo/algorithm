package datatype

class ListNode private constructor(
    var `val`: Int = Int.MIN_VALUE,
    var next: ListNode? = null,
) {
    companion object {
        fun createList(vararg values: Int): ListNode {
            if (values.isEmpty()) return ListNode()
            val head = ListNode(values[0])
            var prev = head

            for (i in 1..values.lastIndex) {
                prev.next = ListNode(values[i])
                prev = prev.next!!
            }
            return head
        }
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as ListNode

        if (`val` != other.`val`) return false
        return next == other.next
    }

    override fun hashCode(): Int {
        var result = `val`
        result = 31 * result + (next?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String {
        return "ListNode(value=$`val`, next=$next)"
    }


}
