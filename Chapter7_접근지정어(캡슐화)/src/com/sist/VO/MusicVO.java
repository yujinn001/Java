package com.sist.VO;
//데이터형 => 캡슐화 코딩 => 읽기/쓰기 (사용자정의타입)
// VO => valueObject (값만 제어하는 클래스 => 변수지정)
// 0|That That (Prod. & Feat. SUGA of BTS)|싸이 (Psy)|싸다9|8dJyRm2jJ-U
// 1개에 대한 데이터 묶어서 관리 ===> new (새로운메모리를 만들어서 저장)
//         --------------- 노출금지(데이터를 은닉화 ==> 필요시에 사용이 가능하게 만든다)
public class MusicVO {
	private int mno;
	private String title;
	private String singer;
	private String album;
	private String key;
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	

}
