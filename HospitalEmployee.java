
public class HospitalEmployee {
	
	

	protected String name;
	protected int number;
	
	HospitalEmployee(){
	}
	
	HospitalEmployee(String name,int number) {
		
		this.name = name;
		this.number =  number;
	}
	
	// getter
	public String getName() { return name; }
	
	public int getNumber() { return number; }
	
	
	 
    // Method 1 - Setter
    public void setName(String name)
    {
 
        // This keyword refers to current instance itself
        this.name = name;
    }
    
 // Method 2 - Setter
    public void setNumber(int number)
    {
 
        // This keyword refers to current instance itself
        this.number = number;
    }
    
    
    // work function 
    public void work() {
    	System.out.println (name + " works for the hospital."); 
    	
    }
    
    
 // Creating our own toString() 	method
    public String toString()
    {
       return name + " " + number;
    }
    
    
}
