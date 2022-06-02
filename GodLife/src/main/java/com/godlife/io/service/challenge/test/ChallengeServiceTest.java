package com.godlife.io.service.challenge.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.godlife.io.common.CertiCycle;
import com.godlife.io.service.domain.Challenge;
import com.godlife.io.service.user.UserService;

/*
 *	FileName :  UserServiceTest.java
 * ㅇ JUnit4 (Test Framework) 과 Spring Framework 통합 Test( Unit Test)
 * ㅇ Spring 은 JUnit 4를 위한 지원 클래스를 통해 스프링 기반 통합 테스트 코드를 작성 할 수 있다.
 * ㅇ @RunWith : Meta-data 를 통한 wiring(생성,DI) 할 객체 구현체 지정
 * ㅇ @ContextConfiguration : Meta-data location 지정
 * ㅇ @Test : 테스트 실행 소스 지정
 */
@RunWith(SpringJUnit4ClassRunner.class)

//==> Meta-Data 를 다양하게 Wiring 하자...
//@ContextConfiguration(locations = { "classpath:config/context-*.xml" })
@ContextConfiguration	(locations = {	"classpath:config/context-common.xml",
																	"classpath:config/context-aspect.xml",
																	"classpath:config/context-mybatis.xml",
																	"classpath:config/context-transaction.xml" })
//@ContextConfiguration(locations = { "classpath:config/context-common.xml" })
public class ChallengeServiceTest {

	//==>@RunWith,@ContextConfiguration 이용 Wiring, Test 할 instance DI
	@Autowired
	@Qualifier("userServiceImpl")
	private UserService userService;

	@Test
	public void testAddUser() throws Exception {
		Challenge challenge = new Challenge();
		List<String> certiCycle = new ArrayList<String>();
		certiCycle.add("1");//일
		certiCycle.add("2");//월
		certiCycle.add("5");//목
		certiCycle.add("6");//금
		certiCycle.add("7");//토
		
		
		challenge.setStartDate("2022-06-01");
		challenge.setEndDate("2022-07-16");
		challenge.setCertiCycle(certiCycle);
		challenge = CertiCycle.certiCycle(challenge);
		
		System.out.println(challenge.getCertiCount());
		for(int i=0; i<challenge.getCertiDate().size(); i++) {
			System.out.println("인증 요일 : "+challenge.getCertiDate().get(i));
		}
	}
	
	
}	
