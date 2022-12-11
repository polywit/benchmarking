/*
 * Origin of the benchmark:
 *     license: 4-clause BSD (see /java/jbmc-regression/LICENSE)
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/exceptions5
 * The benchmark was taken from the repo: 24 January 2018
 */
open class A : Throwable()
open class B : A()
open class C : B()
internal class D : C()
fun main(args: Array<String>) {
    try {
        val d = D()
        val c = C()
        val b = B()
        val a = A()
        throw a
    } catch (exc: D) {
        System.out.println("D")
        assert(false)
    } catch (exc: C) {
        System.out.println("C")
        assert(false)
    } catch (exc: B) {
        System.out.println("B")
        assert(false)
    } catch (exc: A) {
        System.out.println("A")
    }
}