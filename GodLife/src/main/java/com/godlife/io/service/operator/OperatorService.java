package com.godlife.io.service.operator;

import java.util.Map;

import com.godlife.io.common.Search;
import com.godlife.io.service.domain.OperatorEvents;
import com.godlife.io.service.domain.OperatorJoinEvent;
import com.godlife.io.service.domain.OperatorReward;
import com.godlife.io.service.domain.OperatorNoticeFaqs;

public interface OperatorService {
	
	public void addOperatorEvents(OperatorEvents operatorEvents ) throws Exception;
	public void addOperatorJoinEvent(OperatorJoinEvent operatorJoinEvent ) throws Exception;
	public void addOperatorReward(OperatorReward operatorReward ) throws Exception;
	public void addOperatorNoticeFaqs(OperatorNoticeFaqs operatorNoticeFaqs ) throws Exception;
	
	public OperatorEvents getOperatoreEvents(int eventNo) throws Exception;
	public OperatorJoinEvent getOperatoreJoinEvent(int joinEventNo) throws Exception;
	public OperatorReward getOperatoreReward(int rewardNo) throws Exception;
	public OperatorNoticeFaqs getOperatorNoticeFaqs(int noticeFaqNo) throws Exception;	

	public Map<String , Object> getOperatorEvents(Search search) throws Exception;
	public Map<String , Object> getOperatorJoinEvent(Search search) throws Exception;
	public Map<String , Object> getOperatorReward(Search search) throws Exception;
	public Map<String , Object> getOperatorNoticeFaqs(Search search) throws Exception;
	
	public void updateOperatorEvents(OperatorEvents operatorEvents) throws Exception;
	public void updateOperatorJoinEvent(OperatorJoinEvent operatorJoinEvent) throws Exception;
	public void updateOperatorReward(OperatorReward operatorReward) throws Exception;
	public void updateOperatorNoticeFaqs(OperatorNoticeFaqs operatorNoticeFaqs) throws Exception;
	
}
