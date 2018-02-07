package Lab2Pkg;


public class Calendar {

    // TODO: declare and initialize a static variable to track last ID assigned
    private static int nextId = 0;
    // TODO: ensure that encapsulation is not violated.
    //       Add appropriate visibility modifiers.
    private Person person;
    private String calendarName, description;

    private int id;

    // Constructor #1 - creates a new object with no values initialized
    public Calendar(){
        this.id = person.getNextId();
    }

    // Constructor #2 - creates a new object with all attributes initialized
    // with parameter values
    public Calendar(String personName, String calendarName, String description,
                    String address, String telephoneNumber){

        this.person = new Person(personName, address, telephoneNumber);
        this.calendarName = calendarName;
        this.description = description;

        this.id = getNextId() ;
        this.id = getId();

    }

    // TODO: implement getNextID() method
    public static int getNextId(){
  
  
      return nextId++;
        
    }
    // TODO: implement getId() method
      
    // TODO: implement other necessary accessors and modifiers for the class

    /**
     * Returns a string representation of the object for user output.
     * Overrides default toString method in the Object class and presents a
     * string representation as deifined
     *
     * @return a string representation of the object.
     */
    public String toString(){
        String output = "*************************************************************************\n"+
                "************" + person.getName() + " Calendar*************\n" +
                "*********************************************************************\n"+
                "Calendar Name: " + calendarName+ "\n" +
                "Description:   " + description+ "\n" +
                "Address:       " + person.getAddress()+ "\n" +
                "Telephone:     " + person.getTelephone()+ "\n" +
                "ID :           " + id + "\n" +
                "*********************************************************************\n";

        return output;
    }
	public String getCalendarName(){
    	return calendarName;
    }
    public String getDescription(){
    	return description;
    }
    public void initalizetId(){
    	id = 0;
		
    }
    public int getId(){
    	return id;
    }
    public void setCalendarName(String calnm){
    	this.calendarName = calnm;
    }
    
}
