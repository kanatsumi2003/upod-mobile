package a2;

public enum b {
    off("off"),
    fast("fast"),
    highQuality("highQuality"),
    minimal("minimal"),
    zeroShutterLag("zeroShutterLag");
    

    /* renamed from: d  reason: collision with root package name */
    private final String f39d;

    private b(String str) {
        this.f39d = str;
    }

    public String toString() {
        return this.f39d;
    }
}
