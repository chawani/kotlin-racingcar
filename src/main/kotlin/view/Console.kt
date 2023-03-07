package view

import validation.InputValidator.validateNames
import validation.InputValidator.validateTurn

object Console {

    private const val NAME_DELIMITER = ","
    private const val MOVE_LINE = "-"

    fun inputCarNames(): List<String> {
        while (true) {
            printCarNamesInputMessage()
            try {
                return readln().split(NAME_DELIMITER).apply { validateNames(this) }
            } catch (e: IllegalArgumentException) {
                println(e.message)
            }
        }
    }

    fun inputTurn(): Int {
        while (true) {
            printTurnInputMessage()
            try {
                return convertToTurn(readln()).apply { validateTurn(this) }
            } catch (e: IllegalArgumentException) {
                println(e.message)
            }
        }
    }

    private fun convertToTurn(turn: String): Int {
        return requireNotNull(turn.toIntOrNull()) { "[ERROR] 숫자만 입력해주세요." }
    }

    private fun printCarNamesInputMessage() = println("자동차 이름 입력하세요(쉼표로 구분)")

    private fun printTurnInputMessage() = println("시도할 횟수를 입력하세요")

    fun printResult(locations: Map<String, Int>, winner: List<String>) {
        locations.forEach {
            println("${it.key} : ${MOVE_LINE.repeat(it.value)}")
        }
        println("우승자 : ${winner.joinToString(NAME_DELIMITER)}")
    }
}
