package q;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.c;
import androidx.fragment.app.i;
import t.o;

public class l extends c {

    /* renamed from: j0  reason: collision with root package name */
    private Dialog f2640j0;

    /* renamed from: k0  reason: collision with root package name */
    private DialogInterface.OnCancelListener f2641k0;

    /* renamed from: l0  reason: collision with root package name */
    private Dialog f2642l0;

    public static l u1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        l lVar = new l();
        Dialog dialog2 = (Dialog) o.i(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        lVar.f2640j0 = dialog2;
        if (onCancelListener != null) {
            lVar.f2641k0 = onCancelListener;
        }
        return lVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f2641k0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog q1(Bundle bundle) {
        Dialog dialog = this.f2640j0;
        if (dialog != null) {
            return dialog;
        }
        r1(false);
        if (this.f2642l0 == null) {
            this.f2642l0 = new AlertDialog.Builder((Context) o.h(r())).create();
        }
        return this.f2642l0;
    }

    public void t1(i iVar, String str) {
        super.t1(iVar, str);
    }
}
