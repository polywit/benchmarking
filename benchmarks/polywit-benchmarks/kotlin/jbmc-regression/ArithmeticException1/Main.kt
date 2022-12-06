import org.polywit.benchmarks.Verifier

fun main(args: Array<String>) {
    try {
        val i = Verifier.nondetInt()
        val j = 10 / i
    } catch (exc: ArithmeticException) {
        throw AssertionError()
    }
}
