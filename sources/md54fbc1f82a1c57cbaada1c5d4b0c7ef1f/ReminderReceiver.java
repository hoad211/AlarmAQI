package md54fbc1f82a1c57cbaada1c5d4b0c7ef1f;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class ReminderReceiver extends WakefulBroadcastReceiver implements IGCUserPeer {
    public static final String __md_methods = "n_onReceive:(Landroid/content/Context;Landroid/content/Intent;)V:GetOnReceive_Landroid_content_Context_Landroid_content_Intent_Handler\n";
    private ArrayList refList;

    private native void n_onReceive(Context context, Intent intent);

    static {
        Runtime.register("AlarmAQI.Droid.ReminderReceiver, AlarmAQI.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", ReminderReceiver.class, __md_methods);
    }

    public ReminderReceiver() {
        if (getClass() == ReminderReceiver.class) {
            TypeManager.Activate("AlarmAQI.Droid.ReminderReceiver, AlarmAQI.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    public void onReceive(Context context, Intent intent) {
        n_onReceive(context, intent);
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
