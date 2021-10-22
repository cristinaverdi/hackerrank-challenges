package rocks.code.sherpas.hackerrank.challenges.problem.solving

fun main() {
    val n = 4

    staircase(n)
}

fun staircase(n: Int) {
    var spacesToAdd = n - 1
    var keysToAdd: Int
    var blanks: String
    var pads: String

    for (i in 0..n-1) {
        keysToAdd = i + 1
        blanks = ""
        pads = ""

        for (i in 1..spacesToAdd) {
            blanks += " "
        }

        for(i in 1..keysToAdd) {
            pads += "#"
        }
        spacesToAdd--

        println(blanks + pads)
    }
}
