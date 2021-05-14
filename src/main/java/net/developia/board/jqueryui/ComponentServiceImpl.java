package net.developia.board.jqueryui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ComponentServiceImpl implements ComponentService {
	
	@Autowired
	private ComponentDAO componentDAO;
	
	@Override
	public List<ItemVO> getWords(String term) throws Exception {
		try {
			return componentDAO.getWords(term);
		} catch (Exception e) {
			log.info(e.getMessage());
			throw e;
		}
	}
}
