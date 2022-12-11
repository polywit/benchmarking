/*
 * Origin of the benchmark:
 *     license: 4-clause BSD (see /java/jbmc-regression/LICENSE)
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/exceptions2
 * The benchmark was taken from the repo: 24 January 2018
 */
open class A : Throwable()
open class B : A()
class C : B()
fun main(args: Array<String>) {
    try {
        val b = B()
        throw b
    } catch (exc: C) {
        assert(false)
    } catch (exc: B) {
        assert(false)
    }
}