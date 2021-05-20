package net.developia.board.dao;

import java.sql.SQLException;
import java.util.List;

import net.developia.board.dto.ArticleDTO;
import net.developia.board.dto.BoardDTO;
import net.developia.board.dto.CommentDTO;

public interface BoardDAO {

	List<BoardDTO> getBoardList() throws SQLException;

	void insertBoard(BoardDTO boardDTO) throws SQLException;

	void insertArticle(ArticleDTO articleDTO) throws SQLException;

	BoardDTO getBoard(int boa_no) throws SQLException;

	List<ArticleDTO> getArticleList(int boa_no) throws SQLException;

	ArticleDTO getDetail(long art_no) throws SQLException;

	int deleteArticle(ArticleDTO articleDTO) throws SQLException;

	int updateArticle(ArticleDTO articleDTO) throws SQLException;

	void insertComment(CommentDTO commentDTO) throws SQLException;
	List<CommentDTO> getCommentList(CommentDTO commentDTO) throws SQLException;
	void deleteComment(CommentDTO commentDTO) throws SQLException;
	int updateComment(CommentDTO commentDTO) throws SQLException;


}
