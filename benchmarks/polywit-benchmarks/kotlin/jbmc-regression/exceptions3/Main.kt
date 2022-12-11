/*
 * Origin of the benchmark:
 *     license: 4-clause BSD (see /java/jbmc-regression/LICENSE)
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/exceptions3
 * The benchmark was taken from the repo: 24 January 2018
 */
open class A : Throwable()
open class B : A()
internal class C : B()
fun main(args: Array<String>) {
    try {
        throw B()
    } catch (exc: C) {
        assert(false)
    } catch (exc: B) {
        assert(false)
    }
}