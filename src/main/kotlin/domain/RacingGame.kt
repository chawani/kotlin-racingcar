package domain

class RacingGame(
    names: List<String>
) {

    private val cars: Cars = Cars(names.map { Car(it) })

    companion object {
        private const val MIN_RAND_NUM_RANGE = 0
        private const val MAX_RAND_NUM_RANGE = 9
        private const val MOVE_LOWER_LIMIT = 4
    }

    fun execute(turn: Int) {
        for (i in 1..turn) {
            cars.moveOrStop { judgeMove() }
        }
    }

    private fun judgeMove(): Boolean {
        val range = (MIN_RAND_NUM_RANGE..MAX_RAND_NUM_RANGE)
        val randomNumber = range.random()
        return randomNumber >= MOVE_LOWER_LIMIT
    }

    fun getRaceResult(): Map<String, Int> {
        return cars.getLocations()
    }

    fun getWinnerName(): List<String> {
        return cars.getFrontRunnerCar().map { it.name }
    }
}
