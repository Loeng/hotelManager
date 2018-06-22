package com.whxx.hms.model;

import java.util.Date;

public class CommissionCode {
    /**
    *   
     */
    private String commissionCodeId;

    /**
    *   集团id
     */
    private Integer hotelGroupId;

    /**
    *   酒店id
     */
    private Integer hotelId;

    /**
    *   序号 17位 yyyyMMddHHmmssfff 年年年年月月日日时时分分秒秒3位毫秒
     */
    private String lineNo;

    /**
    *   备注
     */
    private String remark;

    /**
    *   佣金码
     */
    private String commissionCode;

    /**
    *   描述
     */
    private String notice;

    /**
    *   英文描述
     */
    private String enNotice;

    /**
    *   是否阶梯分房类
     */
    private String ladderRoom;

    /**
    *   是否是有 ，无用目前 Y N
     */
    private String privated;

    /**
    *   是否停用 Y N
     */
    private String stopped;

    /**
    *   阶梯时段：1月，2季度，3年，4不限
     */
    private String ladderTime;

    /**
    *   开始时间
     */
    private Date startTime;

    /**
    *   结束时间
     */
    private Date endTime;

    /**
    *   序号
     */
    private Integer seq;

    /**
    *   新增人
     */
    private String createEmp;

    /**
    *   新增时间
     */
    private Date createDate;

    /**
    *   修改时间
     */
    private Date updateDate;

    /**
    *   修改人
     */
    private String updateEmp;

