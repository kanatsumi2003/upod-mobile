package z;

import android.os.IBinder;
import java.lang.reflect.Field;
import t.o;
import z.a;

public final class b<T> extends a.C0056a {

    /* renamed from: a  reason: collision with root package name */
    private final Object f3263a;

    private b(Object obj) {
        this.f3263a = obj;
    }

    public static <T> T b(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f3263a;
        }
        IBinder asBinder = aVar.asBinder();
        Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        Field field = null;
        int i3 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i3++;
                field = field2;
            }
        }
        if (i3 == 1) {
            o.h(field);
            if (!field.isAccessible()) {
                field.setAccessible(true);
                try {
                    return field.get(asBinder);
                } catch (NullPointerException e4) {
                    throw new IllegalArgumentException("Binder object is null.", e4);
                } catch (IllegalAccessException e5) {
                    throw new IllegalArgumentException("Could not access the field in remoteBinder.", e5);
                }
            } else {
                throw new IllegalArgumentException("IObjectWrapper declared field not private!");
            }
        } else {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
    }

    public static <T> a c(T t3) {
        return new b(t3);
    }
}
