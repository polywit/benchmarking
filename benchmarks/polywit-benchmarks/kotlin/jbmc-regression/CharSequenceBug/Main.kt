import org.polywit.benchmarks.Verifier
fun main(args: Array<String>) {
    val s: String = Verifier.nondetString()
    val target: CharSequence = "b"
    var replaced = ""
    if (target.length === 1) replaced = s.replace('b', 'c')
    assert(replaced.indexOf('b') !== -1)
}