import constant.ValidationConstants.NAME_MAX_LENGTH
import constant.ViewConstants.NAME_DELIMITER

class InputView {
    companion object {

        fun inputCarNames(): List<String> {
            var names: List<String>

            while (true) {
                try {
                    names = readln().split(NAME_DELIMITER)
                    for (name in names) {
                        validateName(name)
                    }
                    return names
                } catch (e: IllegalArgumentException) {
                    continue
                }
            }
        }

        private fun validateName(name: String) {
            if (name.isBlank()) {
                throw IllegalArgumentException("이름은 공백일 수 없습니다.")
            }
            if (name.length > NAME_MAX_LENGTH) {
                throw IllegalArgumentException("이름은 ${NAME_MAX_LENGTH}자를 초과할 수 없습니다.")
            }
        }

        fun inputTurn(): Int = readln().toInt()
    }
}