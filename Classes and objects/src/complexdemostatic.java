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
}
class complexdemostatic
{
	public static void main (String[] args)
{
complex c1=new complex(1,2);
complex c2=new complex(3,4);
complex c3=new complex();
c3 =add(c1,c2);
System.out.println("c1 ="+c1.a +" " +c1.b);
System.out.println("c2 ="+c2.a +" " +c2.b);
System.out.println("Sum = "+c3.a + " " + c3.b);
}
public static complex add(complex c1, complex c2){
	complex c3 = new complex ();
	c3.a=c1.a + c2.a;
	c3.b=c1.b + c2.b;
	return c3;
}
}




