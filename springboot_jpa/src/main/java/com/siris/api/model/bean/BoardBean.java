package com.siris.api.model.bean;

import java.io.Serializable;

import lombok.Data;

/**
 * 클래스에 대한 설명을 여기에 쓴다.
 * 
 * @author 	sjcNotBooki
 * @since 	2019. 11. 25.
 * @version 1.0
 * @see <pre>
 *  == 개정이력(Modification Information) ==
 *   
 *   수정일			수정자				수정내용
 *  ---------------------------------------------------------------------------------
 *   2019. 11. 25.		sjcNotBooki				최초생성
 * 
 * </pre>
 */
@Data
public class BoardBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long no;
	private String title;
	private String title_content;
	private String content;

}
