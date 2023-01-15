class RacingGame(private val turn: Int, private val cars: Cars) {
    companion object {
        private const val MIN_RAND_NUM_RANGE = 0
        private const val MAX_RAND_NUM_RANGE = 9
        private const val MOVE_LOWER_LIMIT = 4
    }

    fun executeAndReturnWinner(): List<String> {
        for (i in 1..turn) {
            cars.moveOrStop { judgeMove() }
        }
        return getWinnerName()
    }

    private fun judgeMove(): Boolean {
        val range = (MIN_RAND_NUM_RANGE..MAX_RAND_NUM_RANGE)
        val randomNumber = range.random()
        return randomNumber >= MOVE_LOWER_LIMIT
    }

    private fun getWinnerName(): List<String> {
        return cars.getFrontRunnerCar()
            .map { it.name }
            .toList()
    }
}