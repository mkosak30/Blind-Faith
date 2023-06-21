public class BlindFaith { 

// Declaration & Initialization 
public static int integerNumber = 0; 
public static double doubleNumber = 0.0; 
public static String stringValue = ""; 

public static void main (String[] args) { 

//Loop one - write 1000 lines of code 
for (int i = 1; i <= 1000; i++) { 
integerNumber = i; 
doubleNumber = integerNumber * 1.5; 
stringValue = "line " + integerNumber; 
System.out.println(stringValue + " - " + doubleNumber); 
} 

// Loop two - write the remaining 1000 lines of code 
for (int i = 1000; i <= 2000; i++) { 
integerNumber = i; 
doubleNumber = integerNumber * 1.75; 
stringValue = "line " + integerNumber; 
System.out.println(stringValue + " - " + doubleNumber); 
} 

} 

}