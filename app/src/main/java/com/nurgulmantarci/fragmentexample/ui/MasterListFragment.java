package com.nurgulmantarci.fragmentexample.ui;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.nurgulmantarci.fragmentexample.R;
import com.nurgulmantarci.fragmentexample.data.ImageAssets;

public class MasterListFragment extends Fragment {

    OnImageClickListener mCallback;

    public interface OnImageClickListener{
        void onImageSelected(int position);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try{
            mCallback= (OnImageClickListener) context;
        }catch (ClassCastException e){
            throw new ClassCastException(context.toString() + "must implement OnImageClickListener");
        }
    }
//
    public MasterListFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View roortView=inflater.inflate(R.layout.fragment_master_list,container,false);

        GridView gridView=roortView.findViewById(R.id.images_grid_view);

        ListAdapter mAdapter=new ListAdapter(getContext(), ImageAssets.getAll());

        gridView.setAdapter(mAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                mCallback.onImageSelected(position);
            }
        });

        return roortView;

    }
}
