package com.siris.api.service.Impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.siris.api.model.entity.BoardEntity;
import com.siris.api.repository.BoardRepository;
import com.siris.api.service.BoardService;

@Service
public class BoardServiceImpl implements BoardService {

	// Autowried 사용하지 말고 아래 방식으로 사용하기
	private final BoardRepository boardRepository;

	public BoardServiceImpl(BoardRepository boardRepository) {
		this.boardRepository = boardRepository;
	}

	public void test() {
	
	}

	@Override
	public BoardEntity save(BoardEntity entity) {
		return boardRepository.save(entity);
	}

	@Override
	public List<BoardEntity> findAll() {
		return boardRepository.findAll();
	}

	@Override
	public BoardEntity findByNo(Long no) {
		return boardRepository.findByNo(no).orElseGet(BoardEntity::new);// null이라면 BoardEntity객체 새로 생성
		// BoardEntity::new == new BoardEntity
	}

	@Override
	public Integer deleteByNo(Long no) {
		return boardRepository.deleteByNo(no);
	}
}
