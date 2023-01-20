fun main() {
    val racingGame = RacingGame(inputNames())
    racingGame.start(inputTurn())
    printRacingGameResult(racingGame)
}

private fun inputNames(): List<String> {
    OutputView.printCarNamesInputMessage()
    return InputView.inputCarNames()
}

private fun inputTurn(): Int {
    OutputView.printTurnInputMessage()
    return InputView.inputTurn()
}

private fun printRacingGameResult(racingGame: RacingGame) {
    OutputView.printResult(
        racingGame.getRaceResult(),
        racingGame.getWinnerName()
    )
}
