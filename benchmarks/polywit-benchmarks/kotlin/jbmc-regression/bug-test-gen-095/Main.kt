import org.polywit.benchmarks.Verifier
fun main(args: Array<String>) {
    val sb = StringBuilder(Verifier.nondetString())
    sb.append("Z")
    val s: String = sb.toString()
    assert(s.equals("fg"))
}