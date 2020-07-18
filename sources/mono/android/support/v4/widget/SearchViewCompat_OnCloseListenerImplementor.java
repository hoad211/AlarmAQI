package mono.android.support.v4.widget;

import android.support.v4.widget.SearchViewCompat.OnCloseListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class SearchViewCompat_OnCloseListenerImplementor implements IGCUserPeer, OnCloseListener {
    public static final String __md_methods = "n_onClose:()Z:GetOnCloseHandler:Android.Support.V4.Widget.SearchViewCompat/IOnCloseListenerInvoker, Xamarin.Android.Support.Compat\n";
    private ArrayList refList;

    private native boolean n_onClose();

    static {
        Runtime.register("Android.Support.V4.Widget.SearchViewCompat+IOnCloseListenerImplementor, Xamarin.Android.Support.Compat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", SearchViewCompat_OnCloseListenerImplementor.class, __md_methods);
    }

    public SearchViewCompat_OnCloseListenerImplementor() {
        if (getClass() == SearchViewCompat_OnCloseListenerImplementor.class) {
            TypeManager.Activate("Android.Support.V4.Widget.SearchViewCompat+IOnCloseListenerImplementor, Xamarin.Android.Support.Compat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    public boolean onClose() {
        return n_onClose();
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
