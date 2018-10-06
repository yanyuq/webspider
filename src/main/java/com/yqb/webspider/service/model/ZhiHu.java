package com.yqb.webspider.service.model;

import java.io.Serializable;
import java.util.List;

public class ZhiHu implements Serializable {

    private static final long serialVersionUID = -3500701657546939319L;
    private PagingBean paging;
    private SearchActionInfoBean search_action_info;
    private List<DataBean> data;

    public PagingBean getPaging() {
        return paging;
    }

    public void setPaging(PagingBean paging) {
        this.paging = paging;
    }

    public SearchActionInfoBean getSearch_action_info() {
        return search_action_info;
    }

    public void setSearch_action_info(SearchActionInfoBean search_action_info) {
        this.search_action_info = search_action_info;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class PagingBean {
        /**
         * is_end : false
         * next : http://www.zhihu.com/search_v3?content_length=150&vertical_info=0%2C0%2C0%2C0%2C0%2C0%2C0%2C0%2C0%2C0&advert_count=0&correction=1&search_hash_id=5f82b96d1686b7c9cf6377dd28ad35dc&q=%E4%B8%96%E7%95%8C%E6%9D%AF&limit=10&t=general&offset=75&topic_filter=0
         */

        private boolean is_end;
        private String next;

        public boolean isIs_end() {
            return is_end;
        }

        public void setIs_end(boolean is_end) {
            this.is_end = is_end;
        }

        public String getNext() {
            return next;
        }

        public void setNext(String next) {
            this.next = next;
        }
    }

    public static class SearchActionInfoBean {
        /**
         * attached_info_bytes : OjMSIDVmODJiOTZkMTY4NmI3YzljZjYzNzdkZDI4YWQzNWRjSgnkuJbnlYzmna9QAFgBYAE=
         * search_hash_id : 5f82b96d1686b7c9cf6377dd28ad35dc
         */

        private String attached_info_bytes;
        private String search_hash_id;

        public String getAttached_info_bytes() {
            return attached_info_bytes;
        }

        public void setAttached_info_bytes(String attached_info_bytes) {
            this.attached_info_bytes = attached_info_bytes;
        }

        public String getSearch_hash_id() {
            return search_hash_id;
        }

        public void setSearch_hash_id(String search_hash_id) {
            this.search_hash_id = search_hash_id;
        }
    }

    public static class DataBean {

        private HighlightBean highlight;
        private ObjectBean object;
        private String type;
        private int id;

        public HighlightBean getHighlight() {
            return highlight;
        }

        public void setHighlight(HighlightBean highlight) {
            this.highlight = highlight;
        }

        public ObjectBean getObject() {
            return object;
        }

        public void setObject(ObjectBean object) {
            this.object = object;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public static class HighlightBean {
            /**
             * description : 借此机会，回忆一下自己2002年看<em>世界杯</em>时候的经历吧。 2002年正值大学期间，完整的看了中国队的<em>世界杯</em>三场比赛。 第一场比赛记得是下午。那一天学校为了照顾大家
             * title : 看中国队踢<em>世界杯</em>是一种怎样的体验？
             */

            private String description;
            private String title;

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }
        }

        public static class ObjectBean {

            private ThumbnailInfoBean thumbnail_info;
            private RelationshipBean relationship;
            private String excerpt;
            private int created_time;
            private String id;
            private int voteup_count;
            private String attached_info_bytes;
            private AuthorBean author;
            private String url;
            private QuestionBean question;
            private int updated_time;
            private String content;
            private int comment_count;
            private String type;

            public ThumbnailInfoBean getThumbnail_info() {
                return thumbnail_info;
            }

            public void setThumbnail_info(ThumbnailInfoBean thumbnail_info) {
                this.thumbnail_info = thumbnail_info;
            }

            public RelationshipBean getRelationship() {
                return relationship;
            }

            public void setRelationship(RelationshipBean relationship) {
                this.relationship = relationship;
            }

            public String getExcerpt() {
                return excerpt;
            }

            public void setExcerpt(String excerpt) {
                this.excerpt = excerpt;
            }

            public int getCreated_time() {
                return created_time;
            }

            public void setCreated_time(int created_time) {
                this.created_time = created_time;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public int getVoteup_count() {
                return voteup_count;
            }

            public void setVoteup_count(int voteup_count) {
                this.voteup_count = voteup_count;
            }

            public String getAttached_info_bytes() {
                return attached_info_bytes;
            }

            public void setAttached_info_bytes(String attached_info_bytes) {
                this.attached_info_bytes = attached_info_bytes;
            }

            public AuthorBean getAuthor() {
                return author;
            }

            public void setAuthor(AuthorBean author) {
                this.author = author;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public QuestionBean getQuestion() {
                return question;
            }

            public void setQuestion(QuestionBean question) {
                this.question = question;
            }

            public int getUpdated_time() {
                return updated_time;
            }

            public void setUpdated_time(int updated_time) {
                this.updated_time = updated_time;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public int getComment_count() {
                return comment_count;
            }

            public void setComment_count(int comment_count) {
                this.comment_count = comment_count;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public static class ThumbnailInfoBean {
                /**
                 * count : 0
                 * type : thumbnail_info
                 * thumbnails : []
                 */

                private int count;
                private String type;
                private List<?> thumbnails;

                public int getCount() {
                    return count;
                }

                public void setCount(int count) {
                    this.count = count;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public List<?> getThumbnails() {
                    return thumbnails;
                }

                public void setThumbnails(List<?> thumbnails) {
                    this.thumbnails = thumbnails;
                }
            }

            public static class RelationshipBean {
                /**
                 * is_author : false
                 * voting : 0
                 * is_thanked : false
                 * is_nothelp : false
                 */

                private boolean is_author;
                private int voting;
                private boolean is_thanked;
                private boolean is_nothelp;

                public boolean isIs_author() {
                    return is_author;
                }

                public void setIs_author(boolean is_author) {
                    this.is_author = is_author;
                }

                public int getVoting() {
                    return voting;
                }

                public void setVoting(int voting) {
                    this.voting = voting;
                }

                public boolean isIs_thanked() {
                    return is_thanked;
                }

                public void setIs_thanked(boolean is_thanked) {
                    this.is_thanked = is_thanked;
                }

                public boolean isIs_nothelp() {
                    return is_nothelp;
                }

                public void setIs_nothelp(boolean is_nothelp) {
                    this.is_nothelp = is_nothelp;
                }
            }

            public static class AuthorBean {
                /**
                 * url : https://api.zhihu.com/people/0c5c7afd25f575d091f6162c7b68d42b
                 * badge : []
                 * avatar_url : https://pic3.zhimg.com/50/6924f2a18_s.jpg
                 * name : 赵乾
                 * headline : 德国队政委
                 * url_token : zhao-gan-90
                 * type : people
                 * id : 0c5c7afd25f575d091f6162c7b68d42b
                 */

                private String url;
                private String avatar_url;
                private String name;
                private String headline;
                private String url_token;
                private String type;
                private String id;
                private List<?> badge;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getAvatar_url() {
                    return avatar_url;
                }

                public void setAvatar_url(String avatar_url) {
                    this.avatar_url = avatar_url;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public String getHeadline() {
                    return headline;
                }

                public void setHeadline(String headline) {
                    this.headline = headline;
                }

                public String getUrl_token() {
                    return url_token;
                }

                public void setUrl_token(String url_token) {
                    this.url_token = url_token;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public List<?> getBadge() {
                    return badge;
                }

                public void setBadge(List<?> badge) {
                    this.badge = badge;
                }
            }

            public static class QuestionBean {
                /**
                 * url : https://api.zhihu.com/questions/37613354
                 * type : question
                 * id : 37613354
                 * name : 看中国队踢<em>世界杯</em>是一种怎样的体验？
                 */

                private String url;
                private String type;
                private String id;
                private String name;

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }
        }
    }
}
