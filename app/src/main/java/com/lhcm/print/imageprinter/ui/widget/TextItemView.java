package com.lhcm.print.imageprinter.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.lhcm.print.imageprinter.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by chenweiqi on 2017/1/4.
 */

public class TextItemView extends LinearLayout {
    @BindView(R.id.icon)
    ImageView icon;
    @BindView(R.id.text)
    TextView text;
    @BindView(R.id.arrow)
    ImageView arrow;

    public TextItemView(Context context) {
        this(context, null);
    }



    public TextItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
        View view = LayoutInflater.from(context).inflate(R.layout.layout_list_item, this,true);
        ButterKnife.bind(this,view);

        setAttr(context.obtainStyledAttributes(attrs,R.styleable.TextItemView));
    }

    private void setAttr(TypedArray typedArray){

        boolean isShowRightArrow = typedArray.getBoolean(R.styleable.TextItemView_showRightArrow,false);
        arrow.setVisibility(isShowRightArrow?VISIBLE:GONE);

        String contentText = typedArray.getString(R.styleable.TextItemView_text);
        text.setText(contentText);

        int imgId = typedArray.getResourceId(R.styleable.TextItemView_icon,0);
        if (imgId==0){
            icon.setVisibility(GONE);
        }else {
            icon.setVisibility(VISIBLE);
            icon.setImageResource(imgId);
        }

        boolean isTextEnable = typedArray.getBoolean(R.styleable.TextItemView_isTextEnable,true);
        if (isTextEnable){
            text.setTextColor(getResources().getColor(R.color.enableTextColor));
        }else {
            text.setTextColor(getResources().getColor(R.color.disableTextColor));
        }

        typedArray.recycle();
    }

}
