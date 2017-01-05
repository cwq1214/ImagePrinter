package com.lhcm.print.imageprinter.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lcodecore.tkrefreshlayout.RefreshListenerAdapter;
import com.lcodecore.tkrefreshlayout.TwinklingRefreshLayout;
import com.lhcm.print.imageprinter.R;
import com.lhcm.print.imageprinter.adapter.AddressListAdapter;
import com.lhcm.print.imageprinter.adapter.OrderStateAdapater;
import com.lhcm.print.imageprinter.base.BaseFragment;
import com.lhcm.print.imageprinter.contract.OrderListContract;
import com.lhcm.print.imageprinter.entity.Order;
import com.lhcm.print.imageprinter.presenter.OrderListPresenterImpl;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by chenweiqi on 2017/1/5.
 */

public class OrderListFragment extends BaseFragment<OrderListContract.OrderListPresenter> implements OrderListContract.OrderListView {
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.refreshLayout)
    TwinklingRefreshLayout refreshLayout;
    @BindView(R.id.centerMessage)
    TextView centerMessage;


    OrderStateAdapater adapter;
    @Override
    public int getLayoutId() {
        return R.layout.layout_refreshlist;
    }

    @Override
    public OrderListContract.OrderListPresenter createPresenter() {
        return new OrderListPresenterImpl();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        refreshLayout.setOnRefreshListener(new RefreshListenerAdapter() {
            @Override
            public void onLoadMore(TwinklingRefreshLayout refreshLayout) {
                super.onLoadMore(refreshLayout);
                refreshLayout.finishLoadmore();
            }

            @Override
            public void onRefresh(TwinklingRefreshLayout refreshLayout) {
                super.onRefresh(refreshLayout);
                refreshLayout.finishRefreshing();
            }

        });


        adapter = new OrderStateAdapater();
        List<Order> orders = new ArrayList<>();
        for (int i=0;i<10;i++){
            orders.add(new Order());
        }

        adapter.setOrders(orders);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
    }

}
