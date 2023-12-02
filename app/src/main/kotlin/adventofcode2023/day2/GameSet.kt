package adventofcode2023.day2

class GameSet(gameSetString: String) {
    var red: Int = 0
    var green: Int = 0
    var blue: Int = 0

    fun isValid(maxRed: Int, maxGreen: Int, maxBlue: Int): Boolean {
        return red <= maxRed && green <= maxGreen && blue <= maxBlue
    }

    init {
        val numcolor = gameSetString.split(",")
        for (n in numcolor) {
            val split = n.split(" ")
            val color = split[2]
            val num = split[1].toInt()

            when (color) {
                "red" -> red = num
                "green" -> green = num
                "blue" -> blue = num
                else -> {
                    // ignore
                }
            }
        }
    }
}
