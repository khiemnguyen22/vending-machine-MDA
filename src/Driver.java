import java.util.Scanner;

import AbstractFactory.*;
import DataStore.*;
import MDA.*;
import OP.*;
import VM.*;

public class Driver{
	
	public static void main(String args[]){ 
		
		Scanner sc = new Scanner(System.in); 
		Character in = new Character('1');   
		System.out.println("                          Select Vending Machine");
		System.out.println("          1. Vending machine 1");  
		System.out.println("          2. Vending machine 2");
		in = sc.next().charAt(0);
		
		// start vending machine 1
		if (in == '1') {
			// initialize Concrete Factory
			AF af = new CF1();
			DataStore ds = af.getDataStore();
			
			// initialize Input, Output processor, and VM-1
			OP op = new OP(af, ds);
			MDA_EFSM m = new MDA_EFSM(op);
			VM_1 vm1 = new VM_1(m, ds);  
			float p;  // handle price input
			float v;  // handle coin input
			int n;  // handle cup input
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
			
			// application loop
			while (ch != 'q')  {
				System.out.println("  Select Operation: ");
				System.out.println("0-create,1-coin,2-sugar,3-tea,4-latte,5-insert_cups,6-set_price,7-cancel");
				ch = sc.next().charAt(0); 
				switch (ch){
					case '0': 
						//create
						System.out.println("  Operation:  create(int p)");
						System.out.println("  Enter value of parameter p:");
						p = sc.nextFloat();
						vm1.create((int)p);
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
						System.out.println("  Operation:  set_price(float p)");
						System.out.println("  Enter value of parameter p:");
						p = sc.nextFloat();
						vm1.set_price(p);
						break;
					case '7': // cancel
						System.out.println("  Operation:  cancel()");
						vm1.cancel();
						break;
				} // endswitch
			} //endwhile
		} // end vm - 1
		
		// Start vending machine 2
		if (in == '2') {
			
			// initialize concrete factory
			AF af = new CF2();
			DataStore ds = af.getDataStore();
			
			// initialize input and output processor with VM-2
			OP op = new OP(af, ds);
			MDA_EFSM m = new MDA_EFSM(op);
			VM_2 vm2 = new VM_2(m, ds);  
			
			float p;  // handle price input
			int v;  // handle coin input
			int n;  // handle cups input
			int x;  // handle card input
			System.out.println("                          Vending Machine-2");  
			System.out.println("                  MENU of Operations");  
			System.out.println("          0. CREATE(float p)");  
			System.out.println("          1. COIN(int v)");  
			System.out.println("          2. SUGAR()");  
			System.out.println("          3. CREAM()");  
			System.out.println("          4. COFFEE()");  
			System.out.println("          5. InsertCups(int n)");  
			System.out.println("          6. SetPrice(int p)"); 
			System.out.println("          7. CARD(int x)"); 
			System.out.println("          8. CANCEL()");  
			System.out.println("          q. Quit the demo program");  
			System.out.println("  Please make a note of these operations");  
			System.out.println("           Vending Machine-1 Execution");  
			Character ch = new Character('1');      
			 
			// application loop
			while (ch != 'q')  {
				System.out.println("  Select Operation: ");
				System.out.println("0-create,1-coin,2-sugar,3-cream,4-coffee,5-insert_cups,6-set_price,7-card,8-cancel");
				ch = sc.next().charAt(0); 
				switch (ch){
					case '0': 
						//create
						System.out.println("  Operation:  CREATE(float p)");
						System.out.println("  Enter value of parameter p:");
						p = sc.nextFloat();
						vm2.CREATE(p);
						break;   
					case '1': //coin
						System.out.println("  Operation:  COIN(int v)");
						System.out.println("  Enter value of parameter v:");
						v = sc.nextInt();
						vm2.COIN(v);
						break;
					case '2': //sugar
						System.out.println("  Operation:  SUGAR()");
						vm2.SUGAR();
						break;
					case '3': // cream
						System.out.println("  Operation:  CREAM()");
						vm2.CREAM();
						break;
					case '4': // coffee
						System.out.println("  Operation:  COFFEE()");
						vm2.COFFEE();
						break;
					case '5': // insert_cups
						System.out.println("  Operation:  insertCups(int n)");
						System.out.println("  Enter value of parameter n:");
						n = sc.nextInt();
						vm2.InsertCups(n);
						break;
					case '6': // set_price
						System.out.println("  Operation:  setPrice(int p)");
						System.out.println("  Enter value of parameter p:");
						p = sc.nextInt();
						vm2.SetPrice(p);
						break;
					case '7': // card
						System.out.println("  Operation:  CARD(int x)");
						System.out.println("  Enter value of parameter x:");
						x = sc.nextInt();
						vm2.CARD(x);
						break;
					case '8': // cancel
						System.out.println("  Operation:  CANCEL()");
						vm2.CANCEL();
						break;
				} // end switch
			} //end while			
		} // end vm 2
	} // main
} // class
