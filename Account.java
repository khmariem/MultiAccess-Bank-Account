
public class Account {
	private double solde;
	private String name;
	private boolean access=false;
	
	public Account(String name,double solde){
		this.name=name;
		this.solde=solde;
	}
	
	synchronized void addMoney(double sum,Person p) throws InterruptedException{
		while(access){wait();}
		access=true;
		this.solde+=sum;
		System.out.println(solde+" after the intervention of person"+p.getIdentity());
		access=false;
		notifyAll();
	}
	
	synchronized void withdrawMoney(double sum,Person p) throws InterruptedException{
		while(access){wait();}
		access=true;
		if(this.solde>sum){
			this.solde-=sum;
			System.out.println(solde+" after the intervention of person"+p.getIdentity());
		}else{
			System.out.println("the transaction is rejected");
		}
		access=false;
		notifyAll();
	}

}
