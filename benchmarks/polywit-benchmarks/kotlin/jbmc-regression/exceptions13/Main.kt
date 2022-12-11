/*
 * Origin of the benchmark:
 *     license: 4-clause BSD (see /java/jbmc-regression/LICENSE)
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/exceptions13
 * The benchmark was taken from the repo: 24 January 2018
 */
open class A : RuntimeException()
open class B : A()
open class C : B()
internal class F {
    fun foo() {
        try {
            val b = B()
            throw b
        } catch (exc: B) {
            throw exc
        }
    }
}


fun main(args: Array<String>) {
    try {
        val f = F()
        f.foo()
    } catch (exc: B) {
        assert(false)
    }
}