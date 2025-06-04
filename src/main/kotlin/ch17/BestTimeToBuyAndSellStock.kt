package ch17

object BestTimeToBuyAndSellStock {

    fun maxProfit(prices: IntArray): Int {
        var lp = 0
        var rp = prices.size - 1

        var min = 10000
        var max = 0
        while (lp < rp) {
            val left = prices[lp++]
            val right = prices[rp--]
            if (left < min) {
                min = left
            }
            if (max < right) {
                max = right
            }
        }

        if (max <= min) {
            return 0
        }


        return max - min
    }

}