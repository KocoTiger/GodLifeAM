package com.godlife.io.common;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.godlife.io.service.domain.Challenge;

public class CertiCycle {
	
	
	public static Challenge certiCycle(Challenge challenge)throws Exception {
		
		
	
		
//		switch(cal.get(Calendar.DAY_OF_WEEK)) {
//			case 1 : day2 = "��";
//			break;
//			case 2 : day2 = "��";
//			break;
//			case 3 : day2 = "ȭ";
//			break;
//			case 4 : day2 = "��";
//			break;
//			case 5 : day2 = "��";
//			break;
//			case 6 : day2 = "��";
//			break;
//			case 7 : day2 = "��";
//			break;
//		}
//		
//		System.out.println("���� ��¥ : "+inputDate2);
//		System.out.println("���� ��¥ : "+inputDate);
//		
//		System.out.println("���� �� ���ᳯ ���� : "+diffDays);
//		
//		
//		// �����ֱⰡ üũ�ڽ��� 1�� / 2�� / 3ȭ / 4�� / 5�� / 6�� / 7��
//		
//		int startWeek = cal.get(Calendar.DAY_OF_WEEK);
//		System.out.println("startWeek "+startWeek);
//		//���۳�¥�� ������ ���� ���� ó�� 1�̸� �� 2�� ��...
//		
		int result = 0;
//		for(int i=0; i<challenge.getCertiCycle().size(); i++) {// 3 5 �ΰ�
//			
//			System.out.println("�����ֱ� 0: "+Integer.parseInt(challenge.getCertiCycle().get(i)));
//			int count = 0;
//			int largeCount = 0;
//			
//			if(startWeek > Integer.parseInt(challenge.getCertiCycle().get(i))) { //startweek = 4 
//				int j = 0;
//				
//				System.out.println("�����ֱ� 1: "+Integer.parseInt(challenge.getCertiCycle().get(i)));
//				
//				for(j = startWeek; j<=7; j++) {
//					count++;
//				}
//				
//				for(j = 0; j<startWeek; j++) {
//					count++;
//				}
//				count = 1;
//				result = result + ((int)(diffDays - count));//
//				System.out.println("result :"+result);
//				//       4                               6
//			}else if(startWeek < Integer.parseInt(challenge.getCertiCycle().get(i))){
////				for(int j = startWeek; j<challenge.getCertiCycle().size(); j++) {
////					System.out.println("�����ֱ� 2: "+Integer.parseInt(challenge.getCertiCycle().get(i)));
////					count++;
////				}
////				count -= 1;
//				largeCount++;
//				result = result + (int)diffDays;
//				
//			}else {
//				System.out.println("�����ֱ� 3: "+Integer.parseInt(challenge.getCertiCycle().get(i)));
//				result = result + (int)diffDays;
//			}
//	}
		
		String inputDate = challenge.getEndDate(); // �ŰԺ����� ������
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse(inputDate);
		String day = "";
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		// ���� ��¥
		
		String inputDate2= challenge.getStartDate();// �ŰԺ����� ������
		Date date2 =  new SimpleDateFormat("yyyy-MM-dd").parse(inputDate2);
		String day2 = "";
		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(date2);
		//���۳�¥
		
		
		long diffSec = (date.getTime() - date2.getTime()) / 1000; //�� ����
		
		long diffDays = (diffSec / (24*60*60))+1;
		
		int startWeek = cal.get(Calendar.DAY_OF_WEEK);
		int counts = 0;//=> ���� Ƚ���� �ɼ� ����.
		
		Calendar cal3 = Calendar.getInstance();
		
		List<String> certiDate = new ArrayList<String>();
			
for(int i=0; i<challenge.getCertiCycle().size(); i++) {
							
	for (LocalDate date1 = LocalDate.parse(inputDate2); date1.isBefore(LocalDate.parse(inputDate)); date1 = date1.plusDays(1))
			{
				
		
			String start = ""+date1;
			Date dates = new SimpleDateFormat("yyyy-MM-dd").parse(start);
			cal3.setTime(dates);
			int week = cal3.get(Calendar.DAY_OF_WEEK);// �� ��¥�� ������ �� �� ����.
				
			if(week == Integer.parseInt(challenge.getCertiCycle().get(i))) {
					counts++;
					certiDate.add(start);
				}	
					
					
			}
			
		}
	
		int week2 = cal.get(Calendar.DAY_OF_WEEK);// ���ᳯ¥�� ����
		
	for(int i=0; i<challenge.getCertiCycle().size(); i++) {
		
		if(week2 == Integer.parseInt(challenge.getCertiCycle().get(i))) {
			counts++;
			certiDate.add(inputDate);
		}
		
	}
	
	challenge.setCertiCount(counts);
	challenge.setCertiDate(certiDate);
//		System.out.println("��¥ : "+inputDate);
//		
//		counts++;
//		System.out.println("week2 : "+week2);
//		System.out.println("counts : "+counts);
//		
//		
//		System.out.println("///////////////������////////////////////");
//		
//		System.out.println("���۳�¥ : "+inputDate2);
//		System.out.println("���� ���� : "+day2);
//		System.out.println("���۳�¥ : "+inputDate);
////		int stack = 0;
////		for(int i=0; i<challenge.getCertiCycle().size(); i++) {
////			stack++;
////		}// �� �����ϴ� ���� 7�� �����϶� �ּ� �� ��ŭ�� ���� Ƚ���� �����⶧���� �����аŰ���.
////		
//		System.out.println("ç���� �� ���� Ƚ�� :"+((result/7))+"��");
//		
//		
//		System.out.println("���� �и� : "+((result/7)));
//		
//		challenge.setCertiCount((result/7));
		
		return challenge;
	}
	
	
	
}
//int[] athentication = new int[7]; //�Ͽ���
//Scanner sc = new Scanner(System.in);
//for(int i=0; i<athentication.length; i++) {
//	System.out.println("1.�� 2.�� 3.ȭ 4.�� 5.�� 6.�� 7.��");
//	System.out.print("�����ֱ� �Է� : ");
//	athentication[i] = sc.nextInt();
//	int vreak = 0;
//	System.out.println("�Է��� �׸� �ΰڽ��ϱ�. 1 (n) 2 (y)");
//	vreak = sc.nextInt();
//	if(vreak == 2) {
//		break;
//	}
//}  �� �κ��� challenge.getCertiCycle

//athentication[i] ���� �ֱ�� List Ÿ������ �����Ͱ� 1,2,3,4... �� ���ð���.



//String[] athenticationDay = new String[7];
//for(int i=0; i<challenge.getCertiCycle().size(); i++) {
//	if(athentication[i]==0) {
//		break;
//	}
//	switch(athentication[i]) {
//	case 1 : athenticationDay[i] = "��";
//	break;                
//	case 2 : athenticationDay[i] = "��";
//	break;                
//	case 3 : athenticationDay[i] = "ȭ";
//	break;                
//	case 4 : athenticationDay[i] = "��";
//	break;                
//	case 5 : athenticationDay[i] = "��";
//	break;                
//	case 6 : athenticationDay[i] = "��";
//	break;                
//	case 7 : athenticationDay[i] = "��";
//	break;
//	}
//	
//}