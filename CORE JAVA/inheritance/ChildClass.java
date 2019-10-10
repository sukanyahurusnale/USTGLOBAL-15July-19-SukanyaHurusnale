
package com.dev.inheritance;

public class ChildClass extends ParentClass{

	@Override
	public void printAdd(){

	}

	/*
	 * @Override 
	 * private void printName(){ 
	 * 
	 * }  private method can not be override
	 */


	/*
	 * @Override static void printArea(){
	 * 
	 * }   static method can not overide it 
	 */


	/*
	 *  void printArea(){
	 * 
	 * } this static method and parent static method are not related  if we dont give @override
	 */

	/*
	 * void printAa(){
	 * 
	 * }  final method can not override
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildClass c=new ChildClass();
		c.printAdd();

	}

}
