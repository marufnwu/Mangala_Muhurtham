package com.mangala.muhurtham.Common;

import android.content.Context;
import android.graphics.Color;

import cc.cloudist.acplibrary.ACProgressConstant;
import cc.cloudist.acplibrary.ACProgressPie;

public class WaitingDialog {


    private final ACProgressPie dialog;

    public WaitingDialog(Context ctx, boolean cancelable) {
        dialog = new ACProgressPie.Builder(ctx)
                .ringColor(Color.WHITE)
                .pieColor(Color.WHITE)
                .updateType(ACProgressConstant.PIE_AUTO_UPDATE)
                .build();
        dialog.setCancelable(cancelable);
    }

    public void show(){
        if (dialog!=null && !dialog.isShowing()){
            dialog.show();
        }
    }

    public void hide(){
        if (dialog!=null && dialog.isShowing()){
            dialog.dismiss();
        }
    }
}
