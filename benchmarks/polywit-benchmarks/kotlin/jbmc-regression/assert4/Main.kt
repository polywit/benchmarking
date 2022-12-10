import org.polywit.benchmarks.Verifier
fun main(args: Array<String>) {
    val i: Int = Verifier.nondetInt()
    if (i >= 10) assert(i >= 20) {
        "my super assertion" // should hold
    }
}