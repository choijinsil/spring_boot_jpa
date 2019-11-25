package com.siris.api.controller;

import com.siris.api.model.entity.BoardEntity;
import com.siris.api.service.BoardService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/test")
public class TestController {

    private final BoardService boardService;

    public TestController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping("/test")
    public String test(){
        System.out.println("여기 hello들어왔어요");
        return "test";
    }

//    @PostMapping("/save")
//    public BoardEntity save(BoardEntity entity, Model m) {
//        m.addAttribute("list",)
//        boardService.save(entity);
//        return "";
//    }

    @GetMapping("/findAll")
    public String findAll(Model m) {
        m.addAttribute("userList",boardService.findAll());
        return "hello";
    }

//    @GetMapping("/findByNo")
//    public BoardEntity findByNo(Long no) {
//
//        return boardService.findByNo(no);
//    }
//
//    @DeleteMapping("/deleteByNo")
//    public Integer deleteByNo(Long no) {
//        return boardService.deleteByNo(no);
//    }
}
