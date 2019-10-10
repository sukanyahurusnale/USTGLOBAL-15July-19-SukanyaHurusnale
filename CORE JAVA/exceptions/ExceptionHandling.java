package com.dev.exceptions;

public class ExceptionHandling  {

	public static void main(String[] args) throws Exception{

		try {

			s();	
			System.out.println("no exception for s()");
			int res=divide(10,0);

			System.out.println("no exception for devide");
			System.out.println(res);

		}
		catch(NegativeArraySizeException e) {

			System.err.println("\nexception caught in catch block");
			System.err.println("getmessag()"+e.getMessage());
			/* e.printStackTrace(); */

		} catch(Exception e) {

			System.err.println("\nexception caught in catch block");
			System.err.println("getmessage(): "+e.getMessage());
			//e.printStackTrace();

		}
		finally {

			System.out.println("\nthis is finally block\n");
		}

	}

	public static void s() throws Exception{
		int i=1;
		if(i<0) {
			throw new Exception();
		}
		StringBuffer sb=new StringBuffer(1);
		System.out.println(sb);
	}


	public static int divide(int i,int j) {
		int res=i/j;
		return res;
	}
}


