package t1;

public enum b {
    auto("auto"),
    locked("locked");
    

    /* renamed from: d  reason: collision with root package name */
    private final String f3077d;

    private b(String str) {
        this.f3077d = str;
    }

    public static b a(String str) {
        for (b bVar : values()) {
            if (bVar.f3077d.equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    public String toString() {
        return this.f3077d;
    }
}
