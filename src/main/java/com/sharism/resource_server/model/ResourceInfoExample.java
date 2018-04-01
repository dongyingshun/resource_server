package com.sharism.resource_server.model;

import java.util.ArrayList;
import java.util.List;

public class ResourceInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ResourceInfoExample() {
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
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFileSortIsNull() {
            addCriterion("file_sort is null");
            return (Criteria) this;
        }

        public Criteria andFileSortIsNotNull() {
            addCriterion("file_sort is not null");
            return (Criteria) this;
        }

        public Criteria andFileSortEqualTo(String value) {
            addCriterion("file_sort =", value, "fileSort");
            return (Criteria) this;
        }

        public Criteria andFileSortNotEqualTo(String value) {
            addCriterion("file_sort <>", value, "fileSort");
            return (Criteria) this;
        }

        public Criteria andFileSortGreaterThan(String value) {
            addCriterion("file_sort >", value, "fileSort");
            return (Criteria) this;
        }

        public Criteria andFileSortGreaterThanOrEqualTo(String value) {
            addCriterion("file_sort >=", value, "fileSort");
            return (Criteria) this;
        }

        public Criteria andFileSortLessThan(String value) {
            addCriterion("file_sort <", value, "fileSort");
            return (Criteria) this;
        }

        public Criteria andFileSortLessThanOrEqualTo(String value) {
            addCriterion("file_sort <=", value, "fileSort");
            return (Criteria) this;
        }

        public Criteria andFileSortLike(String value) {
            addCriterion("file_sort like", value, "fileSort");
            return (Criteria) this;
        }

        public Criteria andFileSortNotLike(String value) {
            addCriterion("file_sort not like", value, "fileSort");
            return (Criteria) this;
        }

        public Criteria andFileSortIn(List<String> values) {
            addCriterion("file_sort in", values, "fileSort");
            return (Criteria) this;
        }

        public Criteria andFileSortNotIn(List<String> values) {
            addCriterion("file_sort not in", values, "fileSort");
            return (Criteria) this;
        }

        public Criteria andFileSortBetween(String value1, String value2) {
            addCriterion("file_sort between", value1, value2, "fileSort");
            return (Criteria) this;
        }

