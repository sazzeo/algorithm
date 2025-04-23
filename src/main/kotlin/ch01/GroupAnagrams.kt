package ch01

object GroupAnagrams {

    //https://leetcode.com/problems/group-anagrams/description/
    //18ms
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val map = mutableMapOf<String, MutableList<String>>()
        for (str in strs) {
            val sortedStrChars = str.toCharArray()
            sortedStrChars.sort()
            val builder = StringBuilder()
            for (char in sortedStrChars) {
                builder.append(char)
            }
            val sortedStr = builder.toString()
            if (map[sortedStr] == null) {
                map[sortedStr] = mutableListOf()
            }
            map[sortedStr]?.add(str)
        }

        val list = mutableListOf<List<String>>()
        for ((_, value)in map) {
            list.add(value)
        }

        return list
    }
}
