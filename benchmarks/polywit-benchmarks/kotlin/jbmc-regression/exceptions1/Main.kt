/*
 * Origin of the benchmark:
 *     license: 4-clause BSD (see /java/jbmc-regression/LICENSE)
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/exceptions1
 * The benchmark was taken from the repo: 24 January 2018
 */

fun main(args: Array<String>) {
    open class A : Throwable()
    open class B : A()
    open class C : B()
    class D : C()
    try {
        val d = D()
        val c = C()
        val b = B()
        val a = A()
        throw a
    } catch (exc: D) {
        assert(false)
    } catch (exc: C) {
        assert(false)
    } catch (exc: B) {
        assert(false)
    } catch (exc: A) {
        assert(false)
    }
}