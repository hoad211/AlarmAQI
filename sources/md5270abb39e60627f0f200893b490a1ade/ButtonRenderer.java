package md5270abb39e60627f0f200893b490a1ade;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class ButtonRenderer extends ViewRenderer_2 implements IGCUserPeer, OnAttachStateChangeListener {
    public static final String __md_methods = "n_onLayout:(ZIIII)V:GetOnLayout_ZIIIIHandler\nn_onViewAttachedToWindow:(Landroid/view/View;)V:GetOnViewAttachedToWindow_Landroid_view_View_Handler:Android.Views.View/IOnAttachStateChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onViewDetachedFromWindow:(Landroid/view/View;)V:GetOnViewDetachedFromWindow_Landroid_view_View_Handler:Android.Views.View/IOnAttachStateChangeListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onLayout(boolean z, int i, int i2, int i3, int i4);

    private native void n_onViewAttachedToWindow(View view);

    private native void n_onViewDetachedFromWindow(View view);

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.AppCompat.ButtonRenderer, Xamarin.Forms.Platform.Android, Version=2.0.0.0, Culture=neutral, PublicKeyToken=null", ButtonRenderer.class, __md_methods);
    }

    public ButtonRenderer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getClass() == ButtonRenderer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.AppCompat.ButtonRenderer, Xamarin.Forms.Platform.Android, Version=2.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new Object[]{context, attributeSet, Integer.valueOf(i)});
        }
    }

    public ButtonRenderer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == ButtonRenderer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.AppCompat.ButtonRenderer, Xamarin.Forms.Platform.Android, Version=2.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new Object[]{context, attributeSet});
        }
    }

    public ButtonRenderer(Context context) {
        super(context);
        if (getClass() == ButtonRenderer.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.AppCompat.ButtonRenderer, Xamarin.Forms.Platform.Android, Version=2.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new Object[]{context});
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        n_onLayout(z, i, i2, i3, i4);
    }

    public void onViewAttachedToWindow(View view) {
        n_onViewAttachedToWindow(view);
    }

    public void onViewDetachedFromWindow(View view) {
        n_onViewDetachedFromWindow(view);
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
