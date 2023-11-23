package com.esgproject.daaang_univ.dao;

import com.esgproject.daaang_univ.dto.DmunityCommentsDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DmunityCommentsDAO {
    List<DmunityCommentsDTO> findCommentById(Integer dmunityNo);

    DmunityCommentsDTO writeComment(DmunityCommentsDTO dmunityCommentsDTO);
}