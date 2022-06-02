package com.godlife.io.service.badge;

import java.util.List;

import com.godlife.io.common.Search;
import com.godlife.io.service.domain.Badge;
import com.godlife.io.service.domain.MyBadge;


//==> 회원관리에서 CRUD 추상화/캡슐화한 DAO Interface Definition
public interface BadgeDao {
	

/////////////////////////////////////////////////////////////	

	// 신규 배지 등록 UI 요청 
	public void addBadgeView(Badge badge) throws Exception ;
	// 신규 배지 등록 완료
	public void addBadge(Badge badge) throws Exception ;
	// 신규 배지 등록 확인
	public void addBadgeConfirm(Badge badge) throws Exception ;
	// 신규 배지 이미지 등록 완료
	public void addBadgeImg(Badge badge) throws Exception ;

/////////////////////////////////////////////////////////////
	
	// 배지 상세 내용 UI 요청 
	public Badge getBadge(int badgeNo) throws Exception ;
	// 내 배지 상세 내용  
	public MyBadge getBadgeMy(int myBadgeNo) throws Exception ;

/////////////////////////////////////////////////////////////
	
	// 배지 전체 목록 UI 요청
	public List<Badge> getBadgeList(Search search) throws Exception ;
	// 내 배지 전체 목록 UI 요청
	public List<MyBadge> getBadgeMyList(Search search) throws Exception ;
	
/////////////////////////////////////////////////////////////
	
	// 배지 이미지 수정
	public void updateBadgeImg(Badge badge) throws Exception ;	
	// 배지 내용 수정 완료 요청
	public void updateBadge(Badge badge) throws Exception ;	
	// 배지 내용 수정 확인 요청
	public void updateBadgeConfirm(Badge badge) throws Exception ;	

/////////////////////////////////////////////////////////////	
	
	// DELETE (추가 Data)
	// 배지 삭제 완료 요청
	public void deleteBadge(Badge badge) throws Exception ;
	// 배지 삭제 확인 요청
	public void deleteBadgeConfirm(Badge badge) throws Exception ;	
	
/////////////////////////////////////////////////////////////
	
	// 게시판 Page 처리를 위한 전체Row(totalCount)  return (기존 Data)
	public int getTotalCount(Search search) throws Exception ;
	
	

}
