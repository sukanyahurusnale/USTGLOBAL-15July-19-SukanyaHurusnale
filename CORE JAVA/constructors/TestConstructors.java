
package com.dev.constructors;

public class TestConstructors {

	/*		public int TestConstructors(int a,int b){
		    return 1;
	    } //this is method not a constructor
	 */
	public  TestConstructors(int a){
		System.out.println("this constructor is parameterized with int arg");

	}
	
	public  TestConstructors(){
		System.out.println("this constructor is without parameterized");

	}
	
	public  TestConstructors(String a){
		System.out.println("this constructor is parameterized with string arg");

	}
	

	public  TestConstructors(String a,int g){
		System.out.println("this constructor is parameterized with string and int arg");

	}

	public  TestConstructors(int g,String a){
		System.out.println("this constructor is parameterized with int and  string arg");

	}

	public static void main(String[] args) {
		TestConstructors nn=new TestConstructors(); //caling no argument const
		System.out.println(" :" +nn);               //displaying address 
		
		TestConstructors nn1=new TestConstructors(3); //calling with int arg 
		System.out.println(" : " +nn1);
		
		TestConstructors nn2=new TestConstructors("suk");  //calling string arg
		System.out.println(" : " +nn2);
		
		TestConstructors nn3=new TestConstructors("suk",5); //calling string and int
		System.out.println( " : " +nn3);
		
		TestConstructors nn4=new TestConstructors(6,"dd");  //calling int and string
		System.out.println(nn4);
	}

}
