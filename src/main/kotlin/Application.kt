fun main() {
    OutputView.printCarNamesInputMessage()
    val names = InputView.inputCarNames()
    val cars = names.map { Car(it) }

    OutputView.printTurnInputMessage()
    val turn = InputView.inputTurn()

    val racingGame = RacingGame(turn, cars)
    racingGame.start()
}
