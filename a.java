import java.util.*;
class AnyToDecimal
{
    public void convertDec(String d,int b)
    {
       int sum=0,dec=0;
        int len;
        len=d.length();
        for(int i=0;i<len;i++)
        {
            char ch=d.charAt(len-1-i);
            if(ch=='A')
            dec=10;
            else if(ch=='B')
            dec=11;
            else if(ch=='C')
            dec=12;
            else if(ch=='D')
            dec=13;
            else if(ch=='E')
            dec=14;
            else if(ch=='F')
            dec=15;
            else
            dec=(int)ch-48;
            sum+=(int)Math.pow(b,i)*dec;
        }
        System.out.println("Decimal Number:"+sum);
    }
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base:");
        int b=sc.nextInt();
        System.out.println("Enter the number");
        String num=sc.next();
         int len = num.length();
        if (b==2)
        {
            for(int i= 0; i <len; i++)
            { 
                char ch = num.charAt(i);
                if (ch !='0'|| ch != '1')
                {
                System.out.println(" Invalid digit as per base");
                System.exit(0);
                }
            }
        }
        else if (b==8)
        {
            for(int i= 0; i <len; i++)
            { 
                char ch = num.charAt(i);
                if (ch <'0'|| ch >'7')
                {
                System.out.println(" Invalid digit as per base");
                System.exit(0);
            }
         }
      }
        else if (b==16)
        {
            for(int i= 0; i <len; i++)
            { 
                char ch = num.charAt(i);
                if (!(ch >='0'&& ch<='9')&& !(ch >='A'&& ch<='F'))
                {
                System.out.println(" Invalid digit as per base");
                System.exit(0);
                }
            }
        }
        else
        System.out.println("Invalid Base");
        
        AnyToDecimal ob=new AnyToDecimal();
        ob.convertDec(num,b);
    }
}






