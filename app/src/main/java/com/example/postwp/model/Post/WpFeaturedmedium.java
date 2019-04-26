package com.example.postwp.model.Post;

public class WpFeaturedmedium {

    private String href;

    private String embeddable;

    public String getHref ()
    {
        return href;
    }

    public void setHref (String href)
    {
        this.href = href;
    }

    public String getEmbeddable ()
    {
        return embeddable;
    }

    public void setEmbeddable (String embeddable)
    {
        this.embeddable = embeddable;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [href = "+href+", embeddable = "+embeddable+"]";
    }
}
