package level0.day01

private class Solution1 {
    fun solution(num1: Int, num2: Int): Int {
        Validator1.validateInputRange(num1)
        Validator1.validateInputRange(num2)

        return num1 + num2
    }
}

private object Validator1 {
    private const val PREFIX = "[ERROR] "
    private const val MIN_RANGE = -50000
    private const val MAX_RANGE = 50000

    fun validateInputRange(input : Int){
        require(input in MIN_RANGE .. MAX_RANGE) { "$PREFIX$MIN_RANGE 부터 $MAX_RANGE 까지의 값을 입력해주세요." }
    }
}