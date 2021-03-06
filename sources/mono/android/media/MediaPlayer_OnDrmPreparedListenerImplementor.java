package mono.android.media;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnDrmPreparedListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class MediaPlayer_OnDrmPreparedListenerImplementor implements IGCUserPeer, OnDrmPreparedListener {
    public static final String __md_methods = "n_onDrmPrepared:(Landroid/media/MediaPlayer;I)V:GetOnDrmPrepared_Landroid_media_MediaPlayer_IHandler:Android.Media.MediaPlayer/IOnDrmPreparedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onDrmPrepared(MediaPlayer mediaPlayer, int i);

    static {
        Runtime.register("Android.Media.MediaPlayer+IOnDrmPreparedListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", MediaPlayer_OnDrmPreparedListenerImplementor.class, __md_methods);
    }

    public MediaPlayer_OnDrmPreparedListenerImplementor() {
        if (getClass() == MediaPlayer_OnDrmPreparedListenerImplementor.class) {
            TypeManager.Activate("Android.Media.MediaPlayer+IOnDrmPreparedListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    public void onDrmPrepared(MediaPlayer mediaPlayer, int i) {
        n_onDrmPrepared(mediaPlayer, i);
    }

    public void monodroidAddReference(Object obj) {
        if (this.refList == null) {
            this.refList = new ArrayList();
        }
        this.refList.add(obj);
    }

    public void monodroidClearReferences() {
        if (this.refList != null) {
            this.refList.clear();
        }
    }
}
