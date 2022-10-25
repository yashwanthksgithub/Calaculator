//Java Swing -> graphical user interface this uses inheritance of the Oracal's Java foundation
import java.awt.EventQueue;//use of package 
//Data binding ->process of binding application UI
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.AbstractAction;
import javax.swing.Action;

import java.util.*;
import java.io.*;
import project1.intro;
import project1.intro2;
import project1.intro3;
import project1.intro4;

class NewThread implements Runnable {
	 String name; 
	 Thread t;
	public NewThread(String op) {
	 name = op;
	 t = new Thread(this, name);
	 System.out.println("Just Few Seconds LEFT," + t +" Is Created");
	 t.start(); 
	 }
	 
	 public void run() {
		 intro4 syn=new intro4();
	 try {
	 for(int i = 3; i > 0; i--) {
	 System.out.println(name + ": " + i);
	 syn.synchro();
	 Thread.sleep(1000);
	 }
	 
	 } 
     catch (InterruptedException e) {
	 System.out.println(name + " interrupted.");
	 }

	 }
	 
	}

public class calc1 {
	
	//private JTextField txtDisplay;
	private JFrame frame;
	private JTextField jtxtDisplay;
	
	//operands and operator
	double EnterNum1;
	double EnterNum2;
	double result;
	String operator;
	private final Action action = new SwingAction();//creating the objects of action 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {//main class
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		String a;
		System.out.println("I Welcome you to MY PROJECT. Please enter your NAME.");
		a=sc.nextLine();
		System.out.println();
		System.out.println("Welcome Prof."+ a);
		System.out.println();
	
	    System.out.println("Before going to vist the MAIN PART OF MY PROJECT,");
	    System.out.println("Do you want know how many characters are there in your NAME?");
	    String b;
	    b=sc.nextLine();
	    if("yes".equalsIgnoreCase(b)) {
	    	System.out.println("WOW!!! "+a+" You Have "+a.length()+" Characters in you name" );
	    }
	    else
	    	System.out.println("No problem, I think You Know how many characters are there in your NAME");
	    System.out.println();
	    System.out.println("NOW LET US COME BACK TO THE MAIN PART OF THE PROJECT");
	    System.out.println();
	    System.out.println("THERE ARE 4 DIFFERENT TYPES OF OPERATIONS");
	    System.out.println("1. ADDITION");
	    System.out.println("2. SUBTRACTION");
	    System.out.println("3. MULTIPLACTION");
	    System.out.println("4. DIVISION");
	    System.out.println();
	    int x;
	    int y;
	    intro2 obj1=new intro2();
	    intro3 obj2=new intro3();
	    intro4 obj3=new intro4();
	    System.out.println("Choose any operation you wish to perform?");
	    int choise;
	    choise=sc.nextInt();
	    switch(choise)
	    {
	    case 1:
	    {
	    	System.out.println("Do you wish to perform ADDITION operation? Please press YES");
	    	System.out.println("Otherwise I will Automaticaly set two input for ADDITION operation");
	    	String c;
	    	c=sc.nextLine();
	    	String d;
	    	d=sc.nextLine();
	    	if("yes".equalsIgnoreCase(d))
	    	{
	    		System.out.println("Enter operand 1:");
	    		x=sc.nextInt();
	    		System.out.println("Enter operand 2:");
	    		y=sc.nextInt();
	    		obj1.add(x, y);
	    	}
	    	else {
	    		System.out.println("I selected input a=10 and b=20");
	    		obj1.add(10, 20);
	    		System.out.println();
	    	}	
	    	break;
	    }
	    case 2:
	    {
	    	System.out.println("Do you wish to perform SUBTRACTION operation? Please press YES");
	    	System.out.println("Otherwise I will Automaticaly set two input for SUBTRACTION operation");
	    	String c;
	    	c=sc.nextLine();
	    	String E;
	    	E=sc.nextLine();
	    	if("yes".equalsIgnoreCase(E))
	    	{
	    		System.out.println("Enter operand 1:");
	    		x=sc.nextInt();
	    		System.out.println("Enter operand 2:");
	    		y=sc.nextInt();
	    		obj2.sub(x, y);
	    	}
	    	else {
	    		System.out.println("I selected input a=30 and b=10");
	    		obj2.sub(30,10);
	    		System.out.println();
	    	}	
	    	break;
	    }
	    case 3:
	    {
	    	System.out.println("Do you wish to perform MULTIPICATION operation? Please press YES");
	    	System.out.println("Otherwise I will Automaticaly set two input for MULTIPLICATION operation");
	    	String c;
	    	c=sc.nextLine();
	    	String f;
	    	f=sc.nextLine();
	    	if("yes".equalsIgnoreCase(f))
	    	{
	    		System.out.println("Enter operand 1:");
	    		x=sc.nextInt();
	    		System.out.println("Enter operand 2:");
	    		y=sc.nextInt();
	    		obj2.mul(x, y);
	    	}
	    	else {
	    		System.out.println("I selected input a=5 and b=10");
	    		obj2.mul(5,10);
	    		System.out.println();
	    	}	
	    	break;
	    }
	    case 4:
	    {
	    	System.out.println("Do you wish to perform DIVISION operation? Please press YES");
	    	System.out.println("Otherwise I Automaticaly set two input for DIVISION operation");
	    	String c;
	    	c=sc.nextLine();
	    	String g;
	    	g=sc.nextLine();
	    	if("yes".equalsIgnoreCase(g))
	    	{
	    		System.out.println("Enter operand 1:");
	    		x=sc.nextInt();
	    		System.out.println("Enter operand 2:");
	    		y=sc.nextInt();
	    		if(y==0) {
	    			try {
	    				throw new ArithmeticException();
	    			}
	    			catch(ArithmeticException e)
	    			{
	    				System.out.println("SYNTAX ERROR DUE TO DIVISOR ZERO-->"+e);
	    			}
	    		}
	    		else
	    		{
	    		obj3.div(x, y);
	    		}
	    	}
	    	else {
	    		System.out.println("I selected input a=30 and b=10");
	    		obj3.div(30,10);
	    		System.out.println();
	    	}
	    	break;
	    }
	    default:
	    {
	    	System.out.println("Invaild input!!!!!!!!!");
	    	break;
	    }
	    
	    }
	    
