package e2;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.media.MediaRecorder;
import android.os.Build;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f1163a;

    /* renamed from: b  reason: collision with root package name */
    private final CamcorderProfile f1164b;

    /* renamed from: c  reason: collision with root package name */
    private final EncoderProfiles f1165c;

    /* renamed from: d  reason: collision with root package name */
    private final C0019a f1166d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f1167e;

    /* renamed from: f  reason: collision with root package name */
    private int f1168f;

    /* renamed from: e2.a$a  reason: collision with other inner class name */
    static class C0019a {
        C0019a() {
        }

        /* access modifiers changed from: package-private */
        public MediaRecorder a() {
            return new MediaRecorder();
        }
    }

    public a(CamcorderProfile camcorderProfile, String str) {
        this(camcorderProfile, str, new C0019a());
    }

    a(CamcorderProfile camcorderProfile, String str, C0019a aVar) {
        this.f1163a = str;
        this.f1164b = camcorderProfile;
        this.f1165c = null;
        this.f1166d = aVar;
    }

    public a(EncoderProfiles encoderProfiles, String str) {
        this(encoderProfiles, str, new C0019a());
    }

    a(EncoderProfiles encoderProfiles, String str, C0019a aVar) {
        this.f1163a = str;
        this.f1165c = encoderProfiles;
        this.f1164b = null;
        this.f1166d = aVar;
    }

    public MediaRecorder a() {
        int i3;
        int i4;
        MediaRecorder a4 = this.f1166d.a();
        if (this.f1167e) {
            a4.setAudioSource(1);
        }
        a4.setVideoSource(2);
        if (Build.VERSION.SDK_INT >= 31) {
            EncoderProfiles.VideoProfile videoProfile = this.f1165c.getVideoProfiles().get(0);
            EncoderProfiles.AudioProfile audioProfile = this.f1165c.getAudioProfiles().get(0);
            a4.setOutputFormat(this.f1165c.getRecommendedFileFormat());
            if (this.f1167e) {
                a4.setAudioEncoder(audioProfile.getCodec());
                a4.setAudioEncodingBitRate(audioProfile.getBitrate());
                a4.setAudioSamplingRate(audioProfile.getSampleRate());
            }
            a4.setVideoEncoder(videoProfile.getCodec());
            a4.setVideoEncodingBitRate(videoProfile.getBitrate());
            a4.setVideoFrameRate(videoProfile.getFrameRate());
            a4.setVideoSize(videoProfile.getWidth(), videoProfile.getHeight());
            i3 = videoProfile.getWidth();
            i4 = videoProfile.getHeight();
        } else {
            a4.setOutputFormat(this.f1164b.fileFormat);
            if (this.f1167e) {
                a4.setAudioEncoder(this.f1164b.audioCodec);
                a4.setAudioEncodingBitRate(this.f1164b.audioBitRate);
                a4.setAudioSamplingRate(this.f1164b.audioSampleRate);
            }
            a4.setVideoEncoder(this.f1164b.videoCodec);
            a4.setVideoEncodingBitRate(this.f1164b.videoBitRate);
            a4.setVideoFrameRate(this.f1164b.videoFrameRate);
            CamcorderProfile camcorderProfile = this.f1164b;
            i3 = camcorderProfile.videoFrameWidth;
            i4 = camcorderProfile.videoFrameHeight;
        }
        a4.setVideoSize(i3, i4);
        a4.setOutputFile(this.f1163a);
        a4.setOrientationHint(this.f1168f);
        a4.prepare();
        return a4;
    }

    public a b(boolean z3) {
        this.f1167e = z3;
        return this;
    }

    public a c(int i3) {
        this.f1168f = i3;
        return this;
    }
}
