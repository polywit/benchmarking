/*
 * Origin of the benchmark:
 *     license: 4-clause BSD (see /java/jbmc-regression/LICENSE)
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/exceptions6
 * The benchmark was taken from the repo: 24 January 2018
 */
open class A : RuntimeException() {
    var i = 1
}

open class B : A()
internal class C : B()

fun main(args: Array<String>) {
    try {
        try {
            val i = 0
            throw A()
        } catch (exc: A) {
            assert(exc.i == 2)
        }
    } catch (exc: B) {
        assert(exc.i == 2)
    }
}