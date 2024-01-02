package t;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class n {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final List f3014a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final Object f3015b;

        /* synthetic */ a(Object obj, q0 q0Var) {
            o.h(obj);
            this.f3015b = obj;
        }

        public a a(String str, Object obj) {
            List list = this.f3014a;
            o.h(str);
            String valueOf = String.valueOf(obj);
            list.add(str + "=" + valueOf);
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f3015b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f3014a.size();
            for (int i3 = 0; i3 < size; i3++) {
                sb.append((String) this.f3014a.get(i3));
                if (i3 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj, (q0) null);
    }
}
