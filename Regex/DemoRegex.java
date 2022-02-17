package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoRegex {

	public static void main(String[] args) {
		Demoregex1();
		Demoregex2();
		Demoregex3();
		Demoregex4();
		Demoregex5();
		Demoregex6();
		Demoregex7();
		Demoregex8();
		Demoregex9();
		Demoregex10();
		Demoregex11();
		Demoregex12();
		Demoregex13();
		Demoregex14();
		Demoregex15();
		Demoregex16();
		Demoregex17();
		Demoregex18();
		Demoregex19();
		Demoregex20();

	}
	
	
	public static void Demoregex1() {
		System.out.println("DemoRegex 1.");
		String input = "ahmed is learning java";
		Pattern pat = Pattern.compile("Ahmed");
	    Matcher matcher = pat.matcher(input);
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }
	    System.out.println("-----------------------------------------");
	}
	
	
	public static void Demoregex2() {
		//not consider letters is capital or simple
		System.out.println("DemoRegex 2.");
		String input = "ahmed is learning java";
		Pattern pat = Pattern.compile("Ahmed",Pattern.CASE_INSENSITIVE);
	    Matcher matcher = pat.matcher(input);
	    boolean matchFound = matcher.find();
	    if(matchFound) {
	      System.out.println("Match found");
	    } else {
	      System.out.println("Match not found");
	    }
	    System.out.println("-----------------------------------------");
	}
	
	
	public static void Demoregex3() {
		//check all capital letters
		System.out.println("DemoRegex 3.");
		String input = "Abmushfiq@gmail.com";
		Pattern pat = Pattern.compile("[A-Z]");
		Matcher mat = pat.matcher(input);
		boolean matchFound = mat.find();
		while(matchFound) {
			System.out.println(mat.group());
			matchFound = mat.find();
		}
		
		
		 System.out.println("-----------------------------------------");
	}
	
	public static void Demoregex4() {
		// except all small letters
		System.out.println("DemoRegex 4.");
		String input = "Abmushfiq@gmail.com";
		Pattern pat = Pattern.compile("[^A-Z]");
		Matcher mat = pat.matcher(input);
		boolean matchFound = mat.find();
		while(matchFound) {
			System.out.print(mat.group());
			matchFound = mat.find();
		}
		System.out.println();
		
		
		 System.out.println("-----------------------------------------");
	}
	
	public static void Demoregex5() {
		//check all capital letters
		System.out.println("DemoRegex 5.");
		String input = "AbmushFiq@gmail.com";
		Pattern pat = Pattern.compile("[A-Z]");
		Matcher mat = pat.matcher(input);
		boolean matchFound = mat.find();
		while(matchFound) {
			System.out.print(mat.group());
			matchFound = mat.find();
		}
		System.out.println();
		
		
		 System.out.println("-----------------------------------------");
	}
	
	public static void Demoregex6() {
		//check all simple letters
		System.out.println("DemoRegex 6.");
		String input = "AbmushFiq@gmail.com";
		Pattern pat = Pattern.compile("[a-z]");
		Matcher mat = pat.matcher(input);
		boolean matchFound = mat.find();
		while(matchFound) {
			System.out.print(mat.group());
			matchFound = mat.find();
		}
		System.out.println();
		
		
		 System.out.println("-----------------------------------------");
	}
	
	
	public static void Demoregex7() {
		System.out.println("DemoRegex 7.");
		String input = "abmushfiq@gmail.com";
		Pattern pat = Pattern.compile("^abmushfiq");
		Matcher mat = pat.matcher(input);
		boolean matchFound = mat.find();
		while(matchFound) {
			System.out.print(mat.group());
			matchFound = mat.find();
		}
		System.out.println();
		
		
		 System.out.println("-----------------------------------------");
	}
	
	public static void Demoregex8() {
		System.out.println("DemoRegex 8.");
		//("^abmushfiq) sentence is in first or not 
		String input = "abmushfiq@gmail.com";
		Pattern pat = Pattern.compile("^abmushfiq");
		Matcher mat = pat.matcher(input);
		boolean matchFound = mat.find();
		while(matchFound) {
			System.out.print(mat.group());
			matchFound = mat.find();
		}
		System.out.println();
		
		
		 System.out.println("-----------------------------------------");
	}
	
	
	public static void Demoregex9() {
		System.out.println("DemoRegex 9.");
		//("com$) sentence is in first or not 
		String input = "abmushfiq@gmail.com";
		Pattern pat = Pattern.compile("com$");
		Matcher mat = pat.matcher(input);
		boolean matchFound = mat.find();
		while(matchFound) {
			System.out.print(mat.group());
			matchFound = mat.find();
		}
		System.out.println();
		
		
		 System.out.println("-----------------------------------------");
	}
	
	public static void Demoregex10() {
		System.out.println("DemoRegex 10.");
		//small letters and capital letters 
		String input = "Hi My email abmushfiq@gmail.com";
		Pattern pat = Pattern.compile("[a-zA-z]");
		Matcher mat = pat.matcher(input);
		boolean matchFound = mat.find();
		while(matchFound) {
			System.out.print(mat.group());
			matchFound = mat.find();
		}
		System.out.println();
		
		
		 System.out.println("-----------------------------------------");
	}
	
	
	public static void Demoregex11() {
		System.out.println("DemoRegex 11.");
		//small letters and capital letters 
		String input = "Hi My email abmushfiq@897343275";
		Pattern pat = Pattern.compile("[a-zA-z0-9]");
		Matcher mat = pat.matcher(input);
		boolean matchFound = mat.find();
		while(matchFound) {
			System.out.print(mat.group());
			matchFound = mat.find();
		}
		System.out.println();
		
		
		 System.out.println("-----------------------------------------");
	}
	
	public static void Demoregex12() {
		System.out.println("DemoRegex 12.");
		// [^a-zA-z0-9] print special characters and space 
		String input = "Hi My email abmushfiq@897343275.com";
		Pattern pat = Pattern.compile("[^a-zA-z0-9]");
		Matcher mat = pat.matcher(input);
		boolean matchFound = mat.find();
		while(matchFound) {
			System.out.print(mat.group());
			matchFound = mat.find();
		}
		System.out.println();
		
		
		 System.out.println("-----------------------------------------");
	}
	
	public static void Demoregex13() {
		System.out.println("DemoRegex 13.");
		// "[A-Za-z&&[^a]]" particularly remove "a" only
		String input = "aHi My email abmushfiq@897343275.com";
		Pattern pat = Pattern.compile("[a-zA-z&&[^a]]");
		Matcher mat = pat.matcher(input);
		boolean matchFound = mat.find();
		while(matchFound) {
			System.out.print(mat.group());
			matchFound = mat.find();
		}
		System.out.println();
		
		
		 System.out.println("-----------------------------------------");
	}
	
	
	public static void Demoregex14() {
		System.out.println("DemoRegex 14.");
		// "[A-Za-z&&[^a]]" particularly remove "a" only
		String input = "aHi My email abmushfiq@897343275.com";
		Pattern pat = Pattern.compile("[a-z&&[iam]]");
		Matcher mat = pat.matcher(input);
		boolean matchFound = mat.find();
		while(matchFound) {
			System.out.print(mat.group());
			matchFound = mat.find();
		}
		System.out.println();
		
		
		 System.out.println("-----------------------------------------");
	}
	
	
	// Numbers
	
	public static void Demoregex15() {
		System.out.println("DemoRegex 15.");
		// printing numbers () - must want number type, [] - witch type, {} - how many times
		String input = "My mobile number is : 94776387364";
		Pattern pat = Pattern.compile("(94)[0-9]{9}");
		Matcher mat = pat.matcher(input);
		boolean matchFound = mat.find();
		while(matchFound) {
			System.out.print(mat.group());
			matchFound = mat.find();
		}
		System.out.println();
		
		
		 System.out.println("-----------------------------------------");
	}
	
	
	public static void Demoregex16() {
		System.out.println("DemoRegex 16.");
		// printing numbers () - must want number type, [] - witch type, {} - how many times, ? - not neccessary that element 
		String input1 = "My mobile number is : 0776387364";
		String input2 = "My mobile number is : 94776387364";
		String input3 = "My mobile number is : 776387364";
		
		Pattern pat = Pattern.compile("(0|94)?[0-9]{9}");
		Matcher mat = pat.matcher(input3);
		boolean matchFound = mat.find();
		while(matchFound) {
			System.out.print(mat.group());
			matchFound = mat.find();
		}
		System.out.println();
		
		
		 System.out.println("-----------------------------------------");
	}
	
	public static void Demoregex17() {
		System.out.println("DemoRegex 17.");
		// a+ atleast one match
		String input = "ababbaabbabab";
		Pattern pat = Pattern.compile("a+");
		Matcher mat = pat.matcher(input);
		boolean matchFound = mat.find();
		while(matchFound) {
			System.out.println(mat.group()+"Position at: "+mat.start()+" ");
			matchFound = mat.find();
		}
		System.out.println();
		
		
		 System.out.println("-----------------------------------------");
	}
	
	
	public static void Demoregex18() {
		System.out.println("DemoRegex 18.");
		 //metacharacters
		String input = "hi i am 123 from srilanka code blog something";
		Pattern pat = Pattern.compile("\\s");
		Matcher mat = pat.matcher(input);
		boolean matchFound = mat.find();
		while(matchFound) {
			System.out.println(mat.group()+"Position at: "+mat.start()+" ");
			matchFound = mat.find();
		}
		System.out.println();
		
		
		 //metacharacters  expresions
		
        //s small s : find space
        // S caps S   : no space charters 
        //d : get number values only 
        //D : non digits characters
        // w : print all sentence expect special characters 
        // W : print special characters only including spaces 
        //b : word boundary
        //B  : Boundary matcher
        //G : prevoius match ending regex
        //. dot  : all characters including special characters
		
		
		 System.out.println("-----------------------------------------");
	}
	
	
	public static void Demoregex19() {
		System.out.println("DemoRegex 19.");
		 // start and end methods in Matcher class.
		String input = "you know newyork,you need newyork, you know you need unquie newyork";
		Pattern pat = Pattern.compile("newyork");
		Matcher mat = pat.matcher(input);
		boolean matchFound = mat.find();
		while(matchFound) {
			System.out.println(mat.group()+"Position at: "+mat.start()+" ends at : "+mat.end());
			matchFound = mat.find();
		}
		System.out.println();
		
		
		 System.out.println("-----------------------------------------");
	}
	
	public static void Demoregex20() {
		System.out.println("DemoRegex 20.");
		 // start and end methods in Matcher class.
		String input = "you know newyork,you need newyork, you know you need unquie newyork";
		Pattern pat = Pattern.compile("newyork");
		Matcher mat = pat.matcher(input);
		int count = 0;
		boolean matchFound = mat.find();
		while(matchFound) {
			
			matchFound = mat.find();
			count++;
		}
		System.out.println("newyork appears : "+count);
		System.out.println();
		
		
		 System.out.println("-----------------------------------------");
	}
	
	
	

}
