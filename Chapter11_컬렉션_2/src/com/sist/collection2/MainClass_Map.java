package com.sist.collection2;
/*    
 *    	Collection
 *          |
 *         Map
--------------------------인터페이스
            |
      -------------------
      |                 |
      Hashtable        HAshMap(***)
      
       특징) 두 개를 동시에 저장 (key, value)
            => key는 중복할 수 없다. value값은 중복이 가능하다
            
            => 1) key는 문자열, value값은 상관없다
               2) 사용처 : 웹에서 지원하는 모든 클래스 (Map형식)
               
            => 주요 메소드
               저장 : put(key, 값)
               읽기 : get(key)
 */
import java.util.*;
public class MainClass_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map map = new HashMap();
		map.put("id","adimn");
		map.put("password","1234");
		map.put("name", "홍길동");
		map.put("sex","남자");
		map.put("age",25);
		map.put("password", "46578"); // 덮어쓴다 (같은 이름이면)
		
		// 값 출력
//		System.out.println("ID : "+map.get("id"));
//		System.out.println("password : "+map.get("password"));
//		System.out.println("name : "+map.get("name"));
//		System.out.println("sex : "+map.get("sex"));
//		System.out.println("age : "+map.get("age"));
		Set s = map.keySet(); //KeySet() : map에 저장된 key만 저장
		System.out.println(s); // key값만 저장되니! key값만 나온다
		
		for(Object obj :s) /// 데이터가 많을 경우 : 키 전체를 가져온 다음 루프를 돌린다
		{
			String key=(String)obj;
			System.out.println(key+":"+map.get(key));
		}
		
	}

}



















