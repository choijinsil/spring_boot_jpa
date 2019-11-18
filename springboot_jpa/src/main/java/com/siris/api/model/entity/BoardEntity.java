package com.siris.api.model.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "board")
public class BoardEntity implements Serializable {

	// 직렬화 
	private static final long serialVersionUID = 1L;

	@Id
	private Long no;
	private String title;
	private String content;

	@Column(name = "write_date")
	private Date writeDate;//자바스럽게 코딩하고 실제 DB에 입력되는 컬럼명은 스네이크 표기법으로 @Column을 준다.

	private String writer;

}
