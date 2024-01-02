package io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;
import n1.p;

class e extends SpannableStringBuilder {

    /* renamed from: d  reason: collision with root package name */
    private int f1655d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f1656e = 0;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<b> f1657f = new ArrayList<>();

    /* renamed from: g  reason: collision with root package name */
    private ArrayList<b> f1658g = new ArrayList<>();

    /* renamed from: h  reason: collision with root package name */
    private ArrayList<g> f1659h = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    private String f1660i;

    /* renamed from: j  reason: collision with root package name */
    private String f1661j;

    /* renamed from: k  reason: collision with root package name */
    private int f1662k;

    /* renamed from: l  reason: collision with root package name */
    private int f1663l;

    /* renamed from: m  reason: collision with root package name */
    private int f1664m;

    /* renamed from: n  reason: collision with root package name */
    private int f1665n;

    /* renamed from: o  reason: collision with root package name */
    private BaseInputConnection f1666o;

    class a extends BaseInputConnection {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Editable f1667a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(View view, boolean z3, Editable editable) {
            super(view, z3);
            this.f1667a = editable;
        }

        public Editable getEditable() {
            return this.f1667a;
        }
    }

    interface b {
        void a(boolean z3, boolean z4, boolean z5);
    }

    public e(p.e eVar, View view) {
        this.f1666o = new a(view, true, this);
        if (eVar != null) {
            n(eVar);
        }
    }

    private void j(b bVar, boolean z3, boolean z4, boolean z5) {
        this.f1656e++;
        bVar.a(z3, z4, z5);
        this.f1656e--;
    }

    private void k(boolean z3, boolean z4, boolean z5) {
        if (z3 || z4 || z5) {
            Iterator<b> it = this.f1657f.iterator();
            while (it.hasNext()) {
                j(it.next(), z3, z4, z5);
            }
        }
    }

    public void a(b bVar) {
        ArrayList<b> arrayList;
        if (this.f1656e > 0) {
            b1.b.b("ListenableEditingState", "adding a listener " + bVar.toString() + " in a listener callback");
        }
        if (this.f1655d > 0) {
            b1.b.f("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            arrayList = this.f1658g;
        } else {
            arrayList = this.f1657f;
        }
        arrayList.add(bVar);
    }

    public void b() {
        this.f1655d++;
        if (this.f1656e > 0) {
            b1.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f1655d == 1 && !this.f1657f.isEmpty()) {
            this.f1661j = toString();
            this.f1662k = i();
            this.f1663l = h();
            this.f1664m = g();
            this.f1665n = f();
        }
    }

    public void c() {
        this.f1659h.clear();
    }

    public void d() {
        int i3 = this.f1655d;
        if (i3 == 0) {
            b1.b.b("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i3 == 1) {
            Iterator<b> it = this.f1658g.iterator();
            while (it.hasNext()) {
                j(it.next(), true, true, true);
            }
            if (!this.f1657f.isEmpty()) {
                b1.b.e("ListenableEditingState", "didFinishBatchEdit with " + String.valueOf(this.f1657f.size()) + " listener(s)");
                boolean equals = toString().equals(this.f1661j) ^ true;
                boolean z3 = false;
                boolean z4 = (this.f1662k == i() && this.f1663l == h()) ? false : true;
                if (!(this.f1664m == g() && this.f1665n == f())) {
                    z3 = true;
                }
                k(equals, z4, z3);
            }
        }
        this.f1657f.addAll(this.f1658g);
        this.f1658g.clear();
        this.f1655d--;
    }

    public ArrayList<g> e() {
        ArrayList<g> arrayList = new ArrayList<>(this.f1659h);
        this.f1659h.clear();
        return arrayList;
    }

    public final int f() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    public final int g() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    public final int h() {
        return Selection.getSelectionEnd(this);
    }

    public final int i() {
        return Selection.getSelectionStart(this);
    }

    public void l(b bVar) {
        if (this.f1656e > 0) {
            b1.b.b("ListenableEditingState", "removing a listener " + bVar.toString() + " in a listener callback");
        }
        this.f1657f.remove(bVar);
        if (this.f1655d > 0) {
            this.f1658g.remove(bVar);
        }
    }

    public void m(int i3, int i4) {
        if (i3 < 0 || i3 >= i4) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f1666o.setComposingRegion(i3, i4);
        }
    }

    public void n(p.e eVar) {
        b();
        replace(0, length(), eVar.f2520a);
        if (eVar.c()) {
            Selection.setSelection(this, eVar.f2521b, eVar.f2522c);
        } else {
            Selection.removeSelection(this);
        }
        m(eVar.f2523d, eVar.f2524e);
        c();
        d();
    }

    public SpannableStringBuilder replace(int i3, int i4, CharSequence charSequence, int i5, int i6) {
        boolean z3;
        boolean z4;
        if (this.f1656e > 0) {
            b1.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String eVar = toString();
        int i7 = i4 - i3;
        boolean z5 = i7 != i6 - i5;
        for (int i8 = 0; i8 < i7 && !z5; i8++) {
            z5 |= charAt(i3 + i8) != charSequence.charAt(i5 + i8);
        }
        CharSequence charSequence2 = charSequence;
        if (z5) {
            this.f1660i = null;
        }
        int i9 = i();
        int h3 = h();
        int g3 = g();
        int f4 = f();
        SpannableStringBuilder replace = super.replace(i3, i4, charSequence, i5, i6);
        g gVar = r1;
        boolean z6 = z5;
        int i10 = f4;
        g gVar2 = new g(eVar, i3, i4, charSequence, i(), h(), g(), f());
        this.f1659h.add(gVar);
        if (this.f1655d > 0) {
            return replace;
        }
        boolean z7 = (i() == i9 && h() == h3) ? false : true;
        if (g() == g3 && f() == i10) {
            z3 = z6;
            z4 = false;
        } else {
            z3 = z6;
            z4 = true;
        }
        k(z3, z7, z4);
        return replace;
    }

    public void setSpan(Object obj, int i3, int i4, int i5) {
        super.setSpan(obj, i3, i4, i5);
        this.f1659h.add(new g(toString(), i(), h(), g(), f()));
    }

    public String toString() {
        String str = this.f1660i;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f1660i = spannableStringBuilder;
        return spannableStringBuilder;
    }
}
