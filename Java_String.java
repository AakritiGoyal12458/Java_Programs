public class Java_String
{
	public static void main(String Args[])
	{
		String myStr = "Hello";
		System.out.println(myStr.startsWith("Hel"));   // true
		System.out.println(myStr.startsWith("llo"));   // false
		System.out.println(myStr.startsWith("o"));     // false
		System.out.println(myStr.hashCode());	//69609650
		char result1 = myStr.charAt(0);
		int result2 = myStr.codePointAt(0);
		int result3 = myStr.codePointBefore(1);
		int result4= myStr.codePointCount(0, 5);
		System.out.println(result1);	//H
		System.out.println(result2);	//72
		System.out.println(result3);	
		System.out.println(result4);

		String firstName = "Johny ";
		String lastName = "Depp";
		System.out.println(firstName.concat(lastName));

		String myStr1 = "Hello";
		String myStr2 = "Hello";
		String myStr3 = "hello";
		System.out.println(myStr1.equalsIgnoreCase(myStr2)); // true
		System.out.println(myStr1.equalsIgnoreCase(myStr3)); // false
		System.out.println(myStr1.isEmpty());
		System.out.println(myStr1.compareTo(myStr2)); // Returns 0 because they are equal
		System.out.println(myStr1.compareToIgnoreCase(myStr3));

		System.out.println(myStr.contains("Hel"));   // true
		System.out.println(myStr.contains("e"));     // true
		System.out.println(myStr.contains("Hi"));    // false

		System.out.println(myStr.contentEquals("Hello"));  // true
		System.out.println(myStr.contentEquals("e"));      // false
		System.out.println(myStr.contentEquals("Hi"));     // false

		System.out.println(myStr.endsWith("Hel"));   // false
		System.out.println(myStr.endsWith("llo"));   // true
		System.out.println(myStr.endsWith("o"));     // true

		char[] myStr4 = {'H', 'e', 'l', 'l', 'o'};
		String myStr5 = "";
		myStr5= myStr5.copyValueOf(myStr4, 0, 5);
		System.out.println("Returned String: " + myStr5);

		String myStr6 = "Another String";
		System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal
		System.out.println(myStr1.equals(myStr6)); // false

		String myStr7 = "I am a python learner.";
		System.out.println(myStr7.indexOf("python"));
		System.out.println(myStr7.lastIndexOf("python"));

		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(txt.length());
		System.out.println(txt.toUpperCase());
		System.out.println(txt.toLowerCase());

		String myStr8 = "Preety";
		System.out.println(myStr8.replace('e', 'i'));

		String myStr9 = "       Hello World!       ";
		System.out.println(myStr9);
		System.out.println(myStr9.trim());
	}

}
