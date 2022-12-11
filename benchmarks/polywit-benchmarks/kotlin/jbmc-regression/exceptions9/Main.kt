/*
 * Origin of the benchmark:
 *     license: 4-clause BSD (see /java/jbmc-regression/LICENSE)
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/exceptions9
 * The benchmark was taken from the repo: 24 January 2018
 */
open class A : RuntimeException() {
    var i = 1
}

internal class B : A()
fun foo(k: Int): Int {
    try {
        if (k == 0) {
            val a = A()
            throw a
        } else {
            val b = A()
            throw b
        }
    } catch (exc: B) {
        assert(exc.i == 1)
    }
    return 1
}

fun main(args: Array<String>) {
    try {
        val a = A()
        foo(6)
    } catch (exc: A) {
        assert(exc.i == 1)
    }
}