		//threads:
	    System.out.println();
		NewThread ob1 = new NewThread("OPENS IN");
		 NewThread ob2 = new NewThread("OPENS IN");
		 		System.out.println();
		 		System.out.println("I THINK YOU ARE REALLY EXCITED !!! " + ob1.t.isAlive());
		 		System.out.println("This Project Give Some Interest To You Right : " + ob2.t.isAlive());
		 		System.out.println();
				 try {
				 System.out.println("MAIN PART OF THE PROJECT OPENS IN :");
				 ob1.t.join();
				 ob2.t.join();
				 } catch (InterruptedException e){
				 System.out.println("Main thread Interrupted");
				 }
				 System.out.println("Main Part Of The Project IS BELOW ['-']");
				 
		EventQueue.invokeLater(new Runnable() {
			public void run() {//thread 
				try {//Exception handling
					calc1 window = new calc1();//creating object of the calculator
					window.frame.setVisible(true);
				} catch (Exception e) {//catch of any type of exception 
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calc1() {//constructor of same class name 
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {//private class which can be used in the same class
		frame = new JFrame();
		frame.setBackground(new Color(0, 206, 209));//methods of inbuilt to design the frame
		frame.getContentPane().setBackground(new Color(32, 178, 170));
		frame.setBounds(100, 100, 369, 597);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		jtxtDisplay = new JTextField();//NEW->dynamically allocates a memory so,automatically deallocates memory ->garbage collector
		jtxtDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		jtxtDisplay.setFont(new Font("Times New Roman", Font.BOLD, 27));
		jtxtDisplay.setBounds(20, 0, 310, 83);
		frame.getContentPane().add(jtxtDisplay);
		jtxtDisplay.setColumns(10);
		
		
	//--------------> 1st row <-----------------------:
		
		JButton btnar = new JButton("\uF0E7");
		btnar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bs;
				if(jtxtDisplay.getText().length()>0)//string length function
				{
					StringBuilder stb=new StringBuilder(jtxtDisplay.getText());//object of class stringBuilder
					stb.deleteCharAt(jtxtDisplay.getText().length()-1);//character concept
					bs=stb.toString();//Conversion of char to string
					jtxtDisplay.setText(bs);//set display the function 
				}
				
			}
		});
		btnar.setBackground(new Color(255, 160, 122));
		btnar.setFont(new Font("Wingdings", Font.BOLD, 20));
		btnar.setBounds(20, 111, 60, 60);
		frame.getContentPane().add(btnar);
		
		JButton btnc = new JButton("C");
		btnc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//action performed by each button when we press
				
				jtxtDisplay.setText("");
			}
		});
		btnc.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnc.setBackground(new Color(255, 160, 122));
		btnc.setBounds(102, 111, 60, 60);
		frame.getContentPane().add(btnc);
		
