package com.android.train.androidlasttrainesfand98;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.widget.TextViewCompat;

public class CustomTextView extends AppCompatTextView {
    public CustomTextView(Context context) {
        super(context);
    }

    public CustomTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Typeface typeface = Typeface.createFromAsset(context.getAssets(), "vazir.ttf");
        this.setTypeface(typeface);
    }
}
