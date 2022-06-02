package com.godlife.io.service.domain;

import java.sql.Date;
import java.util.List;

public class Challenge {
	
	private int challengeNo;
	private String hostEmail;
	private String challengeTitle;
	private String challengeThumbnailImg;
	private String challengeDetail;
	private String challengeRule;
	private int challengeCateNo;
	private List<String> certiCycle;
	private String startDate;
	private String endDate;
	private String openRange;
	private int joinPoint;
	private Date challengeRegDate;
	private String challengeStatus;
	private int joinCount;
	private List<String> certiDate;
	private int certiCount;
	
	
	public int getChallengeNo() {
		return challengeNo;
	}
	public String getHostEmail() {
		return hostEmail;
	}
	public String getChallengeTitle() {
		return challengeTitle;
	}
	public String getChallengeThumbnailImg() {
		return challengeThumbnailImg;
	}
	public String getChallengeDetail() {
		return challengeDetail;
	}
	public String getChallengeRule() {
		return challengeRule;
	}
	public int getChallengeCateNo() {
		return challengeCateNo;
	}
	public List<String> getCertiCycle() {
		return certiCycle;
	}
	public String getStartDate() {
		return startDate;
	}
	public String getEndDate() {
		return endDate;
	}
	public String getOpenRange() {
		return openRange;
	}
	public int getJoinPoint() {
		return joinPoint;
	}
	public Date getChallengeRegDate() {
		return challengeRegDate;
	}
	public String getChallengeStatus() {
		return challengeStatus;
	}
	public int getJoinCount() {
		return joinCount;
	}
	public List<String> getCertiDate() {
		return certiDate;
	}
	public void setChallengeNo(int challengeNo) {
		this.challengeNo = challengeNo;
	}
	public void setHostEmail(String hostEmail) {
		this.hostEmail = hostEmail;
	}
	public void setChallengeTitle(String challengeTitle) {
		this.challengeTitle = challengeTitle;
	}
	public void setChallengeThumbnailImg(String challengeThumbnailImg) {
		this.challengeThumbnailImg = challengeThumbnailImg;
	}
	public void setChallengeDetail(String challengeDetail) {
		this.challengeDetail = challengeDetail;
	}
	public void setChallengeRule(String challengeRule) {
		this.challengeRule = challengeRule;
	}
	public void setChallengeCateNo(int challengeCateNo) {
		this.challengeCateNo = challengeCateNo;
	}
	public void setCertiCycle(List<String> certiCycle) {
		this.certiCycle = certiCycle;
	}
	public void setStartDate(String statDate) {
		this.startDate = statDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public void setOpenRange(String openRange) {
		this.openRange = openRange;
	}
	public void setJoinPoint(int joinPoint) {
		this.joinPoint = joinPoint;
	}
	public void setChallengeRegDate(Date challengeRegDate) {
		this.challengeRegDate = challengeRegDate;
	}
	public void setChallengeStatus(String challengeStatus) {
		this.challengeStatus = challengeStatus;
	}
	public void setJoinCount(int joinCount) {
		this.joinCount = joinCount;
	}
	public void setCertiDate(List<String> certiDate) {
		this.certiDate = certiDate;
	}
	public int getCertiCount() {
		return certiCount;
	}
	public void setCertiCount(int certiCount) {
		this.certiCount = certiCount;
	}
	@Override
	public String toString() {
		return "Challenge [challengeNo=" + challengeNo + ", hostEmail=" + hostEmail + ", challengeTitle="
				+ challengeTitle + ", challengeThumbnailImg=" + challengeThumbnailImg + ", challengeDetail="
				+ challengeDetail + ", challengeRule=" + challengeRule + ", challengeCateNo=" + challengeCateNo
				+ ", certiCycle=" + certiCycle + ", startDate=" + startDate + ", endDate=" + endDate + ", openRange="
				+ openRange + ", joinPoint=" + joinPoint + ", challengeRegDate=" + challengeRegDate
				+ ", challengeStatus=" + challengeStatus + ", joinCount=" + joinCount + ", certiDate=" + certiDate
				+ ", certiCount=" + certiCount + "]";
	}
	

	
	
	
	
}
