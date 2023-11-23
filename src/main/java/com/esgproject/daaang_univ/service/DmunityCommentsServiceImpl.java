package com.esgproject.daaang_univ.service;

import com.esgproject.daaang_univ.dao.DmunityCommentsDAO;
import com.esgproject.daaang_univ.dto.DmunityCommentsDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Primary
@Service
public class DmunityCommentsServiceImpl implements DmunityCommentsService{
    private final DmunityCommentsDAO dao;

    @Override
    public List<DmunityCommentsDTO> getCommentsById(Integer dmunityNo) {
        return dao.findCommentById(dmunityNo);
    }
    @Override
    public DmunityCommentsDTO postComment(DmunityCommentsDTO dmunityCommentsDTO) {
        return dao.writeComment(dmunityCommentsDTO);
    }
}