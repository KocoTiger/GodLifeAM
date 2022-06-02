package com.godlife.io.service.badge.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.godlife.io.common.Search;
import com.godlife.io.service.badge.BadgeDao;
import com.godlife.io.service.badge.BadgeService;
import com.godlife.io.service.domain.Badge;
import com.godlife.io.service.domain.MyBadge;
import com.godlife.io.service.domain.Product;



@Service("badgeServiceImpl")
public class BadgeServiceImpl implements BadgeService{
		
	///Field
	@Autowired
	@Qualifier("badgeDaoImpl")
	private BadgeDao badgeDao;
	public void setBadgeDao(BadgeDao badgeDao) {
		this.badgeDao = badgeDao;
	}
	
	///Constructor
	public BadgeServiceImpl() {
		System.out.println(this.getClass());
	}

	///Method
	public void addBadgeView(Badge badge) throws Exception {
		badgeDao.addBadgeView(badge);
	}
	public void addBadge(Badge badge) throws Exception {
		badgeDao.addBadge(badge);
	}
	public void addBadgeConfirm(Badge badge) throws Exception {
		badgeDao.addBadgeConfirm(badge);
	}
	public void addBadgeImg(Badge badge) throws Exception {
		badgeDao.addBadgeImg(badge);
	}
//////////////////////////////////////////////////////////////
	public Badge getBadge(int badgeNo) throws Exception {
		return badgeDao.getBadge(badgeNo);
	}
	public MyBadge getBadgeMy(int myBadgeNo) throws Exception {
		return badgeDao.getBadgeMy(myBadgeNo);
	}
//////////////////////////////////////////////////////////////
	public Map<String , Object> getBadgeList(Search search) throws Exception {
		List<Badge> list= badgeDao.getBadgeList(search);
		int totalCount = badgeDao.getTotalCount(search);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list );
		map.put("totalCount", new Integer(totalCount));
		
		return map;
	}

	public Map<String , Object> getBadgeMyList(Search search) throws Exception {
		List<MyBadge> list= badgeDao.getBadgeMyList(search);
		int totalCount = badgeDao.getTotalCount(search);
		
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list", list );
		map.put("totalCount", new Integer(totalCount));
		
		return map;
	}

//////////////////////////////////////////////////////////////	
	public void updateBadgeImg(Badge badge) throws Exception {
		badgeDao.updateBadgeImg(badge);
	}
	public void updateBadge(Badge badge) throws Exception {
		badgeDao.updateBadge(badge);
	}
	public void updateBadgeConfirm(Badge badge) throws Exception {
		badgeDao.updateBadgeConfirm(badge);
	}
	
//////////////////////////////////////////////////////////////
	
	public void deleteBadge(Badge badge) throws Exception {
		badgeDao.deleteBadge(badge);
	}
	public void deleteBadgeConfirm(Badge badge) throws Exception {
		badgeDao.deleteBadgeConfirm(badge);
	}
	

	
	
	
	
	

}