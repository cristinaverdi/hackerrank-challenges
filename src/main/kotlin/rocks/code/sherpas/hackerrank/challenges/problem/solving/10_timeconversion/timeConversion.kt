package rocks.code.sherpas.hackerrank.challenges.problem.solving.`10_timeconversion`

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    val AMTimeDictionary =
        mapOf(
            "12" to "00",
            "01" to "01",
            "02" to "02",
            "03" to "03",
            "04" to "04",
            "05" to "05",
            "06" to "06",
            "07" to "07",
            "08" to "08",
            "09" to "09",
            "10" to "10",
            "11" to "11"
        )
    val PMTimeDictionary = mapOf(
        "12" to "12",
        "01" to "13",
        "02" to "14",
        "03" to "15",
        "04" to "16",
        "05" to "17",
        "06" to "18",
        "07" to "19",
        "08" to "20",
        "09" to "21",
        "10" to "22",
        "11" to "23"
    )
    var isAM = false

    isAM = s.contains("AM")

    if (isAM) {
        return convertTo24hAndFormat(s, AMTimeDictionary)
    }

    return convertTo24hAndFormat(s, PMTimeDictionary)
}

private fun convertTo24hAndFormat(
    timeIn12hFormat: String,
    AMTimeDictionary: Map<String, String>
): String {
    val hour12 = timeIn12hFormat.substring(0, 2)
    val hour24 = AMTimeDictionary.get(hour12)

    return timeIn12hFormat.replace(hour12, hour24!!).dropLast(2)
}

fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
