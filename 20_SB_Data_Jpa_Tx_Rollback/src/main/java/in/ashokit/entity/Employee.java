package in.ashokit.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "EMP_TBL")
public class Employee {

	/*
	 * public Employee() {
	 * 
	 * } public Employee(Integer empId,String empName,Double empsal) { this.empId =
	 * empId; this.empName = empName; this.empsal = empsal; }
	 */	
	@Id
	@Column(name = "EMP_ID")
	private Integer empId;
	
	@Column(name = "EMP_NAME")
	private String empName;
	
	@Column(name = "EMP_SAL")
	private Double empsal;
}
