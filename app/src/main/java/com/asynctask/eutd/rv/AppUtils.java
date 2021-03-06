package com.asynctask.eutd.rv;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;

/**
 * Created by ithelpdesk on 10/17/2015.
 */
public class AppUtils {

    public static Bitmap takeScreenShot(Activity activity) {
        View view = activity.getWindow().getDecorView();
        view.setDrawingCacheEnabled(true);
        view.buildDrawingCache();


        Bitmap b1 = view.getDrawingCache();
        Bitmap b2 = view.getDrawingCache();
        Bitmap b3 = view.getDrawingCache();
        Bitmap b5 = view.getDrawingCache();
        Bitmap b6 = view.getDrawingCache();
        Bitmap b7 = view.getDrawingCache();

// ni ni
        Rect frame = new Rect();
        activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(frame);
        int statusBarHeight = frame.top;

        Display display = activity.getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;


        Bitmap b = Bitmap.createBitmap(b1, 0, statusBarHeight, width, height - statusBarHeight);
        view.destroyDrawingCache();
        return b;
    }
}
