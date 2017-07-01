package com.agoranerd.smartcomponentslibrary.utils;

import android.content.Context;
import android.graphics.Typeface;

import java.util.HashMap;


/**
 * Created by guilherme on 3/28/17.
 */

public final class FontLoader {

    private FontLoader() {}

    public static final Typeface getTypeFace(EFontType type, final Context context) {
        Typeface font = null;
        if (type == null){
            type = EFontType.CLEAR_SANS_REGULAR;
        }
        if (font == null) {
            font = Typeface.createFromAsset(context.getAssets(), type.getFontPath());
        }
        return font;
    }

    public static final HashMap getFontsHashMap(){
        HashMap fontMap = new HashMap<Integer, String>();
        fontMap.put(1, EFontType.CLEAR_SANS_REGULAR.getFontName());
        fontMap.put(2, EFontType.CLEAR_SANS_BOLD.getFontName());
        fontMap.put(3, EFontType.CLEAR_SANS_MEDIUM.getFontName());
        fontMap.put(4, EFontType.ROBOTO_BLACK.getFontName());
        fontMap.put(5, EFontType.ROBOTO_BLACK_ITALIC.getFontName());
        fontMap.put(6, EFontType.ROBOTO_BOLD.getFontName());
        fontMap.put(7, EFontType.ROBOTO_BOLD_ITALIC.getFontName());
        fontMap.put(8, EFontType.ROBOTO_ITALIC.getFontName());
        fontMap.put(9, EFontType.ROBOTO_LIGHT.getFontName());
        fontMap.put(10, EFontType.ROBOTO_LIGHT_ITALIC.getFontName());
        fontMap.put(11, EFontType.ROBOTO_MEDIUM.getFontName());
        fontMap.put(12, EFontType.ROBOTO_MEDIUM_ITALIC.getFontName());
        fontMap.put(13, EFontType.ROBOTO_REGULAR.getFontName());
        fontMap.put(14, EFontType.ROBOTO_THIN.getFontName());
        fontMap.put(15, EFontType.ROBOTO_THIN_ITALIC.getFontName());
        return fontMap;
    }
}