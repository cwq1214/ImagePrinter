package com.lhcm.print.imageprinter.ui.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

import com.lhcm.print.imageprinter.R;
import com.lhcm.print.imageprinter.adapter.ImageFolderAdapter;
import com.lhcm.print.imageprinter.entity.LocalMediaFolder;
import com.lhcm.print.imageprinter.ui.fragment.ImgFolderFragment;
import com.lhcm.print.imageprinter.ui.fragment.ImgListFragment;
import com.lhcm.print.imageprinter.util.LocalMediaLoader;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by chenweiqi on 2017/1/9.
 */

public class ImageFolderActivity extends AppCompatActivity {

    ImageFolderAdapter adapter;
    @BindView(R.id.backBtn)
    FrameLayout backBtn;
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.functionBtn)
    TextView functionBtn;
    @BindView(R.id.layout)
    FrameLayout layout;

    ImgFolderFragment imgFolderFragment;
    ImgListFragment imgListFragment;
    public static int fragmentLevel = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_image_folder);
        ButterKnife.bind(this);


        title.setText("选择相片");
        backBtn.setVisibility(View.VISIBLE);
        getSupportFragmentManager().beginTransaction().replace(R.id.layout,imgFolderFragment = new ImgFolderFragment()).commitAllowingStateLoss();
    }

    @OnClick(R.id.backBtn)
    public void onBackBtnClick(){
        if (fragmentLevel==0){
            finish();
        }else {
            fragmentLevel--;
            getSupportFragmentManager().beginTransaction().replace(R.id.layout,imgFolderFragment).commit();
        }

    }

    @Override
    public void onBackPressed() {
        onBackBtnClick();
    }
}
