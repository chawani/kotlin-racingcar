class OutputView {
    companion object {
        fun printCarNamesInputMessage() = println("자동차 이름 입력하세요(쉼표로 구분)")

        fun printTurnInputMessage() = println("시도할 횟수를 입력하세요")

        fun printResult(cars: Cars, winner: List<String>) {
            val locations = cars.getLocations()
            locations.forEach {
                println("${it.key} : ${"-".repeat(it.value)}")
            }
            println("우승자 : ${winner.joinToString(",")}")
        }
    }
}