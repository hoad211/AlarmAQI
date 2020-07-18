package md54fbc1f82a1c57cbaada1c5d4b0c7ef1f;

import android.content.Intent;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;
import mono.android.app.IntentService;

public class SimpleStartedService extends IntentService implements IGCUserPeer {
    public static final String __md_methods = "n_onHandleIntent:(Landroid/content/Intent;)V:GetOnHandleIntent_Landroid_content_Intent_Handler\n";
    private ArrayList refList;

    private native void n_onHandleIntent(Intent intent);

    static {
        Runtime.register("AlarmAQI.Droid.SimpleStartedService, AlarmAQI.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", SimpleStartedService.class, __md_methods);
    }

    public SimpleStartedService(String str) {
        super(str);
        if (getClass() == SimpleStartedService.class) {
            TypeManager.Activate("AlarmAQI.Droid.SimpleStartedService, AlarmAQI.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "System.String, mscorlib, Version=2.0.5.0, Culture=neutral, PublicKeyToken=7cec85d7bea7798e", this, new Object[]{str});
        }
    }

    public SimpleStartedService() {
        if (getClass() == SimpleStartedService.class) {
            TypeManager.Activate("AlarmAQI.Droid.SimpleStartedService, AlarmAQI.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    public void onHandleIntent(Intent intent) {
        n_onHandleIntent(intent);
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
