package ch17

class ValidAnagram {

    //12ms , 시간복잡도 nlogn
    // https://leetcode.com/problems/valid-anagram/description/
    fun isAnagram1(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }

        val sArr = s.toCharArray()
        sArr.sort()
        val tArr = t.toCharArray()
        tArr.sort()
        for (i in 0..<s.length) {
            if (sArr[i] != tArr[i]) {
                return false
            }
        }
        return true
    }

    //12ms , 시간복잡도 n
    fun isAnagram2(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }
        val sArr = s.toCharArray()
        val tArr = t.toCharArray()
        val alphabet = IntArray(26)

        for (i in sArr.indices) {
            alphabet[sArr[i] - 'a']++
            alphabet[tArr[i] - 'a']--
        }
        for (i in alphabet.indices) {
            if (alphabet[i] != 0) {
                return false
            }
        }
        return true
    }
}
