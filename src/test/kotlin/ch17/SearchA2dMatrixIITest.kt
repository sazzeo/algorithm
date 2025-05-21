package ch17

import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class SearchA2dMatrixIITest : StringSpec({

    "test" {
        val matrix = arrayOf(
            intArrayOf(1, 4, 7, 11, 15),
            intArrayOf(2, 5, 8, 12, 19),
            intArrayOf(3, 6, 9, 16, 22),
            intArrayOf(10, 13, 14, 17, 24),
            intArrayOf(18, 21, 23, 26, 30)
        )
        val res = SearchA2dMatrixII.searchMatrix(
            matrix,
            23
        )

        val allValues = matrix.flatMap { it.toList() }.toSet()

        allValues.forEach { target ->
            withClue("target = $target") {
                SearchA2dMatrixII.searchMatrix(matrix, target) shouldBe true
            }
        }
    }


    "test2" {
        val res = SearchA2dMatrixII.searchMatrix(
            arrayOf(
                intArrayOf(5),
            ),
            -10
        )
        res shouldBe false
    }
})