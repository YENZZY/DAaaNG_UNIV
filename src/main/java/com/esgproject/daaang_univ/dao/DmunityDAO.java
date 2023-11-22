package com.esgproject.daaang_univ.dao;

import com.esgproject.daaang_univ.dto.DmunityDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface DmunityDAO {
    List<DmunityDTO> findDmunity(Integer pageNo);
    DmunityDTO findDmunityById(Integer dmunityNo);
    void writeDmunity(DmunityDTO dmunityDTO);
    void editDmunity(DmunityDTO dmunityDTO);
    void deleteDmunity(Integer dmunityNo);
    Integer getTotalPageCount();
}
