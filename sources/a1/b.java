package a1;

import java.util.List;
import y0.e;

public abstract class b implements f {
    private Boolean g(String str) {
        Object c4 = c(str);
        if (c4 instanceof Boolean) {
            return (Boolean) c4;
        }
        return null;
    }

    private String i() {
        return (String) c("sql");
    }

    private List<Object> j() {
        return (List) c("arguments");
    }

    public e d() {
        return new e(i(), j());
    }

    public boolean e() {
        return Boolean.TRUE.equals(c("noResult"));
    }

    public Boolean f() {
        return g("inTransaction");
    }

    public boolean h() {
        return Boolean.TRUE.equals(c("continueOnError"));
    }
}
