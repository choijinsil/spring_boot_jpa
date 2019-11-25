package com.siris.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.siris.api.model.entity.BoardEntity;
import com.siris.api.repository.support.BoardRepositorySupport;

public interface BoardRepository extends JpaRepository<BoardEntity, Long>, BoardRepositorySupport{
	//CRUD가 마쳐있는 상태
	
	//쿼리 메소드
	Optional<BoardEntity> findByNo(Long no);
	
	Integer deleteByNo(Long no);
}
