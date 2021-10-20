import java.util.*;
class Kaprekar
{
public static void main()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter a Number : ");
int n = sc.nextInt();   //Inputting the number
int sq = n*n; //finding the square of the number  
String s = Integer.toString(sq);    //converting the square into a String
 if(sq<=9)
s="0"+s; 
//Adding a zero in the beginning if the square is of single digit
 int l = s.length();
 //finding the length (i.e. no. of digits in the square).
int mid = l/2; //finding the middle point
 String left=s.substring(0,mid);
 //extracting the left digits from the square
String right=s.substring(mid);
 //extracting the right digits from the square 
int x = Integer.parseInt(left);
 //converting the left String into Integer
int y  = Integer.parseInt(right);
 //converting the right String into Integer
 //if sum of left and right numbers is equal to the original number then it is a Kaprekar number
if(x+y == n) 
System.out.println(n+" is a Kaprekar Number");
else
System.out.println(n+" is Not a Kaprekar Number");
}
}
