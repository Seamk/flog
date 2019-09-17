package com.fu.lei.flog.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "flog_blog", schema = "flog", catalog = "")
public class FlogBlogEntity {
    private long blogId;
    private String blogTile;
    private String blogContent;
    private String blogAutor;
    private Byte blogStatus;
    private Timestamp gmtCreate;
    private Timestamp gmtUpdate;
    private String uuid;

    @Id
    @Column(name = "blog_id")
    public long getBlogId() {
        return blogId;
    }

    public void setBlogId(long blogId) {
        this.blogId = blogId;
    }

    @Basic
    @Column(name = "blog_tile")
    public String getBlogTile() {
        return blogTile;
    }

    public void setBlogTile(String blogTile) {
        this.blogTile = blogTile;
    }

    @Basic
    @Column(name = "blog_content")
    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent;
    }

    @Basic
    @Column(name = "blog_autor")
    public String getBlogAutor() {
        return blogAutor;
    }

    public void setBlogAutor(String blogAutor) {
        this.blogAutor = blogAutor;
    }

    @Basic
    @Column(name = "blog_status")
    public Byte getBlogStatus() {
        return blogStatus;
    }

    public void setBlogStatus(Byte blogStatus) {
        this.blogStatus = blogStatus;
    }

    @Basic
    @Column(name = "gmt_create")
    public Timestamp getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Timestamp gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Basic
    @Column(name = "gmt_update")
    public Timestamp getGmtUpdate() {
        return gmtUpdate;
    }

    public void setGmtUpdate(Timestamp gmtUpdate) {
        this.gmtUpdate = gmtUpdate;
    }

    @Basic
    @Column(name = "uuid")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlogBlogEntity that = (FlogBlogEntity) o;
        return blogId == that.blogId &&
                Objects.equals(blogTile, that.blogTile) &&
                Objects.equals(blogContent, that.blogContent) &&
                Objects.equals(blogAutor, that.blogAutor) &&
                Objects.equals(blogStatus, that.blogStatus) &&
                Objects.equals(gmtCreate, that.gmtCreate) &&
                Objects.equals(gmtUpdate, that.gmtUpdate) &&
                Objects.equals(uuid, that.uuid);
    }

    @Override
    public int hashCode() {

        return Objects.hash(blogId, blogTile, blogContent, blogAutor, blogStatus, gmtCreate, gmtUpdate, uuid);
    }
}
