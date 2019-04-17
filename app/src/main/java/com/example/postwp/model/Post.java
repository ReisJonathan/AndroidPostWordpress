package com.example.postwp.model;

public class Post {
    private int id;
    private int idPhoto;
    private String title;
    private String publishDate;

    public Post() {

    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPhoto() {
        return idPhoto;
    }

    public void setIdPhoto(int idPhoto) {
        this.idPhoto = idPhoto;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }
}
