package com.lhcm.print.imageprinter.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lhcm.print.imageprinter.R;
import com.lhcm.print.imageprinter.adapter.MFragmentPageAdapter;
import com.lhcm.print.imageprinter.annotation.ActivityAnnotation;
import com.lhcm.print.imageprinter.base.BaseFragment;
import com.lhcm.print.imageprinter.model.HomeContract;
import com.lhcm.print.imageprinter.presenter.HomePresenterImpl;
import com.lhcm.print.imageprinter.util.DensityUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by chenweiqi on 2017/1/4.
 */
public class HomeFragment extends BaseFragment<HomeContract.HomePresenter> implements HomeContract.HomeView {
    @BindView(R.id.tabLayout)
    TabLayout tabLayout;
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    MFragmentPageAdapter adapter;
    @BindView(R.id.title)
    TextView title;


    @Override
    public int getLayoutId() {
        return R.layout.fragment_home;
    }

    @Override
    public HomeContract.HomePresenter createPresenter() {
        return new HomePresenterImpl();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        title.setText("首页");
        adapter = new MFragmentPageAdapter(getChildFragmentManager());
        adapter.addFragment(new PhotoTempListFragment(), "remen");
        adapter.addFragment(new PhotoTempListFragment(), "remen");

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        //设置tab间距
        int betweenSpace = DensityUtil.dpToPx(getContext(), 4);
        ViewGroup slidingTabStrip = (ViewGroup) tabLayout.getChildAt(0);
        for (int i = 0; i < slidingTabStrip.getChildCount() - 1; i++) {
            View v = slidingTabStrip.getChildAt(i);
            ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
            params.rightMargin = betweenSpace;
        }


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }
}
