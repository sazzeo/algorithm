package ch17

//겹치는 구간을 병합하라
class MergeIntervals {

    fun solution1(intervals: Array<IntArray>): Array<IntArray> {
        val result = mutableListOf<IntArray>()
        intervals.sortBy { it.first() }
        result.add(intervals.first())

        intervals.forEach {
            val last = result.last()
            if (last[1] >= it[1]) {
                //암것도안함
            } else if (last[1] >= it[0]) {
                last[1] = it[1]
            } else {
                result.add(it)
            }
        }

        return result.toTypedArray()
    }


    fun solution2(intervals: Array<IntArray>): Array<IntArray> {
        val sortedIntervals = intervals.sortedBy { it.first() }
        val merged = mutableListOf(sortedIntervals.first())

        for (current in sortedIntervals.drop(1)) {
            val lastMerged = merged.last()
            when {
                lastMerged[1] >= current[1] -> continue
                lastMerged[1] >= current[0] -> lastMerged[1] = current[1]
                else -> merged.add(current)
            }
        }

        return merged.toTypedArray()
    }


}
