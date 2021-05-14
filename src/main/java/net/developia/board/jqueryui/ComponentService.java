package net.developia.board.jqueryui;

import java.util.List;

public interface ComponentService {

	List<ItemVO> getWords(String term) throws Exception;

}
