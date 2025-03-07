package model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbAdvertisementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbAdvertisementExample() {
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
            addCriterion("Id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("Id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("Id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("Id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("Id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("Id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("Id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("Id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("Id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("Id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("Id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("Id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameIsNull() {
            addCriterion("advertisement_name is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameIsNotNull() {
            addCriterion("advertisement_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameEqualTo(String value) {
            addCriterion("advertisement_name =", value, "advertisementName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameNotEqualTo(String value) {
            addCriterion("advertisement_name <>", value, "advertisementName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameGreaterThan(String value) {
            addCriterion("advertisement_name >", value, "advertisementName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameGreaterThanOrEqualTo(String value) {
            addCriterion("advertisement_name >=", value, "advertisementName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameLessThan(String value) {
            addCriterion("advertisement_name <", value, "advertisementName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameLessThanOrEqualTo(String value) {
            addCriterion("advertisement_name <=", value, "advertisementName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameLike(String value) {
            addCriterion("advertisement_name like", value, "advertisementName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameNotLike(String value) {
            addCriterion("advertisement_name not like", value, "advertisementName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameIn(List<String> values) {
            addCriterion("advertisement_name in", values, "advertisementName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameNotIn(List<String> values) {
            addCriterion("advertisement_name not in", values, "advertisementName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameBetween(String value1, String value2) {
            addCriterion("advertisement_name between", value1, value2, "advertisementName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementNameNotBetween(String value1, String value2) {
            addCriterion("advertisement_name not between", value1, value2, "advertisementName");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIconIsNull() {
            addCriterion("advertisement_icon is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIconIsNotNull() {
            addCriterion("advertisement_icon is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIconEqualTo(String value) {
            addCriterion("advertisement_icon =", value, "advertisementIcon");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIconNotEqualTo(String value) {
            addCriterion("advertisement_icon <>", value, "advertisementIcon");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIconGreaterThan(String value) {
            addCriterion("advertisement_icon >", value, "advertisementIcon");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIconGreaterThanOrEqualTo(String value) {
            addCriterion("advertisement_icon >=", value, "advertisementIcon");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIconLessThan(String value) {
            addCriterion("advertisement_icon <", value, "advertisementIcon");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIconLessThanOrEqualTo(String value) {
            addCriterion("advertisement_icon <=", value, "advertisementIcon");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIconLike(String value) {
            addCriterion("advertisement_icon like", value, "advertisementIcon");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIconNotLike(String value) {
            addCriterion("advertisement_icon not like", value, "advertisementIcon");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIconIn(List<String> values) {
            addCriterion("advertisement_icon in", values, "advertisementIcon");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIconNotIn(List<String> values) {
            addCriterion("advertisement_icon not in", values, "advertisementIcon");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIconBetween(String value1, String value2) {
            addCriterion("advertisement_icon between", value1, value2, "advertisementIcon");
            return (Criteria) this;
        }

        public Criteria andAdvertisementIconNotBetween(String value1, String value2) {
            addCriterion("advertisement_icon not between", value1, value2, "advertisementIcon");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPicIsNull() {
            addCriterion("advertisement_pic is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPicIsNotNull() {
            addCriterion("advertisement_pic is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPicEqualTo(String value) {
            addCriterion("advertisement_pic =", value, "advertisementPic");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPicNotEqualTo(String value) {
            addCriterion("advertisement_pic <>", value, "advertisementPic");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPicGreaterThan(String value) {
            addCriterion("advertisement_pic >", value, "advertisementPic");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPicGreaterThanOrEqualTo(String value) {
            addCriterion("advertisement_pic >=", value, "advertisementPic");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPicLessThan(String value) {
            addCriterion("advertisement_pic <", value, "advertisementPic");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPicLessThanOrEqualTo(String value) {
            addCriterion("advertisement_pic <=", value, "advertisementPic");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPicLike(String value) {
            addCriterion("advertisement_pic like", value, "advertisementPic");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPicNotLike(String value) {
            addCriterion("advertisement_pic not like", value, "advertisementPic");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPicIn(List<String> values) {
            addCriterion("advertisement_pic in", values, "advertisementPic");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPicNotIn(List<String> values) {
            addCriterion("advertisement_pic not in", values, "advertisementPic");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPicBetween(String value1, String value2) {
            addCriterion("advertisement_pic between", value1, value2, "advertisementPic");
            return (Criteria) this;
        }

        public Criteria andAdvertisementPicNotBetween(String value1, String value2) {
            addCriterion("advertisement_pic not between", value1, value2, "advertisementPic");
            return (Criteria) this;
        }

        public Criteria andAdvertisementLinkIsNull() {
            addCriterion("advertisement_link is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementLinkIsNotNull() {
            addCriterion("advertisement_link is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementLinkEqualTo(String value) {
            addCriterion("advertisement_link =", value, "advertisementLink");
            return (Criteria) this;
        }

        public Criteria andAdvertisementLinkNotEqualTo(String value) {
            addCriterion("advertisement_link <>", value, "advertisementLink");
            return (Criteria) this;
        }

        public Criteria andAdvertisementLinkGreaterThan(String value) {
            addCriterion("advertisement_link >", value, "advertisementLink");
            return (Criteria) this;
        }

        public Criteria andAdvertisementLinkGreaterThanOrEqualTo(String value) {
            addCriterion("advertisement_link >=", value, "advertisementLink");
            return (Criteria) this;
        }

        public Criteria andAdvertisementLinkLessThan(String value) {
            addCriterion("advertisement_link <", value, "advertisementLink");
            return (Criteria) this;
        }

        public Criteria andAdvertisementLinkLessThanOrEqualTo(String value) {
            addCriterion("advertisement_link <=", value, "advertisementLink");
            return (Criteria) this;
        }

        public Criteria andAdvertisementLinkLike(String value) {
            addCriterion("advertisement_link like", value, "advertisementLink");
            return (Criteria) this;
        }

        public Criteria andAdvertisementLinkNotLike(String value) {
            addCriterion("advertisement_link not like", value, "advertisementLink");
            return (Criteria) this;
        }

        public Criteria andAdvertisementLinkIn(List<String> values) {
            addCriterion("advertisement_link in", values, "advertisementLink");
            return (Criteria) this;
        }

        public Criteria andAdvertisementLinkNotIn(List<String> values) {
            addCriterion("advertisement_link not in", values, "advertisementLink");
            return (Criteria) this;
        }

        public Criteria andAdvertisementLinkBetween(String value1, String value2) {
            addCriterion("advertisement_link between", value1, value2, "advertisementLink");
            return (Criteria) this;
        }

        public Criteria andAdvertisementLinkNotBetween(String value1, String value2) {
            addCriterion("advertisement_link not between", value1, value2, "advertisementLink");
            return (Criteria) this;
        }

        public Criteria andAdvertisementStatusIsNull() {
            addCriterion("advertisement_status is null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementStatusIsNotNull() {
            addCriterion("advertisement_status is not null");
            return (Criteria) this;
        }

        public Criteria andAdvertisementStatusEqualTo(String value) {
            addCriterion("advertisement_status =", value, "advertisementStatus");
            return (Criteria) this;
        }

        public Criteria andAdvertisementStatusNotEqualTo(String value) {
            addCriterion("advertisement_status <>", value, "advertisementStatus");
            return (Criteria) this;
        }

        public Criteria andAdvertisementStatusGreaterThan(String value) {
            addCriterion("advertisement_status >", value, "advertisementStatus");
            return (Criteria) this;
        }

        public Criteria andAdvertisementStatusGreaterThanOrEqualTo(String value) {
            addCriterion("advertisement_status >=", value, "advertisementStatus");
            return (Criteria) this;
        }

        public Criteria andAdvertisementStatusLessThan(String value) {
            addCriterion("advertisement_status <", value, "advertisementStatus");
            return (Criteria) this;
        }

        public Criteria andAdvertisementStatusLessThanOrEqualTo(String value) {
            addCriterion("advertisement_status <=", value, "advertisementStatus");
            return (Criteria) this;
        }

        public Criteria andAdvertisementStatusLike(String value) {
            addCriterion("advertisement_status like", value, "advertisementStatus");
            return (Criteria) this;
        }

        public Criteria andAdvertisementStatusNotLike(String value) {
            addCriterion("advertisement_status not like", value, "advertisementStatus");
            return (Criteria) this;
        }

        public Criteria andAdvertisementStatusIn(List<String> values) {
            addCriterion("advertisement_status in", values, "advertisementStatus");
            return (Criteria) this;
        }

        public Criteria andAdvertisementStatusNotIn(List<String> values) {
            addCriterion("advertisement_status not in", values, "advertisementStatus");
            return (Criteria) this;
        }

        public Criteria andAdvertisementStatusBetween(String value1, String value2) {
            addCriterion("advertisement_status between", value1, value2, "advertisementStatus");
            return (Criteria) this;
        }

        public Criteria andAdvertisementStatusNotBetween(String value1, String value2) {
            addCriterion("advertisement_status not between", value1, value2, "advertisementStatus");
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

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Long value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Long value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Long value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Long value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Long value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Long value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Long> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Long> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Long value1, Long value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Long value1, Long value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
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