package ch17

import datatype.ListNode
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class InsertionSortListTest : StringSpec({
    val insertionSortList = InsertionSortList()

    "솔루션1" {
        val res = insertionSortList.solution1(
            ListNode.createList(5, 2, 1)
        )

        res shouldBe ListNode.createList(1, 2, 5)

    }
})
