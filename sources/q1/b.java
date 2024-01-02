package q1;

import android.annotation.TargetApi;
import android.view.PointerIcon;
import java.util.HashMap;
import n1.g;

@TargetApi(24)
public class b {

    /* renamed from: c  reason: collision with root package name */
    private static HashMap<String, Integer> f2656c;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final c f2657a;

    /* renamed from: b  reason: collision with root package name */
    private final g f2658b;

    class a implements g.b {
        a() {
        }

        public void a(String str) {
            b.this.f2657a.setPointerIcon(b.this.d(str));
        }
    }

    /* renamed from: q1.b$b  reason: collision with other inner class name */
    class C0046b extends HashMap<String, Integer> {
        C0046b() {
            put("alias", 1010);
            put("allScroll", 1013);
            put("basic", 1000);
            put("cell", 1006);
            put("click", 1002);
            put("contextMenu", 1001);
            put("copy", 1011);
            put("forbidden", 1012);
            put("grab", 1020);
            put("grabbing", 1021);
            put("help", 1003);
            put("move", 1013);
            put("none", 0);
            put("noDrop", 1012);
            put("precise", 1007);
            put("text", 1008);
            put("resizeColumn", 1014);
            put("resizeDown", 1015);
            put("resizeUpLeft", 1016);
            put("resizeDownRight", 1017);
            put("resizeLeft", 1014);
            put("resizeLeftRight", 1014);
            put("resizeRight", 1014);
            put("resizeRow", 1015);
            put("resizeUp", 1015);
            put("resizeUpDown", 1015);
            put("resizeUpLeft", 1017);
            put("resizeUpRight", 1016);
            put("resizeUpLeftDownRight", 1017);
            put("resizeUpRightDownLeft", 1016);
            put("verticalText", 1009);
            put("wait", 1004);
            put("zoomIn", 1018);
            put("zoomOut", 1019);
        }
    }

    public interface c {
        PointerIcon b(int i3);

        void setPointerIcon(PointerIcon pointerIcon);
    }

    public b(c cVar, g gVar) {
        this.f2657a = cVar;
        this.f2658b = gVar;
        gVar.b(new a());
    }

    /* access modifiers changed from: private */
    public PointerIcon d(String str) {
        if (f2656c == null) {
            f2656c = new C0046b();
        }
        return this.f2657a.b(((Integer) f2656c.getOrDefault(str, 1000)).intValue());
    }

    public void c() {
        this.f2658b.b((g.b) null);
    }
}
