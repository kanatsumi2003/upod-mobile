package a3;

final class u0 implements f1 {

    /* renamed from: d  reason: collision with root package name */
    private final boolean f113d;

    public u0(boolean z3) {
        this.f113d = z3;
    }

    public boolean b() {
        return this.f113d;
    }

    public v1 h() {
        return null;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(b() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
