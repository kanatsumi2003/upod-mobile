package t;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import androidx.window.R;
import c.e;
import java.util.Locale;
import p.b;
import q.h;
import q.k;
import y.d;

public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    private static final e<String, String> f2886a = new e<>();

    /* renamed from: b  reason: collision with root package name */
    private static Locale f2887b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return d.a(context).b(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context) {
        return context.getResources().getString(b.common_google_play_services_notification_channel_name);
    }

    public static String c(Context context, int i3) {
        return context.getResources().getString(i3 != 1 ? i3 != 2 ? i3 != 3 ? 17039370 : b.common_google_play_services_enable_button : b.common_google_play_services_update_button : b.common_google_play_services_install_button);
    }

    public static String d(Context context, int i3) {
        Resources resources = context.getResources();
        String a4 = a(context);
        if (i3 == 1) {
            return resources.getString(b.common_google_play_services_install_text, new Object[]{a4});
        } else if (i3 != 2) {
            if (i3 == 3) {
                return resources.getString(b.common_google_play_services_enable_text, new Object[]{a4});
            } else if (i3 == 5) {
                return h(context, "common_google_play_services_invalid_account_text", a4);
            } else {
                if (i3 == 7) {
                    return h(context, "common_google_play_services_network_error_text", a4);
                }
                if (i3 == 9) {
                    return resources.getString(b.common_google_play_services_unsupported_text, new Object[]{a4});
                } else if (i3 == 20) {
                    return h(context, "common_google_play_services_restricted_profile_text", a4);
                } else {
                    switch (i3) {
                        case 16:
                            return h(context, "common_google_play_services_api_unavailable_text", a4);
                        case 17:
                            return h(context, "common_google_play_services_sign_in_failed_text", a4);
                        case 18:
                            return resources.getString(b.common_google_play_services_updating_text, new Object[]{a4});
                        default:
                            return resources.getString(k.common_google_play_services_unknown_issue, new Object[]{a4});
                    }
                }
            }
        } else if (x.e.c(context)) {
            return resources.getString(b.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(b.common_google_play_services_update_text, new Object[]{a4});
        }
    }

    public static String e(Context context, int i3) {
        return (i3 == 6 || i3 == 19) ? h(context, "common_google_play_services_resolution_required_text", a(context)) : d(context, i3);
    }

    public static String f(Context context, int i3) {
        String i4 = i3 == 6 ? i(context, "common_google_play_services_resolution_required_title") : g(context, i3);
        return i4 == null ? context.getResources().getString(b.common_google_play_services_notification_ticker) : i4;
    }

    public static String g(Context context, int i3) {
        String str;
        Resources resources = context.getResources();
        switch (i3) {
            case 1:
                return resources.getString(b.common_google_play_services_install_title);
            case 2:
                return resources.getString(b.common_google_play_services_update_title);
            case 3:
                return resources.getString(b.common_google_play_services_enable_title);
            case 4:
            case R.styleable.SplitPairRule_splitRatio:
            case 18:
                return null;
            case R.styleable.SplitPairRule_splitMinWidth:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return i(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return i(context, "common_google_play_services_network_error_title");
            case 8:
                str = "Internal error occurred. Please see logs for detailed information";
                break;
            case 9:
                str = "Google Play services is invalid. Cannot recover.";
                break;
            case 10:
                str = "Developer error occurred. Please see logs for detailed information";
                break;
            case 11:
                str = "The application is not licensed to the user.";
                break;
            case 16:
                str = "One of the API components you attempted to connect to is not available.";
                break;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return i(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return i(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i3);
                str = sb.toString();
                break;
        }
        Log.e("GoogleApiAvailability", str);
        return null;
    }

    private static String h(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String i3 = i(context, str);
        if (i3 == null) {
            i3 = resources.getString(k.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, i3, new Object[]{str2});
    }

    private static String i(Context context, String str) {
        e<String, String> eVar = f2886a;
        synchronized (eVar) {
            Locale c4 = i.b.a(context.getResources().getConfiguration()).c(0);
            if (!c4.equals(f2887b)) {
                eVar.clear();
                f2887b = c4;
            }
            String str2 = eVar.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources b4 = h.b(context);
            if (b4 == null) {
                return null;
            }
            int identifier = b4.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Missing resource: ".concat(str) : new String("Missing resource: "));
                return null;
            }
            String string = b4.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                Log.w("GoogleApiAvailability", str.length() != 0 ? "Got empty resource: ".concat(str) : new String("Got empty resource: "));
                return null;
            }
            eVar.put(str, string);
            return string;
        }
    }
}
