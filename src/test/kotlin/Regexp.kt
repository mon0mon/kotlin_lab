import kotlin.test.Test
import kotlin.test.assertContentEquals

class Regexp {
    val string = """
        Twas brillig, and the slithy toves
        Did gyre and gimble in the wabe:
        All mimsy were the borogoves,
        And the mome raths outgrabe.
    """.trimIndent()

    @Test
    fun `정규표현식 테스트`() {
        val regex: Regex = Regex("""\w+""")
        val matchResults = regex.findAll(string)
        val stringList: MutableList<String> = mutableListOf()
        for (result in matchResults) {
            stringList.add(result.value)
        }
        val expectedStringList = listOf(
            "Twas",
            "brillig",
            "and",
            "the",
            "slithy",
            "toves",
            "Did",
            "gyre",
            "and",
            "gimble",
            "in",
            "the",
            "wabe",
            "All",
            "mimsy",
            "were",
            "the",
            "borogoves",
            "And",
            "the",
            "mome",
            "raths",
            "outgrabe",
        )

        println("actual : " + stringList)

        assertContentEquals(expectedStringList, stringList)
    }
}