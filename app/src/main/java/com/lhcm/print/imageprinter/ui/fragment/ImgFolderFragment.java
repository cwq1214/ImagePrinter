package com.lhcm.print.imageprinter.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.lhcm.print.imageprinter.R;
import com.lhcm.print.imageprinter.adapter.ImageFolderAdapter;
import com.lhcm.print.imageprinter.base.BaseFragment;
import com.lhcm.print.imageprinter.base.BaseViewHolder;
import com.lhcm.print.imageprinter.contract.BaseContract;
import com.lhcm.print.imageprinter.entity.LocalMediaFolder;
import com.lhcm.print.imageprinter.model.BaseModelImpl;
import com.lhcm.print.imageprinter.presenter.BasePresenterImpl;
import com.lhcm.print.imageprinter.ui.activity.ImageFolderActivity;
import com.lhcm.print.imageprinter.util.LocalMediaLoader;

import java.io.Serializable;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by chenweiqi on 2017/1/9.
 */

public class ImgFolderFragment extends BaseFragment {

    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;
    @BindView(R.id.emptyMsg)
    TextView emptyMsg;


    ImageFolderAdapter adapter;
    @Override
    public int getLayoutId() {
        return R.layout.fragment_img_folder;
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


        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(adapter = new ImageFolderAdapter());
        recyclerView.addItemDecoration(new DividerItemDecoration(getContext(),LinearLayoutManager.VERTICAL));
        adapter.setOnViewHolderClickListener(new BaseViewHolder.OnViewHolderClickListener() {
            @Override
            public void onClick(Object data, int position) {
                ImgListFragment imgListFragment = new ImgListFragment();
                Bundle bundle = new Bundle();
                bundle.putSerializable("IMAGES", (Serializable) ((LocalMediaFolder) data).getImages());
                imgListFragment.setArguments(bundle);
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.layout,imgListFragment).commitAllowingStateLoss();
                ImageFolderActivity.fragmentLevel++;
            }
        });
        new LocalMediaLoader(getActivity(),LocalMediaLoader.TYPE_IMAGE).loadAllImage(new LocalMediaLoader.LocalMediaLoadListener() {
            @Override
            public void loadComplete(List<LocalMediaFolder> folders) {
                if (folders!=null){
                    adapter.setFolderList(folders);
                    adapter.notifyDataSetChanged();
                    emptyMsg.setVisibility(folders.size()==0?View.VISIBLE:View.GONE);
                }


            }
        });

    }
}
