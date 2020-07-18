package mono.android.support.v7.media;

import android.os.Bundle;
import android.support.v7.media.RemotePlaybackClient.OnMessageReceivedListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class RemotePlaybackClient_OnMessageReceivedListenerImplementor implements IGCUserPeer, OnMessageReceivedListener {
    public static final String __md_methods = "n_onMessageReceived:(Ljava/lang/String;Landroid/os/Bundle;)V:GetOnMessageReceived_Ljava_lang_String_Landroid_os_Bundle_Handler:Android.Support.V7.Media.RemotePlaybackClient/IOnMessageReceivedListenerInvoker, Xamarin.Android.Support.v7.MediaRouter\n";
    private ArrayList refList;

    private native void n_onMessageReceived(String str, Bundle bundle);

    static {
        Runtime.register("Android.Support.V7.Media.RemotePlaybackClient+IOnMessageReceivedListenerImplementor, Xamarin.Android.Support.v7.MediaRouter, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", RemotePlaybackClient_OnMessageReceivedListenerImplementor.class, __md_methods);
    }

    public RemotePlaybackClient_OnMessageReceivedListenerImplementor() {
        if (getClass() == RemotePlaybackClient_OnMessageReceivedListenerImplementor.class) {
            TypeManager.Activate("Android.Support.V7.Media.RemotePlaybackClient+IOnMessageReceivedListenerImplementor, Xamarin.Android.Support.v7.MediaRouter, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    public void onMessageReceived(String str, Bundle bundle) {
        n_onMessageReceived(str, bundle);
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
