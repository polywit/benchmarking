/*
 * Origin of the benchmark:
 *     license: 4-clause BSD (see /java/jbmc-regression/LICENSE)
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/return1
 * The benchmark was taken from the repo: 24 January 2018
 */
fun short_value(): Short {
    return 1
}

fun bool_value(): Boolean {
    return true
}

fun long_value(): Long {
    return 0x10000ffffL
}

fun main(args: Array<String>) {
    val s = short_value()
    if (s.toInt() == 1) if (bool_value()) if (long_value() == 0x10000ffffL) assert(false)
}