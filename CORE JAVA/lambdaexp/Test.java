package com.dev.lambdaexp;

public class Test {

	public static void main(String[] args) {
		FuncInt f=(int i)->{
			for(int j=1;j<=i;j++) {
				System.out.println("j:"+j);
				
			}
		};
		
		//trycatch
		FuncInt2 f1=()->{
			try {
				int a=90;
				int b=0;
				int res=a/b;
				System.out.println("devision is "+res);
			}catch(Exception e) {
				System.out.println("\nexception...\n");
			}
			
		};
	
		//single line
		FuncInt3 f2=()-> System.out.println("hello all my name is sukanya\n");
			
		f2.printName();
		f.printVal(5);
		f1.printAdd();
		
	}
}

