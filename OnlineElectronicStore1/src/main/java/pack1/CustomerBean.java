package pack1;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CustomerBean implements Serializable
{
private String cname;
private String pwd;
private String fname;
private String lname;
private String addr;
private String mid;
private String phn;
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
public String getFname() {
	return fname;
}
public void setFname(String fname) {
	this.fname = fname;
}
public String getLname() {
	return lname;
}
public void setLname(String lname) {
	this.lname = lname;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public String getMid() {
	return mid;
}
public void setMid(String mid) {
	this.mid = mid;
}
public String getPhn() {
	return phn;
}
public void setPhn(String phn) {
	this.phn = phn;
}
public CustomerBean ()
{
	
}
}
