fun main() {
    print(solution(12, 108))
}

@Suppress("NAME_SHADOWING")
fun digitSum(n: Int): Int {
    var n = n
    var sum = 0

    while (n > 0) {
        sum += (n % 10)
        n /= 10
    }

    return sum
}
fun solution(l: Int, r: Int): Int {
    var totalPairs = 0

    for (i in l until r + 1) {
        for (j in i + 1 until r + 1) {
            val sa = digitSum(i)
            val sb = digitSum(j)
            if (j >= (i - sa) && j <= (i + sa) && i >= (j - sb) && i <= (j + sb)) {
                totalPairs++
            }
        }
    }
    return totalPairs
}