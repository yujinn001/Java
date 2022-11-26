/*
 *    컬렉션 ==> java.util.* ==> 668page
 *    데이터를 수집 => ArrayList
 *    데이터 전송 => Map
 *    데이터 중복 제거 : Set
 *    ---------------------
 *         List 
 *          ArrayList
 *            = 배열기반 (인덱스번호를 가지고 있다) => 순차적으로 생성 
 *                                            -----------
 *            = 단점) 추가나 삭제시에 속도가 느려진다 
 *            = 순차적으로 추가할때는 가장 빠르다 
 *              -------------------------
 *            = 데이터에 접근하는 접근성이 뛰어나다
 *              --------------------------
 *            **** 순서를 가지고 있다 / 중복 데이터를 허용
 *            **** 데이터베이스 연동시 가장 많이 사용되는 컬렉션 
 *            **** 주요 기능 
 *                 add() =  추가 , get() = 읽기 , size() =저장 갯수 , isEmpty() 데이터존재 여부 , clear() 전체 삭제
 *                 ***** 크롤링   
 *          Vector : 동기화 (네트워크에서 주로 사용) 
 *                   Vector의 단점을 보완 => ArrayList이다 (주로 사용)
 *          LinkedList : 연결기반 (메모리 크기가 크다 (다음에 있는 데이터 주소 , 본인 데이터 주소)
 *                       데이터 추가,삭제시에 속도가 빠르다 , 데이터에 대한 접근성이 낮다 
 *                   *** 메소드가 동일 
 *                   
 *          =============> List list=new ArrayList()
 *                         list=new LinkedList()
 *                         list=new Vector()
 *         Set 
 *          HashSet : 중복이 없는 데이터 저장 , 순서가 존재하지 않는다 
 *                    주요기능 ) add , get , remove , isEmpty , clear
 *                    ==> List에서 중복된 데이터를 제거 
 *         Map
 *          HashMap : (key,value) 동시에 저장 
 *                     key는 저장된 값을 읽을 때 사용 
 *                     key=>중복할 수 없다 
 *                     value=>중복이 가능 
 *                    주요기능) put(추가) , get(값 읽기) , isEmpty() , clear()
 *         Properties : 파일로 만들어진다 
 *                      load() : 파일 읽기 , getProperty() : 파일에서 데이터 읽기 
 *                      setProperty() : 파일에 저장할 내용 설정 
 *        ---------------------------------------------------------------------
 * 
 */
public class Collection_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
