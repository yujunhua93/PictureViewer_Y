package com.example.junhuayu.pictureviewer_y;

import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.SparseArray;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<PicBean> mBeanList = new ArrayList<>();

    private List<Fragment> mFragmentList = new ArrayList<>();

    private PicViewAdapter mPicViewAdapter;

    private ViewPager mViewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mViewPager = findViewById(R.id.pic_viewer_vp);
        requestData();
        initData();
    }

    private void requestData() {
            mBeanList.add(new PicBean("http://img.lanrentuku.com/img/allimg/1601/5-1601121202370-L.jpg","1"));
            mBeanList.add(new PicBean("http://img.lanrentuku.com/img/allimg/1503/5-15031H026200-L.jpg","2"));
            mBeanList.add(new PicBean("http://img.lanrentuku.com/img/allimg/1503/5-1503112014190-L.jpg","3"));
            mBeanList.add(new PicBean("http://img.lanrentuku.com/img/allimg/1503/5-15031H030430-L.jpg","4"));
            mBeanList.add(new PicBean("http://img.lanrentuku.com/img/allimg/1603/5-1603240919320-L.jpg","5"));
    }
    private void initData() {

        for (int i = 0; i < mBeanList.size(); i++) {
            mFragmentList.add(PicViewFragment.newInstance(mBeanList.get(i).getUrl()));
        }
        mPicViewAdapter = new PicViewAdapter(getSupportFragmentManager(),mFragmentList);
        mViewPager.setAdapter(mPicViewAdapter);
    }


}
