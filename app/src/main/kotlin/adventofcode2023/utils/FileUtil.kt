package adventofcode2023.utils

class FileUtil {
    fun getLines(filename: String): List<String> {
        return this.javaClass.classLoader.getResource(filename)?.readText()?.split("\n") ?: emptyList()
    }

    fun getLinesNotEmpty(filename: String): List<String> {
        return getLines(filename).filter { it.isNotEmpty() }
    }
}
