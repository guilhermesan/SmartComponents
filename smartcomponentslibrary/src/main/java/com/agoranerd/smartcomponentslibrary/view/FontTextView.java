package com.agoranerd.smartcomponentslibrary.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.TextView;

import com.agoranerd.smartcomponentslibrary.R;
import com.agoranerd.smartcomponentslibrary.utils.EFontType;
import com.agoranerd.smartcomponentslibrary.utils.FontLoader;

import java.util.HashMap;

/**
 * Created by guilhermesan on 24/06/17.
 */

public class FontTextView extends android.support.v7.widget.AppCompatTextView {

    public FontTextView(Context context) {
        super(context);
        init(null);
    }

    public FontTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public FontTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(@Nullable AttributeSet attrs){

        if (attrs != null) {
            HashMap fontMap = FontLoader.getFontsHashMap();
            TypedArray attributes = getContext().obtainStyledAttributes(attrs, R.styleable.FontTextView);
            int fontType = attributes.getInt(R.styleable.FontTextView_fontType, 0);
            if (fontType > 0) {
                String attribute = (String) fontMap.get(fontType);
                setTypeface(FontLoader.getTypeFace(EFontType.getFontByName(attribute), getContext()));
            }else{
                String custom = attributes.getString(R.styleable.FontTextView_fontPath);
                if (custom != null && custom.length() > 0) {
                    Typeface.createFromAsset(getContext().getAssets(),custom);
                }
            }
            attributes.recycle();
        }

    }
}
