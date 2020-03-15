import java.util.Scanner;
class Test17{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        String s;
        int i=0;
        char t,c;
        s=input.next();
        t=s.charAt(0);
        c=s.charAt(i++);
        while(c!='#')
        {
            if(c>='a'&&c<='z')
            c+='A'-'a';
            if(c<t)
            t=c;
            c=s.charAt(i++);
        }
        System.out.println(t);
    }
}