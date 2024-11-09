package by

interface Bot {
    fun talk(): String
}

class ChatBot: Bot {
    override fun talk() = "Chatbot talking"
}

interface AI {
    fun talk(): String
}

class GPT: AI {
    override fun talk() = "GPT talking"
}

class App(
    var bot: Bot,
    var ai: AI
) : Bot by bot, AI by ai {
    //  Must Override talk() because of inherits many implementations from AI, BOT
    override fun talk() =  "${bot.talk()} ${ai.talk()} App is talking"
}

fun main() {
    val bot : Bot = ChatBot()
    val ai : AI = GPT()
    val app = App(bot, ai)

    println(bot.talk())
    println(ai.talk())
    println(app.talk())
}
