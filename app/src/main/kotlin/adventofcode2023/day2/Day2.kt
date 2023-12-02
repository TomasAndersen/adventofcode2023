package adventofcode2023.day2

import adventofcode2023.utils.FileUtil

// Determine which games would have been possible if the bag had
// been loaded with only
// 12 red cubes,
// 13 green cubes,
// and 14 blue cubes. What is the sum of the IDs of those games?
class Day2(lines: List<String>) {
    val games: ArrayList<Game> = ArrayList()
    fun sumFromValidGames(maxRed: Int, maxGreen: Int, maxBlue: Int): Int {
        var sum = 0
        for (game in games) {
            val id = game.idIfValid(maxRed, maxGreen, maxBlue)
            if (id != null) {
                sum += id
            }
        }
        return sum
    }

    fun powerOfCubesMinForSets(): Int {
        return games.sumOf { it.powerOfCubesMinForSets() }
    }

    init {
        for (line in lines) {
            games.add(Game(line))
        }
    }

}


fun main() {
    val lines = FileUtil().getLinesNotEmpty("day2input.txt")
    val day2 = Day2(lines);
    println(day2.sumFromValidGames(12, 13, 14))
    println(day2.powerOfCubesMinForSets())
}
