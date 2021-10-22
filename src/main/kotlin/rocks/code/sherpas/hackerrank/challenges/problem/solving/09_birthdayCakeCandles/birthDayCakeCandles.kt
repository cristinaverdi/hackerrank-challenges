package rocks.code.sherpas.hackerrank.challenges.problem.solving.`09_birthdayCakeCandles`

import rocks.code.sherpas.hackerrank.challenges.problem.solving.bubbleSort

fun main() {
    val candles = arrayOf(82, 49, 82, 82, 41, 82, 15, 63, 38, 25)
    println(birthDayCakeCandles(candles))

}

fun birthDayCakeCandles(candles: Array<Int>): Int {
    var max = candles.first()
    var count: Int = 1

    for (i in 1 until candles.size) {
        val candle = candles[i]
        if (max < candle) {
            max = candle
            count = 1
        } else if (max == candles[i]) {
            count++
        }
    }

    return count
}

fun birthDayCakeCandles1(candles: Array<Int>): Int {
    bubbleSort(candles)

    var max = candles.last()
    var count = 0

    //countMax
    for (i in 0..candles.size - 1) {
        if (candles[candles.size - 1 - i] == max) {
            count++
        }
    }

    return count
}

fun bubbleSort(numbers: Array<Int>) {
    var temp: Int
    for (i in 0..numbers.size - 1) {
        for (j in 0..numbers.size - 2 - i) {
            if (numbers[j] > numbers[j + 1]) {
                temp = numbers[j]
                numbers[j] = numbers[j + 1]
                numbers[j + 1] = temp
            }
        }
    }
}
