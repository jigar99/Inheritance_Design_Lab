
public class Doctor extends HospitalEmployee {
   String specialty;
	
   Doctor(String name,int number,String specialty){
	   
	   super(name,number);
	   this.specialty = specialty;
   }
  
   
  public String toString()
   {
	  return name + " " + number + " " + specialty;
   }
   
   @Override
	public void work() {
   	System.out.println (name + " works for the hospital. " + name + " is a(n) " + specialty + " doctor."); 
   	
   }
   
}
