class Solution {
    fun numOfStrings(patterns: Array<String>, word: String): Int {
        var result = 0
        for (i in 0 .. patterns.size - 1) {
            if (patterns[i] in word) result++
        }
        return result
    }
}