package com.springmvc.pojo;

import java.util.ArrayList;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(Integer value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(Integer value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(Integer value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(Integer value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(Integer value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(Integer value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<Integer> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<Integer> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(Integer value1, Integer value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(Integer value1, Integer value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNull() {
            addCriterion("userpassword is null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIsNotNull() {
            addCriterion("userpassword is not null");
            return (Criteria) this;
        }

        public Criteria andUserpasswordEqualTo(String value) {
            addCriterion("userpassword =", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotEqualTo(String value) {
            addCriterion("userpassword <>", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThan(String value) {
            addCriterion("userpassword >", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("userpassword >=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThan(String value) {
            addCriterion("userpassword <", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLessThanOrEqualTo(String value) {
            addCriterion("userpassword <=", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordLike(String value) {
            addCriterion("userpassword like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotLike(String value) {
            addCriterion("userpassword not like", value, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordIn(List<String> values) {
            addCriterion("userpassword in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotIn(List<String> values) {
            addCriterion("userpassword not in", values, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordBetween(String value1, String value2) {
            addCriterion("userpassword between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserpasswordNotBetween(String value1, String value2) {
            addCriterion("userpassword not between", value1, value2, "userpassword");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNull() {
            addCriterion("userphone is null");
            return (Criteria) this;
        }

        public Criteria andUserphoneIsNotNull() {
            addCriterion("userphone is not null");
            return (Criteria) this;
        }

        public Criteria andUserphoneEqualTo(String value) {
            addCriterion("userphone =", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotEqualTo(String value) {
            addCriterion("userphone <>", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThan(String value) {
            addCriterion("userphone >", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneGreaterThanOrEqualTo(String value) {
            addCriterion("userphone >=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThan(String value) {
            addCriterion("userphone <", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLessThanOrEqualTo(String value) {
            addCriterion("userphone <=", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneLike(String value) {
            addCriterion("userphone like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotLike(String value) {
            addCriterion("userphone not like", value, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneIn(List<String> values) {
            addCriterion("userphone in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotIn(List<String> values) {
            addCriterion("userphone not in", values, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneBetween(String value1, String value2) {
            addCriterion("userphone between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUserphoneNotBetween(String value1, String value2) {
            addCriterion("userphone not between", value1, value2, "userphone");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNull() {
            addCriterion("useremail is null");
            return (Criteria) this;
        }

        public Criteria andUseremailIsNotNull() {
            addCriterion("useremail is not null");
            return (Criteria) this;
        }

        public Criteria andUseremailEqualTo(String value) {
            addCriterion("useremail =", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotEqualTo(String value) {
            addCriterion("useremail <>", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThan(String value) {
            addCriterion("useremail >", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailGreaterThanOrEqualTo(String value) {
            addCriterion("useremail >=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThan(String value) {
            addCriterion("useremail <", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLessThanOrEqualTo(String value) {
            addCriterion("useremail <=", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailLike(String value) {
            addCriterion("useremail like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotLike(String value) {
            addCriterion("useremail not like", value, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailIn(List<String> values) {
            addCriterion("useremail in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotIn(List<String> values) {
            addCriterion("useremail not in", values, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailBetween(String value1, String value2) {
            addCriterion("useremail between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andUseremailNotBetween(String value1, String value2) {
            addCriterion("useremail not between", value1, value2, "useremail");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNull() {
            addCriterion("usersex is null");
            return (Criteria) this;
        }

        public Criteria andUsersexIsNotNull() {
            addCriterion("usersex is not null");
            return (Criteria) this;
        }

        public Criteria andUsersexEqualTo(Integer value) {
            addCriterion("usersex =", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotEqualTo(Integer value) {
            addCriterion("usersex <>", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThan(Integer value) {
            addCriterion("usersex >", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexGreaterThanOrEqualTo(Integer value) {
            addCriterion("usersex >=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThan(Integer value) {
            addCriterion("usersex <", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexLessThanOrEqualTo(Integer value) {
            addCriterion("usersex <=", value, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexIn(List<Integer> values) {
            addCriterion("usersex in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotIn(List<Integer> values) {
            addCriterion("usersex not in", values, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexBetween(Integer value1, Integer value2) {
            addCriterion("usersex between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andUsersexNotBetween(Integer value1, Integer value2) {
            addCriterion("usersex not between", value1, value2, "usersex");
            return (Criteria) this;
        }

        public Criteria andUserfundsIsNull() {
            addCriterion("userfunds is null");
            return (Criteria) this;
        }

        public Criteria andUserfundsIsNotNull() {
            addCriterion("userfunds is not null");
            return (Criteria) this;
        }

        public Criteria andUserfundsEqualTo(Double value) {
            addCriterion("userfunds =", value, "userfunds");
            return (Criteria) this;
        }

        public Criteria andUserfundsNotEqualTo(Double value) {
            addCriterion("userfunds <>", value, "userfunds");
            return (Criteria) this;
        }

        public Criteria andUserfundsGreaterThan(Double value) {
            addCriterion("userfunds >", value, "userfunds");
            return (Criteria) this;
        }

        public Criteria andUserfundsGreaterThanOrEqualTo(Double value) {
            addCriterion("userfunds >=", value, "userfunds");
            return (Criteria) this;
        }

        public Criteria andUserfundsLessThan(Double value) {
            addCriterion("userfunds <", value, "userfunds");
            return (Criteria) this;
        }

        public Criteria andUserfundsLessThanOrEqualTo(Double value) {
            addCriterion("userfunds <=", value, "userfunds");
            return (Criteria) this;
        }

        public Criteria andUserfundsIn(List<Double> values) {
            addCriterion("userfunds in", values, "userfunds");
            return (Criteria) this;
        }

        public Criteria andUserfundsNotIn(List<Double> values) {
            addCriterion("userfunds not in", values, "userfunds");
            return (Criteria) this;
        }

        public Criteria andUserfundsBetween(Double value1, Double value2) {
            addCriterion("userfunds between", value1, value2, "userfunds");
            return (Criteria) this;
        }

        public Criteria andUserfundsNotBetween(Double value1, Double value2) {
            addCriterion("userfunds not between", value1, value2, "userfunds");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeIsNull() {
            addCriterion("usercreatetime is null");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeIsNotNull() {
            addCriterion("usercreatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeEqualTo(String value) {
            addCriterion("usercreatetime =", value, "usercreatetime");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeNotEqualTo(String value) {
            addCriterion("usercreatetime <>", value, "usercreatetime");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeGreaterThan(String value) {
            addCriterion("usercreatetime >", value, "usercreatetime");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("usercreatetime >=", value, "usercreatetime");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeLessThan(String value) {
            addCriterion("usercreatetime <", value, "usercreatetime");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeLessThanOrEqualTo(String value) {
            addCriterion("usercreatetime <=", value, "usercreatetime");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeLike(String value) {
            addCriterion("usercreatetime like", value, "usercreatetime");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeNotLike(String value) {
            addCriterion("usercreatetime not like", value, "usercreatetime");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeIn(List<String> values) {
            addCriterion("usercreatetime in", values, "usercreatetime");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeNotIn(List<String> values) {
            addCriterion("usercreatetime not in", values, "usercreatetime");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeBetween(String value1, String value2) {
            addCriterion("usercreatetime between", value1, value2, "usercreatetime");
            return (Criteria) this;
        }

        public Criteria andUsercreatetimeNotBetween(String value1, String value2) {
            addCriterion("usercreatetime not between", value1, value2, "usercreatetime");
            return (Criteria) this;
        }

        public Criteria andIsmemberIsNull() {
            addCriterion("ismember is null");
            return (Criteria) this;
        }

        public Criteria andIsmemberIsNotNull() {
            addCriterion("ismember is not null");
            return (Criteria) this;
        }

        public Criteria andIsmemberEqualTo(Integer value) {
            addCriterion("ismember =", value, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberNotEqualTo(Integer value) {
            addCriterion("ismember <>", value, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberGreaterThan(Integer value) {
            addCriterion("ismember >", value, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberGreaterThanOrEqualTo(Integer value) {
            addCriterion("ismember >=", value, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberLessThan(Integer value) {
            addCriterion("ismember <", value, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberLessThanOrEqualTo(Integer value) {
            addCriterion("ismember <=", value, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberIn(List<Integer> values) {
            addCriterion("ismember in", values, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberNotIn(List<Integer> values) {
            addCriterion("ismember not in", values, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberBetween(Integer value1, Integer value2) {
            addCriterion("ismember between", value1, value2, "ismember");
            return (Criteria) this;
        }

        public Criteria andIsmemberNotBetween(Integer value1, Integer value2) {
            addCriterion("ismember not between", value1, value2, "ismember");
            return (Criteria) this;
        }

        public Criteria andPicturenameIsNull() {
            addCriterion("picturename is null");
            return (Criteria) this;
        }

        public Criteria andPicturenameIsNotNull() {
            addCriterion("picturename is not null");
            return (Criteria) this;
        }

        public Criteria andPicturenameEqualTo(String value) {
            addCriterion("picturename =", value, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameNotEqualTo(String value) {
            addCriterion("picturename <>", value, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameGreaterThan(String value) {
            addCriterion("picturename >", value, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameGreaterThanOrEqualTo(String value) {
            addCriterion("picturename >=", value, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameLessThan(String value) {
            addCriterion("picturename <", value, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameLessThanOrEqualTo(String value) {
            addCriterion("picturename <=", value, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameLike(String value) {
            addCriterion("picturename like", value, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameNotLike(String value) {
            addCriterion("picturename not like", value, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameIn(List<String> values) {
            addCriterion("picturename in", values, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameNotIn(List<String> values) {
            addCriterion("picturename not in", values, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameBetween(String value1, String value2) {
            addCriterion("picturename between", value1, value2, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturenameNotBetween(String value1, String value2) {
            addCriterion("picturename not between", value1, value2, "picturename");
            return (Criteria) this;
        }

        public Criteria andPicturepathIsNull() {
            addCriterion("picturepath is null");
            return (Criteria) this;
        }

        public Criteria andPicturepathIsNotNull() {
            addCriterion("picturepath is not null");
            return (Criteria) this;
        }

        public Criteria andPicturepathEqualTo(String value) {
            addCriterion("picturepath =", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathNotEqualTo(String value) {
            addCriterion("picturepath <>", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathGreaterThan(String value) {
            addCriterion("picturepath >", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathGreaterThanOrEqualTo(String value) {
            addCriterion("picturepath >=", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathLessThan(String value) {
            addCriterion("picturepath <", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathLessThanOrEqualTo(String value) {
            addCriterion("picturepath <=", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathLike(String value) {
            addCriterion("picturepath like", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathNotLike(String value) {
            addCriterion("picturepath not like", value, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathIn(List<String> values) {
            addCriterion("picturepath in", values, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathNotIn(List<String> values) {
            addCriterion("picturepath not in", values, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathBetween(String value1, String value2) {
            addCriterion("picturepath between", value1, value2, "picturepath");
            return (Criteria) this;
        }

        public Criteria andPicturepathNotBetween(String value1, String value2) {
            addCriterion("picturepath not between", value1, value2, "picturepath");
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