    /**
    *   版本
     */
    private Integer version;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commission_code.COMMISSION_CODE_ID_
     *
     * @return the value of commission_code.COMMISSION_CODE_ID_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public String getCommissionCodeId() {
        return commissionCodeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commission_code.COMMISSION_CODE_ID_
     *
     * @param commissionCodeId the value for commission_code.COMMISSION_CODE_ID_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public void setCommissionCodeId(String commissionCodeId) {
        this.commissionCodeId = commissionCodeId == null ? null : commissionCodeId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commission_code.HOTEL_GROUP_ID_
     *
     * @return the value of commission_code.HOTEL_GROUP_ID_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public Integer getHotelGroupId() {
        return hotelGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commission_code.HOTEL_GROUP_ID_
     *
     * @param hotelGroupId the value for commission_code.HOTEL_GROUP_ID_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public void setHotelGroupId(Integer hotelGroupId) {
        this.hotelGroupId = hotelGroupId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commission_code.HOTEL_ID_
     *
     * @return the value of commission_code.HOTEL_ID_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public Integer getHotelId() {
        return hotelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commission_code.HOTEL_ID_
     *
     * @param hotelId the value for commission_code.HOTEL_ID_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public void setHotelId(Integer hotelId) {
        this.hotelId = hotelId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commission_code.LINE_NO_
     *
     * @return the value of commission_code.LINE_NO_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public String getLineNo() {
        return lineNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commission_code.LINE_NO_
     *
     * @param lineNo the value for commission_code.LINE_NO_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public void setLineNo(String lineNo) {
        this.lineNo = lineNo == null ? null : lineNo.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commission_code.REMARK_
     *
     * @return the value of commission_code.REMARK_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commission_code.REMARK_
     *
     * @param remark the value for commission_code.REMARK_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commission_code.COMMISSION_CODE
     *
     * @return the value of commission_code.COMMISSION_CODE
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public String getCommissionCode() {
        return commissionCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commission_code.COMMISSION_CODE
     *
     * @param commissionCode the value for commission_code.COMMISSION_CODE
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public void setCommissionCode(String commissionCode) {
        this.commissionCode = commissionCode == null ? null : commissionCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commission_code.NOTICE_
     *
     * @return the value of commission_code.NOTICE_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public String getNotice() {
        return notice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commission_code.NOTICE_
     *
     * @param notice the value for commission_code.NOTICE_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public void setNotice(String notice) {
        this.notice = notice == null ? null : notice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commission_code.EN_NOTICE_
     *
     * @return the value of commission_code.EN_NOTICE_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public String getEnNotice() {
        return enNotice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commission_code.EN_NOTICE_
     *
     * @param enNotice the value for commission_code.EN_NOTICE_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public void setEnNotice(String enNotice) {
        this.enNotice = enNotice == null ? null : enNotice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commission_code.LADDER_ROOM_
     *
     * @return the value of commission_code.LADDER_ROOM_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public String getLadderRoom() {
        return ladderRoom;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commission_code.LADDER_ROOM_
     *
     * @param ladderRoom the value for commission_code.LADDER_ROOM_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public void setLadderRoom(String ladderRoom) {
        this.ladderRoom = ladderRoom == null ? null : ladderRoom.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commission_code.PRIVATED_
     *
     * @return the value of commission_code.PRIVATED_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public String getPrivated() {
        return privated;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commission_code.PRIVATED_
     *
     * @param privated the value for commission_code.PRIVATED_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public void setPrivated(String privated) {
        this.privated = privated == null ? null : privated.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commission_code.STOPPED_
     *
     * @return the value of commission_code.STOPPED_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public String getStopped() {
        return stopped;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commission_code.STOPPED_
     *
     * @param stopped the value for commission_code.STOPPED_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public void setStopped(String stopped) {
        this.stopped = stopped == null ? null : stopped.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commission_code.LADDER_TIME_
     *
     * @return the value of commission_code.LADDER_TIME_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public String getLadderTime() {
        return ladderTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commission_code.LADDER_TIME_
     *
     * @param ladderTime the value for commission_code.LADDER_TIME_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public void setLadderTime(String ladderTime) {
        this.ladderTime = ladderTime == null ? null : ladderTime.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commission_code.START_TIME_
     *
     * @return the value of commission_code.START_TIME_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commission_code.START_TIME_
     *
     * @param startTime the value for commission_code.START_TIME_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commission_code.END_TIME_
     *
     * @return the value of commission_code.END_TIME_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public Date getEndTime() {
        return endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commission_code.END_TIME_
     *
     * @param endTime the value for commission_code.END_TIME_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commission_code.SEQ_
     *
     * @return the value of commission_code.SEQ_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public Integer getSeq() {
        return seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commission_code.SEQ_
     *
     * @param seq the value for commission_code.SEQ_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public void setSeq(Integer seq) {
        this.seq = seq;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commission_code.CREATE_EMP_
     *
     * @return the value of commission_code.CREATE_EMP_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public String getCreateEmp() {
        return createEmp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commission_code.CREATE_EMP_
     *
     * @param createEmp the value for commission_code.CREATE_EMP_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public void setCreateEmp(String createEmp) {
        this.createEmp = createEmp == null ? null : createEmp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commission_code.CREATE_DATE_
     *
     * @return the value of commission_code.CREATE_DATE_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public Date getCreateDate() {
        return createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commission_code.CREATE_DATE_
     *
     * @param createDate the value for commission_code.CREATE_DATE_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commission_code.UPDATE_DATE_
     *
     * @return the value of commission_code.UPDATE_DATE_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public Date getUpdateDate() {
        return updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commission_code.UPDATE_DATE_
     *
     * @param updateDate the value for commission_code.UPDATE_DATE_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commission_code.UPDATE_EMP_
     *
     * @return the value of commission_code.UPDATE_EMP_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public String getUpdateEmp() {
        return updateEmp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commission_code.UPDATE_EMP_
     *
     * @param updateEmp the value for commission_code.UPDATE_EMP_
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public void setUpdateEmp(String updateEmp) {
        this.updateEmp = updateEmp == null ? null : updateEmp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column commission_code.VERSION
     *
     * @return the value of commission_code.VERSION
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public Integer getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column commission_code.VERSION
     *
     * @param version the value for commission_code.VERSION
     *
     * @mbggenerated Wed Jun 13 16:19:02 CST 2018
     */
    public void setVersion(Integer version) {
        this.version = version;
    }
}