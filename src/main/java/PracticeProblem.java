/**
 * File Name: Problem Solving and Good Programming Style
 * Author: Tom Leung
 * Date Created: April 17, 2026
 * Date Last Edited: April 17, 2026
 */

public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(isValidName("J Doe"));
	}

	public static void q1() {
		//Write question 1 code here
	}

	public static void q2() {
		//Write question 2 code here
	}

	public static void q3() {
		//Write question 3 code here
	}

	public static void q4() {
		//Write question 4 code here
	}

	public static void q5() {
		//Write question 5 code here
	}

	public static String getFirstName (String s1){
		String s2 = s1.trim() ;
		String s3 = s2.substring(0,s2.indexOf(" "));
		return s3 ;
		}
	
	public static String getLastName (String s1){
		String s2 = s1.trim() ;
		String s3 = s2.substring(s2.lastIndexOf(" ")+1);
		return s3 ;
		}
	

	public static boolean isValidName (String s1){
		if (s1.length() < 1 || !s1.contains(" ") ){
			return false ;
		}
		String s2 = s1.trim() ;
		String s3 = s2.substring(0,s2.indexOf(" "));
		String s4 = s2.substring(s2.indexOf(" ")+1);
		return ( s3.length() > 1 && s4.length() > 1 && s2.indexOf(" ") == s2.lastIndexOf(" ")) ;

	}

}

