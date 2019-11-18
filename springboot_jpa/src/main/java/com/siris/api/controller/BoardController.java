package com.siris.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siris.api.model.entity.BoardEntity;
import com.siris.api.repository.BoardRepository;
import com.siris.api.service.BoardService;

@RestController
public class BoardController {
	
	//sweager는
	//http://localhost:18888/swagger-ui.html로 접속을 한다.

	private final BoardService boardService;
	
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}

	@GetMapping("/test")
	public String test() {
		return "test";
	}
	
	@PostMapping("/save")
	public BoardEntity save(BoardEntity entity) {
		return boardService.save(entity);
	}
	
	@GetMapping("/findAll")
	public List<BoardEntity> findAll() {
		return boardService.findAll();
	}
	
	@GetMapping("/findByNo")
	public BoardEntity findByNo(Long no) {
		return boardService.findByNo(no);
	}
	
	@DeleteMapping("/deleteByNo")
	public Integer deleteByNo(Long no) {
		return boardService.deleteByNo(no);
	}
	
}
