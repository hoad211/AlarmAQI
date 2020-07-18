package mono.android.support.v4.view;

import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnAdapterChangeListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class ViewPager_OnAdapterChangeListenerImplementor implements IGCUserPeer, OnAdapterChangeListener {
    public static final String __md_methods = "n_onAdapterChanged:(Landroid/support/v4/view/ViewPager;Landroid/support/v4/view/PagerAdapter;Landroid/support/v4/view/PagerAdapter;)V:GetOnAdapterChanged_Landroid_support_v4_view_ViewPager_Landroid_support_v4_view_PagerAdapter_Landroid_support_v4_view_PagerAdapter_Handler:Android.Support.V4.View.ViewPager/IOnAdapterChangeListenerInvoker, Xamarin.Android.Support.Core.UI\n";
    private ArrayList refList;

    private native void n_onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2);

    static {
        Runtime.register("Android.Support.V4.View.ViewPager+IOnAdapterChangeListenerImplementor, Xamarin.Android.Support.Core.UI, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", ViewPager_OnAdapterChangeListenerImplementor.class, __md_methods);
    }

    public ViewPager_OnAdapterChangeListenerImplementor() {
        if (getClass() == ViewPager_OnAdapterChangeListenerImplementor.class) {
            TypeManager.Activate("Android.Support.V4.View.ViewPager+IOnAdapterChangeListenerImplementor, Xamarin.Android.Support.Core.UI, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    public void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        n_onAdapterChanged(viewPager, pagerAdapter, pagerAdapter2);
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
