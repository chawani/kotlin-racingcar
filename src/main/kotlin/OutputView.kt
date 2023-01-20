import constant.ViewConstants.MOVE_LINE_REPRESENTATION
import constant.ViewConstants.NAME_DELIMITER

class OutputView {
    companion object {

        fun printCarNamesInputMessage() = println("자동차 이름 입력하세요(쉼표로 구분)")

        fun printTurnInputMessage() = println("시도할 횟수를 입력하세요")

        fun printResult(locations: Map<String, Int>, winner: List<String>) {
            locations.forEach {
                println("${it.key} : ${MOVE_LINE_REPRESENTATION.repeat(it.value)}")
            }
            println("우승자 : ${winner.joinToString(NAME_DELIMITER)}")
        }
    }
}