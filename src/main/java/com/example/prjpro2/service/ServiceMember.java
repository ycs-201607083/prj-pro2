package com.example.prjpro2.service;

import com.example.prjpro2.dto.Member;
import com.example.prjpro2.mapper.MapperMember;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional
public class ServiceMember {

    private final MapperMember mapperMember;

    public void addMember(Member member) {
        mapperMember.addMember(member);
    }

    public Member get(String id, String password) {
        return mapperMember.getIdAndPassword(id, password);
    }
}
