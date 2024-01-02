package io.flutter.plugin.editing;

import b1.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private CharSequence f1673a;

    /* renamed from: b  reason: collision with root package name */
    private CharSequence f1674b;

    /* renamed from: c  reason: collision with root package name */
    private int f1675c;

    /* renamed from: d  reason: collision with root package name */
    private int f1676d;

    /* renamed from: e  reason: collision with root package name */
    private int f1677e;

    /* renamed from: f  reason: collision with root package name */
    private int f1678f;

    /* renamed from: g  reason: collision with root package name */
    private int f1679g;

    /* renamed from: h  reason: collision with root package name */
    private int f1680h;

    public g(CharSequence charSequence, int i3, int i4, int i5, int i6) {
        this.f1677e = i3;
        this.f1678f = i4;
        this.f1679g = i5;
        this.f1680h = i6;
        a(charSequence, "", -1, -1);
    }

    public g(CharSequence charSequence, int i3, int i4, CharSequence charSequence2, int i5, int i6, int i7, int i8) {
        this.f1677e = i5;
        this.f1678f = i6;
        this.f1679g = i7;
        this.f1680h = i8;
        a(charSequence, charSequence2.toString(), i3, i4);
    }

    private void a(CharSequence charSequence, CharSequence charSequence2, int i3, int i4) {
        this.f1673a = charSequence;
        this.f1674b = charSequence2;
        this.f1675c = i3;
        this.f1676d = i4;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("oldText", this.f1673a.toString());
            jSONObject.put("deltaText", this.f1674b.toString());
            jSONObject.put("deltaStart", this.f1675c);
            jSONObject.put("deltaEnd", this.f1676d);
            jSONObject.put("selectionBase", this.f1677e);
            jSONObject.put("selectionExtent", this.f1678f);
            jSONObject.put("composingBase", this.f1679g);
            jSONObject.put("composingExtent", this.f1680h);
        } catch (JSONException e4) {
            b.b("TextEditingDelta", "unable to create JSONObject: " + e4);
        }
        return jSONObject;
    }
}
