import org.polywit.benchmarks.Verifier
fun main(args: Array<String>) {
    val i: Int = Verifier.nondetInt()
    if (i >= 1000) if (i <= 1000) assert(false)
}