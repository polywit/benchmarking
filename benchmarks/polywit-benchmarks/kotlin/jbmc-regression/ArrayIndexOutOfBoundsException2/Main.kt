import org.polywit.benchmarks.Verifier

fun main(args: Array<String>) {
    val size: Int = Verifier.nondetInt()
    if (size < 0) return
    try {
        val a = IntArray(4)
        val i = a[size]
    } catch (exc: ArrayIndexOutOfBoundsException) {
        throw AssertionError()
    }
}