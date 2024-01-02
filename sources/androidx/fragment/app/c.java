package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;

public class c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    private Handler Y;
    private Runnable Z = new a();

    /* renamed from: a0  reason: collision with root package name */
    int f245a0 = 0;

    /* renamed from: b0  reason: collision with root package name */
    int f246b0 = 0;

    /* renamed from: c0  reason: collision with root package name */
    boolean f247c0 = true;

    /* renamed from: d0  reason: collision with root package name */
    boolean f248d0 = true;

    /* renamed from: e0  reason: collision with root package name */
    int f249e0 = -1;

    /* renamed from: f0  reason: collision with root package name */
    Dialog f250f0;

    /* renamed from: g0  reason: collision with root package name */
    boolean f251g0;

    /* renamed from: h0  reason: collision with root package name */
    boolean f252h0;

    /* renamed from: i0  reason: collision with root package name */
    boolean f253i0;

    class a implements Runnable {
        a() {
        }

        public void run() {
            c cVar = c.this;
            Dialog dialog = cVar.f250f0;
            if (dialog != null) {
                cVar.onDismiss(dialog);
            }
        }
    }

    public void V(Bundle bundle) {
        Bundle bundle2;
        super.V(bundle);
        if (this.f248d0) {
            View L = L();
            if (L != null) {
                if (L.getParent() == null) {
                    this.f250f0.setContentView(L);
                } else {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
            }
            d l3 = l();
            if (l3 != null) {
                this.f250f0.setOwnerActivity(l3);
            }
            this.f250f0.setCancelable(this.f247c0);
            this.f250f0.setOnCancelListener(this);
            this.f250f0.setOnDismissListener(this);
            if (bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
                this.f250f0.onRestoreInstanceState(bundle2);
            }
        }
    }

    public void Y(Context context) {
        super.Y(context);
        if (!this.f253i0) {
            this.f252h0 = false;
        }
    }

    public void b0(Bundle bundle) {
        super.b0(bundle);
        this.Y = new Handler();
        this.f248d0 = this.f202w == 0;
        if (bundle != null) {
            this.f245a0 = bundle.getInt("android:style", 0);
            this.f246b0 = bundle.getInt("android:theme", 0);
            this.f247c0 = bundle.getBoolean("android:cancelable", true);
            this.f248d0 = bundle.getBoolean("android:showsDialog", this.f248d0);
            this.f249e0 = bundle.getInt("android:backStackId", -1);
        }
    }

    public void i0() {
        super.i0();
        Dialog dialog = this.f250f0;
        if (dialog != null) {
            this.f251g0 = true;
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
            this.f250f0.dismiss();
            if (!this.f252h0) {
                onDismiss(this.f250f0);
            }
            this.f250f0 = null;
        }
    }

    public void j0() {
        super.j0();
        if (!this.f253i0 && !this.f252h0) {
            this.f252h0 = true;
        }
    }

    public LayoutInflater k0(Bundle bundle) {
        Context g3;
        if (!this.f248d0) {
            return super.k0(bundle);
        }
        Dialog q12 = q1(bundle);
        this.f250f0 = q12;
        if (q12 != null) {
            s1(q12, this.f245a0);
            g3 = this.f250f0.getContext();
        } else {
            g3 = this.f198s.g();
        }
        return (LayoutInflater) g3.getSystemService("layout_inflater");
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.f251g0) {
            p1(true, true);
        }
    }

    /* access modifiers changed from: package-private */
    public void p1(boolean z3, boolean z4) {
        if (!this.f252h0) {
            this.f252h0 = true;
            this.f253i0 = false;
            Dialog dialog = this.f250f0;
            if (dialog != null) {
                dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
                this.f250f0.dismiss();
                if (!z4) {
                    if (Looper.myLooper() == this.Y.getLooper()) {
                        onDismiss(this.f250f0);
                    } else {
                        this.Y.post(this.Z);
                    }
                }
            }
            this.f251g0 = true;
            if (this.f249e0 >= 0) {
                b1().f(this.f249e0, 1);
                this.f249e0 = -1;
                return;
            }
            n a4 = b1().a();
            a4.g(this);
            if (z3) {
                a4.e();
            } else {
                a4.d();
            }
        }
    }

    public Dialog q1(Bundle bundle) {
        throw null;
    }

    public void r1(boolean z3) {
        this.f248d0 = z3;
    }

    public void s1(Dialog dialog, int i3) {
        if (!(i3 == 1 || i3 == 2)) {
            if (i3 == 3) {
                dialog.getWindow().addFlags(24);
            } else {
                return;
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void t1(i iVar, String str) {
        this.f252h0 = false;
        this.f253i0 = true;
        n a4 = iVar.a();
        a4.b(this, str);
        a4.d();
    }

    public void x0(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.x0(bundle);
        Dialog dialog = this.f250f0;
        if (!(dialog == null || (onSaveInstanceState = dialog.onSaveInstanceState()) == null)) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i3 = this.f245a0;
        if (i3 != 0) {
            bundle.putInt("android:style", i3);
        }
        int i4 = this.f246b0;
        if (i4 != 0) {
            bundle.putInt("android:theme", i4);
        }
        boolean z3 = this.f247c0;
        if (!z3) {
            bundle.putBoolean("android:cancelable", z3);
        }
        boolean z4 = this.f248d0;
        if (!z4) {
            bundle.putBoolean("android:showsDialog", z4);
        }
        int i5 = this.f249e0;
        if (i5 != -1) {
            bundle.putInt("android:backStackId", i5);
        }
    }

    public void y0() {
        super.y0();
        Dialog dialog = this.f250f0;
        if (dialog != null) {
            this.f251g0 = false;
            dialog.show();
        }
    }

    public void z0() {
        super.z0();
        Dialog dialog = this.f250f0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
