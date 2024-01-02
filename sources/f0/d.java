package f0;

public final class d extends IllegalStateException {
    private d(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(k<?> kVar) {
        if (!kVar.m()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception j3 = kVar.j();
        String concat = j3 != null ? "failure" : kVar.n() ? "result ".concat(String.valueOf(kVar.k())) : kVar.l() ? "cancellation" : "unknown issue";
        return new d(concat.length() != 0 ? "Complete with: ".concat(concat) : new String("Complete with: "), j3);
    }
}
