package s0;

final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f2874a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2875b;

    a(String str, String str2) {
        if (str != null) {
            this.f2874a = str;
            if (str2 != null) {
                this.f2875b = str2;
                return;
            }
            throw new NullPointerException("Null version");
        }
        throw new NullPointerException("Null libraryName");
    }

    public String b() {
        return this.f2874a;
    }

    public String c() {
        return this.f2875b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f2874a.equals(fVar.b()) && this.f2875b.equals(fVar.c());
    }

    public int hashCode() {
        return ((this.f2874a.hashCode() ^ 1000003) * 1000003) ^ this.f2875b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f2874a + ", version=" + this.f2875b + "}";
    }
}
