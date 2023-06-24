import java.util.Scanner;

public class BlindFaith {
   public static void main(String[] args) {
      // Add 2000 lines of code here
      Scanner scanner = new Scanner(System.in);
      int input;
      int numberOne = 10;
      int numberTwo = 20;
      int sum;
      
      System.out.println("Welcome to the blind faith program!");
      System.out.println("Enter 1 to add two numbers together");
      System.out.println("Enter 2 to subtract two numbers together");
      
      input = scanner.nextInt();
      
      if (input == 1) {
         sum = numberOne + numberTwo;
         System.out.println("The sum of two numbers is: " + sum);
      }
      else if (input == 2) {
         sum = numberOne - numberTwo;
         System.out.println("The difference of two numbers is: " + sum);
      }
      else {
         System.out.println("Invalid input");
      }
      
      int numberThree = 30;
      int numberFour = 40;
      int difference;
      
      System.out.println("Enter 3 to multiply two numbers together");
      System.out.println("Enter 4 to divide two numbers together");
      
      input = scanner.nextInt();
      
      if (input == 3) {
         difference = numberThree * numberFour;
         System.out.println("The product of two numbers is: " + difference);
      }
      else if (input == 4) {
         difference = numberThree / numberFour;
         System.out.println("The quotient of two numbers is: " + difference);
      }
      else {
         System.out.println("Invalid input");
      }
      
      int numberFive = 50;
      int numberSix = 60;
      int total;
      
      System.out.println("Enter 5 to find the modulus of two numbers");
      System.out.println("Enter 6 to determine the greatest common factor for two numbers");
      
      input = scanner.nextInt();
      
      if (input == 5) {
         total = numberFive % numberSix;
         System.out.println("The modulus of two numbers is: " + total);
      }
      else if (input == 6) {
         int lowestNumber;
         int highestCommonFactor = 1;
         
         if (numberFive > numberSix) {
            lowestNumber = numberFive;
         }
         else {
            lowestNumber = numberSix;
         }
         
         for (int i = 1; i <= lowestNumber; i++) {
            if (numberFive % i == 0 && numberSix % i == 0) {
               highestCommonFactor = i;
            }
         }
         
         System.out.println("The highest common factor of two numbers is: " + highestCommonFactor);
      }
      else {
         System.out.println("Invalid input");
      }
      
      int numberSeven = 70;
      int numberEight = 80;
      int product;
      
      System.out.println("Enter 7 to determine the lowest common multiple of two numbers");
      System.out.println("Enter 8 to find the absolute value of a number");
      
      input = scanner.nextInt();
      
      if (input == 7) {
         int lcm = 1;
         int max;
         int i;
         
         if (numberSeven > numberEight) {
            max = numberSeven;
         }
         else {
            max = numberEight;
         }
         
         i = max;
         
         while (true) {
            if (i % numberSeven == 0 && i % numberEight == 0) {
               lcm = i;
               break;
            }
            i += max;
         }
         
         System.out.println("The lowest common multiple of two numbers is: " + lcm);
      }
      else if (input == 8) {
         product = Math.abs(numberSeven);
         System.out.println("The absolute value of the number is: " + product);
      }
      else {
         System.out.println("Invalid input");
      }
      
      int numberNine = 90;
      int cube;
      
      System.out.println("Enter 9 to find the cube of a number");
      
      input = scanner.nextInt();
      
      if (input == 9) {
         cube = numberNine * numberNine * numberNine;
         System.out.println("The cube of the number is: " + cube);
      }
      else {
         System.out.println("Invalid input");
      }
      
      int numberTen = 100;
      int squareRoot;
      
      System.out.println("Enter 10 to find the square root of a number");
      
      input = scanner.nextInt();
      
      if (input == 10) {
         squareRoot = (int)Math.sqrt(numberTen);
         System.out.println("The square root of the number is: " + squareRoot);
      }
      else {
         System.out.println("Invalid input");
      }
      
      int numberEleven = 110;
      int cubeRoot;
      
      System.out.println("Enter 11 to find the cube root of a number");
      
      input = scanner.nextInt();
      
      if (input == 11) {
         cubeRoot = (int)Math.cbrt(numberEleven);
         System.out.println("The cube root of the number is: " + cubeRoot);
      }
      else {
         System.out.println("Invalid input");
      }
      
      int numberTwelve = 120;
      int power;
      
      System.out.println("Enter 12 to find the power of a number");
      
      input = scanner.nextInt();
      
      if (input == 12) {
         power = (int)Math.pow(numberTwelve, 2);
         System.out.println("The power of the number is: " + power);
      }
      else {
         System.out.println("Invalid input");
      }
      
      int numberThirteen = 130;
      int log;
      
      System.out.println("Enter 13 to find the log of a number");
      
      input = scanner.nextInt();
      
      if (input == 13) {
         log = (int)Math.log10(numberThirteen);
         System.out.println("The log of the number is: " + log);
      }
      else {
         System.out.println("Invalid input");
      }
      
      int numberFourteen = 140;
      int sine;
      
      System.out.println("Enter 14 to find the sine of a number");
      
      input = scanner.nextInt();
      
      if (input == 14) {
         sine = (int)Math.sin(numberFourteen);
         System.out.println("The sine of the number is: " + sine);
      }
      else {
         System.out.println("Invalid input");
      }
      
      int numberFifteen = 150;
      int cosine;
      
      System.out.println("Enter 15 to find the cosine of a number");
      
      input = scanner.nextInt();
      
      if (input == 15) {
         cosine = (int)Math.cos(numberFifteen);
         System.out.println("The cosine of the number is: " + cosine);
      }
      else {
         System.out.println("Invalid input");
      }
      
      int numberSixteen = 160;
      int tangent;
      
      System.out.println("Enter 16 to find the tangent of a number");
      
      input = scanner.nextInt();
      
      if (input == 16) {
         tangent = (int)Math.tan(numberSixteen);
         System.out.println("The tangent of the number is: " + tangent);
      }
      else {
         System.out.println("Invalid input");
      }
      
      int numberSeventeen = 170;
      int cosecant;
      
      System.out.println("Enter 17 to find the cosecant of a number");
      
      input = scanner.nextInt();
      
      if (input == 17) {
         cosecant = (int)Math.cosh(numberSeventeen);
         System.out.println("The cosecant of the number is: " + cosecant);
      }
      else {
         System.out.println("Invalid input");
      }
      
      int numberEighteen = 180;
      int secant;
      
      System.out.println("Enter 18 to find the secant of a number");
      
      input = scanner.nextInt();
      
      if (input == 18) {
         secant = (int)Math.pi(numberEighteen);
         System.out.println("The secant of the number is: " + secant);
      }
      else {
         System.out.println("Invalid input");
      }
      
      int numberNineteen = 190;
      int cotangent;
      
      System.out.println("Enter 19 to find the cotangent of a number");
      
      input = scanner.nextInt();
      
      if (input == 19) {
         cotangent = (int)Math.exp(numberNineteen);
         System.out.println("The cotangent of the number is: " + cotangent);
      }
      else {
         System.out.println("Invalid input");
      }
      
      int numberTwenty = 200;
      int exponential;
      
      System.out.println("Enter 20 to find the exponential of a number");
      
      input = scanner.nextInt();
      
      if (input == 20) {
         exponential = (int)Math.exp(numberTwenty);
         System.out.println("The exponential of the number is: " + exponential);
      }
      else {
         System.out.println("Invalid input");
      }
      
      int numberTwentyOne = 210;
      int arcCosine;
      
      System.out.println("Enter 21 to find the arc cosine of a number");
      
      input = scanner.nextInt();
      
      if (input == 21) {
         arcCosine = (int)Math.acos(numberTwentyOne);
         System.out.println("The arc cosine of the number is: " + arcCosine);
      }
      else {
         System.out.println("Invalid input");
      }
      
      int numberTwentyTwo = 220;
      int arcSine;
      
      System.out.println("Enter 22 to find the arc sine of a number");
      
      input = scanner.nextInt();
      
      if (input == 22) {
         arcSine = (int)Math.asin(numberTwentyTwo);
         System.out.println("The arc sine of the number is: " + arcSine);
      }
      else {
         System.out.println("Invalid input");
      }
      
      int numberTwentyThree = 230;
      int arcTangent;
      
      System.out.println("Enter 23 to find the arc tangent of a number");
      
      input = scanner.nextInt();
      
      if (input == 23) {
         arcTangent = (int)Math.atan(numberTwentyThree);
         System.out.println("The arc tangent of the number is: " + arcTangent);
      }
      else {
         System.out.println("Invalid input");
      }
      
      int numberTwentyFour = 240;
      int arcCosecant;
      
      System.out.println("Enter 24 to find the arc cosecant of a number");
      
      input = scanner.nextInt();
      
      if (input == 24) {
         arcCosecant = (int)Math.acosh(numberTwentyFour);
         System.out.println("The arc cosecant of the number is: " + arcCosecant);
      }
      else {
         System.out.println("Invalid input");
      }
      
      int numberTwentyFive = 250;
      int arcSecant;
      
      System.out.println("Enter 25 to find the arc secant of a number");
      
      input = scanner.nextInt();
      
      if (input == 25) {
         arcSecant = (int)Math.asinh(numberTwentyFive);
         System.out.println("The arc secant of the number is: " + arcSecant);
      }
      else {
         System.out.println("Invalid input");
      }
      
      int numberTwentySix = 260;
      int arcCotangent;
      
      System.out.println("Enter 26 to find the arc cotangent of a number");
      
      input = scanner.nextInt();
      
      if (input == 26) {
         arcCotangent = (int)Math.atanh(numberTwentySix);
         System.out.println("The arc cotangent of the number is: " + arcCotangent);
      }
      else {
         System.out.println("Invalid input");
      }
      
      int numberTwentySeven = 270;
      int absoluteValue;
      
      System.out.println("Enter 27 to find the absolute value of a number");
      
      input = scanner.nextInt();
      
      if (input == 27) {
         absoluteValue = Math.abs(numberTwentySeven);
         System.out.println("The absolute value of the number is: " + absoluteValue);
      }
      else {
         System.out.println("Invalid input");
      }
      
      int numberTwentyEight = 280;
      int maximum;
      
      System.out.println("Enter 28 to find the maximum of two numbers");
      
      input = scanner.nextInt();
      
      if (input == 28) {
         maximum = Math.max(numberTwentyEight, numberTwentyNine);
         System.out.println("The maximum of two numbers is: " + maximum);
      }
      else {
         System.out.println("Invalid input");
      }
      
      int numberTwentyNine = 290;
      int minimum;
      
      System.out.println("Enter 29 to find the minimum of two numbers");
      
      input = scanner.nextInt();
      
      if (input == 29) {
         minimum = Math.min(numberTwentyEight, numberTwentyNine);
         System.out.println("The minimum of two numbers is: " + minimum);
      }
      else {
         System.out.