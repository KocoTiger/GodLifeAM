package com.godlife.io.service.operator.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.godlife.io.common.Search;
import com.godlife.io.service.domain.OperatorEvents;
import com.godlife.io.service.domain.OperatorJoinEvent;
import com.godlife.io.service.domain.OperatorReward;
import com.godlife.io.service.domain.OperatorNoticeFaqs;
import com.godlife.io.service.operator.OperatorDao;

@Repository("operatorDaoImpl")
public class OperatorDaoImpl implements OperatorDao{
	
	///Field
	@Autowired
	@Qualifier("sqlSessionTemplate")
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	///Constructor
	public OperatorDaoImpl() {
		System.out.println(this.getClass());
	}

	///Method Add
	public void addOperatorEvents(OperatorEvents operatorEvents) throws Exception {
		sqlSession.insert("OperatorEventsMapper.addOperatorEvents", operatorEvents);		
	}
	
	public void addOperatorJoinEvent(OperatorJoinEvent operatorJoinEvent) throws Exception {
		sqlSession.insert("OperatorJoinEventMapper.addOperatorJoinEvent",operatorJoinEvent);
	}
	
	public void addOperatorReward(OperatorReward operatorReward) throws Exception {
		sqlSession.insert("OperatorRewardMapper.addOperatorReward", operatorReward);
	}
	
	public void addOperatorNoticeFaqs(OperatorNoticeFaqs operatorNoticeFaqs) throws Exception {
		sqlSession.insert("OperatorNoticeFaqsMapper.addOperatorNoticeFaqs",operatorNoticeFaqs);
	}
	
	///Method get
	public OperatorEvents getOperatoreEvents(int eventNo) throws Exception {
		return sqlSession.selectOne("OperatorEventsMapper.getOperatoreEvents", eventNo);
	}

	public OperatorJoinEvent getOperatoreJoinEvent(int joinEventNo) throws Exception {
		return sqlSession.selectOne("OperatorJoinEventMapper.getOperatoreJoinEvent", joinEventNo);
	}
	
	public OperatorReward getOperatoreReward(int rewardNo) throws Exception {
		return sqlSession.selectOne("OperatorRewardMapper.getOperatoreReward",rewardNo);
	}
	
	public OperatorNoticeFaqs getOperatorNoticeFaqs(int noticeFaqNo) throws Exception {
		return sqlSession.selectOne("OperatorNoticeFaqsMapper.getOperatorNoticeFaqs",noticeFaqNo);
	}
	
	///Method List
	public List<OperatorEvents> getOperatorEventsList(Search search) throws Exception {
		return sqlSession.selectList("OperatorNoticeFaqsMapper.getOperatorEventsList",search);
	}
	
	public List<OperatorJoinEvent> getOperatorJoinEventList(Search search) throws Exception {
		return sqlSession.selectList("OperatorJoinEvent.getOperatorJoinEventList",search);
	}
	
	public List<OperatorReward> getOperatorRewardList(Search search) throws Exception {
		return sqlSession.selectList("OperatorReward.getOperatorRewardList",search);
	}
	
	public List<OperatorNoticeFaqs> getOperatorNoticeFaqsList(Search search) throws Exception {
		return sqlSession.selectList("OperatorNoticeFaqs.getOperatorNoticeFaqsList",search);
	}
	
	///Method Update
	public void updateOperatorEvents(OperatorEvents operatorEvents) throws Exception {
		sqlSession.update("OperatorEventsMapper.updateOperatorEvents",operatorEvents);
	}
	
	public void updateOperatorJoinEvent(OperatorJoinEvent operatorJoinEvent) throws Exception {
		sqlSession.update("OperatorJoinEventMapper.updateOperatorJoinEvent",operatorJoinEvent);
	}
	
	public void updateOperatorReward(OperatorReward operatorReward) throws Exception {
		sqlSession.update("OperatorRewardMapper.updateOperatorReward", operatorReward);
	}
	public void updateOperatorNoticeFaqs(OperatorNoticeFaqs operatorNoticeFaqs) throws Exception {
		sqlSession.update("OperatorNoticeFaqs.updateOperatorNoticeFaqs",operatorNoticeFaqs);
	}
	
	// �Խ��� Page ó���� ���� ��ü Row(totalCount)  return
	public int getTotalCount(Search search) throws Exception {
		return sqlSession.selectOne("UserMapper.getTotalCount", search);
	}

}