package l0;

import java.util.Arrays;
import java.util.List;

public class s extends t {

    /* renamed from: d  reason: collision with root package name */
    private final List<d<?>> f2283d;

    public s(List<d<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f2283d = list;
    }
}
