/*
 * Origin of the benchmark:
 *     license: 4-clause BSD (see /java/jbmc-regression/LICENSE)
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/exceptions10
 * The benchmark was taken from the repo: 24 January 2018
 */
open class A : RuntimeException()
open class B : A()
internal class C : B()

fun foo() {
    try {
        val b = A()
        throw b
    } catch (exc: A) {
        assert(false)
    }
}

fun main(args: Array<String>) {
    try {
        val a = A()
        foo()
    } catch (exc: B) {
        assert(false)
    }
}