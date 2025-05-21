package ch01

object TrappingRainWater {

    fun trap(height: IntArray): Int {
        val stack = ArrayDeque<Int>()
        for (h in height) {
            stack.add(h)
            if (stack.first() < h) {
                if (stack.size == 1) {
                    stack.removeFirst()
                } else {
                    //TODO()
                }
            }
        }

        return 1
    }


}