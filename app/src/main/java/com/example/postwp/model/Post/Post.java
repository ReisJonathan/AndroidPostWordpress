package com.example.postwp.model.Post;

public class Post {
    private String date;

    private String template;

    private String modified_gmt;

    private _links _links;

    private String author;

    private String link;

    private String format;

    private String type;

    private Title title;

    private String comment_status;

    private Content content;

    private int featured_media;

    private String[] tags;

    private String ping_status;

    private String[] meta;

    private String sticky;

    private Guid guid;

    private String modified;

    private String id;

    private String[] categories;

    private Excerpt excerpt;

    private String date_gmt;

    private String slug;

    private String status;

    public String getDate ()
    {
        return date;
    }

    public void setDate (String date)
    {
        this.date = date;
    }

    public String getTemplate ()
    {
        return template;
    }

    public void setTemplate (String template)
    {
        this.template = template;
    }

    public String getModified_gmt ()
    {
        return modified_gmt;
    }

    public void setModified_gmt (String modified_gmt)
    {
        this.modified_gmt = modified_gmt;
    }

    public _links get_links ()
    {
        return _links;
    }

    public void set_links (_links _links)
    {
        this._links = _links;
    }

    public String getAuthor ()
    {
        return author;
    }

    public void setAuthor (String author)
    {
        this.author = author;
    }

    public String getLink ()
    {
        return link;
    }

    public void setLink (String link)
    {
        this.link = link;
    }

    public String getFormat ()
    {
        return format;
    }

    public void setFormat (String format)
    {
        this.format = format;
    }

    public String getType ()
    {
        return type;
    }

    public void setType (String type)
    {
        this.type = type;
    }

    public Title getTitle ()
    {
        return title;
    }

    public void setTitle (Title title)
    {
        this.title = title;
    }

    public String getComment_status ()
    {
        return comment_status;
    }

    public void setComment_status (String comment_status)
    {
        this.comment_status = comment_status;
    }

    public Content getContent ()
    {
        return content;
    }

    public void setContent (Content content)
    {
        this.content = content;
    }

    public int getFeatured_media ()
    {
        return featured_media;
    }

    public void setFeatured_media (int featured_media)
    {
        this.featured_media = featured_media;
    }

    public String[] getTags ()
    {
        return tags;
    }

    public void setTags (String[] tags)
    {
        this.tags = tags;
    }

    public String getPing_status ()
    {
        return ping_status;
    }

    public void setPing_status (String ping_status)
    {
        this.ping_status = ping_status;
    }

    public String[] getMeta ()
    {
        return meta;
    }

    public void setMeta (String[] meta)
    {
        this.meta = meta;
    }

    public String getSticky ()
    {
        return sticky;
    }

    public void setSticky (String sticky)
    {
        this.sticky = sticky;
    }

    public Guid getGuid ()
    {
        return guid;
    }

    public void setGuid (Guid guid)
    {
        this.guid = guid;
    }

    public String getModified ()
    {
        return modified;
    }

    public void setModified (String modified)
    {
        this.modified = modified;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String[] getCategories ()
    {
        return categories;
    }

    public void setCategories (String[] categories)
    {
        this.categories = categories;
    }

    public Excerpt getExcerpt ()
    {
        return excerpt;
    }

    public void setExcerpt (Excerpt excerpt)
    {
        this.excerpt = excerpt;
    }

    public String getDate_gmt ()
    {
        return date_gmt;
    }

    public void setDate_gmt (String date_gmt)
    {
        this.date_gmt = date_gmt;
    }

    public String getSlug ()
    {
        return slug;
    }

    public void setSlug (String slug)
    {
        this.slug = slug;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    /*@Override
    public String toString()
    {
        return "[date = "+date+", template = "+template+", modified_gmt = "+modified_gmt+", _links = "+_links+", author = "+author+", link = "+link+", format = "+format+", type = "+type+", title = "+title+", comment_status = "+comment_status+", content = "+content+", featured_media = "+featured_media+", tags = "+tags+", ping_status = "+ping_status+", meta = "+meta+", sticky = "+sticky+", guid = "+guid+", modified = "+modified+", id = "+id+", categories = "+categories+", excerpt = "+excerpt+", date_gmt = "+date_gmt+", slug = "+slug+", status = "+status+"]";
    }*/

}
