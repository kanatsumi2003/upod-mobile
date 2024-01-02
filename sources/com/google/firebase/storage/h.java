package com.google.firebase.storage;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final List<l> f932a;

    /* renamed from: b  reason: collision with root package name */
    private final List<l> f933b;

    /* renamed from: c  reason: collision with root package name */
    private final String f934c;

    h(List<l> list, List<l> list2, String str) {
        this.f932a = list;
        this.f933b = list2;
        this.f934c = str;
    }

    static h a(d dVar, JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (jSONObject.has("prefixes")) {
            JSONArray jSONArray = jSONObject.getJSONArray("prefixes");
            for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                String string = jSONArray.getString(i3);
                if (string.endsWith("/")) {
                    string = string.substring(0, string.length() - 1);
                }
                arrayList.add(dVar.o(string));
            }
        }
        if (jSONObject.has("items")) {
            JSONArray jSONArray2 = jSONObject.getJSONArray("items");
            for (int i4 = 0; i4 < jSONArray2.length(); i4++) {
                arrayList2.add(dVar.o(jSONArray2.getJSONObject(i4).getString("name")));
            }
        }
        return new h(arrayList, arrayList2, jSONObject.optString("nextPageToken", (String) null));
    }

    public List<l> b() {
        return this.f933b;
    }

    public String c() {
        return this.f934c;
    }

    public List<l> d() {
        return this.f932a;
    }
}
