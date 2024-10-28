package com.example.prjpro2.mapper;

import com.example.prjpro2.dto.Board;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MapperBoard {

    @Select("""
                    SELECT *
                    FROM board
            """)
    List<Board> pageList();
}
