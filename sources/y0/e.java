package y0;

import android.database.sqlite.SQLiteProgram;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private final String f3251a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Object> f3252b;

    public e(String str, List<Object> list) {
        this.f3251a = str;
        this.f3252b = list == null ? new ArrayList<>() : list;
    }

    private Object[] e(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (Object f4 : list) {
                arrayList.add(f(f4));
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    private static Object f(Object obj) {
        if (obj == null) {
            return null;
        }
        if (!(obj instanceof List)) {
            return obj;
        }
        List list = (List) obj;
        byte[] bArr = new byte[list.size()];
        for (int i3 = 0; i3 < list.size(); i3++) {
            bArr[i3] = (byte) ((Integer) list.get(i3)).intValue();
        }
        return bArr;
    }

    public void a(SQLiteProgram sQLiteProgram) {
        long j3;
        List<Object> list = this.f3252b;
        if (list != null) {
            int size = list.size();
            int i3 = 0;
            while (i3 < size) {
                Object f4 = f(this.f3252b.get(i3));
                int i4 = i3 + 1;
                if (f4 == null) {
                    sQLiteProgram.bindNull(i4);
                } else if (f4 instanceof byte[]) {
                    sQLiteProgram.bindBlob(i4, (byte[]) f4);
                } else if (f4 instanceof Double) {
                    sQLiteProgram.bindDouble(i4, ((Double) f4).doubleValue());
                } else {
                    if (f4 instanceof Integer) {
                        j3 = (long) ((Integer) f4).intValue();
                    } else if (f4 instanceof Long) {
                        j3 = ((Long) f4).longValue();
                    } else if (f4 instanceof String) {
                        sQLiteProgram.bindString(i4, (String) f4);
                    } else if (f4 instanceof Boolean) {
                        j3 = ((Boolean) f4).booleanValue() ? 1 : 0;
                    } else {
                        throw new IllegalArgumentException("Could not bind " + f4 + " from index " + i3 + ": Supported types are null, byte[], double, long, boolean and String");
                    }
                    sQLiteProgram.bindLong(i4, j3);
                }
                i3 = i4;
            }
        }
    }

    public List<Object> b() {
        return this.f3252b;
    }

    public String c() {
        return this.f3251a;
    }

    public Object[] d() {
        return e(this.f3252b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        String str = this.f3251a;
        if (str != null) {
            if (!str.equals(eVar.f3251a)) {
                return false;
            }
        } else if (eVar.f3251a != null) {
            return false;
        }
        if (this.f3252b.size() != eVar.f3252b.size()) {
            return false;
        }
        for (int i3 = 0; i3 < this.f3252b.size(); i3++) {
            if (!(this.f3252b.get(i3) instanceof byte[]) || !(eVar.f3252b.get(i3) instanceof byte[])) {
                if (!this.f3252b.get(i3).equals(eVar.f3252b.get(i3))) {
                    return false;
                }
            } else if (!Arrays.equals((byte[]) this.f3252b.get(i3), (byte[]) eVar.f3252b.get(i3))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str = this.f3251a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f3251a);
        List<Object> list = this.f3252b;
        if (list == null || list.isEmpty()) {
            str = "";
        } else {
            str = " " + this.f3252b;
        }
        sb.append(str);
        return sb.toString();
    }
}
