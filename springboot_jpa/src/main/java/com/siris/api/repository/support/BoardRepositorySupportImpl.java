package com.siris.api.repository.support;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.support.QuerydslRepositorySupport;

import com.querydsl.core.QueryResults;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.JPQLQuery;
import com.querydsl.jpa.impl.JPAQuery;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.siris.api.model.bean.BoardBean;
import com.siris.api.model.entity.BoardEntity;
import com.siris.api.model.entity.QBoardEntity;

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

public class BoardRepositorySupportImpl extends QuerydslRepositorySupport implements BoardRepositorySupport {
	
	@PersistenceContext
	private EntityManager em;
	
	private final JPAQueryFactory queryFactory;
	
	private QBoardEntity boardEntity;

	public BoardRepositorySupportImpl(JPAQueryFactory queryFactory) {		
		super(BoardRepositorySupportImpl.class);
		this.queryFactory = queryFactory;
		boardEntity = new QBoardEntity("b");
	}

	@Override
	public Page<BoardBean> getAllBoardDSL(Pageable pageable) {
		QueryResults<BoardBean> query = 
			queryFactory
						.select(Projections.bean(BoardBean.class
								, boardEntity.no.as("no")
								, boardEntity.title.as("title")
								, boardEntity.content.as("content")
								, boardEntity.title.as("title_content")
								)
							)
						.from(boardEntity)
						.offset(pageable.getOffset())
						.limit(pageable.getPageSize())
						.fetchResults();
		return new PageImpl<>(query.getResults(), pageable, query.getTotal());
	}
	
	
	
	
	
	
	
	

}
