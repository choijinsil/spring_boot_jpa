package com.siris.api.repository.support;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.siris.api.model.bean.BoardBean;
import com.siris.api.model.entity.BoardEntity;

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

public interface BoardRepositorySupport {
	
	Page<BoardBean> getAllBoardDSL(Pageable pageable);

}
