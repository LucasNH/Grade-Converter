/*
FormCDCollection.java 
Created by: Lucas N-H
Created on: May 14, 2018
Last edited on: May 18, 2018
*/
package grade.converter;
import java.util.*;
public class GradeConverter {
    public static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int type; // was double type;         
	do
	{
	    System.out.println("MAIN MENU");
	    System.out.println("=========");
	    System.out.println("1. Convert to a Level grade");
	    System.out.println("2. Convert to a Letter grade");
	    System.out.println("3. Exit \n");
	    System.out.println("Please enter your selection: ");
	    type=sc.nextInt();
	    if (type==1) percentageToAlpha(); // was if (type!=1) percentageToAlpha();
	    if (type==2) percentageToLevel();
	}
	while (type != 3); // was while (type == 3);
    }
    // Conversion function percentage to Alpha
    public static void percentageToAlpha () {
	double grade;  
	String alphaGrade;
	System.out.println("Please enter the numeric grade: "); 
	grade=sc.nextInt();
	if (grade >= 0 && grade <= 49) alphaGrade="F"; // was if (grade > 50) {
	else if (grade >= 50 && grade <= 52) alphaGrade = "D-";
	else if (grade >= 53 && grade <= 56) alphaGrade = "D";
	else if (grade >= 57 && grade <= 59) alphaGrade = "D+";
	else if (grade >= 60 && grade <= 62) alphaGrade = "C-";
	else if (grade >= 63 && grade <= 66) alphaGrade = "C";
	else if (grade >= 67 && grade <= 69) alphaGrade = "C+";
	else if (grade >= 70 && grade <= 72) alphaGrade = "B-";
	else if (grade >= 73 && grade <= 76) alphaGrade = "B";
	else if (grade >= 77 && grade <= 79) alphaGrade = "B+";
	else if (grade >= 80 && grade <= 84) alphaGrade = "A-";
	else if (grade >= 85 && grade <= 89) alphaGrade = "A";
	else if (grade >= 90 && grade <= 100) alphaGrade = "A+";
	else alphaGrade = "Error - invalid mark, try again!";
	System.out.println(grade + "% = " + alphaGrade);
    }
    // Conversion function percentage to level
    public static void percentageToLevel () {
	int grade;
	String levelGrade; // was String levelGrade = "";
	System.out.println("Please enter the numeric grade: ");
	grade=sc.nextInt();
	if (grade >= 0 && grade <= 49) levelGrade="R"; // was if (grade < 50) {
	else if (grade >= 50 && grade <= 52) levelGrade="L1-";
	else if (grade >= 53 && grade <= 56) levelGrade="L1";
	else if (grade >= 57 && grade <= 59) levelGrade="L1+";
	else if (grade >= 60 && grade <= 62) levelGrade="L2-";
	else if (grade >= 63 && grade <= 66) levelGrade="L2"; // was grade > 63 && grade <= 66 
	else if (grade >= 67 && grade <= 69) levelGrade="L2+";
	else if (grade >= 70 && grade <= 72) levelGrade="L3-";
	else if (grade >= 73 && grade <= 76) levelGrade="L3"; // was levelGrade="L4";                
	else if (grade >= 77 && grade <= 79) levelGrade="L3+";
	else if (grade >= 80 && grade <= 84) levelGrade="L4-";
	else if (grade >= 85 && grade <= 89) levelGrade="L4";
	else if (grade >= 90 && grade <= 100) levelGrade="L4+";
	else levelGrade="Error - invalid mark, try again!"; // was }else if (grade>100) {
	System.out.println(grade + "% = " + levelGrade); // was System.out.println(grade + "% = " + grade);
    }
}
