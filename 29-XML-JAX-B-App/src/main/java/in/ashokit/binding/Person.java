package in.ashokit.binding;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorOrder;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

import lombok.Data;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlAccessorOrder
@Data
public class Person {
	private Integer id;

	private String name;

	@XmlTransient
	private Integer age;

	@XmlElement(name = "PhoneNumber")
	private Long phno;

	@XmlAttribute
	private String type;

	private Address address;
}
