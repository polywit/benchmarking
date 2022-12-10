import org.polywit.benchmarks.Verifier
fun main(args: Array<String>) {
    val i: Int = Verifier.nondetInt()
    if (i >= 1000) assert(i > 1000) {
        "i is greater 1000" // should fail
    }
}