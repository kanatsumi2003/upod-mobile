package com.google.firebase.storage;

import android.util.Log;
import com.google.android.gms.common.api.Status;
import t.o;

public class j extends g0.j {

    /* renamed from: d  reason: collision with root package name */
    private final int f940d;

    /* renamed from: e  reason: collision with root package name */
    private final int f941e;

    /* renamed from: f  reason: collision with root package name */
    private Throwable f942f;

    static {
        Class<j> cls = j.class;
    }

    j(int i3, Throwable th, int i4) {
        super(g(i3));
        this.f942f = th;
        this.f940d = i3;
        this.f941e = i4;
        Log.e("StorageException", "StorageException has occurred.\n" + g(i3) + "\n Code: " + i3 + " HttpResult: " + i4);
        Throwable th2 = this.f942f;
        if (th2 != null) {
            Log.e("StorageException", th2.getMessage(), this.f942f);
        }
    }

    private static int a(Status status) {
        if (status.f()) {
            return -13040;
        }
        return status.equals(Status.f754m) ? -13030 : -13000;
    }

    private static int b(Throwable th, int i3) {
        if (th instanceof a) {
            return -13040;
        }
        if (i3 == -2) {
            return -13030;
        }
        if (i3 == 401) {
            return -13020;
        }
        if (i3 == 409) {
            return -13031;
        }
        if (i3 != 403) {
            return i3 != 404 ? -13000 : -13010;
        }
        return -13021;
    }

    public static j c(Status status) {
        o.h(status);
        o.a(!status.g());
        return new j(a(status), (Throwable) null, 0);
    }

    public static j d(Throwable th) {
        return e(th, 0);
    }

    public static j e(Throwable th, int i3) {
        if (th instanceof j) {
            return (j) th;
        }
        if (!h(i3) || th != null) {
            return new j(b(th, i3), th, i3);
        }
        return null;
    }

    static String g(int i3) {
        if (i3 == -13040) {
            return "The operation was cancelled.";
        }
        if (i3 == -13031) {
            return "Object has a checksum which does not match. Please retry the operation.";
        }
        if (i3 == -13030) {
            return "The operation retry limit has been exceeded.";
        }
        if (i3 == -13021) {
            return "User does not have permission to access this object.";
        }
        if (i3 == -13020) {
            return "User is not authenticated, please authenticate using Firebase Authentication and try again.";
        }
        switch (i3) {
            case -13013:
                return "Quota for bucket exceeded, please view quota on www.firebase.google.com/storage.";
            case -13012:
                return "Project does not exist.";
            case -13011:
                return "Bucket does not exist.";
            case -13010:
                return "Object does not exist at location.";
            default:
                return "An unknown error occurred, please check the HTTP result code and inner exception for server response.";
        }
    }

    private static boolean h(int i3) {
        return i3 == 0 || (i3 >= 200 && i3 < 300);
    }

    public int f() {
        return this.f940d;
    }

    public synchronized Throwable getCause() {
        Throwable th = this.f942f;
        if (th == this) {
            return null;
        }
        return th;
    }
}
