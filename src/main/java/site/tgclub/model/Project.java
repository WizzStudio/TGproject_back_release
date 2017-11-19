package site.tgclub.model;


import java.sql.Date;

import java.util.Set;

/**
 * 项目信息表
 * @author 7lenovo
 *
 */
public class Project {

        private Integer id;
        private String projectName;	//项目名称
        private Integer leaderId;	//项目负责人id
        private Date startDate;	//起始时间
        private Date finishedDate;	//结束时间
        private	Set<Member> members;	//参与人员
        private	String sourceUrl;	//源码

        private double  UIProgress;	//UI前端进度
        private double frontProgress;	//前端进度
        private double backProgress;	//后端进度
        private double totalProgress;

        private String introduction;
        private String picUrl;

        private Set<Category> categories;//标签

            public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getProjectName() {
            return projectName;
        }

        public void setProjectName(String projectName) {
            this.projectName = projectName;
        }

        public Integer getLeaderId() {
            return leaderId;
        }

        public void setLeaderId(Integer leaderId) {
            this.leaderId = leaderId;
        }

        public Date getStartDate() {
            return startDate;
        }

        public void setStartDate(Date startDate) {
            this.startDate = startDate;
        }

        public Date getFinishedDate() {
            return finishedDate;
        }

        public void setFinishedDate(Date finishedDate) {
            this.finishedDate = finishedDate;
        }

        public Set<Member> getMembers() {
            return members;
        }

        public void setMembers(Set<Member> members) {
            this.members = members;
        }

        public String getSourceUrl() {
            return sourceUrl;
        }

        public void setSourceUrl(String sourceUrl) {
            this.sourceUrl = sourceUrl;
        }

        public double getUIProgress() {
            return UIProgress;
        }

        public void setUIProgress(double UIProgress) {
            this.UIProgress = UIProgress;
        }

        public double getFrontProgress() {
            return frontProgress;
        }

        public void setFrontProgress(double frontProgress) {
            this.frontProgress = frontProgress;
        }

        public double getBackProgress() {
            return backProgress;
        }

        public void setBackProgress(double backProgress) {
            this.backProgress = backProgress;
        }

        public double getTotalProgress() {
            return totalProgress;
        }

        public void setTotalProgress(double totalProgress) {
            this.totalProgress = totalProgress;
        }

        public String getIntroduction() {
            return introduction;
        }

        public void setIntroduction(String introduction) {
            this.introduction = introduction;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public Set<Category> getCategories() {
            return categories;
        }

        public void setCategories(Set<Category> categories) {
            this.categories = categories;
        }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"id\":")
                .append(id);
        sb.append(",\"projectName\":\"")
                .append(projectName).append('\"');
        sb.append(",\"leaderId\":")
                .append(leaderId);
        sb.append(",\"startDate\":\"")
                .append(startDate).append('\"');
        sb.append(",\"finishedDate\":\"")
                .append(finishedDate).append('\"');
        sb.append(",\"members\":")
                .append(members);
        sb.append(",\"sourceUrl\":\"")
                .append(sourceUrl).append('\"');
        sb.append(",\"UIProgress\":")
                .append(UIProgress);
        sb.append(",\"frontProgress\":")
                .append(frontProgress);
        sb.append(",\"backProgress\":")
                .append(backProgress);
        sb.append(",\"totalProgress\":")
                .append(totalProgress);
        sb.append(",\"introduction\":\"")
                .append(introduction).append('\"');
        sb.append(",\"picUrl\":\"")
                .append(picUrl).append('\"');
        sb.append(",\"categories\":")
                .append(categories);
        sb.append('}');
        return sb.toString();
    }
}
