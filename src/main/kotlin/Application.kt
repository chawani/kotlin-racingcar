import domain.RacingGame
import view.Console

fun main() {
    val racingGame = RacingGame(Console.inputCarNames())
    racingGame.execute(Console.inputTurn())
    printRacingGameResult(racingGame)
}

private fun printRacingGameResult(racingGame: RacingGame) {
    Console.printResult(
        racingGame.getRaceResult(),
        racingGame.getWinnerName()
    )
}
