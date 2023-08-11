class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        var sArray = s.toCharArray()
        var tArray = t.toCharArray()
        
        if (s.length != t.length) {
            return false
        }
        
        val sSorted = sArray.sorted().joinToString("")
        val tSorted = tArray.sorted().joinToString("")
        if (sSorted.equals(tSorted)) return true
        else return false
    }
}