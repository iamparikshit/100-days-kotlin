package strings.validParatheses

import java.util.*

class Solution {
    fun isValid(s: String): Boolean {
        val result = Stack<Char>()
        var value = false
        for (element in s) {
            if (element == '(' || element == '{' || element == '[') {
                result.push(element)
            } else {
                value = when (result.peek()) {
                    '(' -> element == ')'
                    '{' -> element == '}'
                    '[' -> element == ']'
                    else -> false
                }

                if (value) result.pop()
                else return false
            }
        }
        return value
    }
}