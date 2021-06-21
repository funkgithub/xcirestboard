package net.developia.board.dto;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.Length;

import lombok.Data;

@Data
public class MemoDTO implements Serializable {
	
	@Length(min = 2, max = 6)
	private String name;
	
	@NotBlank
	private String title;
	
	@Length(min = 2)
	private String passwd;
	
	@Length(min = 1, max = 1000)
	private String content;
}
