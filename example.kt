import com.sun.jna.Library
import com.sun.jna.Native

interface lib : Library {
    companion object {
        val INSTANCE = Native.loadLibrary("libgo.so", lib::class.java) as lib
    }

    fun Hi()
}

fun main(args: Array<String>) {
    lib.INSTANCE.Hi()
}
