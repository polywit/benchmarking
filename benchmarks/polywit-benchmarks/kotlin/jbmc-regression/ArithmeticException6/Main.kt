import org.polywit.benchmarks.Verifier

fun main(args: Array<String>) {
    try {
        val denom = Verifier.nondetInt()
        val j = 10 / denom
    } catch (exc: ArithmeticException) {
        throw AssertionError()
    }
}