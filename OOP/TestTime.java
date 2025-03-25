 /**
  * A Test Driver for the Time class
  */
  public class TestTime {
    public static void main(String[] args) {
       // Case 1: valid input
       //int hour = 23, minute = 58, second = 58;
       // Case 2: invalid input
       int hour = 24, minute = 58, second = 58;
       Time t12;
 
       //t12 = new Time(second, minute, hour);
       // Without try-catch, the program will terminate abruptly if exception thrown
 
       try {
          t12 = new Time(second, minute, hour);
          // If input is invalid, throw exception. Skip the rest, goto "catch".
          // Else complete "try", skip "catch"
          System.out.println("valid input");
       } catch (IllegalArgumentException ex) {
          // You have the opportunity to do something to recover from the error.
          ex.printStackTrace();  // print error messages
          System.out.println("Error in input. Set to default value");
          // You should ask the user to provide the valid input instead!
          t12 = new Time();
       }
 
       System.out.println("Time is " + t12);
       System.out.println("Life goes on...");
 
       // Case 1 output
       //valid input
       //Time is 23:58:58
       //Life goes on...
 
       // Case 2 output
       //java.lang.IllegalArgumentException: invalid hour
       //Error in input. Set to default value
       //Time is 00:00:00
       //Life goes on...
    }
 }