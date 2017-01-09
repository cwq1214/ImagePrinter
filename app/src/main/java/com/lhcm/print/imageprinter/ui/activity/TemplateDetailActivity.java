package com.lhcm.print.imageprinter.ui.activity;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.lhcm.print.imageprinter.R;
import com.lhcm.print.imageprinter.base.BaseActivity;
import com.lhcm.print.imageprinter.contract.TemplateDetailContract;
import com.lhcm.print.imageprinter.presenter.TemplateDetailPresenterImpl;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by chenweiqi on 2017/1/6.
 */

public class TemplateDetailActivity extends BaseActivity<TemplateDetailContract.TemplateDetailPresenter> implements TemplateDetailContract.TemplateDetailView {
    @BindView(R.id.toLeft)
    ImageView toLeft;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.toRight)
    ImageView toRight;
    @BindView(R.id.name)
    TextView name;
    @BindView(R.id.pages)
    TextView pages;
    @BindView(R.id.oPrice)
    TextView oPrice;
    @BindView(R.id.nPrice)
    TextView nPrice;
    @BindView(R.id.create)
    TextView create;

    @Override
    public TemplateDetailContract.TemplateDetailPresenter createPresenter() {
        return new TemplateDetailPresenterImpl();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_template_detail;
    }

    @Override
    public void onViewCreated() {

    }

    @OnClick({R.id.toLeft, R.id.toRight, R.id.create})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.toLeft:
                break;
            case R.id.toRight:
                break;
            case R.id.create:
                break;
        }
    }

    private void onChangePageClick(boolean right){
        int currentIndex = viewPager.getCurrentItem();
        int maxPages ;
        if (right){

        }
    }
}
