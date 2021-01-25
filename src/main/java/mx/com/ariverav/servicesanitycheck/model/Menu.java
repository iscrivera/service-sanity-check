package mx.com.ariverav.servicesanitycheck.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
public class Menu {

	private String name;
	private List<String> submenu;

}
