package com.siris.api.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.siris.api.model.bean.BoardBean;
import com.siris.api.model.entity.BoardEntity;

public interface BoardService {
	
	public BoardEntity save(BoardEntity entity);
	
	public List<BoardEntity> findAll();
	
	public BoardEntity findByNo(Long no);

	public Integer deleteByNo(Long no);
	
	public List<BoardBean> getAllBoardDSL(Pageable pageable);
}
