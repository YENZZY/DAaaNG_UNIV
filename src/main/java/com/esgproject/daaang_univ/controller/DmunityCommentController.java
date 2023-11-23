package com.esgproject.daaang_univ.controller;

import com.esgproject.daaang_univ.dto.DmunityCommentsDTO;
import com.esgproject.daaang_univ.service.DmunityCommentsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/dmunityComments")
@CrossOrigin("*")
public class DmunityCommentController {
    private final DmunityCommentsService service;

    @GetMapping("/{dmunityNo}")
    public ResponseEntity<List<DmunityCommentsDTO>> getCommentsById(@PathVariable Integer dmunityNo) {
        List<DmunityCommentsDTO> dmunityComments = service.getCommentsById(dmunityNo);
        return ResponseEntity.ok(dmunityComments);
    }
    @PostMapping("/writeComment")
    public ResponseEntity<DmunityCommentsDTO> postComment(@RequestBody DmunityCommentsDTO dmunityCommentsDTO) {
        return ResponseEntity.ok(service.postComment(dmunityCommentsDTO));
    }
}
