package q;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import t.o;

public class b extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    private Dialog f2622a;

    /* renamed from: b  reason: collision with root package name */
    private DialogInterface.OnCancelListener f2623b;

    /* renamed from: c  reason: collision with root package name */
    private Dialog f2624c;

    public static b a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        b bVar = new b();
        Dialog dialog2 = (Dialog) o.i(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener((DialogInterface.OnCancelListener) null);
        dialog2.setOnDismissListener((DialogInterface.OnDismissListener) null);
        bVar.f2622a = dialog2;
        if (onCancelListener != null) {
            bVar.f2623b = onCancelListener;
        }
        return bVar;
    }

    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f2623b;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f2622a;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f2624c == null) {
            this.f2624c = new AlertDialog.Builder((Context) o.h(getActivity())).create();
        }
        return this.f2624c;
    }

    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
