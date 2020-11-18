package com.hhh.erp;
import java.util.regex.Pattern;


public class StringTest {

	public static void main(String[] args) {

		
		int a = 10;
		int b = 10;
		
		System.out.print(a==b);
		// 기본형 데이터는 == 으로 비교 가능하다.
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//"Beatles"라는 문자열을 관리하는 String 객체 생성하고//메위주를 str4에 저장하
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ


		String str4 = "Beatles";
		String str5 = "BEATLES";
		
		//스펠링이 달라서 false 가 아니라 객체의 메위주가 달라서 false다.
		
		// 꼭 다음 아래와같이 비교해야된다.
		System.out.println("str4 == str5 => " + (str4==str5));
		System.out.println("str4.equals(str5)str5 => " + str4.equals(str5));

		//스펠링만 비교
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//String 객체의 equalsIgnoreCase 메소드를 사용하
		// 문자의 스펠링이 같으면 true, 다르면 false를 리턴하기
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		System.out.println("str4equalsIgnoreCase(str5) => " + str4.equalsIgnoreCase(str5));

		
		
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		//"This is a love"라는 문자열을 관리하는 String 객체 생성하고
		//메위주를 str에 저장하기 
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		String str = "This is a love";

		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// String 객체의 charAt(인덱스번호)를 메소드를 호출하여
		// 인덱스번호에 해당하는 문자를 복사하여 char형으로 리턴하기.
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		System.out.println( "str.charAt(5) => " + str.charAt(5));
		// charAt 의 리턴값은 String이 아니라 char형이다.
	
		
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// String 객체의 concat("붙일문자") 메소드를 호출하여
		// String 객체의 문자와 "붙일문자" 붙여 리턴하기 
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		// 이해안된다 *****
		System.out.println( "str.concat(\"girl\") => " + str.concat(" girl"));
		System.out.println( "str + \"girl\" => " + (str + " girl"));

		
		System.out.println( "str.startsWith(\"This\") => " + (str.startsWith("This")));
		System.out.println( "str.endsWith(\"love\") => " + (str.endsWith("love")));
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		System.out.println( "//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println( "str.indexOf(\"i\") => " + (str.indexOf("i")));
		System.out.println( "str.indexOf(\"i\",3) => " + (str.indexOf("i",3)));			
		System.out.println( "str.lastIndexOf(\"is\") => " + (str.lastIndexOf("is")));
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		System.out.println( "//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		System.out.println("str.length() => " + str.length());
		//공백도 길이에 꼭 포함이 된다.
		System.out.println("str.replace(\"i\",\"I\")"+str.replace("i", "I"));
		System.out.println("str.rreplaceFirst(\"is\",\"IS\")"+str.replaceFirst("is","IS"));
		
		System.out.println("str.substring(5,13)=>" + str.substring(5,13));
		System.out.println("str.substring(5,7)=>" + str.substring(5,7));//??
		System.out.println("str.substring(5)=>" + str.substring(5));
		
		System.out.println("str.toLowerCase()=>" + str.toLowerCase());
		System.out.println("str.toUpperCase()=>" + str.toUpperCase());
		System.out.println("String.valueOf(1234)=>" + String.valueOf(1234));
		// 숫자는 더이상 연산의 목적이 아니다 문자로 보전만 하고 덧붙이고싶을때 바로 문자로 바꾸는 것.
		// 계산하고 싶지 않아서.
		// 간단하게 바꾸는 방법있다.
		System.out.println("1234+\"\"=>"+ (1234+""));
		
		//전화번호의 형식이 갖는지 검사를 해야돼.
		//저게 뭐로 구성되어야 하냐
		// - 와 숫자로 구성
		// 이걸 검사하는 프로그램을 짜보겠다.
		
		
		
		//반복문을 왜 돌리지?
		//어렵다 이할때까지 분석 
	String phone ="010-1234-1234";
	String num = "0123456789-";
	boolean result = true;
	
	if(phone.length()!=13) {
		result = false;
	}else {
	
	for(int i = 0; i<phone.length(); i++) {
		char xxx = phone.charAt(i);
//		숫자도 아니고 - 도 아니라면 
//		if(xxx!='0'&&xxx!='1'&&xxx!='2'&&xxx!='3'&&xxx!='4'&&
//				xxx!='5'&&xxx!='6'&&xxx!='7'&&xxx!='8'&&xxx!='9'&&xxx!='-') {
//		 result = false;
//		 break;
//		 
//		}
//		if(num.indexOf(xxx)<0) {
//			result = false;
//			break;
// 
//		}
		//- - 가 두개가 꼭 들어가야한다면
		if (i<3||(i>=4&&i<=7)||(i>=9)) {
			if(num.indexOf(xxx)<0) {
			result = false;
			break;
			}
		}
		if ( i==3||i==8) {
			if(xxx!='-') {
				result = false;
				break;	
			}
		}
	}
	}	
		if (result==true) {
			System.out.println(phone+"는 전화번호로 합당합니다.");
		}else {
			System.out.println(phone+"는 전화번호로 틀립니다.");

		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
// split으로 쪼갠다음 String[]로 담은것.
//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ		
		phone ="010-1234-1234";
		num = "0123456789";
		
		result = true;
		if(phone.length()!=13) {
			result = false;
		
			//맞다면 
		}else{
				// - 로 토막내서 배열에 담는다. 0 1 2  총 3개의 배열 변수 
				String[] arr = phone.split("-");
		
				// 배열의 길이가 3이 아니면 false
				if(arr.length!=3) {			
					result = false;	
					
				// 배열이 총 3개가 맞다면 
				}else{
					
					// 012 => 3 
					// 토막낸 0번째의 길이가 3이아니면 false // i< arr.length 3이니까 0 1 2배열에 들어간다. 
					for(int i = 0 ; i < arr.length ; i++) {
						
						//  0번째 배열이고 0번째 배열의 길이가 3이 아니라면 false.
						if(i==0&&arr[i].length()!=3) {
							result = false;
							break;
							
						}	
						
						//토막낸 배열의 1 2번째 길이가 4가 아니면 false 
						if((i==1||i==2)&&arr[i].length()!=4) {
							result = false;
							break;
						}
						// 각 배열에 j번째 숫자를// j=0 i =0 이면 0번째배열의 길이는 3 1이면 4 4번 돈다. 
						for(int j = 0; j < arr[i].length();j++ ) {
							
							//각 배열안의 j번째 문자가 xxx 에 담긴다.
							char xxx = arr[i].charAt(j);
							
//							0123456789중에 
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
		
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		
		
		
		
		
	}

}
