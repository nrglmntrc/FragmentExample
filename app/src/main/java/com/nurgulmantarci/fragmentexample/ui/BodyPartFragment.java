package com.nurgulmantarci.fragmentexample.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.nurgulmantarci.fragmentexample.R;
import com.nurgulmantarci.fragmentexample.data.ImageAssets;

public class BodyPartFragment extends Fragment {

    public BodyPartFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_body_part,container,false);
        ImageView imageView=rootView.findViewById(R.id.body_part_image_view);
        imageView.setImageResource(ImageAssets.getHeads().get(0));

        return rootView;
    }
}


