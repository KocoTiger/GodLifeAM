package com.godlife.io.service.operator;

import java.util.List;

import com.godlife.io.common.Search;
import com.godlife.io.service.domain.OperatorEvents;
import com.godlife.io.service.domain.OperatorJoinEvent;
import com.godlife.io.service.domain.OperatorReward;
import com.godlife.io.service.domain.OperatorNoticeFaqs;

public interface OperatorDao {
	
	//Insert
	public void addOperatorEvents(OperatorEvents operatorEvents ) throws Exception;
	public void addOperatorJoinEvent(OperatorJoinEvent operatorJoinEvent ) throws Exception;
	public void addOperatorReward(OperatorReward operatorReward ) throws Exception;
	public void addOperatorNoticeFaqs(OperatorNoticeFaqs operatorNoticeFaqs ) throws Exception;
	
	//SELECT ONE
	public OperatorEvents getOperatoreEvents(int eventNo) throws Exception;
	public OperatorJoinEvent getOperatoreJoinEvent(int joinEventNo) throws Exception;
	public OperatorReward getOperatoreReward(int rewardNo) throws Exception;
	public OperatorNoticeFaqs getOperatorNoticeFaqs(int noticeFaqNo) throws Exception;
	
	//SELECT LIST
	public List<OperatorEvents> getOperatorEventsList(Search search) throws Exception;
	public List<OperatorJoinEvent> getOperatorJoinEventList(Search search) throws Exception;
	public List<OperatorReward> getOperatorRewardList(Search search) throws Exception;
	public List<OperatorNoticeFaqs> getOperatorNoticeFaqsList(Search search) throws Exception;
	
	//UPDATE
	public void updateOperatorEvents(OperatorEvents operatorEvents) throws Exception;
	public void updateOperatorJoinEvent(OperatorJoinEvent operatorJoinEvent) throws Exception;
	public void updateOperatorReward(OperatorReward operatorReward) throws Exception;
	public void updateOperatorNoticeFaqs(OperatorNoticeFaqs operatorNoticeFaqs) throws Exception;	
	
	// �Խ��� Page ó���� ���� ��üRow(totalCount)  return
	public int getTotalCount(Search search) throws Exception ;
	
}
