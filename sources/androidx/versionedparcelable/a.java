package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected final c.a<String, Method> f523a;

    /* renamed from: b  reason: collision with root package name */
    protected final c.a<String, Method> f524b;

    /* renamed from: c  reason: collision with root package name */
    protected final c.a<String, Class> f525c;

    public a(c.a<String, Method> aVar, c.a<String, Method> aVar2, c.a<String, Class> aVar3) {
        this.f523a = aVar;
        this.f524b = aVar2;
        this.f525c = aVar3;
    }

    private void N(n.a aVar) {
        try {
            I(c(aVar.getClass()).getName());
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException(aVar.getClass().getSimpleName() + " does not have a Parcelizer", e4);
        }
    }

    private Class c(Class<? extends n.a> cls) {
        Class cls2 = this.f525c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f525c.put(cls.getName(), cls3);
        return cls3;
    }

    private Method d(String str) {
        Class<a> cls = a.class;
        Method method = this.f523a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f523a.put(str, declaredMethod);
        return declaredMethod;
    }

    private Method e(Class cls) {
        Method method = this.f524b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c4 = c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c4.getDeclaredMethod("write", new Class[]{cls, a.class});
        this.f524b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    public abstract void A(byte[] bArr);

    public void B(byte[] bArr, int i3) {
        w(i3);
        A(bArr);
    }

    /* access modifiers changed from: protected */
    public abstract void C(CharSequence charSequence);

    public void D(CharSequence charSequence, int i3) {
        w(i3);
        C(charSequence);
    }

    /* access modifiers changed from: protected */
    public abstract void E(int i3);

    public void F(int i3, int i4) {
        w(i4);
        E(i3);
    }

    /* access modifiers changed from: protected */
    public abstract void G(Parcelable parcelable);

    public void H(Parcelable parcelable, int i3) {
        w(i3);
        G(parcelable);
    }

    /* access modifiers changed from: protected */
    public abstract void I(String str);

    public void J(String str, int i3) {
        w(i3);
        I(str);
    }

    /* access modifiers changed from: protected */
    public <T extends n.a> void K(T t3, a aVar) {
        try {
            e(t3.getClass()).invoke((Object) null, new Object[]{t3, aVar});
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e6);
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
        }
    }

    /* access modifiers changed from: protected */
    public void L(n.a aVar) {
        if (aVar == null) {
            I((String) null);
            return;
        }
        N(aVar);
        a b4 = b();
        K(aVar, b4);
        b4.a();
    }

    public void M(n.a aVar, int i3) {
        w(i3);
        L(aVar);
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract a b();

    public boolean f() {
        return false;
    }

    /* access modifiers changed from: protected */
    public abstract boolean g();

    public boolean h(boolean z3, int i3) {
        return !m(i3) ? z3 : g();
    }

    /* access modifiers changed from: protected */
    public abstract byte[] i();

    public byte[] j(byte[] bArr, int i3) {
        return !m(i3) ? bArr : i();
    }

    /* access modifiers changed from: protected */
    public abstract CharSequence k();

    public CharSequence l(CharSequence charSequence, int i3) {
        return !m(i3) ? charSequence : k();
    }

    /* access modifiers changed from: protected */
    public abstract boolean m(int i3);

    /* access modifiers changed from: protected */
    public <T extends n.a> T n(String str, a aVar) {
        try {
            return (n.a) d(str).invoke((Object) null, new Object[]{aVar});
        } catch (IllegalAccessException e4) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        } catch (NoSuchMethodException e6) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e6);
        } catch (ClassNotFoundException e7) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e7);
        }
    }

    /* access modifiers changed from: protected */
    public abstract int o();

    public int p(int i3, int i4) {
        return !m(i4) ? i3 : o();
    }

    /* access modifiers changed from: protected */
    public abstract <T extends Parcelable> T q();

    public <T extends Parcelable> T r(T t3, int i3) {
        return !m(i3) ? t3 : q();
    }

    /* access modifiers changed from: protected */
    public abstract String s();

    public String t(String str, int i3) {
        return !m(i3) ? str : s();
    }

    /* access modifiers changed from: protected */
    public <T extends n.a> T u() {
        String s3 = s();
        if (s3 == null) {
            return null;
        }
        return n(s3, b());
    }

    public <T extends n.a> T v(T t3, int i3) {
        return !m(i3) ? t3 : u();
    }

    /* access modifiers changed from: protected */
    public abstract void w(int i3);

    public void x(boolean z3, boolean z4) {
    }

    /* access modifiers changed from: protected */
    public abstract void y(boolean z3);

    public void z(boolean z3, int i3) {
        w(i3);
        y(z3);
    }
}
