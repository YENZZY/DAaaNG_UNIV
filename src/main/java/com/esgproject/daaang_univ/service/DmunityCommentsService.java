package com.esgproject.daaang_univ.service;

import com.esgproject.daaang_univ.dto.DmunityCommentsDTO;

import java.util.List;

public interface DmunityCommentsService {
    List<DmunityCommentsDTO> getCommentsById(Integer dmunityNo);

    DmunityCommentsDTO postComment(DmunityCommentsDTO dmunityCommentsDTO);

}
