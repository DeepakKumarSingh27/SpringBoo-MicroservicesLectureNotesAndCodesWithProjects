package in.ashokit.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "EMP_ADD_TBL")
public class Address {

	@Id
	@Column(name = "ADD_ID")
	private Integer addrId;
	private String city;
	private String state;
	private String country;
     private Integer empId;
}
