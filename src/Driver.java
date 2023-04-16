import java.util.Scanner;

import AbstractFactory.*;
import DataStore.*;
import MDA.*;
import OP.*;
import VM.*;

public class Driver{
	
	public static void main(String args[]){ 
		// partial driver 
		AF af = new CF1();
		DataStore ds = af.getDataStore();
		OP op = new OP(af, ds);
		MDA_EFSM m = new MDA_EFSM(op);
		VM_1 vm1 = new VM_1(m, ds);  
		int p;  
		float v;  
		int n;  
		float x;  
		System.out.println("                          Vending Machine-1");  
		System.out.println("                  MENU of Operations");  
		System.out.println("          0. create(int)");  
		System.out.println("          1. coin(int)");  
		System.out.println("          2. sugar()");  
		System.out.println("          3. tea()");  
		System.out.println("          4. latte()");  
		System.out.println("          5. insert_cups(int)");  
		System.out.println("          6. set_price(float)");  
		System.out.println("          7. cancel()");  
		System.out.println("          q. Quit the demo program");  
		System.out.println("  Please make a note of these operations");  
		System.out.println("           Vending Machine-1 Execution");  
		Character ch = new Character('1');      
		Scanner sc = new Scanner(System.in);   
		while (ch != 'q')  {
			System.out.println("  Select Operation: ");
			System.out.println("0-create,1-coin,2-sugar,3-tea,4-latte,5-insert_cups,6-set_price,7-cancel");
			ch = sc.next().charAt(0); 
			switch (ch){
				case '0': 
					//create
					System.out.println("  Operation:  create(int p)");
					System.out.println("  Enter value of parameter p:");
					p = sc.nextInt();
					vm1.create(p);
					break;   
				case '1': //coin
					System.out.println("  Operation:  coin(float v)");
					System.out.println("  Enter value of parameter v:");
					v = sc.nextFloat();
					vm1.coin(v);
					break;
				case '2': //sugar
					System.out.println("  Operation:  sugar()");
					vm1.sugar();
					break;
				case '3': // tea
					System.out.println("  Operation:  tea()");
					vm1.tea();
					break;
				case '4': // latte
					System.out.println("  Operation:  latte()");
					vm1.latte();
					break;
				case '5': // insert_cups
					System.out.println("  Operation:  insert_cups(int n)");
					System.out.println("  Enter value of parameter n:");
					n = sc.nextInt();
					vm1.insert_cups(n);
					break;
				case '6': // set_price
					System.out.println("  Operation:  set_price(float v)");
					System.out.println("  Enter value of parameter v:");
					v = sc.nextFloat();
					vm1.set_price(v);
					break;
				case '7': // cancel
					System.out.println("  Operation:  cancel()");
					vm1.cancel();
					break;
			} // endswitch
		} //endwhile
	}
}
