package learnjava;

class Myemployee{
	private int id;
	private String Name;
	private int sum;
	
	int getid() {
		return id;
	}
	
	String getName() {
		return Name;
	}
	
	void setid(int n) {
		id =n;
	}
	void setName(String Name) {
		this.Name = Name;
		
		
	}
	void setsum(int sum) {
		this.sum=sum;
	}
}



public class GetterandSetter_accessmodifier_prive_20 {
	public static void main(String[] args) {
		Myemployee person =new Myemployee();
		
//		person.id = 45;
//		person.Name = "Keshva";     //.....this will throw an error due to privete access modifier
		
		
		person.setName("Keshav");
		System.out.println(person.getName());
		
		person.setid(18);
		System.out.println(person.getid());
		
	}

}
