package com.gmardon.java_epicture_2017;

/**
 * Created by gmardon on 06/02/18.
 */

enum ImageSourceEnum {

}

public class Image {
    private String url;
    private ImageSourceEnum source;

    public Image(String url, ImageSourceEnum source) {

    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public ImageSourceEnum getSource() {
        return source;
    }

    public void setSource(ImageSourceEnum source) {
        this.source = source;
    }
}
