class RacingGame(private val turn: Int, private val cars: List<Car>) {
    companion object {
        private const val MIN_RAND_NUM_RANGE = 0
        private const val MAX_RAND_NUM_RANGE = 9
        private const val MOVE_LOWER_LIMIT = 4
    }

    fun start() {
        for (i in 1..turn) {
            exceedOneTurn()
        }
    }

    private fun exceedOneTurn() {
        for (car in cars) {
            if (judgeMove()) {
                car.move()
            }
        }
    }

    private fun judgeMove(): Boolean {
        val range = (MIN_RAND_NUM_RANGE..MAX_RAND_NUM_RANGE)
        val randomNumber = range.random()
        return randomNumber >= MOVE_LOWER_LIMIT
    }
}