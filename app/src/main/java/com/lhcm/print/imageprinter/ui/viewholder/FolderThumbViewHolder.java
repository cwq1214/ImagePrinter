package com.lhcm.print.imageprinter.ui.viewholder;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.lhcm.print.imageprinter.R;
import com.lhcm.print.imageprinter.base.BaseViewHolder;
import com.lhcm.print.imageprinter.entity.LocalMediaFolder;

import butterknife.BindView;

/**
 * Created by chenweiqi on 2017/1/9.
 */

public class FolderThumbViewHolder extends BaseViewHolder<LocalMediaFolder> {
    @BindView(R.id.thumb)
    ImageView thumb;
    @BindView(R.id.name)
    TextView name;

    public FolderThumbViewHolder(ViewGroup itemView) {
        super(inflateView(itemView, R.layout.viewholder_image_folder));
    }


    @Override
    public void setData(LocalMediaFolder data, int position) {
        super.setData(data, position);

        if (data.getImages()!=null){
            Glide.with(itemView.getContext()).load(data.getImages().get(0).getPath()).into(thumb);
            name.setText(data.getName()+"("+data.getImages().size()+")");
        }

    }
}
