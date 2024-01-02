package io.flutter.embedding.android;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import io.flutter.plugin.editing.d;
import java.util.HashSet;

public class c0 implements d.a {

    /* renamed from: a  reason: collision with root package name */
    protected final d[] f1449a;

    /* renamed from: b  reason: collision with root package name */
    private final HashSet<KeyEvent> f1450b = new HashSet<>();

    /* renamed from: c  reason: collision with root package name */
    private final e f1451c;

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private int f1452a = 0;

        /* access modifiers changed from: package-private */
        public Character a(int i3) {
            char c4 = (char) i3;
            if ((Integer.MIN_VALUE & i3) != 0) {
                int i4 = i3 & Integer.MAX_VALUE;
                int i5 = this.f1452a;
                if (i5 != 0) {
                    i4 = KeyCharacterMap.getDeadChar(i5, i4);
                }
                this.f1452a = i4;
            } else {
                int i6 = this.f1452a;
                if (i6 != 0) {
                    int deadChar = KeyCharacterMap.getDeadChar(i6, i3);
                    if (deadChar > 0) {
                        c4 = (char) deadChar;
                    }
                    this.f1452a = 0;
                }
            }
            return Character.valueOf(c4);
        }
    }

    private class c {

        /* renamed from: a  reason: collision with root package name */
        final KeyEvent f1453a;

        /* renamed from: b  reason: collision with root package name */
        int f1454b;

        /* renamed from: c  reason: collision with root package name */
        boolean f1455c = false;

        private class a implements d.a {

            /* renamed from: a  reason: collision with root package name */
            boolean f1457a;

            private a() {
                this.f1457a = false;
            }

            public void a(boolean z3) {
                if (!this.f1457a) {
                    this.f1457a = true;
                    c cVar = c.this;
                    int i3 = cVar.f1454b - 1;
                    cVar.f1454b = i3;
                    boolean z4 = z3 | cVar.f1455c;
                    cVar.f1455c = z4;
                    if (i3 == 0 && !z4) {
                        c0.this.d(cVar.f1453a);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
            }
        }

        c(KeyEvent keyEvent) {
            this.f1454b = c0.this.f1449a.length;
            this.f1453a = keyEvent;
        }

        public d.a a() {
            return new a();
        }
    }

    public interface d {

        public interface a {
            void a(boolean z3);
        }

        void a(KeyEvent keyEvent, a aVar);
    }

    public interface e {
        void a(KeyEvent keyEvent);

        boolean c(KeyEvent keyEvent);

        o1.c getBinaryMessenger();
    }

    public c0(e eVar) {
        this.f1451c = eVar;
        this.f1449a = new d[]{new b0(eVar.getBinaryMessenger()), new w(new n1.d(eVar.getBinaryMessenger()))};
    }

    /* access modifiers changed from: private */
    public void d(KeyEvent keyEvent) {
        e eVar = this.f1451c;
        if (eVar != null && !eVar.c(keyEvent)) {
            this.f1450b.add(keyEvent);
            this.f1451c.a(keyEvent);
            if (this.f1450b.remove(keyEvent)) {
                b1.b.f("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
            }
        }
    }

    public boolean a(KeyEvent keyEvent) {
        if (this.f1450b.remove(keyEvent)) {
            return false;
        }
        if (this.f1449a.length > 0) {
            c cVar = new c(keyEvent);
            for (d a4 : this.f1449a) {
                a4.a(keyEvent, cVar.a());
            }
            return true;
        }
        d(keyEvent);
        return true;
    }

    public void c() {
        int size = this.f1450b.size();
        if (size > 0) {
            b1.b.f("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
        }
    }
}
