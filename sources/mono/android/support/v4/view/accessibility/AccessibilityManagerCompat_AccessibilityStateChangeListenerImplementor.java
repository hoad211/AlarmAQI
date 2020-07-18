package mono.android.support.v4.view.accessibility;

import android.support.v4.view.accessibility.AccessibilityManagerCompat.AccessibilityStateChangeListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class AccessibilityManagerCompat_AccessibilityStateChangeListenerImplementor implements IGCUserPeer, AccessibilityStateChangeListener {
    public static final String __md_methods = "n_onAccessibilityStateChanged:(Z)V:GetOnAccessibilityStateChanged_ZHandler:Android.Support.V4.View.Accessibility.AccessibilityManagerCompat/IAccessibilityStateChangeListenerInvoker, Xamarin.Android.Support.Compat\n";
    private ArrayList refList;

    private native void n_onAccessibilityStateChanged(boolean z);

    static {
        Runtime.register("Android.Support.V4.View.Accessibility.AccessibilityManagerCompat+IAccessibilityStateChangeListenerImplementor, Xamarin.Android.Support.Compat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", AccessibilityManagerCompat_AccessibilityStateChangeListenerImplementor.class, __md_methods);
    }

    public AccessibilityManagerCompat_AccessibilityStateChangeListenerImplementor() {
        if (getClass() == AccessibilityManagerCompat_AccessibilityStateChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Support.V4.View.Accessibility.AccessibilityManagerCompat+IAccessibilityStateChangeListenerImplementor, Xamarin.Android.Support.Compat, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    public void onAccessibilityStateChanged(boolean z) {
        n_onAccessibilityStateChanged(z);
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
