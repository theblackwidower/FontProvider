package moe.shizuku.fontprovider;

import android.app.Application;
import android.content.Context;

import moe.shizuku.fontprovider.font.FontManager;

/**
 * Created by rikka on 2017/10/3.
 */

public class FontProviderApplication extends Application {

    private static boolean sInitialized;

    public static void init(Context context) {
        if (sInitialized) {
            return;
        }

        sInitialized = true;

        FontProviderSettings.init(context);
        FontManager.init(context);
    }

    @Override
    public void onCreate() {
        super.onCreate();

        init(this);
    }
}
