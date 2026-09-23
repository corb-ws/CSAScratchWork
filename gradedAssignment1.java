import java.util.Scanner;

public class gradedAssignment1 {
   public static void main(String[] args) {
      String className = "Physics";
      int assignments = 11;
      double gradePoints = 1043.0;
      boolean hasA = true;
      System.out.println("What class are you in");
      Scanner scan = new Scanner(System.in);
      className = scan.nextLine();
      System.out.println("In " + className + " you have a grade of " + (gradePoints/assignments));
      System.out.println("Do you have an A? " + hasA);
   }
}