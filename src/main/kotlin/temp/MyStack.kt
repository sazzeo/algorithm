package temp

import java.util.*

class MyStack {
    private val queue : Queue<Int> = LinkedList()

    //시간복잡도 O(queue size)
    fun push(x: Int) {
        queue.add(x)
        for ( i in 0..<queue.size-1){
            queue.add(queue.poll())
        }
    }

    //시간복잡도 1
    fun pop(): Int {
        return queue.poll()
    }

    //시간복잡도 1
    fun top(): Int {
        return queue.peek()
    }

    //시간복잡도 1
    fun empty(): Boolean {
        return queue.isEmpty()
    }
}