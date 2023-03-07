package validation

object InputValidator {

    private const val NAME_MAX_LENGTH = 5

    fun validateNames(names: List<String>) {
        for (name in names) {
            validateName(name)
        }
    }

    private fun validateName(name: String) {
        require(name.isNotBlank()) { "[ERROR] 이름은 공백일 수 없습니다." }
        require(name.length <= NAME_MAX_LENGTH) { "[ERROR] 이름은 ${NAME_MAX_LENGTH}자를 초과할 수 없습니다." }
    }

    fun validateTurn(turn: Int) {
        require(turn > 0) { "[ERROR] 횟수는 자연수여야 합니다." }
    }
}
