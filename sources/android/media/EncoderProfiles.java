package android.media;

import android.annotation.NonNull;
import java.util.List;

public final /* synthetic */ class EncoderProfiles {

    public final /* synthetic */ class AudioProfile {
        static {
            throw new NoClassDefFoundError();
        }

        public native /* synthetic */ int getBitrate();

        public native /* synthetic */ int getCodec();

        public native /* synthetic */ int getSampleRate();
    }

    public final /* synthetic */ class VideoProfile {
        static {
            throw new NoClassDefFoundError();
        }

        public native /* synthetic */ int getBitrate();

        public native /* synthetic */ int getCodec();

        public native /* synthetic */ int getFrameRate();

        public native /* synthetic */ int getHeight();

        public native /* synthetic */ int getWidth();
    }

    static {
        throw new NoClassDefFoundError();
    }

    @NonNull
    public native /* synthetic */ List<AudioProfile> getAudioProfiles();

    public native /* synthetic */ int getRecommendedFileFormat();

    @NonNull
    public native /* synthetic */ List<VideoProfile> getVideoProfiles();
}
