package cse360assignment02;

public class AddingMachine {
	
	
  private int total;
  private String transactions;

  
	
  /**
   * This is a constructor AddingMachine for this class. 
   */
  public AddingMachine () {
    total = 0; // not needed - included for clarity
    transactions= " ";
  }
  
  
  /**
   * This is used to get the total value
   * @return 0 
   */
  
  public int getTotal () {
    return total;
    
  }
  
  
  /**
   * This is used to add values 
   * @param value used to add 
   */
  
  public void add (int value) {
	  total +=value;
	  transactions += " + " + value;
  }

  /**
   * This is used to subtract the values
   * @param value used to subtract
   */
  
  public void subtract (int value) {
	  total -=value;
	  transactions += " - " + value;
  }
  
  /**
   * This is used to return a string object
   */
  
  public String toString () {
    return transactions;
  }

  /**
   * This is used to clear the memory. 
   */
  
  public void clear() {
	  transactions ="0";
  }
}
