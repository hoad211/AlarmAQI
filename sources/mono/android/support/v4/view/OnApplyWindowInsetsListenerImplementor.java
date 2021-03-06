package mono.android.support.v4.view;

import android.support.v4.view.OnApplyWindowInsetsListener;
import android.support.v4.view.WindowInsetsCompat;
import android.view.View;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class OnApplyWindowInsetsListenerImplementor implements IGCUserPeer, OnApplyWindowInsetsListener {
    public static final String __md_methods = "n_onApplyWindowInsets:(Landroid/view/View;Landroid/support/v4/view/WindowInsetsCompat;)Landroid/support/v4/view/WindowInsetsCompat;:GetOnApplyWindowInsets_Landroid_view_View_Landroid_support_v4_view_WindowInsetsCompat_Handler:Android.Support.V4.View.IOnApplyWindowInsetsListenerInvoker, Xamarin.Android.Support.Compat\n";
    private ArrayList refList;

    private native WindowInsetsCompat n_onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat);

    static {
        Runtime.register("Android.Support.V4.View.IOnApplyWindowInsetsListenerImplementor, Xamarin.Android.Support.Compat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", OnApplyWindowInsetsListenerImplementor.class, __md_methods);
    }

    public OnApplyWindowInsetsListenerImplementor() {
        if (getClass() == OnApplyWindowInsetsListenerImplementor.class) {
            TypeManager.Activate("Android.Support.V4.View.IOnApplyWindowInsetsListenerImplementor, Xamarin.Android.Support.Compat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        return n_onApplyWindowInsets(view, windowInsetsCompat);
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
