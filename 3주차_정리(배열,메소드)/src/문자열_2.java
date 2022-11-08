
public class 문자열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data ="버석으로 관자 느낌 내는 방법! 새송이간장버섯간장버터구이 만들기";
		if(data.length()>17)
		{
			data=data.substring(0,17)+"...";
		}
		System.out.println(data);
		
		String address ="서울특별시 동대문구 전농로23길 78 1F 지번 서울시 동대문구 전농동 221-8 1F";
		// 지번, 도로주소 자르기
		String add1=address.substring(0,address.lastIndexOf("지")).trim();
		// 공백제거를 위해 trim (1F와 지번 사이의 공백)
		System.out.println(add1);
		String addr2 =address.substring(address.indexOf("지")+3);
		System.out.println(addr2);
	}

}
