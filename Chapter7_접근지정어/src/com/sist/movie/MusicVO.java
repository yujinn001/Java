package com.sist.movie;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
// 변수 은닉화 => 데이터를 보호 (해킹, 변질) ==> 메모리에 없다고 가장 (private)
// 다른클래스에서 사용이 부가 ==> 변수의 기능만 첨부 (읽기/쓰기) 읽기 :getXXXX(), 쓰기 : setXXX()
//                                                             getter     /  setter
// ============> Mybatis/ Spring ==> setter 
public class MusicVO {
	@Getter
	@Setter
	private int mno;
	private String title;
	private String singer;
	private String album;
	private String state;
	private int crement;

}
