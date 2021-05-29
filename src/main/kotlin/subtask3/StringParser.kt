package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
        val open_char = charArrayOf('<', '(', '[')
        val end_char = charArrayOf('>', ')', ']')

        val result_mas = mutableListOf<String>()
        var start_position = 0
        var is_open_bracet = false
        var char_bracet = 0
        var incude = 0
        var i = 0
        while (i <= inputString.length - 1) {
            val char = inputString[i]
            if (char in open_char && !is_open_bracet) {
                start_position = i + 1
                is_open_bracet = true
                char_bracet = open_char.indexOf(char)
            } else if (char_bracet == open_char.indexOf(char)) {
                incude++
            } else if (char in end_char && char_bracet == end_char.indexOf(char) && is_open_bracet && incude == 0) {
                result_mas.add(inputString.substring(start_position..i - 1))
                i = start_position-1
                is_open_bracet = false
            } else if (char_bracet == end_char.indexOf(char) && incude > 0) {
                incude--
            }
            i++
        }
        return result_mas.toTypedArray()
    }
}
