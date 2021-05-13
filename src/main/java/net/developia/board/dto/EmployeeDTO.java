package net.developia.board.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@XmlRootElement
public class EmployeeDTO implements Serializable {
	private String name;
	private String hobby;
	private int joinyear;
}
