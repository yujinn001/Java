/*
 *   날짜 / 시간 (10장)
 *   
 *  ***  Date  ==> 저장용 (현재 시스템의 날짜 시간을 읽어 온다) => 오라클 => 기능이 거의 없다
 *  ***  Calendar ==> Date 클래스 확장 => 제어가 쉽게 만들어 준 클래스(추상클래스)
 *       --------
 *        1) 생성 : Calendar cal =Calendar.getInstance()
 *        2) 읽기 : cal.get(Calendar.YEAR)
 *                cal.get(Calendar.MONTH)
 *                cal.get(Calendar.DATE)
 *                cal.get(Calendar.DATE_OF_WEEK)
 *        3) 쓰기        
 *                cal.set(Calendar.YEAR,2022)
 *                cal.set(Calendar.MONTH,11-1) // 0~11
 *                cal.set(Calendar.DATE,22)
 *            *** cal.getActualMaximum(Calendar.DATE) ==> 설정된 달의 마지막 날짜 
 *       
 *  ***  SimpleDateFormat ==> Date를 변환해서 출력
 *          년도 : yyyy
 *          월 : MM, M
 *          일 : dd, d
 *          시간 : hh
 *          분 : mm,m
 *          초 : ss,s
 *       
 *  ***  DecimalFormat : 숫자 변환 ==> 1,000 ==> ###,###
 *       	DecimalFormat df = new DecimalFormath("#,###,###") -> 안에 형식을 넣는다
 *       	System.out.println(df.format(123456798)) ==> 12,345,678 => 쇼핑몰 상품, 예약
 *   	
 *       MessageFormat : 데이터베이스 : 출력형식을 만든다
 *          String pattern ="{0},{1},{2}...";
 *          Object[] obj ={};
 *          MessageFormat.format(pattern,obj)
 *          
 *   *** LocalDate : 날짜
 *       	LocalDate.now() : 현재 날짜 
 *       	LocalTime.of(년, 월, 일) : 날짜 설정
 *       
 *   	 LocalTime : 시간
 *   		LocalTime.now() : 현재 시간
 *   		LocalTime.of(시간, 분, 초) : 시간 설정
 *   
 *   *** LocaslDateTime : 날짜
 *     		LocalDate+LocalTime
 *     
 *     =============> isAfter(), isBefor(), isEqual()
 *     =============> between(기간)
 *     
 *   
 */
public class Chapter10_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}














