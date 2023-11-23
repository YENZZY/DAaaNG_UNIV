package com.esgproject.daaang_univ.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
public class DmunityCommentsDTO {
    private Integer dmunityCommentNo;
    private Integer dmunityNo;
    private String userid;
    private String dmunityCommentText;
    private Timestamp dmunityCommentDate;
    private Integer dmunityReplyNo;
    private Timestamp dmunityCommentEditDate;
}