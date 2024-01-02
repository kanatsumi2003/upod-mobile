package x1;

public enum b {
    off("off"),
    auto("auto"),
    always("always"),
    torch("torch");
    

    /* renamed from: d  reason: collision with root package name */
    private final String f3179d;

    private b(String str) {
        this.f3179d = str;
    }

    public static b a(String str) {
        for (b bVar : values()) {
            if (bVar.f3179d.equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    public String toString() {
        return this.f3179d;
    }
}
