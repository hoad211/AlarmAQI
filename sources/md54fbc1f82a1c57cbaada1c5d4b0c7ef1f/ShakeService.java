package md54fbc1f82a1c57cbaada1c5d4b0c7ef1f;

import android.app.Activity;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Bundle;
import java.util.ArrayList;
import mono.android.IGCUserPeer;
import mono.android.Runtime;
import mono.android.TypeManager;

public class ShakeService extends Activity implements IGCUserPeer, SensorEventListener {
    public static final String __md_methods = "n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\nn_onAccuracyChanged:(Landroid/hardware/Sensor;I)V:GetOnAccuracyChanged_Landroid_hardware_Sensor_IHandler:Android.Hardware.ISensorEventListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\nn_onSensorChanged:(Landroid/hardware/SensorEvent;)V:GetOnSensorChanged_Landroid_hardware_SensorEvent_Handler:Android.Hardware.ISensorEventListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n";
    private ArrayList refList;

    private native void n_onAccuracyChanged(Sensor sensor, int i);

    private native void n_onCreate(Bundle bundle);

    private native void n_onSensorChanged(SensorEvent sensorEvent);

    static {
        Runtime.register("AlarmAQI.Droid.ShakeService, AlarmAQI.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", ShakeService.class, __md_methods);
    }

    public ShakeService() {
        if (getClass() == ShakeService.class) {
            TypeManager.Activate("AlarmAQI.Droid.ShakeService, AlarmAQI.Android, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new Object[0]);
        }
    }

    public void onCreate(Bundle bundle) {
        n_onCreate(bundle);
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
        n_onAccuracyChanged(sensor, i);
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        n_onSensorChanged(sensorEvent);
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
