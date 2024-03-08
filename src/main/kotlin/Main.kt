
fun main(args: Array<String>) {
    var options = arrayOf("Камень","Ножницы","Бумага")
    val gameChoic = computerChoicegeneratur(options)
    println(gameChoic)

    updateArray(options)
    println(options[2])

    val userChoice = getPlayerChoice(options)
}

fun getPlayerChoice(optionsParam: Array<String>): String{
    print("Введите одно из варианта ")
    for(item in optionsParam)
        print("$item ")
    println(".")

    val userInput = readLine()
    if(userInput != null && userInput in optionsParam){
        return userInput
    }
    return "todo"
}
fun updateArray(optionsParam: Array<String>){
    optionsParam[2]="Test"
}
fun computerChoicegeneratur(optionsParam: Array<String>) = optionsParam[(Math.random() * optionsParam.size).toInt()]
