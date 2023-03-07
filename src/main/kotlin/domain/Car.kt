package domain

class Car(
    val name: String,
    distance: Int = 0
) {

    var distance = distance
        private set

    fun move() {
        distance += 1
    }
}
