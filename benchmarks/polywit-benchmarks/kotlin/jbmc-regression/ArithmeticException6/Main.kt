/*
 * Origin of the benchmark:
 *     license: 4-clause BSD (see /java/jbmc-regression/LICENSE)
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/ArithmeticException6
 * The benchmark was taken from the repo: 24 January 2018
 */

import org.polywit.benchmarks.Verifier

fun main(args: Array<String>) {
    try {
        val denom = Verifier.nondetInt()
        val j = 10 / denom
    } catch (exc: ArithmeticException) {
        throw AssertionError()
    }
}