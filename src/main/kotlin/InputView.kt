class InputView {
    companion object {

        fun inputCarNames(): List<String> = readln().split(",")

        fun inputTurn(): Int = readln().toInt()
    }
}