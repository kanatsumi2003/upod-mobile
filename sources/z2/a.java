package z2;

import w2.c;

class a {
    public static final int a(int i3) {
        if (new c(2, 36).f(i3)) {
            return i3;
        }
        throw new IllegalArgumentException("radix " + i3 + " was not in valid range " + new c(2, 36));
    }

    public static final int b(char c4, int i3) {
        return Character.digit(c4, i3);
    }

    public static final boolean c(char c4) {
        return Character.isWhitespace(c4) || Character.isSpaceChar(c4);
    }
}
