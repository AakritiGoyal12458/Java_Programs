import java.io.*;
public class Simple2 
{
	public static void main(String s[]) throws IOException
	{
			try{
			String sname;
			int sage; 
			DataInputStream ob=new DataInputStream(System.in);
			System.out.println("Enter Name : ") ;
			sname=ob.readLine();
			
			System.out.println("Enter Age: ") ;
			sage=Integer.parseInt(ob.readLine());
			System.out.println("Name : " + sname) ;
			System.out.println("Age : " + sage) ;
			}
			catch(IOException e){
			}

	}

}

/*super iwth parameter

class Vehicle {
    Vehicle(String str) {
        System.out.println("Vehicle Class Constructor Called");
    }
}

class Motorcycle extends Vehicle {
    Motorcycle(String str) {
        super(str);
        System.out.println("Motorcycle Class Constructor Called");
    }
}

class ExampleClass1 {
    public static void main(String[] args) {
        new Motorcycle("example string");
    }
}
*/