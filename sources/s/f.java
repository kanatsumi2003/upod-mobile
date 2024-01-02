package s;

public final class f<L> {

    /* renamed from: a  reason: collision with root package name */
    private final L f2832a;

    /* renamed from: b  reason: collision with root package name */
    private final String f2833b;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f2832a == fVar.f2832a && this.f2833b.equals(fVar.f2833b);
    }

    public int hashCode() {
        return (System.identityHashCode(this.f2832a) * 31) + this.f2833b.hashCode();
    }
}
