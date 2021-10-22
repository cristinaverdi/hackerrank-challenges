package rocks.code.sherpas.hackerrank.challenges.problem.solving

fun main() {
    val numbers = arrayOf(256741038, 623958417, 467905213, 714532089, 938071625)
    minManxSum(numbers)
    bubbleSort(numbers)
    for (number in numbers)
        println(number)

    // 256741038 623958417 467905213 714532089 938071625
}

fun minManxSum(numbers: Array<Int>) {
    bubbleSort(numbers)
    var maxSum = 0L
    var minSum = 0L

    val secondLastIndex = numbers.size - 2
    for (i in 0..secondLastIndex)
        minSum += numbers[i]

    val secondIndex: Int = numbers.size - (numbers.size - 1)

    val lastIndex = numbers.size - 1

    for (i in secondIndex..lastIndex)
        maxSum += numbers[i]

    println("$minSum $maxSum")
}

fun customSort(numbers: Array<Int>) {
    var max: Int
    var temp: Int
    var swapOccurred = true

    while(swapOccurred) {
        swapOccurred = false

        for (i in 0..numbers.size - 1) {
            max = numbers[i]

            if (i + 1 < numbers.size) {
                val next = numbers[i + 1]

                if(max > next) {
                    temp = next
                    numbers[i + 1] = max
                    numbers[i] = temp

                    swapOccurred = true
                }
            }
        }
    }
}

fun bubbleSort(numbers: Array<Int>) {
    var temp: Int

    for (i in 0..numbers.size - 1) {
        for (j in 0..numbers.size - 2 - i) {
            if (numbers[j] > numbers[j + 1]) {
                temp = numbers[j + 1]
                numbers[j + 1] = numbers[j]
                numbers[j] = temp
            }
        }
    }
}