		JButton btnper = new JButton("%");
		btnper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {//same methods called many time so this called method overloading
				EnterNum1=Double.parseDouble(jtxtDisplay.getText());
				jtxtDisplay.setText(null);
				operator="%";
			}
		});
		btnper.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnper.setBackground(new Color(255, 160, 122));
		btnper.setBounds(189, 111, 60, 60);
		frame.getContentPane().add(btnper);
		
		JButton btnplus = new JButton("+");
		btnplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNum1=Double.parseDouble(jtxtDisplay.getText());
				jtxtDisplay.setText(null);
				operator="+";
			}
		});
		btnplus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnplus.setBackground(new Color(255, 160, 122));
		btnplus.setBounds(270, 111, 60, 60);
		frame.getContentPane().add(btnplus);
		
		final JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = jtxtDisplay.getText()+ btn8.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBackground(new Color(255, 160, 122));
		btn8.setBounds(102, 202, 60, 60);
		frame.getContentPane().add(btn8);
		
		final JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String digit = jtxtDisplay.getText()+ btn9.getText();
				jtxtDisplay.setText(digit);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBackground(new Color(255, 160, 122));
		btn9.setBounds(189, 202, 60, 60);
		frame.getContentPane().add(btn9);
		
		JButton btnminus = new JButton("-");
		btnminus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EnterNum1=Double.parseDouble(jtxtDisplay.getText());
				jtxtDisplay.setText(null);
				operator="-";
			}
		});
		btnminus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnminus.setBackground(new Color(255, 160, 122));
		btnminus.setBounds(270, 202, 60, 60);
		frame.getContentPane().add(btnminus);
		
		
		//--------------> 3st row <-----------------------:
		
				final JButton btn4 = new JButton("4");
				btn4.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String digit = jtxtDisplay.getText()+ btn4.getText();
						jtxtDisplay.setText(digit);
					}
				});
				btn4.setBackground(new Color(255, 160, 122));
				btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn4.setBounds(20, 292, 60, 60);
				frame.getContentPane().add(btn4);
				
				final JButton btn5 = new JButton("5");
				btn5.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String digit = jtxtDisplay.getText()+ btn5.getText();
						jtxtDisplay.setText(digit);
					}
				});
				btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn5.setBackground(new Color(255, 160, 122));
				btn5.setBounds(102, 292, 60, 60);
				frame.getContentPane().add(btn5);
				
				final JButton btn6 = new JButton("6");
				btn6.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String digit = jtxtDisplay.getText()+ btn6.getText();
						jtxtDisplay.setText(digit);
					}
					
				});
				btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn6.setBackground(new Color(255, 160, 122));
				btn6.setBounds(189, 292, 60, 60);
				frame.getContentPane().add(btn6);
				
				JButton btnmul = new JButton("*");
				btnmul.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						EnterNum1=Double.parseDouble(jtxtDisplay.getText());
						jtxtDisplay.setText(null);
						operator="*";
					}
				});
				btnmul.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnmul.setBackground(new Color(255, 160, 122));
				btnmul.setBounds(270, 292, 60, 60);
				frame.getContentPane().add(btnmul);
				
				
				//--------------> 3st row <-----------------------:
				
				final JButton btn1 = new JButton("1");
				btn1.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String digit = jtxtDisplay.getText()+ btn1.getText();
						jtxtDisplay.setText(digit);
					}
				});
				btn1.setBackground(new Color(255, 160, 122));
				btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn1.setBounds(20, 382, 60, 60);
				frame.getContentPane().add(btn1);
				
				final JButton btn2 = new JButton("2");
				btn2.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String digit = jtxtDisplay.getText()+ btn2.getText();
						jtxtDisplay.setText(digit);
					}
				});
				btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn2.setBackground(new Color(255, 160, 122));
				btn2.setBounds(102, 382, 60, 60);
				frame.getContentPane().add(btn2);
				
				final JButton btn3 = new JButton("3");
				btn3.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String digit = jtxtDisplay.getText()+ btn3.getText();
						jtxtDisplay.setText(digit);
					}
				});
				btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn3.setBackground(new Color(255, 160, 122));
				btn3.setBounds(189, 382, 60, 60);
				frame.getContentPane().add(btn3);
				
				JButton btnslash = new JButton("/");
				btnslash.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						EnterNum1=Double.parseDouble(jtxtDisplay.getText());
						jtxtDisplay.setText(null);
						operator="/";
					}
				});
				btnslash.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnslash.setBackground(new Color(255, 160, 122));
				btnslash.setBounds(270, 382, 60, 60);
				frame.getContentPane().add(btnslash);
				
				
	//--------------> 4st row <-----------------------:
				
				final JButton btn0 = new JButton("0");
				btn0.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String digit = jtxtDisplay.getText()+ btn0.getText();
						jtxtDisplay.setText(digit);
					}
				});
				btn0.setBackground(new Color(255, 160, 122));
				btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
				btn0.setBounds(20, 467, 60, 60);
				frame.getContentPane().add(btn0);
				
				final JButton btndot = new JButton(".");
				btndot.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if(!jtxtDisplay.getText().contains("."))
						{
							jtxtDisplay.setText(jtxtDisplay.getText()+ btndot.getText());
						}
					}
				});
				btndot.setFont(new Font("Tahoma", Font.BOLD, 20));
				btndot.setBackground(new Color(255, 160, 122));
				btndot.setBounds(102, 467, 60, 60);
				frame.getContentPane().add(btndot);
				
				JButton btnpm = new JButton("+-");
				btnpm.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						double pm=Double.parseDouble(String.valueOf(jtxtDisplay.getText()));
						pm=pm*(-1);
						jtxtDisplay.setText(String.valueOf(pm));
					}
					
				});
				btnpm.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnpm.setBackground(new Color(255, 160, 122));
				btnpm.setBounds(189, 467, 60, 60);
				frame.getContentPane().add(btnpm);
				
				JButton btneq = new JButton("=");//if-else operation in oopJava
				btneq.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						EnterNum2=Double.parseDouble(jtxtDisplay.getText());
						if(operator=="+")
						{
							result=EnterNum1+EnterNum2;
							jtxtDisplay.setText(String.valueOf(result));
						}
						else if(operator=="-")
						{
							result=EnterNum1-EnterNum2;
							jtxtDisplay.setText(String.valueOf(result));
						}
						else if(operator=="*")
						{
							result=EnterNum1*EnterNum2;
							jtxtDisplay.setText(String.valueOf(result));
						}
						else if(operator=="/")
						{
							result=EnterNum1/EnterNum2;
							jtxtDisplay.setText(String.valueOf(result));
						}
						else if(operator=="%")
						{
							result=EnterNum1%EnterNum2;
							jtxtDisplay.setText(String.valueOf(result));
						}
					}
				});
				btneq.setFont(new Font("Tahoma", Font.BOLD, 20));
				btneq.setBackground(new Color(255, 160, 122));
				btneq.setBounds(270, 467, 60, 60);
				frame.getContentPane().add(btneq);
				
				final JButton btn7 = new JButton("7");
				btn7.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String digit = jtxtDisplay.getText()+ btn7.getText();
						jtxtDisplay.setText(digit);
					}
				});
				btn7.setFont(new Font("Tahoma", Font.BOLD, 18));
				btn7.setBackground(new Color(255, 160, 122));
				btn7.setBounds(20, 203, 60, 60);
				frame.getContentPane().add(btn7);
				
				JButton btnNewButton = new JButton("YASHU");
				btnNewButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
					}
				});
				btnNewButton.setForeground(new Color(248, 248, 255));
				btnNewButton.setFont(new Font("Tahoma", Font.ITALIC, 12));
				btnNewButton.setBackground(new Color(255, 69, 0));
				btnNewButton.setBounds(260, 537, 85, 21);
				frame.getContentPane().add(btnNewButton);
	}
	private class SwingAction extends AbstractAction {//inheritance concept
		public SwingAction() {//constructor 
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {//calling same method name in different class ->Method Overriding
		}
	}
}
