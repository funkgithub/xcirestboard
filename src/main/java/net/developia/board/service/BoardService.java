package net.developia.board.service;

import java.util.List;

import net.developia.board.dto.ArticleDTO;
import net.developia.board.dto.BoardDTO;

public interface BoardService {

	List<BoardDTO> getBoardList() throws Exception;

	void insertBoard(BoardDTO boardDTO) throws Exception;

	void insertArticle(ArticleDTO articleDTO) throws Exception;

	BoardDTO getBoard(int boa_no) throws Exception;

	List<ArticleDTO> getArticleList(int boa_no) throws Exception;

}
