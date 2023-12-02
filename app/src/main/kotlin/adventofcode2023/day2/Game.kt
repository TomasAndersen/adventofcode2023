package adventofcode2023.day2

class Game(gameString: String) {
    val gameId: Int
    val gameSetList: ArrayList<GameSet> = ArrayList()
    fun isValid(maxRed: Int, maxGreen: Int, maxBlue: Int): Boolean {
        return gameSetList.all { it.isValid(maxRed, maxGreen, maxBlue) }
    }
    fun idIfValid(maxRed: Int, maxGreen: Int, maxBlue: Int): Int? {
        return if (isValid(maxRed, maxGreen, maxBlue)) gameId else null
    }

    fun powerOfCubesMinForSets(): Int {
        val maxRed = gameSetList.maxOf { it.red }
        val maxGreen = gameSetList.maxOf { it.green }
        val maxBlue = gameSetList.maxOf { it.blue }
        return maxRed * maxGreen * maxBlue
    }



    init {
        val split = gameString.split(":")
        gameId = split[0].split(" ")[1].toInt();

        val gameSets = split[1].split(";")
        for (gs in gameSets) {
            gameSetList.add(GameSet(gs))
        }
    }
}
