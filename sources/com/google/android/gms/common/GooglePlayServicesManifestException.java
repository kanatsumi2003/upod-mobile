package com.google.android.gms.common;

import com.google.android.gms.common.annotation.KeepName;

@KeepName
public class GooglePlayServicesManifestException extends IllegalStateException {

    /* renamed from: d  reason: collision with root package name */
    private final int f746d;

    public GooglePlayServicesManifestException(int i3, String str) {
        super(str);
        this.f746d = i3;
    }
}
