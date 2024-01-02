package s2;

import kotlin.jvm.internal.b;
import kotlin.jvm.internal.i;
import x2.c;

public final class a {
    public static final <T> Class<T> a(c<T> cVar) {
        i.e(cVar, "<this>");
        Class b4 = ((b) cVar).b();
        if (!b4.isPrimitive()) {
            i.c(b4, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
            return b4;
        }
        String name = b4.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    b4 = Double.class;
                    break;
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    b4 = Integer.class;
                    break;
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    b4 = Byte.class;
                    break;
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    b4 = Character.class;
                    break;
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    b4 = Long.class;
                    break;
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    b4 = Void.class;
                    break;
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    b4 = Boolean.class;
                    break;
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    b4 = Float.class;
                    break;
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    b4 = Short.class;
                    break;
                }
                break;
        }
        i.c(b4, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-javaObjectType>>");
        return b4;
    }
}
