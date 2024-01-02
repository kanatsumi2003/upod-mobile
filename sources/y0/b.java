package y0;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;
import java.io.File;

class b {

    /* renamed from: h  reason: collision with root package name */
    private static Boolean f3191h;

    /* renamed from: a  reason: collision with root package name */
    final boolean f3192a;

    /* renamed from: b  reason: collision with root package name */
    final String f3193b;

    /* renamed from: c  reason: collision with root package name */
    final int f3194c;

    /* renamed from: d  reason: collision with root package name */
    final int f3195d;

    /* renamed from: e  reason: collision with root package name */
    final Context f3196e;

    /* renamed from: f  reason: collision with root package name */
    SQLiteDatabase f3197f;

    /* renamed from: g  reason: collision with root package name */
    boolean f3198g;

    class a implements DatabaseErrorHandler {
        a() {
        }

        public void onCorruption(SQLiteDatabase sQLiteDatabase) {
        }
    }

    b(Context context, String str, int i3, boolean z3, int i4) {
        this.f3196e = context;
        this.f3193b = str;
        this.f3192a = z3;
        this.f3194c = i3;
        this.f3195d = i4;
    }

    protected static boolean a(Context context) {
        try {
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.tekartik.sqflite.wal_enabled", false);
        } catch (Exception e4) {
            e4.printStackTrace();
        }
    }

    static void c(String str) {
        SQLiteDatabase.deleteDatabase(new File(str));
    }

    public void b() {
        this.f3197f.close();
    }

    public SQLiteDatabase d() {
        return this.f3197f;
    }

    /* access modifiers changed from: package-private */
    public String e() {
        return "[" + f() + "] ";
    }

    /* access modifiers changed from: package-private */
    public String f() {
        Thread currentThread = Thread.currentThread();
        return "" + this.f3194c + "," + currentThread.getName() + "(" + currentThread.getId() + ")";
    }

    public SQLiteDatabase g() {
        return this.f3197f;
    }

    public void h() {
        if (f3191h == null) {
            Boolean valueOf = Boolean.valueOf(a(this.f3196e));
            f3191h = valueOf;
            if (valueOf.booleanValue() && c.c(this.f3195d)) {
                Log.d("Sqflite", e() + "[sqflite] WAL enabled");
            }
        }
        this.f3197f = SQLiteDatabase.openDatabase(this.f3193b, (SQLiteDatabase.CursorFactory) null, f3191h.booleanValue() ? 805306368 : 268435456);
    }

    public void i() {
        this.f3197f = SQLiteDatabase.openDatabase(this.f3193b, (SQLiteDatabase.CursorFactory) null, 1, new a());
    }
}
