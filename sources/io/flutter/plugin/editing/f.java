package io.flutter.plugin.editing;

import android.os.Bundle;
import android.view.textservice.SentenceSuggestionsInfo;
import android.view.textservice.SpellCheckerSession;
import android.view.textservice.SuggestionsInfo;
import android.view.textservice.TextInfo;
import android.view.textservice.TextServicesManager;
import java.util.ArrayList;
import java.util.Locale;
import n1.n;
import o1.k;
import p1.b;

public class f implements n.b, SpellCheckerSession.SpellCheckerSessionListener {

    /* renamed from: a  reason: collision with root package name */
    private final n f1669a;

    /* renamed from: b  reason: collision with root package name */
    private final TextServicesManager f1670b;

    /* renamed from: c  reason: collision with root package name */
    private SpellCheckerSession f1671c;

    /* renamed from: d  reason: collision with root package name */
    k.d f1672d;

    public f(TextServicesManager textServicesManager, n nVar) {
        this.f1670b = textServicesManager;
        this.f1669a = nVar;
        nVar.b(this);
    }

    public void a(String str, String str2, k.d dVar) {
        if (this.f1672d != null) {
            dVar.b("error", "Previous spell check request still pending.", (Object) null);
            return;
        }
        this.f1672d = dVar;
        c(str, str2);
    }

    public void b() {
        this.f1669a.b((n.b) null);
        SpellCheckerSession spellCheckerSession = this.f1671c;
        if (spellCheckerSession != null) {
            spellCheckerSession.close();
        }
    }

    public void c(String str, String str2) {
        str.split("-");
        Locale b4 = b.b(str);
        if (this.f1671c == null) {
            this.f1671c = this.f1670b.newSpellCheckerSession((Bundle) null, b4, this, true);
        }
        this.f1671c.getSentenceSuggestions(new TextInfo[]{new TextInfo(str2)}, 5);
    }

    public void onGetSentenceSuggestions(SentenceSuggestionsInfo[] sentenceSuggestionsInfoArr) {
        ArrayList arrayList;
        k.d dVar;
        if (sentenceSuggestionsInfoArr.length == 0) {
            dVar = this.f1672d;
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList();
            SentenceSuggestionsInfo sentenceSuggestionsInfo = sentenceSuggestionsInfoArr[0];
            for (int i3 = 0; i3 < sentenceSuggestionsInfo.getSuggestionsCount(); i3++) {
                SuggestionsInfo suggestionsInfoAt = sentenceSuggestionsInfo.getSuggestionsInfoAt(i3);
                int suggestionsCount = suggestionsInfoAt.getSuggestionsCount();
                if (suggestionsCount > 0) {
                    int offsetAt = sentenceSuggestionsInfo.getOffsetAt(i3);
                    String str = ("" + String.valueOf(offsetAt) + ".") + String.valueOf((sentenceSuggestionsInfo.getLengthAt(i3) + offsetAt) - 1) + ".";
                    for (int i4 = 0; i4 < suggestionsCount; i4++) {
                        str = str + suggestionsInfoAt.getSuggestionAt(i4) + "\n";
                    }
                    arrayList.add(str.substring(0, str.length() - 1));
                }
            }
            dVar = this.f1672d;
        }
        dVar.a(arrayList);
        this.f1672d = null;
    }

    public void onGetSuggestions(SuggestionsInfo[] suggestionsInfoArr) {
    }
}
