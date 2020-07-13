package com.herbmall.comment.model;

import java.sql.SQLException;
import java.util.List;

public class CommentService {
	private CommentDAO commentDao;
	
	public CommentService() {
		commentDao = new CommentDAO();
	}
	
	public int uploadComment(CommentVO vo) throws SQLException {
		return commentDao.uploadComment(vo);
	}
	
	public List<CommentVO> showComment() throws SQLException{
		return commentDao.showComment();
	}
}
