package com.tam.wold;

import javax.persistence.*;

@Entity
@Table(name="dept")
public class Department {
@Id @GeneratedValue
private String deptId;
@Column(name="dept_name")
private String deptname;
public Department() {}
public Department(String deptname) {
	super();
	this.deptname = deptname;
}
public String getDeptId() {
	return deptId;
}
public void setDeptId(String deptId) {
	this.deptId = deptId;
}
public String getDeptname() {
	return deptname;
}
public void setDeptname(String deptname) {
	this.deptname = deptname;
}
@Override
public String toString() {
	return "Department [deptId=" + deptId + ", deptname=" + deptname + "]";
}

}
