package md5b60ffeb829f638581ab2bb9b1a7f4f3f;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class ToolbarButton extends Button implements IGCUserPeer {
    public static final String __md_methods = "";
    private ArrayList refList;

    static {
        Runtime.register("Xamarin.Forms.Platform.Android.ToolbarButton, Xamarin.Forms.Platform.Android, Version=2.0.0.0, Culture=neutral, PublicKeyToken=null", ToolbarButton.class, __md_methods);
    }

    public ToolbarButton(Context context) {
        super(context);
        if (getClass() == ToolbarButton.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ToolbarButton, Xamarin.Forms.Platform.Android, Version=2.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new Object[]{context});
        }
    }

    public ToolbarButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (getClass() == ToolbarButton.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ToolbarButton, Xamarin.Forms.Platform.Android, Version=2.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065", this, new Object[]{context, attributeSet});
        }
    }

    public ToolbarButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (getClass() == ToolbarButton.class) {
            TypeManager.Activate("Xamarin.Forms.Platform.Android.ToolbarButton, Xamarin.Forms.Platform.Android, Version=2.0.0.0, Culture=neutral, PublicKeyToken=null", "Android.Content.Context, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:Android.Util.IAttributeSet, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=84e04ff9cfb79065:System.Int32, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new Object[]{context, attributeSet, Integer.valueOf(i)});
        }
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
