package com.godlife.io.service.operator.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.godlife.io.common.Search;
import com.godlife.io.service.domain.OperatorEvents;
import com.godlife.io.service.domain.OperatorJoinEvent;
import com.godlife.io.service.domain.OperatorReward;
import com.godlife.io.service.domain.OperatorNoticeFaqs;
import com.godlife.io.service.operator.OperatorService;
import com.godlife.io.service.operator.OperatorDao;

//==> Operator(Event, JoinEvent, Reward, NoticeFaq)Service
@Service("operatorServiceImpl")
public class OperatorServiceImpl implements OperatorService{
	
	//Field
	@Autowired
	@Qualifier("operatorDaoImpl")
	private OperatorDao operatorDao;
	public void setOperatorDao(OperatorDao operatorDao) {
		this.operatorDao = operatorDao;
	}
	
	//Constructor
	public OperatorServiceImpl() {
		// TODO Auto-generated constructor stub
		System.out.println(this.getClass());
	}
	
	//Method Add
	public void addOperatorEvents(OperatorEvents operatorEvents) throws Exception {
		operatorDao.addOperatorEvents(operatorEvents);
	}
	
	public void addOperatorJoinEvent(OperatorJoinEvent operatorJoinEvent) throws Exception {
		operatorDao.addOperatorJoinEvent(operatorJoinEvent);
	}
	
	public void addOperatorReward(OperatorReward operatorReward) throws Exception {
		operatorDao.addOperatorReward(operatorReward);
	}

	public void addOperatorNoticeFaqs(OperatorNoticeFaqs operatorNoticeFaqs) throws Exception {
		operatorDao.addOperatorNoticeFaqs(operatorNoticeFaqs);
	}

	//Method get
	public OperatorEvents getOperatoreEvents(int eventNo) throws Exception {
		return operatorDao.getOperatoreEvents(eventNo);
	}
	
	public OperatorJoinEvent getOperatoreJoinEvent(int joinEventNo) throws Exception {
		return operatorDao.getOperatoreJoinEvent(joinEventNo);
	}
	
	public OperatorReward getOperatoreReward(int rewardNo) throws Exception {
		return operatorDao.getOperatoreReward(rewardNo);
	}
	
	public OperatorNoticeFaqs getOperatorNoticeFaqs(int noticeFaqNo) throws Exception {
		return operatorDao.getOperatorNoticeFaqs(noticeFaqNo);
	}
	
	public Map<String, Object> getOperatorEvents(Search search) throws Exception {
		List<OperatorEvents> list = operatorDao.getOperatorEventsList(search);
		int totalCount = operatorDao.getTotalCount(search);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list );
		map.put("totalCount", new Integer(totalCount));
		
		return map;
	}
	
	public Map<String, Object> getOperatorJoinEvent(Search search) throws Exception {
		List<OperatorJoinEvent> list = operatorDao.getOperatorJoinEventList(search);
		int totalCount = operatorDao.getTotalCount(search);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list );
		map.put("totalCount", new Integer(totalCount));
		
		return map;
	}


	public Map<String, Object> getOperatorReward(Search search) throws Exception {
//		List<OperatorReward> list = operatorDao.getOperatorReward(search);
		
		return null;
	}

	@Override
	public Map<String, Object> getOperatorNoticeFaqs(Search search) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateOperatorEvents(OperatorEvents operatorEvents) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateOperatorJoinEvent(OperatorJoinEvent operatorJoinEvent) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateOperatorReward(OperatorReward operatorReward) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateOperatorNoticeFaqs(OperatorNoticeFaqs operatorNoticeFaqs) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
