package com.example.prjpro2.mapper;

import com.example.prjpro2.dto.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MapperMember {

    @Select("""
                        INSERT INTO member
                        (id, password, nick_name)
            VALUES (#{id}, #{password}, #{nickName})
            """)
    void addMember(Member member);

    @Select("""
                        SELECT *
            FROM member
                    WHERE id = #{id} AND password = #{password}
            """)
    Member getIdAndPassword(String id, String password);
}
