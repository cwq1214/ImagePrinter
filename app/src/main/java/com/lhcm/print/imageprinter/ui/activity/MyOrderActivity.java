package com.lhcm.print.imageprinter.ui.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;

import com.lhcm.print.imageprinter.R;
import com.lhcm.print.imageprinter.adapter.MFragmentPageAdapter;
import com.lhcm.print.imageprinter.annotation.ActivityAnnotation;
import com.lhcm.print.imageprinter.base.BaseActivity;
import com.lhcm.print.imageprinter.contract.MyOrderContract;
import com.lhcm.print.imageprinter.presenter.MyOrderPresenterImpl;
import com.lhcm.print.imageprinter.ui.fragment.OrderListFragment;
import com.lhcm.print.imageprinter.ui.widget.NoScrollViewPager;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by chenweiqi on 2017/1/5.
 */
@ActivityAnnotation(title = "我的订单",showBack = true)
public class MyOrderActivity extends BaseActivity<MyOrderContract.MyOrderPresenter> implements MyOrderContract.MyOrderView {
    @BindView(R.id.tabLayout)
    TabLayout tabLayout;
    @BindView(R.id.viewPager)
    NoScrollViewPager viewPager;

    MFragmentPageAdapter adapter;

    @Override
    public MyOrderContract.MyOrderPresenter createPresenter() {
        return new MyOrderPresenterImpl();
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_myorder;
    }

    @Override
    public void onViewCreated() {
        adapter = new MFragmentPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new OrderListFragment(),"订单确认");
        adapter.addFragment(new OrderListFragment(),"印刷中");
        adapter.addFragment(new OrderListFragment(),"已发货");
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

    }

}
