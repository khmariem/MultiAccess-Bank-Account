
public class Main {
	
	public static void main(String[] args){
		
		Account account = new Account("firstAccount",250);
		
		Person person1 = new Person(1,account);
		Person person2 = new Person(2,account);
		Person person3 = new Person(3,account);
		
		person1.start();
		person2.start();
		person3.start();
		
	}

}
