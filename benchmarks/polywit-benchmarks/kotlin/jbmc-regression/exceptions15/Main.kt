/*
 * Origin of the benchmark:
 *     license: 4-clause BSD (see /java/jbmc-regression/LICENSE)
 *     repo: https://github.com/diffblue/cbmc.git
 *     branch: develop
 *     directory: regression/cbmc-java/exceptions15
 * The benchmark was taken from the repo: 24 January 2018
 */
class InetAddress
class InetSocketAddress

fun lookupPtrRecord(address: InetAddress?): String {
    return "Foo"
}

fun reverse(address: InetAddress): InetAddress {
    return address
}

fun main(args: Array<String>) {
    try {
        val address = InetAddress()
        val domainName = lookupPtrRecord(reverse(address))
    } catch (e: Exception) {
        assert(false)
    }
}