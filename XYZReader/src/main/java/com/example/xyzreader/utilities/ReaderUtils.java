package com.example.xyzreader.utilities;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

import com.example.xyzreader.R;


/**
 * Utility functions and common constants
 */

public final class ReaderUtils {

    // Keys for intent extras
    public static final String EXTRA_RECIPE = "extraRecipe";
    public static final String EXTRA_RECIPE_STEP_INDEX = "extraRecipeStepIndex";
    public static final String EXTRA_RECIPE_STEP = "extraRecipeStep";

    // Keys for saving instance state for recipe
    public static final String INSTANCE_RECIPE = "instanceRecipe";
    public static final String INSTANCE_RECIPE_STEP = "instanceRecipeStep";
    public static final String INSTANCE_RECIPE_STEP_INDEX = "instanceRecipeStepIndex";

    // Keys for saving instance state for fragments
    public static final String INSTANCE_FRAGMENT = "instanceFragment";

    // Keys for saving instance state media player
    public static final String INSTANCE_PLAYER_POSITION = "instancePlayerPosition";
    public static final String INSTANCE_PLAYER_STATE = "instancePlayerState";

    // Keys for saving instance scroll position
    public static final String SCROLL_POSITION = "scrollPosition";
    public static final String SCROLL_STATE = "scrollState";

    // Credit: https://stackoverflow.com/questions/4605527/converting-pixels-to-dp
    public static float convertPixelsToDp(float px, Context context){
        Resources resources = context.getResources();
        DisplayMetrics metrics = resources.getDisplayMetrics();
        float dp = px / ((float)metrics.densityDpi / DisplayMetrics.DENSITY_DEFAULT);
        return dp;
    }

    //Credit: https://stackoverflow.com/questions/11252067/how-do-i-get-the-screensize-programmatically-in-android
    public static int getScreenResolution(Context context)
    {
        WindowManager wm = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = wm.getDefaultDisplay();
        DisplayMetrics metrics = new DisplayMetrics();
        display.getMetrics(metrics);
        int width = metrics.widthPixels;
        return width;
    }

    public static boolean isTablet(Context context) {
        // Check if this is a two-pane layout (tablet)
        boolean tabletSize = context.getResources().getBoolean(R.bool.isTablet);
        if (tabletSize) {
            return true;
        } else {
            return false;
        }
    }
}