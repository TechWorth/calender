
import Lab2Pkg.Calendar;
import java.util.ArrayList;
import java.util.Scanner;


public class EventManager {
    
    private final static String BORDER0 = "******************************************************";
    private final static String BORDER1 = "------------------------------------------------------";
    // both border0 and border1 are 54 characters wide

    public static void main(String[] args){
        //List to store calendars created
        ArrayList<Calendar> calendars = new ArrayList<Calendar>();

        //Menu printed out to the user once the program starts.
        System.out.println(BORDER0);
        System.out.println("          Welcome To the Lab 2 Event Manager");
        System.out.println(BORDER0 + "\n");

        /*
         * This variable is used by the main loop below to decide 
         * whether to present the user with the options menu or not.
         * The value is set to true by default to ensure that the program
         * continues to run until the user elects to quit
         */
        boolean running = true;

        /**
         * Declaration and initialization of scan variable
         * The scan variable below will reference a Scanner object
         *
         * The System.in stream is an input stream that collects data
         * from user input via the keyboard
         *
         * */
        Scanner scan;
        scan  =  new Scanner(System.in);

        // variable used to store the user input for use within our program
        String userSelection;

        while(running){
            System.out.println("Please Select from the following options");
            System.out.println("    Enter \"View\" to see existing Calendars");
            System.out.println("    Enter \"New\" to create a new Calendar");
            System.out.println("    Enter the calendar id to select a calendar");
            System.out.println("    Enter \"Q\" to exit the application");
            System.out.println(BORDER1 + "\n");

            //utilizing the scanner to accept the user input
            userSelection = scan.next();

            if(userSelection.equalsIgnoreCase("View")){
                //Shows all existing calendars
                //for-each loop implementation
                for(Calendar s: calendars){
                    System.out.print(s);
                    // automatically calls the toString() of the Calendar class
                }

            } else if(userSelection.equalsIgnoreCase("New")){
                Calendar calendar = createCalendar(); 
                // declare new calendar variable and assign new calendar object
                calendars.add(calendar); // add calendar to existing list

            } else if(userSelection.equalsIgnoreCase("Q")){
                running = false;

            } else {
            // anything else will be assumed to be an ID
                try {
                    // Trying to get a number version of the user entry.
                    int id = Integer.parseInt(userSelection);

                    // regular for loop implementation
                    for (int i = 0; i < calendars.size(); i++) {

                        if (calendars.get(i).getId() == id) {
                            // TODO:implement getId() method in calendar class
                            showCalendarMenu(calendars.get(id - 1));
                            // TODO: implement showCalendarMenu() method
                        }
                    }

                } catch (NumberFormatException e) {
                    System.out.println("Please ensure that a valid selection "
                                       + "or id is entered");
                } catch (IndexOutOfBoundsException e) {
                    System.out.println("Calendar does not exist");
                }
            }
        }
        System.out.println("Thank you and Good Day");
    }

    private static Calendar createCalendar() {

        String personName,calendarName, description, address, phoneNumber; 
        // TODO: declare variables to store values to be entered by the user
        Scanner scanner;
        // TODO: initialize new scanner object
		scanner =  new Scanner(System.in);

        System.out.println("Please enter the person's full name ");
        // TODO: Uncomment and fix-up the next line
        personName = scanner.nextLine(); 
        
        System.out.println("Please enter the name of the calendar: ");
        // TODO: Uncomment and fix-up the next line
        calendarName = scanner.nextLine();

        // TODO: ask user for remaining values needed to initialize
        //       constructor below
		System.out.println("Please enter the description: ");
        description = scanner.nextLine();
	
		System.out.println("Please enter the address: ");
        address = scanner.nextLine();
	
		System.out.println("Please enter the phone number: ");
        phoneNumber = scanner.nextLine();

        // TODO: change constructor call in the line above to use the one below
        Calendar calendar = new Calendar(personName,calendarName, description, address, phoneNumber);

        return calendar;

    }

    private static void showCalendarMenu(Calendar calendar) {


        System.out.println(BORDER0 + "\n");
        System.out.println();
        boolean running = true;

        Scanner scan = new Scanner(System.in);
        String userSelection;
        while(running){
            System.out.println("Please Select from the following options");
            System.out.println("    Enter \"View\" to see Calendar details");
            System.out.println("    Enter \"Edit\" to modify Calendar name");
            System.out.println("    Enter \"Q\" to go back to the Calendar menu");
            System.out.println(BORDER0);
            userSelection = scan.next();

            // TODO: implement code to accept user selection and run
            // appropriate code below
            
            if(userSelection.equalsIgnoreCase("View")){
                System.out.println(calendar);

            }else if(userSelection.equalsIgnoreCase("Edit")){
                editCalendar(calendar);

            }else if(userSelection.equalsIgnoreCase("Q")){
                running = false;
            }
            
        }

    }

    private static void editCalendar(Calendar calendar) {

        // TODO: initialize scanner object
		Scanner scan = new Scanner(System.in);
		String cal;

        // TODO: display current Calendar name
		System.out.println("Calendar name is " + calendar.getCalendarName());

        // TODO: ask user if they want to change name
		System.out.println("Do you want to change the calendar name?");
		

        // TODO: if they confirm, 
		cal= scan.next();
		if(cal.equalsIgnoreCase("Yes")){
        	 System.out.println("Enter updated calendar name");
        	 cal = scan.next();
        	 calendar.setCalendarName(cal);
         
        }

        // TODO: ask user to enter new Calendar name

        // TODO: update Calendar name with user entered name

        // TODO: else do nothing
    }
}
