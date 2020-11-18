# Java_String_Coding
스트링객체 예제 코딩
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
package com.hhh.erp;

import java.util.regex.Pattern;

public class StringTest1 {

	public static void main(String[] args) {

		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 전화번호 문자열의 패턴을 검사하여 true 또는 false 출력하기
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		
		
		

		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//임의의 전화번호 문자열이 저장된 변수 phone 선언하기 
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		String phone ="010-1234-1234";
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//"0123456789"이 저장된 변수 num 선언하기 
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		String num = "0123456789";
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 합당한 전화번호 여부의 판단이 저장된 변수 result 선언하기 
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		boolean result = true;
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//전화번호의 길이가 13이 아니면 result에 false 저장하기
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		if(phone.length()!=13) {
			result = false;
		}
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//전화번호의 길이가 13이면 
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
		else{
		
			
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			// 전화번호 문자열에서 차례대로 1개씩 꺼내서
			// 숫자도 아니고 - 도 아니면 result에 false 저장하고 반복문 탈출하기
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		for(int i = 0; i<phone.length(); i++) {
			
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			// 전화번호 문자열에서 i번째 문자 1개 꺼내서 xxx 변수에 저장하기
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			char xxx = phone.charAt(i);
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			// 만약 i가 3미만이거나 4~7사이 이거나 9이상이면 
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			if (i<3||(i>=4&&i<=7)||(i>=9)) {
				//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
				// i번째 문자가 num 변수안에 없으면(= i번째 문자가 숫자가 아니면)
				// result에 false 저장하고 반복문 탈출하기 
				//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
				if(num.indexOf(xxx)<0) {
				result = false;
				break;
				}
				//그외경우면
			}else {
				//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
				// i 번째 문자가 -가 아니면
				//result에 false 저장하고 반복문 탈출하기 
				//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
				if(xxx!='-') {
					result = false;
					break;	
				}
			}
		}
		}	
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			//result 에 true 저장되어있으면 합당한 전화번호라고 도스 창에 출력하기
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			if (result==true) {
				System.out.println(phone+"는 전화번호로 합당합니다.");
				
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			//result 에 true 저장되어있지않으면 합당하지않은 전화번호라고 도스 창에 출력하기
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
			}else {
				System.out.println(phone+"는 전화번호로 틀립니다.");

			}
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
			
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	// split으로 쪼갠다음 String[]로 담은것.
	//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
			phone ="010-1234-1234";
			num = "0123456789-";
			
			result = true;
			if(phone.length()!=13) {
				result = false;
			
			}else{
					// - 로 토막내서 배열에 담는다.
					String[] arr = phone.split("-");
			
					// 배열의 길이가 3이 아니면 false
					if(arr.length!=3) {			
						result = false;			
					}else{
						// 012 => 3 
						//토막낸0번째의 길이가 3이아니면 폴스.
						for(int i = 0 ; i < arr.length ; i++) {
							if(i==0&&arr[i].length()!=3) {
								result = false;
								break;
							}	
							//토막낸 1 2번째 길이가 4가 아니면 폴스 
							if((i==1||i==2)&&arr[i].length()!=4) {
								result = false;
								break;
							}
							for(int j = 0; j<arr[i].length();j++ ) {
								char xxx = arr[i].charAt(j);
								if(num.indexOf(xxx)<0) {
									result = false;
									break;
								}				
							}		
						}
					}		
				
			}
			if (result==true) {
				System.out.println(phone+"는 전화번호로 합당합니다.");
			}else {
				System.out.println(phone+"는 전화번호로 틀립니다.");

			}
			
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			// 정규표현식 문자안에 데이터를 검사.
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ	
			//이걸 외워야돼? 
			boolean result2 = Pattern.matches("[0-9]{3}-[0-9]{4}-[0-9]{4}", phone);
			if (result2==true) {
				System.out.println(phone+"는 전화번호로 합당합니다.");
			}else {
				System.out.println(phone+"는 전화번호로 틀립니다.");

			}
	}

}
