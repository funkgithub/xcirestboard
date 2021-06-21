package net.developia.board.anno_security;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class UserEntity {
    private String loginUserId;
    private String password;
}