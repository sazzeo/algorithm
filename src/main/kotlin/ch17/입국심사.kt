package ch17

object 입국심사 {

    fun solution(n: Int, times: IntArray): Long {
        times.sort()
        val last = times.last()
        var minTime = 1L
        var maxTime = last.toLong() * n

        var answer = maxTime
        while (minTime <= maxTime) {
            val midTime = (minTime + maxTime) / 2
            var man = 0L
            for (time in times) {
                man += (midTime / time)
            }
            if (man >= n) {
                answer = midTime
                maxTime = midTime - 1
            } else {
                minTime = midTime + 1
            }
        }

        return answer
    }
}