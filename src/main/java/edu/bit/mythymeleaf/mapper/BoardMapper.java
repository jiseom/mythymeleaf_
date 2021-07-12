package edu.bit.mythymeleaf.mapper;

import edu.bit.mythymeleaf.vo.BoardVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    public List<BoardVO> getList();
}
