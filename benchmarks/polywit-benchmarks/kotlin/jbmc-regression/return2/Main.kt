import org.polywit.benchmarks.Verifier

fun main(args: Array<String>) {
    val v1: Int = Verifier.nondetInt()
    val v2: Int = Verifier.nondetInt()
    assert(v1 == v2 // should be able to fail
    )
}