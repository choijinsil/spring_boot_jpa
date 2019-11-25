package com.siris.api.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.siris.api.model.bean.BoardBean;
import com.siris.api.model.entity.BoardEntity;
import com.siris.api.repository.BoardRepository;
import com.siris.api.service.BoardService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/board")
public class BoardController {

	//sweager는
	//http://localhost:18888/swagger-ui.html로 접속을 한다.

	private final BoardService boardService;

	public BoardController(BoardService boardService) {
		this.boardService = boardService;
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
	
	@GetMapping("/getAllBoardDSL")
	@ApiOperation(value = "목록 조회 DSL")
	@ApiImplicitParams({
	    @ApiImplicitParam(name = "page", dataType = "integer", paramType = "query",
	            value = "Results page you want to retrieve (0..N)"),
	    @ApiImplicitParam(name = "size", dataType = "integer", paramType = "query",
	            value = "Number of records per page.")
	})  
	public ResponseEntity<List<BoardBean>> getAllBoardDSL(Pageable pageable) throws Exception {
		List<BoardBean> resultBean = new ArrayList<>();
		try {
			resultBean = boardService.getAllBoardDSL(pageable);
			if(resultBean.isEmpty()) {
				return new ResponseEntity<List<BoardBean>>(HttpStatus.NO_CONTENT);
			}
		} catch(Exception e) {
			e.printStackTrace();
			throw new Exception("getAllBoardDSL(Pageable) Exception");
		}
		return new ResponseEntity<List<BoardBean>>(resultBean, HttpStatus.OK);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
