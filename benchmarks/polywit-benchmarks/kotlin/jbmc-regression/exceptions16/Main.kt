import org.polywit.benchmarks.Verifier

open class A : RuntimeException()
open class B : A()
open class C : B()
fun main(args: Array<String>) {
    var x: Int = Verifier.nondetInt()
    try {
        x++
    } catch (exc: A) {
        assert(false)
    }
    try {
        throw B()
    } catch (exc: B) {
        assert(false)
    }
}