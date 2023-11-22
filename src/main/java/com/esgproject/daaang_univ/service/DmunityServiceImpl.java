package com.esgproject.daaang_univ.service;

import com.esgproject.daaang_univ.dao.DmunityDAO;
import com.esgproject.daaang_univ.dto.DmunityDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;


@RequiredArgsConstructor
@Primary
@Service
public class DmunityServiceImpl implements DmunityService {

    private final DmunityDAO dao;

    @Override
    public List<DmunityDTO> getDmunity(Integer pageNo) {
        return dao.findDmunity(pageNo);
    }
    @Override
    public DmunityDTO getDmunityById(Integer dmunityNo) {
        return dao.findDmunityById(dmunityNo);
    }
    @Override
    public void writeDmunity(DmunityDTO dmunityDTO) {
        dao.writeDmunity(dmunityDTO);
    }
    @Override
    public void editDmunity(Integer dmunityNo, DmunityDTO updatedPost) {
        DmunityDTO post = dao.findDmunityById(dmunityNo);
        post.setDmunityTitle(updatedPost.getDmunityTitle());
        post.setDmunityText(updatedPost.getDmunityText());
        dao.editDmunity(post);
    }
    @Override
    public void deleteDmunity(Integer dmunityNo) {
        dao.deleteDmunity(dmunityNo);
    }
    @Override
    public Integer getTotalPageCount() {
        return dao.getTotalPageCount();
    }
}

