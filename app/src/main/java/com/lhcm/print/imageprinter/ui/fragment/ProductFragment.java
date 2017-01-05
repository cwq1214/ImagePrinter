package com.lhcm.print.imageprinter.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lhcm.print.imageprinter.R;
import com.lhcm.print.imageprinter.adapter.ProductListAdapter;
import com.lhcm.print.imageprinter.base.BaseFragment;
import com.lhcm.print.imageprinter.contract.ProductContract;
import com.lhcm.print.imageprinter.entity.Product;
import com.lhcm.print.imageprinter.presenter.ProductPresenterImpl;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by chenweiqi on 2017/1/5.
 */

public class ProductFragment extends BaseFragment<ProductContract.ProductPresenter> implements ProductContract.ProductView {
    @BindView(R.id.title)
    TextView title;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;


    ProductListAdapter adapter;
    @Override
    public int getLayoutId() {
        return R.layout.fragment_product;
    }

    @Override
    public ProductContract.ProductPresenter createPresenter() {
        return new ProductPresenterImpl();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        title.setText("我的作品");

        adapter = new ProductListAdapter();
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2,GridLayoutManager.VERTICAL,false));


        List<Product> list = new ArrayList<>();

        for (int i=0;i<10;i++){
            list.add(new Product());
        }

        adapter.setProducts(list);
    }

}
