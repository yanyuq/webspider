package com.yqb.webspider.mapper.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SinaBlogContentExample implements Serializable {
    private static final long serialVersionUID = 6928904837993176882L;
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SinaBlogContentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("_id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("_id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("_id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("_id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("_id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("_id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("_id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("_id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("_id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("_id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("_id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("_id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andBlogIdIsNull() {
            addCriterion("blog_id is null");
            return (Criteria) this;
        }

        public Criteria andBlogIdIsNotNull() {
            addCriterion("blog_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlogIdEqualTo(String value) {
            addCriterion("blog_id =", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotEqualTo(String value) {
            addCriterion("blog_id <>", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThan(String value) {
            addCriterion("blog_id >", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdGreaterThanOrEqualTo(String value) {
            addCriterion("blog_id >=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThan(String value) {
            addCriterion("blog_id <", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLessThanOrEqualTo(String value) {
            addCriterion("blog_id <=", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdLike(String value) {
            addCriterion("blog_id like", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotLike(String value) {
            addCriterion("blog_id not like", value, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdIn(List<String> values) {
            addCriterion("blog_id in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotIn(List<String> values) {
            addCriterion("blog_id not in", values, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdBetween(String value1, String value2) {
            addCriterion("blog_id between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andBlogIdNotBetween(String value1, String value2) {
            addCriterion("blog_id not between", value1, value2, "blogId");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("created_at is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("created_at is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(String value) {
            addCriterion("created_at =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(String value) {
            addCriterion("created_at <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(String value) {
            addCriterion("created_at >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(String value) {
            addCriterion("created_at >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(String value) {
            addCriterion("created_at <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(String value) {
            addCriterion("created_at <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLike(String value) {
            addCriterion("created_at like", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotLike(String value) {
            addCriterion("created_at not like", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<String> values) {
            addCriterion("created_at in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<String> values) {
            addCriterion("created_at not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(String value1, String value2) {
            addCriterion("created_at between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(String value1, String value2) {
            addCriterion("created_at not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andMidIsNull() {
            addCriterion("mid is null");
            return (Criteria) this;
        }

        public Criteria andMidIsNotNull() {
            addCriterion("mid is not null");
            return (Criteria) this;
        }

        public Criteria andMidEqualTo(Long value) {
            addCriterion("mid =", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotEqualTo(Long value) {
            addCriterion("mid <>", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThan(Long value) {
            addCriterion("mid >", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidGreaterThanOrEqualTo(Long value) {
            addCriterion("mid >=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThan(Long value) {
            addCriterion("mid <", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidLessThanOrEqualTo(Long value) {
            addCriterion("mid <=", value, "mid");
            return (Criteria) this;
        }

        public Criteria andMidIn(List<Long> values) {
            addCriterion("mid in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotIn(List<Long> values) {
            addCriterion("mid not in", values, "mid");
            return (Criteria) this;
        }

        public Criteria andMidBetween(Long value1, Long value2) {
            addCriterion("mid between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andMidNotBetween(Long value1, Long value2) {
            addCriterion("mid not between", value1, value2, "mid");
            return (Criteria) this;
        }

        public Criteria andIdstrIsNull() {
            addCriterion("idstr is null");
            return (Criteria) this;
        }

        public Criteria andIdstrIsNotNull() {
            addCriterion("idstr is not null");
            return (Criteria) this;
        }

        public Criteria andIdstrEqualTo(String value) {
            addCriterion("idstr =", value, "idstr");
            return (Criteria) this;
        }

        public Criteria andIdstrNotEqualTo(String value) {
            addCriterion("idstr <>", value, "idstr");
            return (Criteria) this;
        }

        public Criteria andIdstrGreaterThan(String value) {
            addCriterion("idstr >", value, "idstr");
            return (Criteria) this;
        }

        public Criteria andIdstrGreaterThanOrEqualTo(String value) {
            addCriterion("idstr >=", value, "idstr");
            return (Criteria) this;
        }

        public Criteria andIdstrLessThan(String value) {
            addCriterion("idstr <", value, "idstr");
            return (Criteria) this;
        }

        public Criteria andIdstrLessThanOrEqualTo(String value) {
            addCriterion("idstr <=", value, "idstr");
            return (Criteria) this;
        }

        public Criteria andIdstrLike(String value) {
            addCriterion("idstr like", value, "idstr");
            return (Criteria) this;
        }

        public Criteria andIdstrNotLike(String value) {
            addCriterion("idstr not like", value, "idstr");
            return (Criteria) this;
        }

        public Criteria andIdstrIn(List<String> values) {
            addCriterion("idstr in", values, "idstr");
            return (Criteria) this;
        }

        public Criteria andIdstrNotIn(List<String> values) {
            addCriterion("idstr not in", values, "idstr");
            return (Criteria) this;
        }

        public Criteria andIdstrBetween(String value1, String value2) {
            addCriterion("idstr between", value1, value2, "idstr");
            return (Criteria) this;
        }

        public Criteria andIdstrNotBetween(String value1, String value2) {
            addCriterion("idstr not between", value1, value2, "idstr");
            return (Criteria) this;
        }

        public Criteria andTextIsNull() {
            addCriterion("text is null");
            return (Criteria) this;
        }

        public Criteria andTextIsNotNull() {
            addCriterion("text is not null");
            return (Criteria) this;
        }

        public Criteria andTextEqualTo(String value) {
            addCriterion("text =", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotEqualTo(String value) {
            addCriterion("text <>", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThan(String value) {
            addCriterion("text >", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextGreaterThanOrEqualTo(String value) {
            addCriterion("text >=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThan(String value) {
            addCriterion("text <", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLessThanOrEqualTo(String value) {
            addCriterion("text <=", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextLike(String value) {
            addCriterion("text like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotLike(String value) {
            addCriterion("text not like", value, "text");
            return (Criteria) this;
        }

        public Criteria andTextIn(List<String> values) {
            addCriterion("text in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotIn(List<String> values) {
            addCriterion("text not in", values, "text");
            return (Criteria) this;
        }

        public Criteria andTextBetween(String value1, String value2) {
            addCriterion("text between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andTextNotBetween(String value1, String value2) {
            addCriterion("text not between", value1, value2, "text");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andFavoritedIsNull() {
            addCriterion("favorited is null");
            return (Criteria) this;
        }

        public Criteria andFavoritedIsNotNull() {
            addCriterion("favorited is not null");
            return (Criteria) this;
        }

        public Criteria andFavoritedEqualTo(Boolean value) {
            addCriterion("favorited =", value, "favorited");
            return (Criteria) this;
        }

        public Criteria andFavoritedNotEqualTo(Boolean value) {
            addCriterion("favorited <>", value, "favorited");
            return (Criteria) this;
        }

        public Criteria andFavoritedGreaterThan(Boolean value) {
            addCriterion("favorited >", value, "favorited");
            return (Criteria) this;
        }

        public Criteria andFavoritedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("favorited >=", value, "favorited");
            return (Criteria) this;
        }

        public Criteria andFavoritedLessThan(Boolean value) {
            addCriterion("favorited <", value, "favorited");
            return (Criteria) this;
        }

        public Criteria andFavoritedLessThanOrEqualTo(Boolean value) {
            addCriterion("favorited <=", value, "favorited");
            return (Criteria) this;
        }

        public Criteria andFavoritedIn(List<Boolean> values) {
            addCriterion("favorited in", values, "favorited");
            return (Criteria) this;
        }

        public Criteria andFavoritedNotIn(List<Boolean> values) {
            addCriterion("favorited not in", values, "favorited");
            return (Criteria) this;
        }

        public Criteria andFavoritedBetween(Boolean value1, Boolean value2) {
            addCriterion("favorited between", value1, value2, "favorited");
            return (Criteria) this;
        }

        public Criteria andFavoritedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("favorited not between", value1, value2, "favorited");
            return (Criteria) this;
        }

        public Criteria andTruncatedIsNull() {
            addCriterion("truncated is null");
            return (Criteria) this;
        }

        public Criteria andTruncatedIsNotNull() {
            addCriterion("truncated is not null");
            return (Criteria) this;
        }

        public Criteria andTruncatedEqualTo(Boolean value) {
            addCriterion("truncated =", value, "truncated");
            return (Criteria) this;
        }

        public Criteria andTruncatedNotEqualTo(Boolean value) {
            addCriterion("truncated <>", value, "truncated");
            return (Criteria) this;
        }

        public Criteria andTruncatedGreaterThan(Boolean value) {
            addCriterion("truncated >", value, "truncated");
            return (Criteria) this;
        }

        public Criteria andTruncatedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("truncated >=", value, "truncated");
            return (Criteria) this;
        }

        public Criteria andTruncatedLessThan(Boolean value) {
            addCriterion("truncated <", value, "truncated");
            return (Criteria) this;
        }

        public Criteria andTruncatedLessThanOrEqualTo(Boolean value) {
            addCriterion("truncated <=", value, "truncated");
            return (Criteria) this;
        }

        public Criteria andTruncatedIn(List<Boolean> values) {
            addCriterion("truncated in", values, "truncated");
            return (Criteria) this;
        }

        public Criteria andTruncatedNotIn(List<Boolean> values) {
            addCriterion("truncated not in", values, "truncated");
            return (Criteria) this;
        }

        public Criteria andTruncatedBetween(Boolean value1, Boolean value2) {
            addCriterion("truncated between", value1, value2, "truncated");
            return (Criteria) this;
        }

        public Criteria andTruncatedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("truncated not between", value1, value2, "truncated");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicIsNull() {
            addCriterion("thumbnail_pic is null");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicIsNotNull() {
            addCriterion("thumbnail_pic is not null");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicEqualTo(String value) {
            addCriterion("thumbnail_pic =", value, "thumbnailPic");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicNotEqualTo(String value) {
            addCriterion("thumbnail_pic <>", value, "thumbnailPic");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicGreaterThan(String value) {
            addCriterion("thumbnail_pic >", value, "thumbnailPic");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicGreaterThanOrEqualTo(String value) {
            addCriterion("thumbnail_pic >=", value, "thumbnailPic");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicLessThan(String value) {
            addCriterion("thumbnail_pic <", value, "thumbnailPic");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicLessThanOrEqualTo(String value) {
            addCriterion("thumbnail_pic <=", value, "thumbnailPic");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicLike(String value) {
            addCriterion("thumbnail_pic like", value, "thumbnailPic");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicNotLike(String value) {
            addCriterion("thumbnail_pic not like", value, "thumbnailPic");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicIn(List<String> values) {
            addCriterion("thumbnail_pic in", values, "thumbnailPic");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicNotIn(List<String> values) {
            addCriterion("thumbnail_pic not in", values, "thumbnailPic");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicBetween(String value1, String value2) {
            addCriterion("thumbnail_pic between", value1, value2, "thumbnailPic");
            return (Criteria) this;
        }

        public Criteria andThumbnailPicNotBetween(String value1, String value2) {
            addCriterion("thumbnail_pic not between", value1, value2, "thumbnailPic");
            return (Criteria) this;
        }

        public Criteria andBmiddlePicIsNull() {
            addCriterion("bmiddle_pic is null");
            return (Criteria) this;
        }

        public Criteria andBmiddlePicIsNotNull() {
            addCriterion("bmiddle_pic is not null");
            return (Criteria) this;
        }

        public Criteria andBmiddlePicEqualTo(String value) {
            addCriterion("bmiddle_pic =", value, "bmiddlePic");
            return (Criteria) this;
        }

        public Criteria andBmiddlePicNotEqualTo(String value) {
            addCriterion("bmiddle_pic <>", value, "bmiddlePic");
            return (Criteria) this;
        }

        public Criteria andBmiddlePicGreaterThan(String value) {
            addCriterion("bmiddle_pic >", value, "bmiddlePic");
            return (Criteria) this;
        }

        public Criteria andBmiddlePicGreaterThanOrEqualTo(String value) {
            addCriterion("bmiddle_pic >=", value, "bmiddlePic");
            return (Criteria) this;
        }

        public Criteria andBmiddlePicLessThan(String value) {
            addCriterion("bmiddle_pic <", value, "bmiddlePic");
            return (Criteria) this;
        }

        public Criteria andBmiddlePicLessThanOrEqualTo(String value) {
            addCriterion("bmiddle_pic <=", value, "bmiddlePic");
            return (Criteria) this;
        }

        public Criteria andBmiddlePicLike(String value) {
            addCriterion("bmiddle_pic like", value, "bmiddlePic");
            return (Criteria) this;
        }

        public Criteria andBmiddlePicNotLike(String value) {
            addCriterion("bmiddle_pic not like", value, "bmiddlePic");
            return (Criteria) this;
        }

        public Criteria andBmiddlePicIn(List<String> values) {
            addCriterion("bmiddle_pic in", values, "bmiddlePic");
            return (Criteria) this;
        }

        public Criteria andBmiddlePicNotIn(List<String> values) {
            addCriterion("bmiddle_pic not in", values, "bmiddlePic");
            return (Criteria) this;
        }

        public Criteria andBmiddlePicBetween(String value1, String value2) {
            addCriterion("bmiddle_pic between", value1, value2, "bmiddlePic");
            return (Criteria) this;
        }

        public Criteria andBmiddlePicNotBetween(String value1, String value2) {
            addCriterion("bmiddle_pic not between", value1, value2, "bmiddlePic");
            return (Criteria) this;
        }

        public Criteria andOriginalPicIsNull() {
            addCriterion("original_pic is null");
            return (Criteria) this;
        }

        public Criteria andOriginalPicIsNotNull() {
            addCriterion("original_pic is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalPicEqualTo(String value) {
            addCriterion("original_pic =", value, "originalPic");
            return (Criteria) this;
        }

        public Criteria andOriginalPicNotEqualTo(String value) {
            addCriterion("original_pic <>", value, "originalPic");
            return (Criteria) this;
        }

        public Criteria andOriginalPicGreaterThan(String value) {
            addCriterion("original_pic >", value, "originalPic");
            return (Criteria) this;
        }

        public Criteria andOriginalPicGreaterThanOrEqualTo(String value) {
            addCriterion("original_pic >=", value, "originalPic");
            return (Criteria) this;
        }

        public Criteria andOriginalPicLessThan(String value) {
            addCriterion("original_pic <", value, "originalPic");
            return (Criteria) this;
        }

        public Criteria andOriginalPicLessThanOrEqualTo(String value) {
            addCriterion("original_pic <=", value, "originalPic");
            return (Criteria) this;
        }

        public Criteria andOriginalPicLike(String value) {
            addCriterion("original_pic like", value, "originalPic");
            return (Criteria) this;
        }

        public Criteria andOriginalPicNotLike(String value) {
            addCriterion("original_pic not like", value, "originalPic");
            return (Criteria) this;
        }

        public Criteria andOriginalPicIn(List<String> values) {
            addCriterion("original_pic in", values, "originalPic");
            return (Criteria) this;
        }

        public Criteria andOriginalPicNotIn(List<String> values) {
            addCriterion("original_pic not in", values, "originalPic");
            return (Criteria) this;
        }

        public Criteria andOriginalPicBetween(String value1, String value2) {
            addCriterion("original_pic between", value1, value2, "originalPic");
            return (Criteria) this;
        }

        public Criteria andOriginalPicNotBetween(String value1, String value2) {
            addCriterion("original_pic not between", value1, value2, "originalPic");
            return (Criteria) this;
        }

        public Criteria andGeoIsNull() {
            addCriterion("geo is null");
            return (Criteria) this;
        }

        public Criteria andGeoIsNotNull() {
            addCriterion("geo is not null");
            return (Criteria) this;
        }

        public Criteria andGeoEqualTo(String value) {
            addCriterion("geo =", value, "geo");
            return (Criteria) this;
        }

        public Criteria andGeoNotEqualTo(String value) {
            addCriterion("geo <>", value, "geo");
            return (Criteria) this;
        }

        public Criteria andGeoGreaterThan(String value) {
            addCriterion("geo >", value, "geo");
            return (Criteria) this;
        }

        public Criteria andGeoGreaterThanOrEqualTo(String value) {
            addCriterion("geo >=", value, "geo");
            return (Criteria) this;
        }

        public Criteria andGeoLessThan(String value) {
            addCriterion("geo <", value, "geo");
            return (Criteria) this;
        }

        public Criteria andGeoLessThanOrEqualTo(String value) {
            addCriterion("geo <=", value, "geo");
            return (Criteria) this;
        }

        public Criteria andGeoLike(String value) {
            addCriterion("geo like", value, "geo");
            return (Criteria) this;
        }

        public Criteria andGeoNotLike(String value) {
            addCriterion("geo not like", value, "geo");
            return (Criteria) this;
        }

        public Criteria andGeoIn(List<String> values) {
            addCriterion("geo in", values, "geo");
            return (Criteria) this;
        }

        public Criteria andGeoNotIn(List<String> values) {
            addCriterion("geo not in", values, "geo");
            return (Criteria) this;
        }

        public Criteria andGeoBetween(String value1, String value2) {
            addCriterion("geo between", value1, value2, "geo");
            return (Criteria) this;
        }

        public Criteria andGeoNotBetween(String value1, String value2) {
            addCriterion("geo not between", value1, value2, "geo");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andRetweetedIdIsNull() {
            addCriterion("retweeted_id is null");
            return (Criteria) this;
        }

        public Criteria andRetweetedIdIsNotNull() {
            addCriterion("retweeted_id is not null");
            return (Criteria) this;
        }

        public Criteria andRetweetedIdEqualTo(Long value) {
            addCriterion("retweeted_id =", value, "retweetedId");
            return (Criteria) this;
        }

        public Criteria andRetweetedIdNotEqualTo(Long value) {
            addCriterion("retweeted_id <>", value, "retweetedId");
            return (Criteria) this;
        }

        public Criteria andRetweetedIdGreaterThan(Long value) {
            addCriterion("retweeted_id >", value, "retweetedId");
            return (Criteria) this;
        }

        public Criteria andRetweetedIdGreaterThanOrEqualTo(Long value) {
            addCriterion("retweeted_id >=", value, "retweetedId");
            return (Criteria) this;
        }

        public Criteria andRetweetedIdLessThan(Long value) {
            addCriterion("retweeted_id <", value, "retweetedId");
            return (Criteria) this;
        }

        public Criteria andRetweetedIdLessThanOrEqualTo(Long value) {
            addCriterion("retweeted_id <=", value, "retweetedId");
            return (Criteria) this;
        }

        public Criteria andRetweetedIdIn(List<Long> values) {
            addCriterion("retweeted_id in", values, "retweetedId");
            return (Criteria) this;
        }

        public Criteria andRetweetedIdNotIn(List<Long> values) {
            addCriterion("retweeted_id not in", values, "retweetedId");
            return (Criteria) this;
        }

        public Criteria andRetweetedIdBetween(Long value1, Long value2) {
            addCriterion("retweeted_id between", value1, value2, "retweetedId");
            return (Criteria) this;
        }

        public Criteria andRetweetedIdNotBetween(Long value1, Long value2) {
            addCriterion("retweeted_id not between", value1, value2, "retweetedId");
            return (Criteria) this;
        }

        public Criteria andRepostsCountIsNull() {
            addCriterion("reposts_count is null");
            return (Criteria) this;
        }

        public Criteria andRepostsCountIsNotNull() {
            addCriterion("reposts_count is not null");
            return (Criteria) this;
        }

        public Criteria andRepostsCountEqualTo(Integer value) {
            addCriterion("reposts_count =", value, "repostsCount");
            return (Criteria) this;
        }

        public Criteria andRepostsCountNotEqualTo(Integer value) {
            addCriterion("reposts_count <>", value, "repostsCount");
            return (Criteria) this;
        }

        public Criteria andRepostsCountGreaterThan(Integer value) {
            addCriterion("reposts_count >", value, "repostsCount");
            return (Criteria) this;
        }

        public Criteria andRepostsCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("reposts_count >=", value, "repostsCount");
            return (Criteria) this;
        }

        public Criteria andRepostsCountLessThan(Integer value) {
            addCriterion("reposts_count <", value, "repostsCount");
            return (Criteria) this;
        }

        public Criteria andRepostsCountLessThanOrEqualTo(Integer value) {
            addCriterion("reposts_count <=", value, "repostsCount");
            return (Criteria) this;
        }

        public Criteria andRepostsCountIn(List<Integer> values) {
            addCriterion("reposts_count in", values, "repostsCount");
            return (Criteria) this;
        }

        public Criteria andRepostsCountNotIn(List<Integer> values) {
            addCriterion("reposts_count not in", values, "repostsCount");
            return (Criteria) this;
        }

        public Criteria andRepostsCountBetween(Integer value1, Integer value2) {
            addCriterion("reposts_count between", value1, value2, "repostsCount");
            return (Criteria) this;
        }

        public Criteria andRepostsCountNotBetween(Integer value1, Integer value2) {
            addCriterion("reposts_count not between", value1, value2, "repostsCount");
            return (Criteria) this;
        }

        public Criteria andCommentsCountIsNull() {
            addCriterion("comments_count is null");
            return (Criteria) this;
        }

        public Criteria andCommentsCountIsNotNull() {
            addCriterion("comments_count is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsCountEqualTo(Integer value) {
            addCriterion("comments_count =", value, "commentsCount");
            return (Criteria) this;
        }

        public Criteria andCommentsCountNotEqualTo(Integer value) {
            addCriterion("comments_count <>", value, "commentsCount");
            return (Criteria) this;
        }

        public Criteria andCommentsCountGreaterThan(Integer value) {
            addCriterion("comments_count >", value, "commentsCount");
            return (Criteria) this;
        }

        public Criteria andCommentsCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("comments_count >=", value, "commentsCount");
            return (Criteria) this;
        }

        public Criteria andCommentsCountLessThan(Integer value) {
            addCriterion("comments_count <", value, "commentsCount");
            return (Criteria) this;
        }

        public Criteria andCommentsCountLessThanOrEqualTo(Integer value) {
            addCriterion("comments_count <=", value, "commentsCount");
            return (Criteria) this;
        }

        public Criteria andCommentsCountIn(List<Integer> values) {
            addCriterion("comments_count in", values, "commentsCount");
            return (Criteria) this;
        }

        public Criteria andCommentsCountNotIn(List<Integer> values) {
            addCriterion("comments_count not in", values, "commentsCount");
            return (Criteria) this;
        }

        public Criteria andCommentsCountBetween(Integer value1, Integer value2) {
            addCriterion("comments_count between", value1, value2, "commentsCount");
            return (Criteria) this;
        }

        public Criteria andCommentsCountNotBetween(Integer value1, Integer value2) {
            addCriterion("comments_count not between", value1, value2, "commentsCount");
            return (Criteria) this;
        }

        public Criteria andAttitudesCountIsNull() {
            addCriterion("attitudes_count is null");
            return (Criteria) this;
        }

        public Criteria andAttitudesCountIsNotNull() {
            addCriterion("attitudes_count is not null");
            return (Criteria) this;
        }

        public Criteria andAttitudesCountEqualTo(Integer value) {
            addCriterion("attitudes_count =", value, "attitudesCount");
            return (Criteria) this;
        }

        public Criteria andAttitudesCountNotEqualTo(Integer value) {
            addCriterion("attitudes_count <>", value, "attitudesCount");
            return (Criteria) this;
        }

        public Criteria andAttitudesCountGreaterThan(Integer value) {
            addCriterion("attitudes_count >", value, "attitudesCount");
            return (Criteria) this;
        }

        public Criteria andAttitudesCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("attitudes_count >=", value, "attitudesCount");
            return (Criteria) this;
        }

        public Criteria andAttitudesCountLessThan(Integer value) {
            addCriterion("attitudes_count <", value, "attitudesCount");
            return (Criteria) this;
        }

        public Criteria andAttitudesCountLessThanOrEqualTo(Integer value) {
            addCriterion("attitudes_count <=", value, "attitudesCount");
            return (Criteria) this;
        }

        public Criteria andAttitudesCountIn(List<Integer> values) {
            addCriterion("attitudes_count in", values, "attitudesCount");
            return (Criteria) this;
        }

        public Criteria andAttitudesCountNotIn(List<Integer> values) {
            addCriterion("attitudes_count not in", values, "attitudesCount");
            return (Criteria) this;
        }

        public Criteria andAttitudesCountBetween(Integer value1, Integer value2) {
            addCriterion("attitudes_count between", value1, value2, "attitudesCount");
            return (Criteria) this;
        }

        public Criteria andAttitudesCountNotBetween(Integer value1, Integer value2) {
            addCriterion("attitudes_count not between", value1, value2, "attitudesCount");
            return (Criteria) this;
        }

        public Criteria andVisibleIsNull() {
            addCriterion("visible is null");
            return (Criteria) this;
        }

        public Criteria andVisibleIsNotNull() {
            addCriterion("visible is not null");
            return (Criteria) this;
        }

        public Criteria andVisibleEqualTo(String value) {
            addCriterion("visible =", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotEqualTo(String value) {
            addCriterion("visible <>", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleGreaterThan(String value) {
            addCriterion("visible >", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleGreaterThanOrEqualTo(String value) {
            addCriterion("visible >=", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleLessThan(String value) {
            addCriterion("visible <", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleLessThanOrEqualTo(String value) {
            addCriterion("visible <=", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleLike(String value) {
            addCriterion("visible like", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotLike(String value) {
            addCriterion("visible not like", value, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleIn(List<String> values) {
            addCriterion("visible in", values, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotIn(List<String> values) {
            addCriterion("visible not in", values, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleBetween(String value1, String value2) {
            addCriterion("visible between", value1, value2, "visible");
            return (Criteria) this;
        }

        public Criteria andVisibleNotBetween(String value1, String value2) {
            addCriterion("visible not between", value1, value2, "visible");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNull() {
            addCriterion("update_by is null");
            return (Criteria) this;
        }

        public Criteria andUpdateByIsNotNull() {
            addCriterion("update_by is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateByEqualTo(String value) {
            addCriterion("update_by =", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotEqualTo(String value) {
            addCriterion("update_by <>", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThan(String value) {
            addCriterion("update_by >", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByGreaterThanOrEqualTo(String value) {
            addCriterion("update_by >=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThan(String value) {
            addCriterion("update_by <", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLessThanOrEqualTo(String value) {
            addCriterion("update_by <=", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByLike(String value) {
            addCriterion("update_by like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotLike(String value) {
            addCriterion("update_by not like", value, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByIn(List<String> values) {
            addCriterion("update_by in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotIn(List<String> values) {
            addCriterion("update_by not in", values, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByBetween(String value1, String value2) {
            addCriterion("update_by between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateByNotBetween(String value1, String value2) {
            addCriterion("update_by not between", value1, value2, "updateBy");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}