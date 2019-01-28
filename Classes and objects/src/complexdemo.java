import java.util.*;
class complex
{
	int a;
	int b;
	complex(){}
	complex(int a, int b)

{
  this.a=a;
  this.b=b;
}
complex add(complex c)
{
	complex cadd = new complex();
	cadd.a=a +c.a;
	cadd.b=b +c.b;
	return cadd;
}
}
class complexdemo
{
	public static void main (String[] args)
{
complex c1=new complex(1,2);
complex c2=new complex(3,4);
complex c3=new complex();
c3 =c1.add(c2);
System.out.println("c1 ="+c1.a +" " +c1.b);
System.out.println("c2 ="+c2.a +" " +c2.b);
System.out.println("Sum = "+c3.a + " " + c3.b);
}
}





