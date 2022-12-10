/*
 * Origin of the benchmark:
 *     license: 4-clause BSD (see /java/jbmc-regression/LICENSE)
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/athrow1
 * The benchmark was taken from the repo: 24 January 2018
 */
internal class A : Exception()
fun main(args: Array<String>) {
    val a = A()
    try {
        throw a
    } catch (e: Exception) {
        assert(false)
    }
}