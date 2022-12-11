/*
 * Origin of the benchmark:
 *     license: 4-clause BSD (see /java/jbmc-regression/LICENSE)
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/NullPointerException3
 * The benchmark was taken from the repo: 24 January 2018
 */
internal class A {
    var i = 0
}

fun main(args: Array<String>) {
    val a: A? = null
    try {
        val i = a!!.i
    } catch (exc: NullPointerException) {
        assert(false)
    }
}