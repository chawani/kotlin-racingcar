fun main() {
    OutputView.printCarNamesInputMessage()
    val names = InputView.inputCarNames()
    val cars = Cars(names)

    OutputView.printTurnInputMessage()
    val turn = InputView.inputTurn()

    val racingGame = RacingGame(turn, cars)
    val winner = racingGame.executeAndReturnWinner()

    OutputView.printResult(cars, winner)
}
