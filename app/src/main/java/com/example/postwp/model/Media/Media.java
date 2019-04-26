package com.example.postwp.model.Media;

public class Media {

    private String date;

    private String template;

    private _links _links;

    private String link;

    private Description description;

    private Caption caption;

    private String type;

    private Title title;

    private Media_details media_details;

    private String source_url;

    private String post;

    private String alt_text;

    private String media_type;

    private String modified;

    private String id;

    private String date_gmt;

    private String slug;

    private String modified_gmt;

    private String author;

    private String comment_status;

    private String ping_status;

    private String mime_type;

    private String[] meta;

    private Guid guid;

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

    public _links get_links ()
    {
        return _links;
    }

    public void set_links (_links _links)
    {
        this._links = _links;
    }

    public String getLink ()
    {
        return link;
    }

    public void setLink (String link)
    {
        this.link = link;
    }

    public Description getDescription ()
    {
        return description;
    }

    public void setDescription (Description description)
    {
        this.description = description;
    }

    public Caption getCaption ()
    {
        return caption;
    }

    public void setCaption (Caption caption)
    {
        this.caption = caption;
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

    public Media_details getMedia_details ()
    {
        return media_details;
    }

    public void setMedia_details (Media_details media_details)
    {
        this.media_details = media_details;
    }

    public String getSource_url ()
    {
        return source_url;
    }

    public void setSource_url (String source_url)
    {
        this.source_url = source_url;
    }

    public String getPost ()
    {
        return post;
    }

    public void setPost (String post)
    {
        this.post = post;
    }

    public String getAlt_text ()
    {
        return alt_text;
    }

    public void setAlt_text (String alt_text)
    {
        this.alt_text = alt_text;
    }

    public String getMedia_type ()
    {
        return media_type;
    }

    public void setMedia_type (String media_type)
    {
        this.media_type = media_type;
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

    public String getModified_gmt ()
    {
        return modified_gmt;
    }

    public void setModified_gmt (String modified_gmt)
    {
        this.modified_gmt = modified_gmt;
    }

    public String getAuthor ()
    {
        return author;
    }

    public void setAuthor (String author)
    {
        this.author = author;
    }

    public String getComment_status ()
    {
        return comment_status;
    }

    public void setComment_status (String comment_status)
    {
        this.comment_status = comment_status;
    }

    public String getPing_status ()
    {
        return ping_status;
    }

    public void setPing_status (String ping_status)
    {
        this.ping_status = ping_status;
    }

    public String getMime_type ()
    {
        return mime_type;
    }

    public void setMime_type (String mime_type)
    {
        this.mime_type = mime_type;
    }

    public String[] getMeta ()
    {
        return meta;
    }

    public void setMeta (String[] meta)
    {
        this.meta = meta;
    }

    public Guid getGuid ()
    {
        return guid;
    }

    public void setGuid (Guid guid)
    {
        this.guid = guid;
    }

    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [date = "+date+", template = "+template+", _links = "+_links+", link = "+link+", description = "+description+", caption = "+caption+", type = "+type+", title = "+title+", media_details = "+media_details+", source_url = "+source_url+", post = "+post+", alt_text = "+alt_text+", media_type = "+media_type+", modified = "+modified+", id = "+id+", date_gmt = "+date_gmt+", slug = "+slug+", modified_gmt = "+modified_gmt+", author = "+author+", comment_status = "+comment_status+", ping_status = "+ping_status+", mime_type = "+mime_type+", meta = "+meta+", guid = "+guid+", status = "+status+"]";
    }
}
