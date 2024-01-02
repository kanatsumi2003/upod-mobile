package io.flutter.plugin.editing;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputMethodManager;
import b1.b;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.e;
import n1.p;

public class d extends BaseInputConnection implements e.b {

    /* renamed from: a  reason: collision with root package name */
    private final View f1641a;

    /* renamed from: b  reason: collision with root package name */
    private final int f1642b;

    /* renamed from: c  reason: collision with root package name */
    private final p f1643c;

    /* renamed from: d  reason: collision with root package name */
    private final e f1644d;

    /* renamed from: e  reason: collision with root package name */
    private final EditorInfo f1645e;

    /* renamed from: f  reason: collision with root package name */
    private ExtractedTextRequest f1646f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f1647g;

    /* renamed from: h  reason: collision with root package name */
    private CursorAnchorInfo.Builder f1648h;

    /* renamed from: i  reason: collision with root package name */
    private ExtractedText f1649i;

    /* renamed from: j  reason: collision with root package name */
    private InputMethodManager f1650j;

    /* renamed from: k  reason: collision with root package name */
    private final Layout f1651k;

    /* renamed from: l  reason: collision with root package name */
    private a f1652l;

    /* renamed from: m  reason: collision with root package name */
    private final a f1653m;

    /* renamed from: n  reason: collision with root package name */
    private int f1654n;

    public interface a {
        boolean a(KeyEvent keyEvent);
    }

    public d(View view, int i3, p pVar, a aVar, e eVar, EditorInfo editorInfo) {
        this(view, i3, pVar, aVar, eVar, editorInfo, new FlutterJNI());
    }

    public d(View view, int i3, p pVar, a aVar, e eVar, EditorInfo editorInfo, FlutterJNI flutterJNI) {
        super(view, true);
        this.f1647g = false;
        this.f1649i = new ExtractedText();
        this.f1654n = 0;
        this.f1641a = view;
        this.f1642b = i3;
        this.f1643c = pVar;
        this.f1644d = eVar;
        eVar.a(this);
        this.f1645e = editorInfo;
        this.f1653m = aVar;
        this.f1652l = new a(flutterJNI);
        this.f1651k = new DynamicLayout(eVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f1650j = (InputMethodManager) view.getContext().getSystemService("input_method");
    }

    private boolean b(int i3) {
        if (i3 == 16908319) {
            setSelection(0, this.f1644d.length());
            return true;
        } else if (i3 == 16908320) {
            int selectionStart = Selection.getSelectionStart(this.f1644d);
            int selectionEnd = Selection.getSelectionEnd(this.f1644d);
            if (selectionStart != selectionEnd) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                ((ClipboardManager) this.f1641a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f1644d.subSequence(min, max)));
                this.f1644d.delete(min, max);
                setSelection(min, min);
            }
            return true;
        } else if (i3 == 16908321) {
            int selectionStart2 = Selection.getSelectionStart(this.f1644d);
            int selectionEnd2 = Selection.getSelectionEnd(this.f1644d);
            if (selectionStart2 != selectionEnd2) {
                ((ClipboardManager) this.f1641a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f1644d.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        } else if (i3 != 16908322) {
            return false;
        } else {
            ClipData primaryClip = ((ClipboardManager) this.f1641a.getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null) {
                CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(this.f1641a.getContext());
                int max2 = Math.max(0, Selection.getSelectionStart(this.f1644d));
                int max3 = Math.max(0, Selection.getSelectionEnd(this.f1644d));
                int min2 = Math.min(max2, max3);
                int max4 = Math.max(max2, max3);
                if (min2 != max4) {
                    this.f1644d.delete(min2, max4);
                }
                this.f1644d.insert(min2, coerceToText);
                int length = min2 + coerceToText.length();
                setSelection(length, length);
            }
            return true;
        }
    }

    private CursorAnchorInfo c() {
        CursorAnchorInfo.Builder builder = this.f1648h;
        if (builder == null) {
            this.f1648h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        this.f1648h.setSelectionRange(this.f1644d.i(), this.f1644d.h());
        int g3 = this.f1644d.g();
        int f4 = this.f1644d.f();
        if (g3 < 0 || f4 <= g3) {
            this.f1648h.setComposingText(-1, "");
        } else {
            this.f1648h.setComposingText(g3, this.f1644d.toString().subSequence(g3, f4));
        }
        return this.f1648h.build();
    }

    private ExtractedText d(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f1649i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = this.f1644d.i();
        this.f1649i.selectionEnd = this.f1644d.h();
        this.f1649i.text = (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) ? this.f1644d.toString() : this.f1644d;
        return this.f1649i;
    }

    private boolean e(boolean z3, boolean z4) {
        int selectionStart = Selection.getSelectionStart(this.f1644d);
        int selectionEnd = Selection.getSelectionEnd(this.f1644d);
        boolean z5 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        int max = z3 ? Math.max(this.f1652l.b(this.f1644d, selectionEnd), 0) : Math.min(this.f1652l.a(this.f1644d, selectionEnd), this.f1644d.length());
        if (selectionStart == selectionEnd && !z4) {
            z5 = true;
        }
        if (z5) {
            setSelection(max, max);
        } else {
            setSelection(selectionStart, max);
        }
        return true;
    }

    private boolean g(boolean z3, boolean z4) {
        int selectionStart = Selection.getSelectionStart(this.f1644d);
        int selectionEnd = Selection.getSelectionEnd(this.f1644d);
        boolean z5 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z4) {
            z5 = true;
        }
        beginBatchEdit();
        if (z5) {
            if (z3) {
                Selection.moveUp(this.f1644d, this.f1651k);
            } else {
                Selection.moveDown(this.f1644d, this.f1651k);
            }
            int selectionStart2 = Selection.getSelectionStart(this.f1644d);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z3) {
                Selection.extendUp(this.f1644d, this.f1651k);
            } else {
                Selection.extendDown(this.f1644d, this.f1651k);
            }
            setSelection(Selection.getSelectionStart(this.f1644d), Selection.getSelectionEnd(this.f1644d));
        }
        endBatchEdit();
        return true;
    }

