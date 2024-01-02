package o1;

import java.nio.ByteBuffer;

public interface c {

    public interface a {
        void a(ByteBuffer byteBuffer, b bVar);
    }

    public interface b {
        void a(ByteBuffer byteBuffer);
    }

    /* renamed from: o1.c$c  reason: collision with other inner class name */
    public interface C0041c {
    }

    public static class d {

        /* renamed from: a  reason: collision with root package name */
        private boolean f2564a = true;

        public boolean a() {
            return this.f2564a;
        }
    }

    C0041c a(d dVar);

    C0041c b();

    void c(String str, a aVar);

    void d(String str, a aVar, C0041c cVar);

    void e(String str, ByteBuffer byteBuffer);

    void f(String str, ByteBuffer byteBuffer, b bVar);
}
