package ch17

import datatype.ListNode
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.datatest.withData
import io.kotest.matchers.shouldBe

class MergeSortTest : BehaviorSpec({

    given("test") {
        val mergeSort = MergeSort()
        withData(
            ListNode.createNode(-1, 5, 0, 3, 4) to ListNode.createNode(-1, 0, 3, 4, 5),
            ListNode.createNode(5, -1, 3, 4, 0) to ListNode.createNode(-1, 0, 3, 4, 5),
        ) { (input, expected) ->
            mergeSort.sortList(input) shouldBe expected
        }
    }

    given("test2") {
        val a = "a"
        val b = a.also { println(it + 1) }
        println(a)
        println(b)
    }

})