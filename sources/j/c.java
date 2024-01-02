package j;

import android.util.Log;
import java.io.Writer;

@Deprecated
public class c extends Writer {

    /* renamed from: d  reason: collision with root package name */
    private final String f2034d;

    /* renamed from: e  reason: collision with root package name */
    private StringBuilder f2035e = new StringBuilder(128);

    public c(String str) {
        this.f2034d = str;
    }

    private void a() {
        if (this.f2035e.length() > 0) {
            Log.d(this.f2034d, this.f2035e.toString());
            StringBuilder sb = this.f2035e;
            sb.delete(0, sb.length());
        }
    }

    public void close() {
        a();
    }

    public void flush() {
        a();
    }

    public void write(char[] cArr, int i3, int i4) {
        for (int i5 = 0; i5 < i4; i5++) {
            char c4 = cArr[i3 + i5];
            if (c4 == 10) {
                a();
            } else {
                this.f2035e.append(c4);
            }
        }
    }
}
