package md54fbc1f82a1c57cbaada1c5d4b0c7ef1f;

import android.os.Bundle;
import java.util.ArrayList;
import md5b60ffeb829f638581ab2bb9b1a7f4f3f.FormsAppCompatActivity;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class AQIActivity extends FormsAppCompatActivity implements IGCUserPeer {
    public static final String __md_methods = "n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n";
    private ArrayList refList;

    private native void n_onCreate(Bundle bundle);

    static {
        Runtime.register("AlarmAQI.Droid.AQIActivity, AlarmAQI.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", AQIActivity.class, __md_methods);
    }

    public AQIActivity() {
        if (getClass() == AQIActivity.class) {
            TypeManager.Activate("AlarmAQI.Droid.AQIActivity, AlarmAQI.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    public void onCreate(Bundle bundle) {
        n_onCreate(bundle);
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
