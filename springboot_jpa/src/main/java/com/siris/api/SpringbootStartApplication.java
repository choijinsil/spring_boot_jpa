package com.siris.api;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.siris.api.model.entity.BoardEntity;
import com.siris.api.repository.BoardRepository;
import com.siris.api.service.BoardService;

@SpringBootApplication
public class SpringbootStartApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootStartApplication.class, args);
	}
	
	@Autowired
	BoardRepository boardRepository;
	
	@Bean
	public void sampleInit() {
		System.out.println("스프링이 실행될 때 실행됨.");
		BoardEntity boardEntity1 = new BoardEntity(1l , "test1", "test1111", new Date(), "siri1");
		BoardEntity boardEntity2 = new BoardEntity(2l , "test2", "test2222", new Date(), "siri2");
		BoardEntity boardEntity3 = new BoardEntity(3l , "test3", "test3333", new Date(), "siri3");
		BoardEntity boardEntity4 = new BoardEntity(4l , "test4", "test4444", new Date(), "siri4");
		List<BoardEntity> list = new ArrayList();
		list.add(boardEntity1);
		list.add(boardEntity2);
		list.add(boardEntity3);
		list.add(boardEntity4);
		boardRepository.saveAll(list);
		
		
	}

}
