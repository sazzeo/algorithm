package ch01

class ReorderLogFiles {

    fun reorderLogFiles(logs: Array<String>): Array<String> {
        if (logs.size == 1) {
            return logs
        }

        val letters = mutableListOf<String>()
        val numbers = mutableListOf<String>()

        for (log in logs) {
            if (Character.isDigit(log.split(" ")[1][0])) {
                numbers.add(log)
            } else {
                letters.add(log)
            }
        }

        letters.sortWith { o1, o2 ->
            val log1 = Log.create(o1)
            val log2 = Log.create(o2)
            if (log1.value == log2.value) log1.id.compareTo(log2.id) else log1.value.compareTo(log2.value)
        }

        return (letters + numbers).toTypedArray()
    }

    fun reorderLogFiles2(logs: Array<String>): Array<String> {

        //얘가 있으면 성능이 느려짐..왜??
//        if (logs.size == 1) {
//            return logs
//        }

        val letters = mutableListOf<String>()
        val numbers = mutableListOf<String>()

        for (log in logs) {
            if (Character.isDigit(log.split(" ")[1][0])) {
                numbers.add(log)
            } else {
                letters.add(log)
            }
        }

        letters.sortWith { o1, o2 ->
            val log1 = o1.split(" ", limit = 2)
            val log2 = o2.split(" ", limit = 2)
            val res = log1[1].compareTo(log2[1])
            if(res == 0) log1[0].compareTo(log2[0]) else res
        }

        return (letters + numbers).toTypedArray()
    }
}

data class Log(
    val id: String,
    val value: String,
) {
    companion object {
        fun create(str: String): Log {
            val idDivider = str.indexOf(" ")
            val id = str.substring(0, idDivider)
            val log = str.substring(idDivider + 1)
            return Log(id, log)
        }
    }
}
