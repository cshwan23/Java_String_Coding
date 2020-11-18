package com.hhh.erp;

public class StringTest2 {

	public static void main(String[] args) {
		

		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		// 아래 조건을 만족하는 비밀번호인지 여부 출력하기
		
			// 길이가 8자 이상
			// 숫자 1개 이상 포함
			// 영어 대소문자, 숫자로만 구성되어있어야 함
			// 영어 소문자 1개 이상 포함
			// 영어 대문자 1개 이상 포함 
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		String pwd = "Cshwan23";
		boolean result = true;
		
		int numCnt = 0; // 숫자 개수 누적 
		int lowCaseCnt = 0; // 소문자 개수 누적 
		int upperCaseCnt = 0; // 대문자 개수 누적 
		int pwdLength = pwd.length();
		
		
		for ( int i = 0; i <pwd.length() ; i++) {
			
			
			char strOne = pwd.charAt(i);
			
			if ("0123456789".indexOf(strOne)>=0) {
				numCnt++;
			}
			if ("abcdefghijklmnopqrstuvwxyz".indexOf(strOne)>=0) {
				lowCaseCnt++;
			}
			if ("ABCDEFGHIJKLMNOPQRSTUVWXY".indexOf(strOne)>=0) {
				upperCaseCnt++;
			}
			
		}
		if (numCnt<1||lowCaseCnt<1||upperCaseCnt<1||pwdLength<8
				||(numCnt+lowCaseCnt + upperCaseCnt)!=pwdLength) {
			result = false;
		}
		if(result = true) {
			System.out.println(pwd+"는 암호로 설정할 수 있습니다.");
		}else {
			System.out.println(pwd+"는 암호로 설정할 수 없습니다.");

		}
		
		
		
		
		
		
	}

}
