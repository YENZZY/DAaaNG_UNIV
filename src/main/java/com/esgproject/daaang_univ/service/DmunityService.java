package com.esgproject.daaang_univ.service;

import com.esgproject.daaang_univ.dto.DmunityDTO;

import java.util.List;

public interface DmunityService {
    List<DmunityDTO> getDmunity(Integer pageNo, Integer dmunityCategory);
    DmunityDTO getDmunityById(Integer dmunityNo);
    void writeDmunity(DmunityDTO dmunityDTO);
    void editDmunity(Integer dmunityNo, DmunityDTO updatedPost);

    void deleteDmunity(Integer dmunityNo);

    Integer getTotalPageCount(Integer category);
}
