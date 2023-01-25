package domain

class Cars(
    names: List<String>
) {

    private val cars: List<Car> = names.map { Car(it) }

    fun moveOrStop(judgeMove: () -> Boolean) {
        for (car in cars) {
            if (judgeMove.invoke()) {
                car.move()
            }
        }
    }

    fun getLocations(): Map<String, Int> = this.cars.associate { it.name to it.distance }

    fun getFrontRunnerCar(): List<Car> {
        val maxDistance = cars.maxOf { it.distance }
        return cars.filter { it.distance == maxDistance }.toList()
    }
}