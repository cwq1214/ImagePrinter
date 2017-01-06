package com.lhcm.print.imageprinter.ui.activity;

import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.lhcm.print.imageprinter.R;
import com.lhcm.print.imageprinter.adapter.MFragmentPageAdapter;
import com.lhcm.print.imageprinter.annotation.ActivityAnnotation;
import com.lhcm.print.imageprinter.base.BaseActivity;
import com.lhcm.print.imageprinter.contract.MainContract;
import com.lhcm.print.imageprinter.presenter.MainPresenterImpl;
import com.lhcm.print.imageprinter.ui.fragment.HomeFragment;
import com.lhcm.print.imageprinter.ui.fragment.PersonalFragment;
import com.lhcm.print.imageprinter.ui.fragment.ProductFragment;
import com.lhcm.print.imageprinter.util.T;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;

/**
 * Created by chenweiqi on 2017/1/4.
 */
@ActivityAnnotation(title = "首页")
public class MainActivity extends BaseActivity<MainContract.MainPresenter> implements MainContract.MainView {
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.home)
    RadioButton home;
    @BindView(R.id.product)
    RadioButton product;
    @BindView(R.id.personal)
    RadioButton personal;
    @BindView(R.id.radioGroup)
    RadioGroup radioGroup;


    MFragmentPageAdapter adapter;
    Handler handler;
    boolean canClose = false;

    @Override
    public MainContract.MainPresenter createPresenter() {
        return new MainPresenterImpl();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_main;
    }

    @Override
    public void onViewCreated() {
        handler = new Handler();

        adapter = new MFragmentPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new HomeFragment());
        adapter.addFragment(new ProductFragment());
        adapter.addFragment(new PersonalFragment());
        viewPager.setAdapter(adapter);


        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton selBtn = (RadioButton) group.findViewById(checkedId);
                int index = group.indexOfChild(selBtn);
                viewPager.setCurrentItem(index,true);
            }
        });


    }

    @Override
    public void onBackPressed() {
        if (canClose){
            super.onBackPressed();
        }else {
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    canClose = false;
                }
            },2000);
            canClose = true;
            com.lhcm.print.imageprinter.util.T.showShort(getContext(),"在按一次退出");
        }


    }
}
