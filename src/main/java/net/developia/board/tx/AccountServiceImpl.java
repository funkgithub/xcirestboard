package net.developia.board.tx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDAO accountDAO;

	@Override
	@Transactional
	public void transfer() throws Exception {
		try {
			//10만원 인출
			accountDAO.showdraw();
			if (true) throw new RuntimeException("천재지변발생!!!");
			//10만원 입금
			accountDAO.deposit();
		} catch (Exception e) {
			log.info(e.toString());
			throw e;
		}
	}
}
