/*
 * Origin of the benchmark:
 *     license: 4-clause BSD (see /java/jbmc-regression/LICENSE)
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/exceptions8
 * The benchmark was taken from the repo: 24 January 2018
 */
open class A : RuntimeException()
open class B : A()
internal class C : B()

fun foo() {
    try {
        val b = B()
        throw b
    } catch (exc: C) {
        val i = 0
    }
}

fun main(args: Array<String>) {
    try {
        val a = A()
        foo()
        throw a
    } catch (exc: B) {
        assert(false)
    } catch (exc: A) {
        assert(false)
    }
}