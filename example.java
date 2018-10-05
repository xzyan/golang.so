import com.sun.jna.Library;
import com.sun.jna.Native;

public class Main {
    public interface lib extends Library {
        lib INSTANCE = (lib) Native.loadLibrary("libgo.so", lib.class);

        void Hi();
    }

    public static void main(String[] args) {
        lib.INSTANCE.Hi();
    }
}
