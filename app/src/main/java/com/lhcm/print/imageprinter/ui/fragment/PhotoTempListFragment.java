package com.lhcm.print.imageprinter.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lcodecore.tkrefreshlayout.RefreshListenerAdapter;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.lhcm.print.imageprinter.R;
import com.lhcm.print.imageprinter.adapter.PhotoTempListAdapter;
import com.lhcm.print.imageprinter.base.BaseFragment;
import com.lhcm.print.imageprinter.contract.PhotoTempListContract;
import com.lhcm.print.imageprinter.entity.Photo;
import com.lhcm.print.imageprinter.presenter.PhotoTempListPresenterImpl;
import com.lhcm.print.imageprinter.util.DensityUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by chenweiqi on 2017/1/4.
 */

public class PhotoTempListFragment extends BaseFragment<PhotoTempListContract.PhotoTempListPresenter> implements PhotoTempListContract.PhotoTempListView {
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.refreshLayout)
    TwinklingRefreshLayout refreshLayout;
    @BindView(R.id.centerMessage)
    TextView centerMessage;



    PhotoTempListAdapter adapter;
    @Override
    public int getLayoutId() {
        return R.layout.layout_refreshlist;
    }

    @Override
    public PhotoTempListContract.PhotoTempListPresenter createPresenter() {
        return new PhotoTempListPresenterImpl();
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        int dp_2 = DensityUtil.dpToPx(getContext(),2);
        refreshLayout.setPadding(dp_2,dp_2,dp_2,dp_2);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL));
        adapter = new PhotoTempListAdapter();
        recyclerView.setAdapter(adapter);


        List list = new ArrayList();
        for (int i=0;i<10;i++){
            list.add(new Photo());
        }
        adapter.setPhotos(list);


        refreshLayout.setOnRefreshListener(new RefreshListenerAdapter() {
            @Override
            public void onRefresh(TwinklingRefreshLayout refreshLayout) {
                super.onRefresh(refreshLayout);
                refreshLayout.finishRefreshing();
            }

            @Override
            public void onLoadMore(TwinklingRefreshLayout refreshLayout) {
                super.onLoadMore(refreshLayout);
                refreshLayout.finishLoadmore();
            }
        });
    }
}
