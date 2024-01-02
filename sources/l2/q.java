package l2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.i;
import t2.l;

class q extends p {
    public static final <T, A extends Appendable> A i(Iterable<? extends T> iterable, A a4, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i3, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        i.e(iterable, "<this>");
        i.e(a4, "buffer");
        i.e(charSequence, "separator");
        i.e(charSequence2, "prefix");
        i.e(charSequence3, "postfix");
        i.e(charSequence4, "truncated");
        a4.append(charSequence2);
        int i4 = 0;
        for (Object next : iterable) {
            i4++;
            if (i4 > 1) {
                a4.append(charSequence);
            }
            if (i3 >= 0 && i4 > i3) {
                break;
            }
            e.a(a4, next, lVar);
        }
        if (i3 >= 0 && i4 > i3) {
            a4.append(charSequence4);
        }
        a4.append(charSequence3);
        return a4;
    }

    public static /* synthetic */ Appendable j(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i3, CharSequence charSequence4, l lVar, int i4, Object obj) {
        String str = (i4 & 2) != 0 ? ", " : charSequence;
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i4 & 4) != 0 ? charSequence5 : charSequence2;
        if ((i4 & 8) == 0) {
            charSequence5 = charSequence3;
        }
        return i(iterable, appendable, str, charSequence6, charSequence5, (i4 & 16) != 0 ? -1 : i3, (i4 & 32) != 0 ? "..." : charSequence4, (i4 & 64) != 0 ? null : lVar);
    }

    public static final <T> String k(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i3, CharSequence charSequence4, l<? super T, ? extends CharSequence> lVar) {
        i.e(iterable, "<this>");
        i.e(charSequence, "separator");
        i.e(charSequence2, "prefix");
        i.e(charSequence3, "postfix");
        i.e(charSequence4, "truncated");
        String sb = ((StringBuilder) i(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i3, charSequence4, lVar)).toString();
        i.d(sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    public static /* synthetic */ String l(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i3, CharSequence charSequence4, l lVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = "";
        CharSequence charSequence6 = (i4 & 2) != 0 ? charSequence5 : charSequence2;
        if ((i4 & 4) == 0) {
            charSequence5 = charSequence3;
        }
        int i5 = (i4 & 8) != 0 ? -1 : i3;
        if ((i4 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i4 & 32) != 0) {
            lVar = null;
        }
        return k(iterable, charSequence, charSequence6, charSequence5, i5, charSequence7, lVar);
    }

    public static <T extends Comparable<? super T>> T m(Iterable<? extends T> iterable) {
        i.e(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t3 = (Comparable) it.next();
        while (it.hasNext()) {
            T t4 = (Comparable) it.next();
            if (t3.compareTo(t4) > 0) {
                t3 = t4;
            }
        }
        return t3;
    }

    public static <T> T n(Iterable<? extends T> iterable) {
        i.e(iterable, "<this>");
        if (iterable instanceof List) {
            return o((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static final <T> T o(List<? extends T> list) {
        i.e(list, "<this>");
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        } else if (size == 1) {
            return list.get(0);
        } else {
            throw new IllegalArgumentException("List has more than one element.");
        }
    }

    public static final <T, C extends Collection<? super T>> C p(Iterable<? extends T> iterable, C c4) {
        i.e(iterable, "<this>");
        i.e(c4, "destination");
        for (Object add : iterable) {
            c4.add(add);
        }
        return c4;
    }

    public static <T> List<T> q(Iterable<? extends T> iterable) {
        i.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return i.e(r(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return i.b();
        }
        if (size != 1) {
            return s(collection);
        }
        return h.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <T> List<T> r(Iterable<? extends T> iterable) {
        i.e(iterable, "<this>");
        return iterable instanceof Collection ? s((Collection) iterable) : (List) p(iterable, new ArrayList());
    }

    public static final <T> List<T> s(Collection<? extends T> collection) {
        i.e(collection, "<this>");
        return new ArrayList(collection);
    }

    public static <T> Set<T> t(Iterable<? extends T> iterable) {
        i.e(iterable, "<this>");
        if (!(iterable instanceof Collection)) {
            return e0.c((Set) p(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return e0.b();
        }
        if (size != 1) {
            return (Set) p(iterable, new LinkedHashSet(y.a(collection.size())));
        }
        return d0.a(iterable instanceof List ? ((List) iterable).get(0) : iterable.iterator().next());
    }
}
