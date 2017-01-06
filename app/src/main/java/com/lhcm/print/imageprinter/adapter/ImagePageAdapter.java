package com.lhcm.print.imageprinter.adapter;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by chenweiqi on 2017/1/6.
 */

public class ImagePageAdapter extends PagerAdapter {
    List<String> imgUrl;
    List<ImageView> imageViews;

    @Override
    public int getCount() {
        if (imgUrl!=null){
            return imgUrl.size();
        }
        return 0;
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return false;
    }

    public ImagePageAdapter() {
        super();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        return super.instantiateItem(container, position);
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        super.destroyItem(container, position, object);
    }

    private ImageView createImageView(Context context,String imgUrl){
        ImageView imageView = new ImageView(context);


        return imageView;
    }
}
