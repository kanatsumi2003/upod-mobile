package g0;

import t.o;

public class j extends Exception {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(String str) {
        super(str);
        o.e(str, "Detail message must not be empty");
    }
}
