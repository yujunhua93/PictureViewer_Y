package com.example.junhuayu.pictureviewer_y;

/**
 * Created by junhua.yu on 2018/3/28.
 */

public class PicBean {

    private String url;

    private String name;

    public PicBean(String url, String name) {
        this.url = url;
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
