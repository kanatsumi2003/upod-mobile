package q;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import t.m1;
import t.n1;
import t.o;
import z.a;
import z.b;

abstract class t extends m1 {

    /* renamed from: a  reason: collision with root package name */
    private final int f2645a;

    protected t(byte[] bArr) {
        o.a(bArr.length == 25);
        this.f2645a = Arrays.hashCode(bArr);
    }

    protected static byte[] b(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e4) {
            throw new AssertionError(e4);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract byte[] c();

    public final a e() {
        return b.c(c());
    }

    public final boolean equals(Object obj) {
        a e4;
        if (obj != null && (obj instanceof n1)) {
            try {
                n1 n1Var = (n1) obj;
                if (n1Var.i() != this.f2645a || (e4 = n1Var.e()) == null) {
                    return false;
                }
                return Arrays.equals(c(), (byte[]) b.b(e4));
            } catch (RemoteException e5) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e5);
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f2645a;
    }

    public final int i() {
        return this.f2645a;
    }
}
