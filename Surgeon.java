
public class Surgeon extends HospitalEmployee{
	boolean operating;
	String specialty;
	
	
	Surgeon(String name,int number,String specialty,boolean operating){
		   
		   super(name,number);
		   this.specialty = specialty;
		   this.operating = operating;
	}
	
	public String toString()
	   {
		  return name + " " + number + " " + specialty + " Operationg: " + operating;
	   }

	@Override
	public void work() {
    	System.out.println (name + " works for the hospital. " + name + " is operating doctor."); 
    	
    }

}
