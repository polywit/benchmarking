import java.io.BufferedReader
import java.io.StringReader
import org.polywit.benchmarks.Verifier

@Throws(Exception::class)
fun check(br: BufferedReader): String {
    return br.readLine()
}

fun main(args: Array<String>) {
    val arg: String = Verifier.nondetString()
    var thisLine: String? = null
    var numLines = 0
    try {
        val br = BufferedReader(StringReader(arg))
        val line = check(br)
        while (check(br).also { thisLine = it } != null) {
            System.out.println(thisLine)
            numLines += 1
        }
    } catch (e: Exception) {
        e.printStackTrace()
        return
    }
    assert(numLines > 0)
}