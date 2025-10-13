package temp

import java.util.Stack

// https://leetcode.com/problems/valid-parentheses/
object ValidParentheses {
    fun isValid(s: String): Boolean {
        //공간복잡도 최대 O(n)
        val stack = Stack<Char>()
        for (c in s) {
            if(stack.isEmpty()) {
                stack.push(c)
                continue
            }
            val last = stack.peek()
            if (isPair(last, c)) {
                stack.pop()
            } else {
                stack.push(c)
            }
        }
        return stack.size == 0
    }

    //시간복잡도 O(1)
    private fun isPair(left: Char, right: Char): Boolean {
        if (left == '(' && right == ')') {
            return true
        }
        if (left == '[' && right == ']') {
            return true
        }
        if (left == '{' && right == '}') {
            return true
        }

        return false
    }
}