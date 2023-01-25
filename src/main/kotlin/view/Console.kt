package view

import constant.ValidationConstants.NAME_MAX_LENGTH
import constant.ViewConstants
import constant.ViewConstants.NAME_DELIMITER

class Console {
    companion object {

        fun inputCarNames(): List<String> {
            var names: List<String>

            while (true) {
                printCarNamesInputMessage()
                try {
                    names = readln().split(NAME_DELIMITER)
                    for (name in names) {
                        validateName(name)
                    }
                    return names
                } catch (e: IllegalArgumentException) {
                    println(e.message)
                }
            }
        }

        private fun validateName(name: String) {
            if (name.isBlank()) {
                throw IllegalArgumentException("[ERROR] 이름은 공백일 수 없습니다.")
            }
            if (name.length > NAME_MAX_LENGTH) {
                throw IllegalArgumentException("[ERROR] 이름은 ${NAME_MAX_LENGTH}자를 초과할 수 없습니다.")
            }
        }

        fun inputTurn(): Int {
            var turn: Int

            while (true) {
                printTurnInputMessage()
                try {
                    turn = convertToTurn(readln())
                    validateTurn(turn)
                    return turn
                } catch (e: IllegalArgumentException) {
                    println(e.message)
                }
            }
        }

        private fun convertToTurn(turn: String): Int {
            return try {
                turn.toInt()
            } catch (e: NumberFormatException) {
                throw IllegalArgumentException("[ERROR] 숫자만 입력해주세요.")
            }
        }

        private fun validateTurn(turn: Int) {
            if (turn <= 0) {
                throw IllegalArgumentException("[ERROR] 횟수는 자연수여야 합니다.")
            }
        }

        private fun printCarNamesInputMessage() = println("자동차 이름 입력하세요(쉼표로 구분)")

        private fun printTurnInputMessage() = println("시도할 횟수를 입력하세요")

        fun printResult(locations: Map<String, Int>, winner: List<String>) {
            locations.forEach {
                println("${it.key} : ${ViewConstants.MOVE_LINE_REPRESENTATION.repeat(it.value)}")
            }
            println("우승자 : ${winner.joinToString(NAME_DELIMITER)}")
        }
    }
}