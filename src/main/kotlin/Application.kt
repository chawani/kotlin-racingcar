fun main() {
    println("자동차 이름 입력하세요(쉼표로 구분)")
    val names = readln().split(",")
    val cars = names.map { Car(it) }

    println("시도할 횟수를 입력하세요")
    val turn = readln().toInt()
}
