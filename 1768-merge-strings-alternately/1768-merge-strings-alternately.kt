class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var builder = StringBuilder()
				var i = 0
				var j = 0
				val firstStringLength = word1.length
				val secStringLength = word2.length
				while (i < firstStringLength || j < secStringLength) {
					if (i < firstStringLength ) {
						builder.append(word1.get(i++))
					}

					if (j < secStringLength) {
						builder.append(word2.get(j++))
					}
				}
                
				return builder.toString()
    }
}