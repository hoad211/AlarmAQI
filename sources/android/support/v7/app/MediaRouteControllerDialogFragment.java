package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public class MediaRouteControllerDialogFragment extends DialogFragment {
    private MediaRouteControllerDialog mDialog;

    public MediaRouteControllerDialogFragment() {
        setCancelable(true);
    }

    public MediaRouteControllerDialog onCreateControllerDialog(Context context, Bundle savedInstanceState) {
        return new MediaRouteControllerDialog(context);
    }

    public Dialog onCreateDialog(Bundle savedInstanceState) {
        this.mDialog = onCreateControllerDialog(getContext(), savedInstanceState);
        return this.mDialog;
    }

    public void onStop() {
        super.onStop();
        if (this.mDialog != null) {
            this.mDialog.clearGroupListAnimation(false);
        }
    }

    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (this.mDialog != null) {
            this.mDialog.updateLayout();
        }
    }
}
