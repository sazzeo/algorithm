package ch01

import java.lang.StringBuilder

//https://leetcode.com/problems/most-common-word
object MostCommonWord {

    //40ms
    fun mostCommonWord(paragraph: String, banned: Array<String>): String {
        val words = paragraph.split(Regex("[!?';.,\\s]+")).filter { it.isNotEmpty() }
        val wordMap = mutableMapOf<String, Int>()
        words.forEach {
            val beforeCount = wordMap[it.lowercase()] ?: 0
            wordMap[it.lowercase()] = beforeCount + 1
        }

        var mostCount = 0
        var mostWord = ""
        wordMap.forEach { (key, value) ->
            if (!banned.contains(key) && value > mostCount) {
                mostWord = key
                mostCount = value
            }
        }
        return mostWord
    }

    fun mostCommonWord2(paragraph: String, banned: Array<String>): String {
        val wordMap = mutableMapOf<String, Int>()
        val word = StringBuilder()

        for (it in paragraph) {
            if (!it.isLetter()) {
                val key = word.toString()
                if (key.isNotEmpty()) {
                    wordMap[key] = (wordMap[key] ?: 0) + 1
                }
                word.clear()
            } else {
                //lowercase 보다 lowercaseChar 가 더 성능 좋음
                word.append(it.lowercaseChar())
            }
        }

        val key = word.toString()
        if (key.isNotEmpty()) {
            wordMap[key] = (wordMap[key] ?: 0) + 1
        }

        val bannedSet = banned.toSet()
        var mostCount = 0
        var mostWord = ""

        //forEach 문 제거
        for ((k, v) in wordMap) {
            if (!bannedSet.contains(k) && v > mostCount) {
                mostWord = k
                mostCount = v
            }
        }
        return mostWord
    }


}
