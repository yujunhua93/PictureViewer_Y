package com.example.junhuayu.pictureviewer_y;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import uk.co.senab.photoview.PhotoView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PicViewFragment extends Fragment {

    private String picUrl;
    private PhotoView mPhotoView;

    public static PicViewFragment newInstance(String picUrl){
        PicViewFragment picViewFragment = new PicViewFragment();
        Bundle bundle = new Bundle();
        bundle.putString("url",picUrl);
        picViewFragment.setArguments(bundle);
        return picViewFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        picUrl = getArguments().getString("url");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_blank, container, false);
        mPhotoView = rootView.findViewById(R.id.photoview);
        mPhotoView.setScaleType(ImageView.ScaleType.CENTER);
        mPhotoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "111", Toast.LENGTH_SHORT).show();
            }
        });

        Glide.with(this).load(picUrl).placeholder(R.mipmap.ic_launcher_round).error(R.mipmap.ic_launcher).fitCenter().into(mPhotoView);
        return rootView;
    }

}
