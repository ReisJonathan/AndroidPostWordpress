package com.example.postwp.model.Post;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class _links {

    @SerializedName("wp:featuredmedia")
    private List<WpFeaturedmedium> wpFeaturedmedia;


    public List<WpFeaturedmedium> getWpFeaturedmedia() {
        return wpFeaturedmedia;
    }

    public void setWpFeaturedmedia(List<WpFeaturedmedium> wpFeaturedmedia) {
        this.wpFeaturedmedia = wpFeaturedmedia;
    }
}
