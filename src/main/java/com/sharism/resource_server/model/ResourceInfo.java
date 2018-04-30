package com.sharism.resource_server.model;

public class ResourceInfo {
    private String id;

    private String userId;

    private String parentId;

    private Integer folder;

    private String fileSort;

    private String fileName;

    private String fileDes;

    private Double fileSize;

    private String fileMd5;

    private String filePath;

    private String storagePath;

    private String createDate;

    private String updateTime;

    private Integer privacySet;

    private Integer del;

    private Integer weight;

    private Integer needPassword;

    private String filePassword;

    private Integer free;

    private Integer payWay;

    private String payLink;

    private Double needScore;

    private Double needMoney;

    private Integer downloadAmount;

    private Double getScore;

    private Double getMoney;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public Integer getFolder() {
        return folder;
    }

    public void setFolder(Integer folder) {
        this.folder = folder;
    }

    public String getFileSort() {
        return fileSort;
    }

    public void setFileSort(String fileSort) {
        this.fileSort = fileSort == null ? null : fileSort.trim();
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName == null ? null : fileName.trim();
    }

    public String getFileDes() {
        return fileDes;
    }

    public void setFileDes(String fileDes) {
        this.fileDes = fileDes == null ? null : fileDes.trim();
    }

    public Double getFileSize() {
        return fileSize;
    }

    public void setFileSize(Double fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileMd5() {
        return fileMd5;
    }

    public void setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5 == null ? null : fileMd5.trim();
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public String getStoragePath() {
        return storagePath;
    }

    public void setStoragePath(String storagePath) {
        this.storagePath = storagePath == null ? null : storagePath.trim();
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate == null ? null : createDate.trim();
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime == null ? null : updateTime.trim();
    }

    public Integer getPrivacySet() {
        return privacySet;
    }

    public void setPrivacySet(Integer privacySet) {
        this.privacySet = privacySet;
    }

    public Integer getDel() {
        return del;
    }

    public void setDel(Integer del) {
        this.del = del;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getNeedPassword() {
        return needPassword;
    }

    public void setNeedPassword(Integer needPassword) {
        this.needPassword = needPassword;
    }

    public String getFilePassword() {
        return filePassword;
    }

    public void setFilePassword(String filePassword) {
        this.filePassword = filePassword == null ? null : filePassword.trim();
    }

    public Integer getFree() {
        return free;
    }

    public void setFree(Integer free) {
        this.free = free;
    }

    public Integer getPayWay() {
        return payWay;
    }

    public void setPayWay(Integer payWay) {
        this.payWay = payWay;
    }

    public String getPayLink() {
        return payLink;
    }

    public void setPayLink(String payLink) {
        this.payLink = payLink == null ? null : payLink.trim();
    }

    public Double getNeedScore() {
        return needScore;
    }

    public void setNeedScore(Double needScore) {
        this.needScore = needScore;
    }

    public Double getNeedMoney() {
        return needMoney;
    }

    public void setNeedMoney(Double needMoney) {
        this.needMoney = needMoney;
    }

    public Integer getDownloadAmount() {
        return downloadAmount;
    }

    public void setDownloadAmount(Integer downloadAmount) {
        this.downloadAmount = downloadAmount;
    }

    public Double getGetScore() {
        return getScore;
    }

    public void setGetScore(Double getScore) {
        this.getScore = getScore;
    }

    public Double getGetMoney() {
        return getMoney;
    }

    public void setGetMoney(Double getMoney) {
        this.getMoney = getMoney;
    }
}