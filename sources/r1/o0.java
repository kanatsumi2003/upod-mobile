package r1;

import android.media.Image;
import java.io.File;
import java.io.FileOutputStream;

public class o0 implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    private final Image f2753d;

    /* renamed from: e  reason: collision with root package name */
    private final File f2754e;

    /* renamed from: f  reason: collision with root package name */
    private final a f2755f;

    public interface a {
        void a(String str, String str2);

        void b(String str);
    }

    static class b {
        public static FileOutputStream a(File file) {
            return new FileOutputStream(file);
        }
    }

    o0(Image image, File file, a aVar) {
        this.f2753d = image;
        this.f2754e = file;
        this.f2755f = aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0057, code lost:
        r5.f2753d.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        if (r1 != null) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0062, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        r5.f2755f.a("cameraAccess", r1.getMessage());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006c, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0036, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:?, code lost:
        r5.f2755f.a("IOError", "Failed saving image");
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0038 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r5 = this;
            java.lang.String r0 = "cameraAccess"
            android.media.Image r1 = r5.f2753d
            android.media.Image$Plane[] r1 = r1.getPlanes()
            r2 = 0
            r1 = r1[r2]
            java.nio.ByteBuffer r1 = r1.getBuffer()
            int r2 = r1.remaining()
            byte[] r2 = new byte[r2]
            r1.get(r2)
            r1 = 0
            java.io.File r3 = r5.f2754e     // Catch:{ IOException -> 0x0038 }
            java.io.FileOutputStream r1 = r1.o0.b.a(r3)     // Catch:{ IOException -> 0x0038 }
            r1.write(r2)     // Catch:{ IOException -> 0x0038 }
            r1.o0$a r2 = r5.f2755f     // Catch:{ IOException -> 0x0038 }
            java.io.File r3 = r5.f2754e     // Catch:{ IOException -> 0x0038 }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ IOException -> 0x0038 }
            r2.b(r3)     // Catch:{ IOException -> 0x0038 }
            android.media.Image r2 = r5.f2753d
            r2.close()
            r1.close()     // Catch:{ IOException -> 0x004c }
            goto L_0x0056
        L_0x0036:
            r2 = move-exception
            goto L_0x0057
        L_0x0038:
            r1.o0$a r2 = r5.f2755f     // Catch:{ all -> 0x0036 }
            java.lang.String r3 = "IOError"
            java.lang.String r4 = "Failed saving image"
            r2.a(r3, r4)     // Catch:{ all -> 0x0036 }
            android.media.Image r2 = r5.f2753d
            r2.close()
            if (r1 == 0) goto L_0x0056
            r1.close()     // Catch:{ IOException -> 0x004c }
            goto L_0x0056
        L_0x004c:
            r1 = move-exception
            r1.o0$a r2 = r5.f2755f
            java.lang.String r1 = r1.getMessage()
            r2.a(r0, r1)
        L_0x0056:
            return
        L_0x0057:
            android.media.Image r3 = r5.f2753d
            r3.close()
            if (r1 == 0) goto L_0x006c
            r1.close()     // Catch:{ IOException -> 0x0062 }
            goto L_0x006c
        L_0x0062:
            r1 = move-exception
            r1.o0$a r3 = r5.f2755f
            java.lang.String r1 = r1.getMessage()
            r3.a(r0, r1)
        L_0x006c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.o0.run():void");
    }
}
