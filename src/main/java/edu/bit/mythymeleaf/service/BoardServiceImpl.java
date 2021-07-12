package edu.bit.mythymeleaf.service;

import edu.bit.mythymeleaf.mapper.BoardMapper;
import edu.bit.mythymeleaf.vo.BoardVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardServiceImpl implements BoardService{

    @Autowired
    private BoardMapper boardMapper;

    @Override
    public List<BoardVO> getList(){

        return boardMapper.getList();
    }



}