    public void a(boolean z3, boolean z4, boolean z5) {
        this.f1650j.updateSelection(this.f1641a, this.f1644d.i(), this.f1644d.h(), this.f1644d.g(), this.f1644d.f());
        ExtractedTextRequest extractedTextRequest = this.f1646f;
        if (extractedTextRequest != null) {
            this.f1650j.updateExtractedText(this.f1641a, extractedTextRequest.token, d(extractedTextRequest));
        }
        if (this.f1647g) {
            this.f1650j.updateCursorAnchorInfo(this.f1641a, c());
        }
    }

    public boolean beginBatchEdit() {
        this.f1644d.b();
        this.f1654n++;
        return super.beginBatchEdit();
    }

    public boolean clearMetaKeyStates(int i3) {
        return super.clearMetaKeyStates(i3);
    }

    public void closeConnection() {
        super.closeConnection();
        this.f1644d.l(this);
        while (this.f1654n > 0) {
            endBatchEdit();
            this.f1654n--;
        }
    }

    public boolean commitText(CharSequence charSequence, int i3) {
        return super.commitText(charSequence, i3);
    }

    public boolean deleteSurroundingText(int i3, int i4) {
        if (this.f1644d.i() == -1) {
            return true;
        }
        return super.deleteSurroundingText(i3, i4);
    }

    public boolean deleteSurroundingTextInCodePoints(int i3, int i4) {
        return super.deleteSurroundingTextInCodePoints(i3, i4);
    }

    public boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f1654n--;
        this.f1644d.d();
        return endBatchEdit;
    }

    public boolean f(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            if (keyEvent.getKeyCode() == 21) {
                return e(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 22) {
                return e(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 19) {
                return g(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 20) {
                return g(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                EditorInfo editorInfo = this.f1645e;
                if ((131072 & editorInfo.inputType) == 0) {
                    performEditorAction(editorInfo.imeOptions & 255);
                    return true;
                }
            }
            int selectionStart = Selection.getSelectionStart(this.f1644d);
            int selectionEnd = Selection.getSelectionEnd(this.f1644d);
            int unicodeChar = keyEvent.getUnicodeChar();
            if (selectionStart < 0 || selectionEnd < 0 || unicodeChar == 0) {
                return false;
            }
            int min = Math.min(selectionStart, selectionEnd);
            int max = Math.max(selectionStart, selectionEnd);
            beginBatchEdit();
            if (min != max) {
                this.f1644d.delete(min, max);
            }
            this.f1644d.insert(min, String.valueOf((char) unicodeChar));
            int i3 = min + 1;
            setSelection(i3, i3);
            endBatchEdit();
            return true;
        } else if (keyEvent.getAction() != 1 || (keyEvent.getKeyCode() != 59 && keyEvent.getKeyCode() != 60)) {
            return false;
        } else {
            int selectionEnd2 = Selection.getSelectionEnd(this.f1644d);
            setSelection(selectionEnd2, selectionEnd2);
            return true;
        }
    }

    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    public Editable getEditable() {
        return this.f1644d;
    }

    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i3) {
        boolean z3 = true;
        boolean z4 = (i3 & 1) != 0;
        if (this.f1646f != null) {
            z3 = false;
        }
        if (z4 == z3) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled text monitoring ");
            sb.append(z4 ? "on" : "off");
            b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f1646f = z4 ? extractedTextRequest : null;
        return d(extractedTextRequest);
    }

    public boolean performContextMenuAction(int i3) {
        beginBatchEdit();
        boolean b4 = b(i3);
        endBatchEdit();
        return b4;
    }

    public boolean performEditorAction(int i3) {
        if (i3 == 0) {
            this.f1643c.n(this.f1642b);
        } else if (i3 == 1) {
            this.f1643c.f(this.f1642b);
        } else if (i3 == 2) {
            this.f1643c.e(this.f1642b);
        } else if (i3 == 3) {
            this.f1643c.k(this.f1642b);
        } else if (i3 == 4) {
            this.f1643c.l(this.f1642b);
        } else if (i3 == 5) {
            this.f1643c.g(this.f1642b);
        } else if (i3 != 7) {
            this.f1643c.d(this.f1642b);
        } else {
            this.f1643c.i(this.f1642b);
        }
        return true;
    }

    public boolean performPrivateCommand(String str, Bundle bundle) {
        this.f1643c.h(this.f1642b, str, bundle);
        return true;
    }

    public boolean requestCursorUpdates(int i3) {
        if ((i3 & 1) != 0) {
            this.f1650j.updateCursorAnchorInfo(this.f1641a, c());
        }
        boolean z3 = (i3 & 2) != 0;
        if (z3 != this.f1647g) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled cursor monitoring ");
            sb.append(z3 ? "on" : "off");
            b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f1647g = z3;
        return true;
    }

    public boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f1653m.a(keyEvent);
    }

    public boolean setComposingRegion(int i3, int i4) {
        return super.setComposingRegion(i3, i4);
    }

    public boolean setComposingText(CharSequence charSequence, int i3) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, i3) : super.setComposingText(charSequence, i3);
        endBatchEdit();
        return commitText;
    }

    public boolean setSelection(int i3, int i4) {
        beginBatchEdit();
        boolean selection = super.setSelection(i3, i4);
        endBatchEdit();
        return selection;
    }
}
