package com.yonyou.iuap.corp.demo.entity.yonbip.uspace;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @program: corp-demo
 * @description:
 * @author: kw
 * @create: 2020/04/14 14:07
 */

@JsonIgnoreProperties(ignoreUnknown = true)
public class ArticlesEntity {

    private String author;    //	作者姓名
    private boolean commentable;    //	是否可以评论      Y
    private boolean shareAble;    //	是否可以分享      Y
    private String title;    //	标题    Y
    private String thumbId;    //	封面图片url    Y
    private String digest;    //	摘要（显示在图片下方的内容）
    private String contentSourceUrl;    //	链接地址    Y
    private String viceTitle;    //	副标题
    private String contentSource;    //	来源

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isCommentable() {
        return commentable;
    }

    public void setCommentable(boolean commentable) {
        this.commentable = commentable;
    }

    public boolean isShareAble() {
        return shareAble;
    }

    public void setShareAble(boolean shareAble) {
        this.shareAble = shareAble;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbId() {
        return thumbId;
    }

    public void setThumbId(String thumbId) {
        this.thumbId = thumbId;
    }

    public String getDigest() {
        return digest;
    }

    public void setDigest(String digest) {
        this.digest = digest;
    }

    public String getContentSourceUrl() {
        return contentSourceUrl;
    }

    public void setContentSourceUrl(String contentSourceUrl) {
        this.contentSourceUrl = contentSourceUrl;
    }

    public String getViceTitle() {
        return viceTitle;
    }

    public void setViceTitle(String viceTitle) {
        this.viceTitle = viceTitle;
    }

    public String getContentSource() {
        return contentSource;
    }

    public void setContentSource(String contentSource) {
        this.contentSource = contentSource;
    }

}
