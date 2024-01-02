package p1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import n1.f;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private final f f2611a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Context f2612b;
    @SuppressLint({"AppBundleLocaleChanges"})

    /* renamed from: c  reason: collision with root package name */
    final f.b f2613c;

    class a implements f.b {
        a() {
        }

        public String a(String str, String str2) {
            Context a4 = b.this.f2612b;
            if (str2 != null) {
                Locale b4 = b.b(str2);
                Configuration configuration = new Configuration(b.this.f2612b.getResources().getConfiguration());
                configuration.setLocale(b4);
                a4 = b.this.f2612b.createConfigurationContext(configuration);
            }
            int identifier = a4.getResources().getIdentifier(str, "string", b.this.f2612b.getPackageName());
            if (identifier != 0) {
                return a4.getResources().getString(identifier);
            }
            return null;
        }
    }

    public b(Context context, f fVar) {
        a aVar = new a();
        this.f2613c = aVar;
        this.f2612b = context;
        this.f2611a = fVar;
        fVar.c(aVar);
    }

    public static Locale b(String str) {
        String str2;
        String[] split = str.replace('_', '-').split("-", -1);
        String str3 = split[0];
        String str4 = "";
        int i3 = 1;
        if (split.length <= 1 || split[1].length() != 4) {
            str2 = str4;
        } else {
            str2 = split[1];
            i3 = 2;
        }
        if (split.length > i3 && split[i3].length() >= 2 && split[i3].length() <= 3) {
            str4 = split[i3];
        }
        return new Locale(str3, str4, str2);
    }

    public Locale c(List<Locale> list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            ArrayList arrayList = new ArrayList();
            LocaleList a4 = this.f2612b.getResources().getConfiguration().getLocales();
            int size = a4.size();
            for (int i4 = 0; i4 < size; i4++) {
                Locale locale = a4.get(i4);
                String language = locale.getLanguage();
                if (!locale.getScript().isEmpty()) {
                    language = language + "-" + locale.getScript();
                }
                if (!locale.getCountry().isEmpty()) {
                    language = language + "-" + locale.getCountry();
                }
                arrayList.add(new Locale.LanguageRange(language));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage()));
                arrayList.add(new Locale.LanguageRange(locale.getLanguage() + "-*"));
            }
            Locale a5 = Locale.lookup(arrayList, list);
            if (a5 != null) {
                return a5;
            }
        } else if (i3 >= 24) {
            LocaleList a6 = this.f2612b.getResources().getConfiguration().getLocales();
            for (int i5 = 0; i5 < a6.size(); i5++) {
                Locale locale2 = a6.get(i5);
                for (Locale next : list) {
                    if (locale2.equals(next)) {
                        return next;
                    }
                }
                for (Locale next2 : list) {
                    if (locale2.getLanguage().equals(next2.toLanguageTag())) {
                        return next2;
                    }
                }
                for (Locale next3 : list) {
                    if (locale2.getLanguage().equals(next3.getLanguage())) {
                        return next3;
                    }
                }
            }
        } else {
            Locale locale3 = this.f2612b.getResources().getConfiguration().locale;
            if (locale3 != null) {
                for (Locale next4 : list) {
                    if (locale3.equals(next4)) {
                        return next4;
                    }
                }
                for (Locale next5 : list) {
                    if (locale3.getLanguage().equals(next5.toString())) {
                        return next5;
                    }
                }
            }
        }
        return list.get(0);
    }

    public void d(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList a4 = configuration.getLocales();
            int size = a4.size();
            for (int i3 = 0; i3 < size; i3++) {
                arrayList.add(a4.get(i3));
            }
        } else {
            arrayList.add(configuration.locale);
        }
        this.f2611a.b(arrayList);
    }
}
