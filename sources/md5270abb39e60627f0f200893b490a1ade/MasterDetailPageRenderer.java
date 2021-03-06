package md5270abb39e60627f0f200893b490a1ade;

import android.content.Context;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.DrawerLayout.DrawerListener;
import android.util.AttributeSet;
import android.view.View;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class MasterDetailPageRenderer extends DrawerLayout implements IGCUserPeer, DrawerListener {
    public static final String __md_methods = "n_onAttachedToWindow:()V:GetOnAttachedToWindowHandler\nn_onDetachedFromWindow:()V:GetOnDetachedFromWindowHandler\nn_onLayout:(ZIIII)V:GetOnLayout_ZIIIIHandler\nn_onDrawerClosed:(Landroid/view/View;)V:GetOnDrawerClosed_Landroid_view_View_Handler:Android.Support.V4.Widget.DrawerLayout/IDrawerListenerInvoker, Xamarin.Android.Support.Core.UI\nn_onDrawerOpened:(Landroid/view/View;)V:GetOnDrawerOpened_Landroid_view_View_Handler:Android.Support.V4.Widget.DrawerLayout/IDrawerListenerInvoker, Xamarin.Android.Support.Core.UI\nn_onDrawerSlide:(Landroid/view/View;F)V:GetOnDrawerSlide_Landroid_view_View_FHandler:Android.Support.V4.Widget.DrawerLayout/IDrawerListenerInvoker, Xamarin.Android.Support.Core.UI\nn_onDrawerStateChanged:(I)V:GetOnDrawerStateChanged_IHandler:Android.Support.V4.Widget.DrawerLayout/IDrawerListenerInvoker, Xamarin.Android.Support.Core.UI\n";
    private ArrayList refList;

    private native void n_onAttachedToWindow();

    private native void n_onDetachedFromWindow();

    private native void n_onDrawerClosed(View view);

    private native void n_onDrawerOpened(View view);

    private native void n_onDrawerSlide(View view, float f);

    private native void n_onDrawerStateChanged(int i);

    private native void n_onLayout(boolean z, int i, int i2, int i3, int i4);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.AppCompat.MasterDetailPageRenderer, Xamarin.Forms.Platform.Android, Version=2.0.0.0, Culture=neutral, PublicKeyToken=null", MasterDetailPageRenderer.class, __md_methods);
    }

    public MasterDetailPageRenderer(Context context) {
        super(context);
        if (getClass() == MasterDetailPageRenderer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.AppCompat.MasterDetailPageRenderer, Xamarin.Forms.Platform.Android, Version=2.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new Object[]{context});
        }
    }

    public MasterDetailPageRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == MasterDetailPageRenderer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.AppCompat.MasterDetailPageRenderer, Xamarin.Forms.Platform.Android, Version=2.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new Object[]{context, attributeSet});
        }
    }

    public MasterDetailPageRenderer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getClass() == MasterDetailPageRenderer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.AppCompat.MasterDetailPageRenderer, Xamarin.Forms.Platform.Android, Version=2.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new Object[]{context, attributeSet, Integer.valueOf(i)});
        }
    }

    public void onAttachedToWindow() {
        n_onAttachedToWindow();
    }

    public void onDetachedFromWindow() {
        n_onDetachedFromWindow();
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        n_onLayout(z, i, i2, i3, i4);
    }

    public void onDrawerClosed(View view) {
        n_onDrawerClosed(view);
    }

    public void onDrawerOpened(View view) {
        n_onDrawerOpened(view);
    }

    public void onDrawerSlide(View view, float f) {
        n_onDrawerSlide(view, f);
    }

    public void onDrawerStateChanged(int i) {
        n_onDrawerStateChanged(i);
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
