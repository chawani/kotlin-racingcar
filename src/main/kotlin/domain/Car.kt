package domain

class Car(
    val name: String,
    var distance: Int = 0
) {

    fun move() {
        distance += 1
    }
}

fun List<Car>.moveOrStop(judgeMove: () -> Boolean) {
    for (car in this) {
        if (judgeMove.invoke()) {
            car.move()
        }
    }
}

fun List<Car>.getLocations(): Map<String, Int> = this.associate { it.name to it.distance }

fun List<Car>.getFrontRunnerCar(): List<Car> {
    val maxDistance = this.maxOf { it.distance }
    return this.filter { it.distance == maxDistance }.toList()
}
