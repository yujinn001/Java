package com.sist.genrics;
/*
 *      => 컬렉션에 데이터를 저장 => 같은 데이터형을 저장해야 제어가 편하다 (제네릭스) => 한개의 데이터형만 저장
 *                             ----------- 배열 형식으로 저장
 *           Collection : 인터페이스 (1. 독립적으로 사용이 가능, 2. 표준화(메소드가 다 동일), 3. 필요시에 오버라이딩해서 사용 가능
 *                |
 *       -------------------------
 *       |          |            |
 *      List      Set            Map
 *      -------------------------- 인터페이스
 *      List : 중복된 데이터가 있는 경우, 순서가 존재한다 (인덱스 => 배열을 확장(보완) => 고정적 => 가변)
 *          => ArrayList, Vector, LinkedList(수정, 삭제에 많은 경우에 주로 사용)
 *             ---------- Vector를 보완
 *             -------------------------------> 데이터 베이스에 있는 데이터를 읽어와서 브라우저에 전송 목적
 *                                              읽기 / 쓰기
 *                                              데이터베이스를 사용시에는 ArrayList에 있는 데이터는 거의 변경이 없다
 *                                              (수정, 삭제)
 *                                             => 접근성이 뛰어나다, 순차적으로 데이터 첨부시 속도가 빠르다
 *     Set : 중복이 없는 데이터를 저장할 경우 (중복을 허용하지 않는다), 순서가 없다
 *           List에 중복이 있는 경우 => 제거할 때 사용 => DISTINCT
 *           => WebSocket => 사용자의 정보를 저장 (IP,PORT)
 *           => HashSet / TreeSet(검색) => Application => SELECT
 *             ----------
 *           => 웹 : 검색 => 데이터베이스 (검색 : SELECT)
 *     Map : 두개를 동시에 저장 (Key, Value) => 도서 => ISBN/책, 우편 : 우편번호/ 주소
 *           => 웹에서 주로 사용되는 기법 => id = admin, pwd = admin1
 *              사용자가 요청시에, 서버에서 브라우저로 전송, 서버에 저장, 브라우저에 저장
 *                 HttpServeletRequest ,   HttpServletResponse, HttpSesion,  Cookie
 *              클래스 저장, SQL문장 찾기
 *              --------   ----------
 *               스프링       마이바티스
 *            => Hashtable / HashMap => (Hashtable의 단점 보완)
 *       ==> 저장하는 데이터형을 명시한다
 *           형식) 
 *                ArrayList<String>
 *                Set<String>
 */
import  java.util.*;
public class MainClass_제네릭스_4 {
	public static void main(String[] args){
		// 1. ArrayList저장
	}
	
}
