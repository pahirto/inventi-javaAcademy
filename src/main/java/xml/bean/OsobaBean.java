package xml.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="Osoba")
@XmlType(propOrder={"id", "name"})
public class OsobaBean {

	private Integer id;
	private String name;
	
	@XmlElement(name="Id")
	public Integer getId() {
		return id;
	}
	
	@XmlElement(name="Name")
	public String getName() {
		return name;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
