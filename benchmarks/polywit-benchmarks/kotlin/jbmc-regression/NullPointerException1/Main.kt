/*
 * Origin of the benchmark:
 *     license: 4-clause BSD (see /java/jbmc-regression/LICENSE)
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/NullPointerException1
 * The benchmark was taken from the repo: 24 January 2018
 */
fun main(args: Array<String>) {
    val o: Object? = null
    try {
        o.hashCode()
        assert(false)
    } catch (e: Exception) {
    }
}