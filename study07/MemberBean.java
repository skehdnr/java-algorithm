package study07;

public class MemberBean {
	private String name,id,pass,ssn,bt;
	private double height,weight;
	
	public void setName(String name) {
		this.name = name;
	}public String getName() {
		return this.name;
	}public void setId(String id) {
		this.id = id;
	}public String getId() {
		return this.id;
	}public void setPass(String pass) {
		this.pass = pass;
	}public String getPass() {
		return this.pass;
	}public void setSsn(String ssn) {
		this.ssn = ssn;
	}public String getSsn() {
		return this.ssn;
	}public void setBt(String bt) {
		this.bt = bt;
	}public String getBt() {
		return this.bt;
	}public void setHeight(double height) {
		this.height = height;
	}public double getHeight() {
		return this.height;
	}public void setWeight(double weight) {
		this.weight = weight;
	}public double getWeight() {
		return this.weight;
	}
	
	@Override
	public String toString() {
		return String.format("회원정보: \n"
				+ "이름 : %s \n"
				+ "아이디 : %s \n"
				+ "비번 : %s \n"
				+ "주민번호 : %s \n"
				+ "혈액형 : %s \n"
				+ "키 : %.1f \n"
				+ "몸무게 : %.1f \n",
				name, id, pass, ssn, bt,height, weight);
	}
		
}