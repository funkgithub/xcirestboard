package net.developia.board.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import net.developia.board.dao.UserDAO;
import net.developia.board.dto.UserDTO;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDAO userDAO;

	public UserDTO getUser(UserDTO userDTO) throws Exception {
		try {
			UserDTO userInfo = userDAO.getUser(userDTO);
			if (userInfo == null) {
				throw new RuntimeException("아이디 혹은 비밀번호가 틀립니다.");
			}
			return userInfo;
		} catch (Exception e) {
			log.info(e.getMessage());
			throw e;
		}
	}
}
