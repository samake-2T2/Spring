package com.coding404.command;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FreeBoardVO {

	private int bno;
	private String title;
	private String writer;
	private String content;
	// Timestamp - java.sql패키지
	private Timestamp regdate;
	private Timestamp updatedate;
	
}
