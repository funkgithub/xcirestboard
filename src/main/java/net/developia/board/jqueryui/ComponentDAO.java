package net.developia.board.jqueryui;

import java.sql.SQLException;
import java.util.List;

public interface ComponentDAO {

	List<ItemVO> getWords(String term) throws SQLException;

}
