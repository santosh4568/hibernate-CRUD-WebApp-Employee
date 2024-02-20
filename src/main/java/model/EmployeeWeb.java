package model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmployeeWeb {
	private String nameString;
	@Id
	private int idString;
	private String deptString;
	public EmployeeWeb() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNameString() {
		return nameString;
	}
	public void setNameString(String nameString) {
		this.nameString = nameString;
	}
	public int getIdString() {
		return idString;
	}
	public void setIdString(int idString) {
		this.idString = idString;
	}
	public String getDeptString() {
		return deptString;
	}
	public void setDeptString(String deptString) {
		this.deptString = deptString;
	}
	public EmployeeWeb(String nameString, int idString, String deptString) {
		super();
		this.nameString = nameString;
		this.idString = idString;
		this.deptString = deptString;
	}
}
