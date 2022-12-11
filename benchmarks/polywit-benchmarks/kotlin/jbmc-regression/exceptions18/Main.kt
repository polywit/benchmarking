/*
 * Origin of the benchmark:
 *     license: 4-clause BSD (see /java/jbmc-regression/LICENSE)
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/exceptions18
 * The benchmark was taken from the repo: 24 January 2018
 */
open class A : RuntimeException()
internal class B : A()

private fun foo() {
    val a = A()
    throw a
}

fun main(args: Array<String>) {
    try {
        foo()
        assert(false)
    } catch (e: B) {
        assert(false)
    } catch (e: A) {
        // expected here
    }
}