package edu.bit.mythymeleaf.vo;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class BoardVO {

    private int bid;
    private String bname;
    private String btitle;
    private String bcontent;
    private Timestamp bdate;
    private int bhit;
    private int bgroup;
    private int bstep;
    private int bindent;

}
