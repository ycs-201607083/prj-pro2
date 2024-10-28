package com.example.prjpro2.service;

import com.example.prjpro2.dto.Board;
import com.example.prjpro2.mapper.MapperBoard;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class ServiceBoard {
    private final MapperBoard mapperBoard;

    public List<Board> list() {
        return mapperBoard.pageList();
    }
}
