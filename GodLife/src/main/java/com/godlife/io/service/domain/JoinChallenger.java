package com.godlife.io.service.domain;

public class JoinChallenger {
	private int joinChallengeNo;
	private String email;
	private int challengeNo;
	private double challengePercent;
	private int challengeReward;
	private String ChallengeRewardFlag;
	private int certiCount;
	public int getJoinChallengeNo() {
		return joinChallengeNo;
	}
	public String getEmail() {
		return email;
	}
	public int getChallengeNo() {
		return challengeNo;
	}
	public double getChallengePercent() {
		return challengePercent;
	}
	public int getChallengeReward() {
		return challengeReward;
	}
	public String getChallengeRewardFlag() {
		return ChallengeRewardFlag;
	}
	public int getCertiCount() {
		return certiCount;
	}
	public void setJoinChallengeNo(int joinChallengeNo) {
		this.joinChallengeNo = joinChallengeNo;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setChallengeNo(int challengeNo) {
		this.challengeNo = challengeNo;
	}
	public void setChallengePercent(double challengePercent) {
		this.challengePercent = challengePercent;
	}
	public void setChallengeReward(int challengeReward) {
		this.challengeReward = challengeReward;
	}
	public void setChallengeRewardFlag(String challengeRewardFlag) {
		ChallengeRewardFlag = challengeRewardFlag;
	}
	public void setCertiCount(int certiCount) {
		this.certiCount = certiCount;
	}
	@Override
	public String toString() {
		return "JoinChallenger [joinChallengeNo=" + joinChallengeNo + ", email=" + email + ", challengeNo="
				+ challengeNo + ", challengePercent=" + challengePercent + ", challengeReward=" + challengeReward
				+ ", ChallengeRewardFlag=" + ChallengeRewardFlag + ", certiCount=" + certiCount + "]";
	}



}