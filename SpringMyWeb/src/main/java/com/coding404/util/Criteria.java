package com.coding404.util;

import lombok.Data;

@Data // getter, setter
public class Criteria {
	// 페이지 기준정보를 가지는 클래스
	private int pageNum; // 조회할 페이지 번호
	private int amount; // 페이지당 데이터 갯수
	
	private String searchType; // 검색 타입
	private String searchName; // 검색 키워드

	public Criteria() {
		this(1, 10);
	}
	
	public Criteria(int pageNum, int amount) {
		super();
		this.pageNum = pageNum;
		this.amount = amount;
	}
	
}
