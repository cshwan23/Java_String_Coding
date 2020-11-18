package com.hhh.erp;

public class StringTest1_1 {

	public static void main(String[] args) {

		String phone = "010-1234-1234";
		// 전화번호 변수
		String num = "0123456789";
		// 비교할 숫자 더미 
		
		boolean result = true;
		// 결과 트루 
		
		if (phone.length()!=13) {
			result = false;
			
		}else{
			// 전화 번호의 길이는 13이다. 그래서 13번 돌릴거다.
			// 하나씩 들어가서 확인. 숫자가 여기에 포함되는지. 
			for(int i = 0; i<phone.length(); i++) {
				
				//	012 4567 9101112
				// 010-1234-1234의 i번째 문자 반환 
				char xxx = phone.charAt(i);
				//0번째의 문자를 반환. 
				
				if(i<3||i>=4&&i<=7||i>=9&&i<=12) {
					
					if(num.indexOf(xxx)<0) {
						result = false;
						break;
						
					}
		
				}else {
					if(xxx!='-') {
						result = false;
						break;
					}
				}
				
				
			}
			
			
			
			
		}
		
		
		
		
		
		
		
	}

}
