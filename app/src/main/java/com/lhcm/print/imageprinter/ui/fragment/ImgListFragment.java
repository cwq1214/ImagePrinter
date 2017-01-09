package com.lhcm.print.imageprinter.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.lhcm.print.imageprinter.R;
import com.lhcm.print.imageprinter.adapter.ImageThumbAdapter;
import com.lhcm.print.imageprinter.base.BaseFragment;
import com.lhcm.print.imageprinter.base.BaseViewHolder;
import com.lhcm.print.imageprinter.contract.BaseContract;
import com.lhcm.print.imageprinter.entity.LocalMedia;
import com.lhcm.print.imageprinter.model.BaseModelImpl;
import com.lhcm.print.imageprinter.presenter.BasePresenterImpl;
import com.lhcm.print.imageprinter.ui.viewholder.ImageThumbViewHolder;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by chenweiqi on 2017/1/9.
 */

public class ImgListFragment extends BaseFragment {

    ImageThumbAdapter adapter;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;


    @Override
    public int getLayoutId() {
        return R.layout.fragment_image_list;
    }

    @Override
    public BaseContract.BasePresenter createPresenter() {
        return new BasePresenterImpl() {
            @Override
            public BaseContract.BaseModel createModel() {
                return new BaseModelImpl();
            }
        };
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL));
        recyclerView.setAdapter(adapter = new ImageThumbAdapter());
        adapter.setLocalMedias((List<LocalMedia>) getArguments().getSerializable("IMAGES"));
        adapter.setOnViewHolderClickListener(new BaseViewHolder.OnViewHolderClickListener() {
            @Override
            public void onClick(Object data, int position) {

            }
        });
        adapter.setOnCheckImageClickListener(new ImageThumbViewHolder.OnCheckImageClickListener() {
            @Override
            public void onClick(LocalMedia data, int position) {
                data.setChecked(!data.isChecked());
                adapter.notifyItemChanged(position);
            }
        });
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(),StaggeredGridLayoutManager.VERTICAL));
    }

}
