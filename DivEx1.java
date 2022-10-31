public class  DivEx1
{
	public static void main(String s[])
	{
		int x,y,z;
		x=Integer.parseInt(s[0]);
		y=Integer.parseInt(s[1]);
		z=x/y;
		System.out.println(" value of z is ="+z);
	}
}

/*
o/p 1. 
 java DivEx1 10 2
 value of z is =5
o/p 2. 
java DivEx1 10 0
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at DivEx1.main(DivEx1.java:8)
o/p 3.
java DivEx1 10
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 1 out of bounds for length 1
        at DivEx1.main(DivEx1.java:7)
o/p 4.
java DivEx1 10 a
Exception in thread "main" java.lang.NumberFormatException: For input string: "a"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:668)
        at java.base/java.lang.Integer.parseInt(Integer.java:784)
        at DivEx1.main(DivEx1.java:7)
o/p 5.
java DivEx1 a 10
Exception in thread "main" java.lang.NumberFormatException: For input string: "a"
        at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
        at java.base/java.lang.Integer.parseInt(Integer.java:668)
        at java.base/java.lang.Integer.parseInt(Integer.java:784)
        at DivEx1.main(DivEx1.java:6)


*/