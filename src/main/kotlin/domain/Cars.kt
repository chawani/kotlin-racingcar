package domain

class Cars(private val cars: List<Car>) {

    fun moveOrStop(judgeMove: () -> Boolean) {
        for (car in cars) {
            if (judgeMove()) {
                car.move()
            }
        }
    }

    fun getLocations(): Map<String, Int> = cars.associate { it.name to it.distance }

    fun getFrontRunnerCar(): List<Car> {
        val maxDistance = cars.maxOf { it.distance }
        return cars.filter { it.distance == maxDistance }
    }
}
