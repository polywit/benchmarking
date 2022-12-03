package org.polywit.benchmarks

import java.util.Random

object Verifier {
    fun assume(condition: Boolean) {
        if (!condition) {
            Runtime.getRuntime().halt(1)
        }
    }

    fun nondetBoolean(): Boolean {
        return Random().nextBoolean()
    }

    fun nondetByte(): Byte {
        return Random().nextInt().toByte()
    }

    fun nondetChar(): Char {
        return Random().nextInt().toChar()
    }

    fun nondetShort(): Short {
        return Random().nextInt().toShort()
    }

    fun nondetInt(): Int {
        return Random().nextInt()
    }

    fun nondetLong(): Long {
        return Random().nextLong()
    }

    fun nondetFloat(): Float {
        return Random().nextFloat()
    }

    fun nondetDouble(): Double {
        return Random().nextDouble()
    }

    fun nondetString(): String {
        val random = Random()
        val size: Int = random.nextInt()
        assume(size >= 0)
        val bytes = ByteArray(size)
        random.nextBytes(bytes)
        return String(bytes)
    }
}
