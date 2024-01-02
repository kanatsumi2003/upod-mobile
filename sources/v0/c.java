package v0;

import g0.d;
import java.util.Collections;
import java.util.Map;
import u0.h;

public class c extends e {
    public c(h hVar, d dVar, long j3) {
        super(hVar, dVar);
        if (j3 != 0) {
            super.H("Range", "bytes=" + j3 + "-");
        }
    }

    /* access modifiers changed from: protected */
    public String e() {
        return "GET";
    }

    /* access modifiers changed from: protected */
    public Map<String, String> m() {
        return Collections.singletonMap("alt", "media");
    }
}
