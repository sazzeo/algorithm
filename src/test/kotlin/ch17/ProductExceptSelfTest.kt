package ch17

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class ProductExceptSelfTest : StringSpec({
    "test" {
        val res = ProductExceptSelf.productExceptSelf(intArrayOf(1,2,3,4))
        res shouldBe intArrayOf(24,12,8,6)
    }

    "test3" {
        val res = ProductExceptSelf.productExceptSelf3(intArrayOf(1,2,3,4))
        res shouldBe intArrayOf(24,12,8,6)
    }
})