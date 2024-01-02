package g2;

import com.google.firebase.storage.j;

class a extends Exception {

    /* renamed from: d  reason: collision with root package name */
    private int f1291d;

    a(Exception exc, Throwable th) {
        super(exc.getMessage(), th);
        if (exc instanceof j) {
            this.f1291d = ((j) exc).f();
        }
    }

    public String a() {
        int i3 = this.f1291d;
        if (i3 == -13040) {
            return "canceled";
        }
        if (i3 == -13031) {
            return "invalid-checksum";
        }
        if (i3 == -13030) {
            return "retry-limit-exceeded";
        }
        if (i3 == -13021) {
            return "unauthorized";
        }
        if (i3 == -13020) {
            return "unauthenticated";
        }
        switch (i3) {
            case -13013:
                return "quota-exceeded";
            case -13012:
                return "project-not-found";
            case -13011:
                return "bucket-not-found";
            case -13010:
                return "object-not-found";
            default:
                return "unknown";
        }
    }

    public String getMessage() {
        int i3 = this.f1291d;
        if (i3 == -13040) {
            return "User cancelled the operation.";
        }
        if (i3 == -13031) {
            return "File on the client does not match the checksum of the file received by the server.";
        }
        if (i3 == -13030) {
            return "The maximum time limit on an operation (upload, download, delete, etc.) has been exceeded.";
        }
        if (i3 == -13021) {
            return "User is not authorized to perform the desired action.";
        }
        if (i3 == -13020) {
            return "User is unauthenticated. Authenticate and try again.";
        }
        switch (i3) {
            case -13013:
                return "Quota on your Firebase Storage bucket has been exceeded.";
            case -13012:
                return "No project is configured for Firebase Storage.";
            case -13011:
                return "No bucket is configured for Firebase Storage.";
            case -13010:
                return "No object exists at the desired reference.";
            default:
                return "An unknown error occurred";
        }
    }
}
