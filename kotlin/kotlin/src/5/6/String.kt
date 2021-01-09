package `5`.`6`

import kotlin.String

object String {
    fun lettersCount1(str: String): Int {
        var count = 0
        for (char in str) {
            if (char.isLetter()) {
                count++
            }
        }
        return count
    }

    fun String.lettersCount(): Int {
        var count = 0
        for (char in this) {
            if (char.isLetter()) {
                count++
            }
        }
        return count
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val count = "ABC123xyz!@#".lettersCount()
    }

}