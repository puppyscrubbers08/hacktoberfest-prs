import java.util.*;
class magic_num
{
public void main()
{
Scanner sc=new Scanner(System.in);
int n,d,s;
System.out.println("Enter the number");
n=sc.nextInt();
s=n;
while(s>9)
{
n=s;
s=0;
while(n>0)
{
d=n%10;
s=s+d;
n=n/10;
}
}
if(s==1)
System.out.println("Magic number");
else
System.out.println("Not a Magic number");
}
}





















