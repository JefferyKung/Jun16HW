package method;

import java.util.Scanner;

import javax.swing.plaf.TreeUI;

public class main {

	public static void main(String[] args) {
		
		
//		do {
		class number{
			private double num1;
			private double num2;
			
			public number(double num1,double num2) {
				this.num1=num1;
				this.num2=num2;
			}

			public double getNum1() {
				return num1;
			}

			public void setNum1(double num1) {
				this.num1 = num1;
			}

			public double getNum2() {
				return num2;
			}

			public void setNum2(double num2) {
				this.num2 = num2;
			}
			
		}

	
		do {
			
			Scanner a = new Scanner(System.in);		
			System.out.println("Input first number");
			double num1 = a.nextDouble();
			
			Scanner b = new Scanner(System.in);		
			System.out.println("Choose an operation:\nType + for addition\nType - for subtraction\nType * for multiplication\nType / for division\n");
			String operator = b.next();
			
			Scanner c = new Scanner(System.in);		
			System.out.println("Input second number");
			double num2 = c.nextDouble();
			

			
			switch(operator) {
				case "+":
					double o1 = method.addition(num1 ,num2);
					System.out.println(o1);
					break;
				case "-":
					double o2 = method.subtraction(num1 ,num2);
					System.out.println(o2);
					break;
				case "*":
					double o3 = method.multiplication(num1 ,num2);
					System.out.println(o3);
					break;
				case "/":
					if(num2 == 0) {
						Scanner d = new Scanner(System.in);		
						System.out.println("cannot divide by zero\nDo you want to continue or quit?");
						String con = d.next();
										
						if(new String(con).equals("continue")) {
							Scanner e = new Scanner(System.in);		
							System.out.println("Input second number again but no zero");
							double num2v2 = e.nextDouble();
							
							if(num2v2 ==0) {
								System.out.println("Go fuck yourself.");
							}
							else{
							double o4 = method.division(num1 ,num2v2);
							System.out.println(o4);
							}
						}
						else {
							System.out.println("bye forever");
						}
							
					}
					else{
					double o4 = method.division(num1 ,num2);
					System.out.println(o4);
					break;}
					
					

			}
			        Scanner determine = new Scanner(System.in);		
		            System.out.println("Do you want to continue or quit?");
		            String con2 = determine.next();
					if(new String(con2).equals("quit")){
						System.out.println("bye");
						break;
					}
		} while (true);


		
		
//		Scanner 1f = new Scanner(System.in);		
//		System.out.println("Do you want to continue or quit?");
//		String con2 = f.next();

		
//		}while(String con3= new con2; String(con3).equals("quit"));
//		}
		
		
		
	}


}