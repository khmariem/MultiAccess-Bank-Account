
public class Person extends Thread{
	private int id;
	private Account account;
	
	public Person(int id,Account account){
		this.id = id;
		this.account = account;
	}
	
	public void run(){
		try{
			
			if(id%2==0){
				
				while(true){
					sleep(5000);
					account.addMoney(50,this);
					sleep(5000);
					account.withdrawMoney(150,this);
					sleep(5000);
	
				}
				
			}else{
				
				while(true){
					sleep(5000);
					account.withdrawMoney(100,this);
					sleep(5000);
					account.addMoney(50,this);
					sleep(5000);
				}
				
			}
				
		}catch (InterruptedException e){}
		
	}

	public int getIdentity() {
		return this.id;
	}

}
