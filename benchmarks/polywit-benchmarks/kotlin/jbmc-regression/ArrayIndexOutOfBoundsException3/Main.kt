import org.polywit.benchmarks.Verifier

fun main(args: Array<String>) {
    try {
        val a = IntArray(4)
        a[Verifier.nondetInt()] = 0
    } catch (exc: Exception) {
        throw AssertionError()
    }
}