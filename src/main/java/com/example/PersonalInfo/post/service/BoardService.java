package com.example.PersonalInfo.post.service;

import com.example.PersonalInfo.post.dto.BoardDto;
import com.example.PersonalInfo.post.repository.BoardRepository;
import javax.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
    private final BoardRepository boardRepository;

    public BoardService(BoardRepository boardRepository){
        this.boardRepository = boardRepository;
    }

    @Transactional
    public Long savePost(BoardDto boardDto){
        return boardRepository.save(boardDto.toEntity()).getId();
    }
}
