package mono.android.os;

import android.os.CancellationSignal.OnCancelListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class CancellationSignal_OnCancelListenerImplementor implements IGCUserPeer, OnCancelListener {
    public static final String __md_methods = "n_onCancel:()V:GetOnCancelHandler:Android.OS.CancellationSignal/IOnCancelListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onCancel();

    static {
        Runtime.register("Android.OS.CancellationSignal+IOnCancelListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", CancellationSignal_OnCancelListenerImplementor.class, __md_methods);
    }

    public CancellationSignal_OnCancelListenerImplementor() {
        if (getClass() == CancellationSignal_OnCancelListenerImplementor.class) {
            TypeManager.Activate("Android.OS.CancellationSignal+IOnCancelListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    public void onCancel() {
        n_onCancel();
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
