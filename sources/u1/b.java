package u1;

public enum b {
    auto("auto"),
    locked("locked");
    

    /* renamed from: d  reason: collision with root package name */
    private final String f3109d;

    private b(String str) {
        this.f3109d = str;
    }

    public static b a(String str) {
        for (b bVar : values()) {
            if (bVar.f3109d.equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    public String toString() {
        return this.f3109d;
    }
}
