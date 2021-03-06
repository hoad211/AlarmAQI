package mono.android.accessibilityservice;

import android.accessibilityservice.AccessibilityService.SoftKeyboardController;
import android.accessibilityservice.AccessibilityService.SoftKeyboardController.OnShowModeChangedListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class AccessibilityService_SoftKeyboardController_OnShowModeChangedListenerImplementor implements IGCUserPeer, OnShowModeChangedListener {
    public static final String __md_methods = "n_onShowModeChanged:(Landroid/accessibilityservice/AccessibilityService$SoftKeyboardController;I)V:GetOnShowModeChanged_Landroid_accessibilityservice_AccessibilityService_SoftKeyboardController_IHandler:Android.AccessibilityServices.AccessibilityService/SoftKeyboardController/IOnShowModeChangedListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onShowModeChanged(SoftKeyboardController softKeyboardController, int i);

    static {
        Runtime.register("Android.AccessibilityServices.AccessibilityService+SoftKeyboardController+IOnShowModeChangedListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", AccessibilityService_SoftKeyboardController_OnShowModeChangedListenerImplementor.class, __md_methods);
    }

    public AccessibilityService_SoftKeyboardController_OnShowModeChangedListenerImplementor() {
        if (getClass() == AccessibilityService_SoftKeyboardController_OnShowModeChangedListenerImplementor.class) {
            TypeManager.Activate("Android.AccessibilityServices.AccessibilityService+SoftKeyboardController+IOnShowModeChangedListenerImplementor, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", "", this, new Object[0]);
        }
    }

    public void onShowModeChanged(SoftKeyboardController softKeyboardController, int i) {
        n_onShowModeChanged(softKeyboardController, i);
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
