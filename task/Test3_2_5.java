import java.util.Scanner;
public class Test3_2_5 {
     public static void main(String[] args)
     {
    	 Student p[]=new Student[15];
    	 Scanner input=new Scanner(System.in);
    	 for(int i=1;i<=10;i++){
    		 p[i].name=input.next();
    		 p[i].a=input.nextDouble();
    		 p[i].b=input.nextDouble();
    		 p[i].c=input.nextDouble();
    		 p[i].sum();
    	 }
    	 java.util.Arrays.sort(p);
    	 for(Student a:p){
    		 System.out.print(a);
    	 }
     }
}
class Student{
    String name;
    double a,b,c;
    double total;
    public void sum()
    {
    	this.total=this.a+this.b+this.c;
    }
    public int compareTo(Student o){
    	if(this.total>o.total)
    		return -1;
    	else return 1;
    }
}