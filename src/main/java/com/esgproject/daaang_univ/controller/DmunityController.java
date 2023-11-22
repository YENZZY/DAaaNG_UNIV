package com.esgproject.daaang_univ.controller;

import com.esgproject.daaang_univ.dto.DmunityDTO;
import com.esgproject.daaang_univ.service.DmunityService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dmunity")
@CrossOrigin("*")
public class DmunityController {

    private final DmunityService service;

    @GetMapping("/dmunityMainPage/{pageNo}")
    public ResponseEntity<List<DmunityDTO>> getAllDmunity(@PathVariable Integer pageNo) {
        List<DmunityDTO> allDmunities = service.getDmunity(pageNo);
        return new ResponseEntity<>(allDmunities, HttpStatus.OK);
    }
    @GetMapping("/{dmunityNo}")
    public  ResponseEntity<DmunityDTO> getDmunity(@PathVariable Integer dmunityNo) {
        DmunityDTO Dmunity = service.getDmunityById(dmunityNo);
        return ResponseEntity.ok(Dmunity);
    }
    @PostMapping("/dmunityWrite")
    public void writeDmunity(@RequestBody DmunityDTO dmunityDTO) {
        service.writeDmunity(dmunityDTO);
    }
    @PutMapping("/dmunityEdit/{dmunityNo}")
    public void EditDmunity(
            @PathVariable Integer dmunityNo,
            @RequestBody DmunityDTO updatedPost
    ) {
        service.editDmunity(dmunityNo, updatedPost);
    }
    @DeleteMapping("/{dmunityNo}/dmunityDelete")
    public void deleteDmunity(@PathVariable Integer dmunityNo) {
        service.deleteDmunity(dmunityNo);
    }
    @GetMapping("/totalPageCount")
    public Integer getTotalPageCount() {
        return service.getTotalPageCount();
    }
}
