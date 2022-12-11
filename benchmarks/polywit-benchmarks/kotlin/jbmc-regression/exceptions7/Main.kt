/*
 * Origin of the benchmark:
 *     license: 4-clause BSD (see /java/jbmc-regression/LICENSE)
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/exceptions7
 * The benchmark was taken from the repo: 24 January 2018
 */
open class A : RuntimeException()
open class B : A()
internal class C : B()
fun main(args: Array<String>) {
    try {
        try {
            val c = C()
            val a = A()
            throw a
        } catch (exc: C) {
            assert(false)
        } catch (exc: B) {
            assert(false)
        }
    } catch (exc: A) {
        assert(false)
    }
}