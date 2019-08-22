package com.artfactory.project01.todayart.model;

import com.artfactory.project01.todayart.entity.Article;
import com.artfactory.project01.todayart.entity.Comments;
import com.artfactory.project01.todayart.entity.Member;

import java.io.Serializable;
import java.util.Date;


public class CommentForm implements Serializable {

    private Integer commentId;
    private Integer articleId;
    private Integer memberId;
    private String comment;
    private Date createDated;
    private Date updateDated;
    private Date deleteDated;
    private Integer isDeleted;
    private Comments comments;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Date getCreateDated() {
        return createDated;
    }

    public void setCreateDated(Date createDated) {
        this.createDated = createDated;
    }

    public Date getUpdateDated() {
        return updateDated;
    }

    public void setUpdateDated(Date updateDated) {
        this.updateDated = updateDated;
    }

    public Date getDeleteDated() {
        return deleteDated;
    }

    public void setDeleteDated(Date deleteDated) {
        this.deleteDated = deleteDated;
    }

    public Integer getIsDelete() {
        return isDeleted;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDeleted = isDelete;
    }

    public Comments getComments() {
        return comments;
    }

    public void setComments(Comments comments) {


        if (commentId != null) {
            comments.setCommentId(this.commentId);
        }
        if (articleId != null) {
            comments.setArticleId(this.articleId);
        }
        if (memberId != null) {
            comments.setMemberId(this.memberId);
        }
        if (comment != null) {
            comments.setComment(this.comment);
        }
        if (createDated != null) {
            comments.setCreateDated(this.createDated);
        }
        if (updateDated != null) {
            comments.setUpdateDated(this.updateDated);
        }
        if (deleteDated != null) {
            comments.setDeleteDated(this.deleteDated);
        }
        if (isDeleted != null) {
            comments.setIsDeleted(this.isDeleted);
        }
        this.comments = comments;

    }
}