        public Criteria andFileSortNotBetween(String value1, String value2) {
            addCriterion("file_sort not between", value1, value2, "fileSort");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNull() {
            addCriterion("file_name is null");
            return (Criteria) this;
        }

        public Criteria andFileNameIsNotNull() {
            addCriterion("file_name is not null");
            return (Criteria) this;
        }

        public Criteria andFileNameEqualTo(String value) {
            addCriterion("file_name =", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotEqualTo(String value) {
            addCriterion("file_name <>", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThan(String value) {
            addCriterion("file_name >", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameGreaterThanOrEqualTo(String value) {
            addCriterion("file_name >=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThan(String value) {
            addCriterion("file_name <", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLessThanOrEqualTo(String value) {
            addCriterion("file_name <=", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameLike(String value) {
            addCriterion("file_name like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotLike(String value) {
            addCriterion("file_name not like", value, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameIn(List<String> values) {
            addCriterion("file_name in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotIn(List<String> values) {
            addCriterion("file_name not in", values, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameBetween(String value1, String value2) {
            addCriterion("file_name between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileNameNotBetween(String value1, String value2) {
            addCriterion("file_name not between", value1, value2, "fileName");
            return (Criteria) this;
        }

        public Criteria andFileDesIsNull() {
            addCriterion("file_des is null");
            return (Criteria) this;
        }

        public Criteria andFileDesIsNotNull() {
            addCriterion("file_des is not null");
            return (Criteria) this;
        }

        public Criteria andFileDesEqualTo(String value) {
            addCriterion("file_des =", value, "fileDes");
            return (Criteria) this;
        }

        public Criteria andFileDesNotEqualTo(String value) {
            addCriterion("file_des <>", value, "fileDes");
            return (Criteria) this;
        }

        public Criteria andFileDesGreaterThan(String value) {
            addCriterion("file_des >", value, "fileDes");
            return (Criteria) this;
        }

        public Criteria andFileDesGreaterThanOrEqualTo(String value) {
            addCriterion("file_des >=", value, "fileDes");
            return (Criteria) this;
        }

        public Criteria andFileDesLessThan(String value) {
            addCriterion("file_des <", value, "fileDes");
            return (Criteria) this;
        }

        public Criteria andFileDesLessThanOrEqualTo(String value) {
            addCriterion("file_des <=", value, "fileDes");
            return (Criteria) this;
        }

        public Criteria andFileDesLike(String value) {
            addCriterion("file_des like", value, "fileDes");
            return (Criteria) this;
        }

        public Criteria andFileDesNotLike(String value) {
            addCriterion("file_des not like", value, "fileDes");
            return (Criteria) this;
        }

        public Criteria andFileDesIn(List<String> values) {
            addCriterion("file_des in", values, "fileDes");
            return (Criteria) this;
        }

        public Criteria andFileDesNotIn(List<String> values) {
            addCriterion("file_des not in", values, "fileDes");
            return (Criteria) this;
        }

        public Criteria andFileDesBetween(String value1, String value2) {
            addCriterion("file_des between", value1, value2, "fileDes");
            return (Criteria) this;
        }

        public Criteria andFileDesNotBetween(String value1, String value2) {
            addCriterion("file_des not between", value1, value2, "fileDes");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNull() {
            addCriterion("file_size is null");
            return (Criteria) this;
        }

        public Criteria andFileSizeIsNotNull() {
            addCriterion("file_size is not null");
            return (Criteria) this;
        }

        public Criteria andFileSizeEqualTo(Double value) {
            addCriterion("file_size =", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotEqualTo(Double value) {
            addCriterion("file_size <>", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThan(Double value) {
            addCriterion("file_size >", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeGreaterThanOrEqualTo(Double value) {
            addCriterion("file_size >=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThan(Double value) {
            addCriterion("file_size <", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeLessThanOrEqualTo(Double value) {
            addCriterion("file_size <=", value, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeIn(List<Double> values) {
            addCriterion("file_size in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotIn(List<Double> values) {
            addCriterion("file_size not in", values, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeBetween(Double value1, Double value2) {
            addCriterion("file_size between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFileSizeNotBetween(Double value1, Double value2) {
            addCriterion("file_size not between", value1, value2, "fileSize");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNull() {
            addCriterion("file_path is null");
            return (Criteria) this;
        }

        public Criteria andFilePathIsNotNull() {
            addCriterion("file_path is not null");
            return (Criteria) this;
        }

        public Criteria andFilePathEqualTo(String value) {
            addCriterion("file_path =", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotEqualTo(String value) {
            addCriterion("file_path <>", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThan(String value) {
            addCriterion("file_path >", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathGreaterThanOrEqualTo(String value) {
            addCriterion("file_path >=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThan(String value) {
            addCriterion("file_path <", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLessThanOrEqualTo(String value) {
            addCriterion("file_path <=", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathLike(String value) {
            addCriterion("file_path like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotLike(String value) {
            addCriterion("file_path not like", value, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathIn(List<String> values) {
            addCriterion("file_path in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotIn(List<String> values) {
            addCriterion("file_path not in", values, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathBetween(String value1, String value2) {
            addCriterion("file_path between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andFilePathNotBetween(String value1, String value2) {
            addCriterion("file_path not between", value1, value2, "filePath");
            return (Criteria) this;
        }

        public Criteria andStoragePathIsNull() {
            addCriterion("storage_path is null");
            return (Criteria) this;
        }

        public Criteria andStoragePathIsNotNull() {
            addCriterion("storage_path is not null");
            return (Criteria) this;
        }

        public Criteria andStoragePathEqualTo(String value) {
            addCriterion("storage_path =", value, "storagePath");
            return (Criteria) this;
        }

        public Criteria andStoragePathNotEqualTo(String value) {
            addCriterion("storage_path <>", value, "storagePath");
            return (Criteria) this;
        }

        public Criteria andStoragePathGreaterThan(String value) {
            addCriterion("storage_path >", value, "storagePath");
            return (Criteria) this;
        }

        public Criteria andStoragePathGreaterThanOrEqualTo(String value) {
            addCriterion("storage_path >=", value, "storagePath");
            return (Criteria) this;
        }

        public Criteria andStoragePathLessThan(String value) {
            addCriterion("storage_path <", value, "storagePath");
            return (Criteria) this;
        }

        public Criteria andStoragePathLessThanOrEqualTo(String value) {
            addCriterion("storage_path <=", value, "storagePath");
            return (Criteria) this;
        }

        public Criteria andStoragePathLike(String value) {
            addCriterion("storage_path like", value, "storagePath");
            return (Criteria) this;
        }

        public Criteria andStoragePathNotLike(String value) {
            addCriterion("storage_path not like", value, "storagePath");
            return (Criteria) this;
        }

        public Criteria andStoragePathIn(List<String> values) {
            addCriterion("storage_path in", values, "storagePath");
            return (Criteria) this;
        }

        public Criteria andStoragePathNotIn(List<String> values) {
            addCriterion("storage_path not in", values, "storagePath");
            return (Criteria) this;
        }

        public Criteria andStoragePathBetween(String value1, String value2) {
            addCriterion("storage_path between", value1, value2, "storagePath");
            return (Criteria) this;
        }

        public Criteria andStoragePathNotBetween(String value1, String value2) {
            addCriterion("storage_path not between", value1, value2, "storagePath");
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

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(String value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(String value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(String value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(String value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(String value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(String value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLike(String value) {
            addCriterion("create_date like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotLike(String value) {
            addCriterion("create_date not like", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<String> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<String> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(String value1, String value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(String value1, String value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andPrivacySetIsNull() {
            addCriterion("privacy_set is null");
            return (Criteria) this;
        }

        public Criteria andPrivacySetIsNotNull() {
            addCriterion("privacy_set is not null");
            return (Criteria) this;
        }

        public Criteria andPrivacySetEqualTo(Integer value) {
            addCriterion("privacy_set =", value, "privacySet");
            return (Criteria) this;
        }

        public Criteria andPrivacySetNotEqualTo(Integer value) {
            addCriterion("privacy_set <>", value, "privacySet");
            return (Criteria) this;
        }

        public Criteria andPrivacySetGreaterThan(Integer value) {
            addCriterion("privacy_set >", value, "privacySet");
            return (Criteria) this;
        }

        public Criteria andPrivacySetGreaterThanOrEqualTo(Integer value) {
            addCriterion("privacy_set >=", value, "privacySet");
            return (Criteria) this;
        }

        public Criteria andPrivacySetLessThan(Integer value) {
            addCriterion("privacy_set <", value, "privacySet");
            return (Criteria) this;
        }

        public Criteria andPrivacySetLessThanOrEqualTo(Integer value) {
            addCriterion("privacy_set <=", value, "privacySet");
            return (Criteria) this;
        }

        public Criteria andPrivacySetIn(List<Integer> values) {
            addCriterion("privacy_set in", values, "privacySet");
            return (Criteria) this;
        }

        public Criteria andPrivacySetNotIn(List<Integer> values) {
            addCriterion("privacy_set not in", values, "privacySet");
            return (Criteria) this;
        }

        public Criteria andPrivacySetBetween(Integer value1, Integer value2) {
            addCriterion("privacy_set between", value1, value2, "privacySet");
            return (Criteria) this;
        }

        public Criteria andPrivacySetNotBetween(Integer value1, Integer value2) {
            addCriterion("privacy_set not between", value1, value2, "privacySet");
            return (Criteria) this;
        }

        public Criteria andDelIsNull() {
            addCriterion("del is null");
            return (Criteria) this;
        }

        public Criteria andDelIsNotNull() {
            addCriterion("del is not null");
            return (Criteria) this;
        }

        public Criteria andDelEqualTo(Integer value) {
            addCriterion("del =", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotEqualTo(Integer value) {
            addCriterion("del <>", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelGreaterThan(Integer value) {
            addCriterion("del >", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("del >=", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLessThan(Integer value) {
            addCriterion("del <", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelLessThanOrEqualTo(Integer value) {
            addCriterion("del <=", value, "del");
            return (Criteria) this;
        }

        public Criteria andDelIn(List<Integer> values) {
            addCriterion("del in", values, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotIn(List<Integer> values) {
            addCriterion("del not in", values, "del");
            return (Criteria) this;
        }

        public Criteria andDelBetween(Integer value1, Integer value2) {
            addCriterion("del between", value1, value2, "del");
            return (Criteria) this;
        }

        public Criteria andDelNotBetween(Integer value1, Integer value2) {
            addCriterion("del not between", value1, value2, "del");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Integer value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Integer value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Integer value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Integer value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Integer value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Integer> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Integer> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Integer value1, Integer value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Integer value1, Integer value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andNeedPasswordIsNull() {
            addCriterion("need_password is null");
            return (Criteria) this;
        }

        public Criteria andNeedPasswordIsNotNull() {
            addCriterion("need_password is not null");
            return (Criteria) this;
        }

        public Criteria andNeedPasswordEqualTo(Integer value) {
            addCriterion("need_password =", value, "needPassword");
            return (Criteria) this;
        }

        public Criteria andNeedPasswordNotEqualTo(Integer value) {
            addCriterion("need_password <>", value, "needPassword");
            return (Criteria) this;
        }

        public Criteria andNeedPasswordGreaterThan(Integer value) {
            addCriterion("need_password >", value, "needPassword");
            return (Criteria) this;
        }

        public Criteria andNeedPasswordGreaterThanOrEqualTo(Integer value) {
            addCriterion("need_password >=", value, "needPassword");
            return (Criteria) this;
        }

        public Criteria andNeedPasswordLessThan(Integer value) {
            addCriterion("need_password <", value, "needPassword");
            return (Criteria) this;
        }

        public Criteria andNeedPasswordLessThanOrEqualTo(Integer value) {
            addCriterion("need_password <=", value, "needPassword");
            return (Criteria) this;
        }

        public Criteria andNeedPasswordIn(List<Integer> values) {
            addCriterion("need_password in", values, "needPassword");
            return (Criteria) this;
        }

        public Criteria andNeedPasswordNotIn(List<Integer> values) {
            addCriterion("need_password not in", values, "needPassword");
            return (Criteria) this;
        }

        public Criteria andNeedPasswordBetween(Integer value1, Integer value2) {
            addCriterion("need_password between", value1, value2, "needPassword");
            return (Criteria) this;
        }

        public Criteria andNeedPasswordNotBetween(Integer value1, Integer value2) {
            addCriterion("need_password not between", value1, value2, "needPassword");
            return (Criteria) this;
        }

        public Criteria andFilePasswordIsNull() {
            addCriterion("file_password is null");
            return (Criteria) this;
        }

        public Criteria andFilePasswordIsNotNull() {
            addCriterion("file_password is not null");
            return (Criteria) this;
        }

        public Criteria andFilePasswordEqualTo(String value) {
            addCriterion("file_password =", value, "filePassword");
            return (Criteria) this;
        }

        public Criteria andFilePasswordNotEqualTo(String value) {
            addCriterion("file_password <>", value, "filePassword");
            return (Criteria) this;
        }

        public Criteria andFilePasswordGreaterThan(String value) {
            addCriterion("file_password >", value, "filePassword");
            return (Criteria) this;
        }

        public Criteria andFilePasswordGreaterThanOrEqualTo(String value) {
            addCriterion("file_password >=", value, "filePassword");
            return (Criteria) this;
        }

        public Criteria andFilePasswordLessThan(String value) {
            addCriterion("file_password <", value, "filePassword");
            return (Criteria) this;
        }

        public Criteria andFilePasswordLessThanOrEqualTo(String value) {
            addCriterion("file_password <=", value, "filePassword");
            return (Criteria) this;
        }

        public Criteria andFilePasswordLike(String value) {
            addCriterion("file_password like", value, "filePassword");
            return (Criteria) this;
        }

        public Criteria andFilePasswordNotLike(String value) {
            addCriterion("file_password not like", value, "filePassword");
            return (Criteria) this;
        }

        public Criteria andFilePasswordIn(List<String> values) {
            addCriterion("file_password in", values, "filePassword");
            return (Criteria) this;
        }

        public Criteria andFilePasswordNotIn(List<String> values) {
            addCriterion("file_password not in", values, "filePassword");
            return (Criteria) this;
        }

        public Criteria andFilePasswordBetween(String value1, String value2) {
            addCriterion("file_password between", value1, value2, "filePassword");
            return (Criteria) this;
        }

        public Criteria andFilePasswordNotBetween(String value1, String value2) {
            addCriterion("file_password not between", value1, value2, "filePassword");
            return (Criteria) this;
        }

        public Criteria andFreeIsNull() {
            addCriterion("free is null");
            return (Criteria) this;
        }

        public Criteria andFreeIsNotNull() {
            addCriterion("free is not null");
            return (Criteria) this;
        }

        public Criteria andFreeEqualTo(Integer value) {
            addCriterion("free =", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotEqualTo(Integer value) {
            addCriterion("free <>", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeGreaterThan(Integer value) {
            addCriterion("free >", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("free >=", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeLessThan(Integer value) {
            addCriterion("free <", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeLessThanOrEqualTo(Integer value) {
            addCriterion("free <=", value, "free");
            return (Criteria) this;
        }

        public Criteria andFreeIn(List<Integer> values) {
            addCriterion("free in", values, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotIn(List<Integer> values) {
            addCriterion("free not in", values, "free");
            return (Criteria) this;
        }

        public Criteria andFreeBetween(Integer value1, Integer value2) {
            addCriterion("free between", value1, value2, "free");
            return (Criteria) this;
        }

        public Criteria andFreeNotBetween(Integer value1, Integer value2) {
            addCriterion("free not between", value1, value2, "free");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNull() {
            addCriterion("pay_way is null");
            return (Criteria) this;
        }

        public Criteria andPayWayIsNotNull() {
            addCriterion("pay_way is not null");
            return (Criteria) this;
        }

        public Criteria andPayWayEqualTo(Integer value) {
            addCriterion("pay_way =", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotEqualTo(Integer value) {
            addCriterion("pay_way <>", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThan(Integer value) {
            addCriterion("pay_way >", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayGreaterThanOrEqualTo(Integer value) {
            addCriterion("pay_way >=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThan(Integer value) {
            addCriterion("pay_way <", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayLessThanOrEqualTo(Integer value) {
            addCriterion("pay_way <=", value, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayIn(List<Integer> values) {
            addCriterion("pay_way in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotIn(List<Integer> values) {
            addCriterion("pay_way not in", values, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayBetween(Integer value1, Integer value2) {
            addCriterion("pay_way between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayWayNotBetween(Integer value1, Integer value2) {
            addCriterion("pay_way not between", value1, value2, "payWay");
            return (Criteria) this;
        }

        public Criteria andPayLinkIsNull() {
            addCriterion("pay_link is null");
            return (Criteria) this;
        }

        public Criteria andPayLinkIsNotNull() {
            addCriterion("pay_link is not null");
            return (Criteria) this;
        }

        public Criteria andPayLinkEqualTo(String value) {
            addCriterion("pay_link =", value, "payLink");
            return (Criteria) this;
        }

        public Criteria andPayLinkNotEqualTo(String value) {
            addCriterion("pay_link <>", value, "payLink");
            return (Criteria) this;
        }

        public Criteria andPayLinkGreaterThan(String value) {
            addCriterion("pay_link >", value, "payLink");
            return (Criteria) this;
        }

        public Criteria andPayLinkGreaterThanOrEqualTo(String value) {
            addCriterion("pay_link >=", value, "payLink");
            return (Criteria) this;
        }

        public Criteria andPayLinkLessThan(String value) {
            addCriterion("pay_link <", value, "payLink");
            return (Criteria) this;
        }

        public Criteria andPayLinkLessThanOrEqualTo(String value) {
            addCriterion("pay_link <=", value, "payLink");
            return (Criteria) this;
        }

        public Criteria andPayLinkLike(String value) {
            addCriterion("pay_link like", value, "payLink");
            return (Criteria) this;
        }

        public Criteria andPayLinkNotLike(String value) {
            addCriterion("pay_link not like", value, "payLink");
            return (Criteria) this;
        }

        public Criteria andPayLinkIn(List<String> values) {
            addCriterion("pay_link in", values, "payLink");
            return (Criteria) this;
        }

        public Criteria andPayLinkNotIn(List<String> values) {
            addCriterion("pay_link not in", values, "payLink");
            return (Criteria) this;
        }

        public Criteria andPayLinkBetween(String value1, String value2) {
            addCriterion("pay_link between", value1, value2, "payLink");
            return (Criteria) this;
        }

        public Criteria andPayLinkNotBetween(String value1, String value2) {
            addCriterion("pay_link not between", value1, value2, "payLink");
            return (Criteria) this;
        }

        public Criteria andNeedScoreIsNull() {
            addCriterion("need_score is null");
            return (Criteria) this;
        }

        public Criteria andNeedScoreIsNotNull() {
            addCriterion("need_score is not null");
            return (Criteria) this;
        }

        public Criteria andNeedScoreEqualTo(Double value) {
            addCriterion("need_score =", value, "needScore");
            return (Criteria) this;
        }

        public Criteria andNeedScoreNotEqualTo(Double value) {
            addCriterion("need_score <>", value, "needScore");
            return (Criteria) this;
        }

        public Criteria andNeedScoreGreaterThan(Double value) {
            addCriterion("need_score >", value, "needScore");
            return (Criteria) this;
        }

        public Criteria andNeedScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("need_score >=", value, "needScore");
            return (Criteria) this;
        }

        public Criteria andNeedScoreLessThan(Double value) {
            addCriterion("need_score <", value, "needScore");
            return (Criteria) this;
        }

        public Criteria andNeedScoreLessThanOrEqualTo(Double value) {
            addCriterion("need_score <=", value, "needScore");
            return (Criteria) this;
        }

        public Criteria andNeedScoreIn(List<Double> values) {
            addCriterion("need_score in", values, "needScore");
            return (Criteria) this;
        }

        public Criteria andNeedScoreNotIn(List<Double> values) {
            addCriterion("need_score not in", values, "needScore");
            return (Criteria) this;
        }

        public Criteria andNeedScoreBetween(Double value1, Double value2) {
            addCriterion("need_score between", value1, value2, "needScore");
            return (Criteria) this;
        }

        public Criteria andNeedScoreNotBetween(Double value1, Double value2) {
            addCriterion("need_score not between", value1, value2, "needScore");
            return (Criteria) this;
        }

        public Criteria andNeedMoneyIsNull() {
            addCriterion("need_money is null");
            return (Criteria) this;
        }

        public Criteria andNeedMoneyIsNotNull() {
            addCriterion("need_money is not null");
            return (Criteria) this;
        }

        public Criteria andNeedMoneyEqualTo(Double value) {
            addCriterion("need_money =", value, "needMoney");
            return (Criteria) this;
        }

        public Criteria andNeedMoneyNotEqualTo(Double value) {
            addCriterion("need_money <>", value, "needMoney");
            return (Criteria) this;
        }

        public Criteria andNeedMoneyGreaterThan(Double value) {
            addCriterion("need_money >", value, "needMoney");
            return (Criteria) this;
        }

        public Criteria andNeedMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("need_money >=", value, "needMoney");
            return (Criteria) this;
        }

        public Criteria andNeedMoneyLessThan(Double value) {
            addCriterion("need_money <", value, "needMoney");
            return (Criteria) this;
        }

        public Criteria andNeedMoneyLessThanOrEqualTo(Double value) {
            addCriterion("need_money <=", value, "needMoney");
            return (Criteria) this;
        }

        public Criteria andNeedMoneyIn(List<Double> values) {
            addCriterion("need_money in", values, "needMoney");
            return (Criteria) this;
        }

        public Criteria andNeedMoneyNotIn(List<Double> values) {
            addCriterion("need_money not in", values, "needMoney");
            return (Criteria) this;
        }

        public Criteria andNeedMoneyBetween(Double value1, Double value2) {
            addCriterion("need_money between", value1, value2, "needMoney");
            return (Criteria) this;
        }

        public Criteria andNeedMoneyNotBetween(Double value1, Double value2) {
            addCriterion("need_money not between", value1, value2, "needMoney");
            return (Criteria) this;
        }

        public Criteria andDownloadAmountIsNull() {
            addCriterion("download_amount is null");
            return (Criteria) this;
        }

        public Criteria andDownloadAmountIsNotNull() {
            addCriterion("download_amount is not null");
            return (Criteria) this;
        }

        public Criteria andDownloadAmountEqualTo(Integer value) {
            addCriterion("download_amount =", value, "downloadAmount");
            return (Criteria) this;
        }

        public Criteria andDownloadAmountNotEqualTo(Integer value) {
            addCriterion("download_amount <>", value, "downloadAmount");
            return (Criteria) this;
        }

        public Criteria andDownloadAmountGreaterThan(Integer value) {
            addCriterion("download_amount >", value, "downloadAmount");
            return (Criteria) this;
        }

        public Criteria andDownloadAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("download_amount >=", value, "downloadAmount");
            return (Criteria) this;
        }

        public Criteria andDownloadAmountLessThan(Integer value) {
            addCriterion("download_amount <", value, "downloadAmount");
            return (Criteria) this;
        }

        public Criteria andDownloadAmountLessThanOrEqualTo(Integer value) {
            addCriterion("download_amount <=", value, "downloadAmount");
            return (Criteria) this;
        }

        public Criteria andDownloadAmountIn(List<Integer> values) {
            addCriterion("download_amount in", values, "downloadAmount");
            return (Criteria) this;
        }

        public Criteria andDownloadAmountNotIn(List<Integer> values) {
            addCriterion("download_amount not in", values, "downloadAmount");
            return (Criteria) this;
        }

        public Criteria andDownloadAmountBetween(Integer value1, Integer value2) {
            addCriterion("download_amount between", value1, value2, "downloadAmount");
            return (Criteria) this;
        }

        public Criteria andDownloadAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("download_amount not between", value1, value2, "downloadAmount");
            return (Criteria) this;
        }

        public Criteria andGetScoreIsNull() {
            addCriterion("get_score is null");
            return (Criteria) this;
        }

        public Criteria andGetScoreIsNotNull() {
            addCriterion("get_score is not null");
            return (Criteria) this;
        }

        public Criteria andGetScoreEqualTo(Double value) {
            addCriterion("get_score =", value, "getScore");
            return (Criteria) this;
        }

        public Criteria andGetScoreNotEqualTo(Double value) {
            addCriterion("get_score <>", value, "getScore");
            return (Criteria) this;
        }

        public Criteria andGetScoreGreaterThan(Double value) {
            addCriterion("get_score >", value, "getScore");
            return (Criteria) this;
        }

        public Criteria andGetScoreGreaterThanOrEqualTo(Double value) {
            addCriterion("get_score >=", value, "getScore");
            return (Criteria) this;
        }

        public Criteria andGetScoreLessThan(Double value) {
            addCriterion("get_score <", value, "getScore");
            return (Criteria) this;
        }

        public Criteria andGetScoreLessThanOrEqualTo(Double value) {
            addCriterion("get_score <=", value, "getScore");
            return (Criteria) this;
        }

        public Criteria andGetScoreIn(List<Double> values) {
            addCriterion("get_score in", values, "getScore");
            return (Criteria) this;
        }

        public Criteria andGetScoreNotIn(List<Double> values) {
            addCriterion("get_score not in", values, "getScore");
            return (Criteria) this;
        }

        public Criteria andGetScoreBetween(Double value1, Double value2) {
            addCriterion("get_score between", value1, value2, "getScore");
            return (Criteria) this;
        }

        public Criteria andGetScoreNotBetween(Double value1, Double value2) {
            addCriterion("get_score not between", value1, value2, "getScore");
            return (Criteria) this;
        }

        public Criteria andGetMoneyIsNull() {
            addCriterion("get_money is null");
            return (Criteria) this;
        }

        public Criteria andGetMoneyIsNotNull() {
            addCriterion("get_money is not null");
            return (Criteria) this;
        }

        public Criteria andGetMoneyEqualTo(Double value) {
            addCriterion("get_money =", value, "getMoney");
            return (Criteria) this;
        }

        public Criteria andGetMoneyNotEqualTo(Double value) {
            addCriterion("get_money <>", value, "getMoney");
            return (Criteria) this;
        }

        public Criteria andGetMoneyGreaterThan(Double value) {
            addCriterion("get_money >", value, "getMoney");
            return (Criteria) this;
        }

        public Criteria andGetMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("get_money >=", value, "getMoney");
            return (Criteria) this;
        }

        public Criteria andGetMoneyLessThan(Double value) {
            addCriterion("get_money <", value, "getMoney");
            return (Criteria) this;
        }

        public Criteria andGetMoneyLessThanOrEqualTo(Double value) {
            addCriterion("get_money <=", value, "getMoney");
            return (Criteria) this;
        }

        public Criteria andGetMoneyIn(List<Double> values) {
            addCriterion("get_money in", values, "getMoney");
            return (Criteria) this;
        }

        public Criteria andGetMoneyNotIn(List<Double> values) {
            addCriterion("get_money not in", values, "getMoney");
            return (Criteria) this;
        }

        public Criteria andGetMoneyBetween(Double value1, Double value2) {
            addCriterion("get_money between", value1, value2, "getMoney");
            return (Criteria) this;
        }

        public Criteria andGetMoneyNotBetween(Double value1, Double value2) {
            addCriterion("get_money not between", value1, value2, "getMoney");
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