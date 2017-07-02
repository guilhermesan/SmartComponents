package com.agoranerd.smartcomponentslibrary.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.TextView;

import com.agoranerd.smartcomponentslibrary.R;

/**
 * Created by guilhermesan on 01/07/17.
 */

public class FontAwesomeView extends android.support.v7.widget.AppCompatTextView  {

    public FontAwesomeView(Context context) {
        super(context);
        init(null);
    }

    public FontAwesomeView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs);
    }

    public FontAwesomeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(attrs);
    }

    private void init(AttributeSet attrs){
        setTypeface(Typeface.createFromAsset(getContext().getAssets(),"fonts/fontawesome.ttf"));
        if (attrs != null){
            TypedArray a= getContext().obtainStyledAttributes(attrs, R.styleable.FontAwesomeView);
            setText(a.getString(R.styleable.FontAwesomeView_awesomeIcon));
            a.recycle();
        }
    }

}
