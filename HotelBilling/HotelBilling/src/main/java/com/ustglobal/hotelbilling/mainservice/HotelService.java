package com.ustglobal.hotelbilling.mainservice;

import java.util.Scanner;

import com.ustglobal.hotelbilling.beans.Hotel_Bill;
import com.ustglobal.hotelbilling.operation.HotelOperation;

public class HotelService {

	public static void main(String[] args) {

		HotelOperation hb = new HotelOperation();
		Scanner sc = new Scanner(System.in);

		while (true) {

			int ch = 0;
			System.out.println("*******************Hotel Billing *******************");
			
			System.out.println("\n1.Show All Food Items");
			System.out.println("\n2.Take order from customer");
			System.out.println("\n3.Operate on food Items");
			System.out.println("\n4.Total bill of the day");
			System.out.println("Please enter your choice");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				 hb.showAllItems();
				break;

			case 2:
                 hb.takeOrder();
				break;

			case 3:
				int ch1 = 0;
				while (ch1 <= 3) {
					
					System.out.println("1.Add Food Items");
					System.out.println("2.Remove Food Items");
					System.out.println("3.Modify food items");
					System.out.println("select option");
					ch1 = sc.nextInt();
					switch (ch1) {
					case 1:
                          hb.addFoodItem();
						break;
					case 2:
                        hb.removeFoodItem();
						break;
					case 3:
						hb.modifyFoodItem();
						break;
					default:
						System.out.println("invalid option");
						break;
					}
				}
				break;
			case 4:
				hb.totalBill();
				break;
			default:
				System.out.println("invalid option");
				break;

			}

		}
	}

}
