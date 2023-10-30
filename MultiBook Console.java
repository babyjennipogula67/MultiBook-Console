import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
class cv
{
	static Scanner sc = new Scanner(System.in);

	static SBIBank p = new SBIBank();
	static ICICIBank p1 = new ICICIBank();
	static Onlinepay p2 = new Onlinepay();


	static String reset = "\u001B[0m";
	static String red = "\u001B[31m";
	static String green = "\u001B[32m";
	static String yellow = "\u001B[33m";
	static String blue = "\u001B[34m";
	static String violet = "\u001B[35m";
	static String skyblue = "\u001B[36m";
	static String white = "\u001B[37m";
	static String blink = "\u001B[5m";

	static String red1 = "\u001B[101m";
	static String green1 = "\u001B[102m";
	static String yellow1 = "\u001B[103m";
	static String blue1 = "\u001B[104m";
	static String violet1 = "\u001B[105m";
	static String skyblue1 = "\u001B[106m";
	static String white1 = "\u001B[107m";

	static String bold = "\u001B[1m";
	static String thickness = "\u001B[2m";
	static String hello = "\u001B[3m";
	static String underline = "\u001B[4m";

	static void sleep()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{

		}
	}
	static void sleep1()
	{
		try
		{
			Thread.sleep(100);
		}
		catch(InterruptedException e)
		{

		}
	}
	static void sleep2()
	{
		try
		{
			Thread.sleep(5);
		}
		catch(InterruptedException e)
		{

		}
	}

	static void sleep3()
	{
		try
		{
			Thread.sleep(500);
		}
		catch(InterruptedException e)
		{

		}
	}
}

interface CVBANK
{
    double Withdraw(double a);
	double Deposit(double b);
	double Loan(double c);
	void display();
	void login();
	void signup();

	void username(String username);
	void Account_number(String Account_number);
	void Pancard_number(String Aadhar_number);
	void number(String number);

	String getusername();
	String getAccount_number();
	String getPancard_number();
	String getnumber();

}
class SBIBank implements CVBANK
{

	private String username = "pravin";
	private String Account_number = "24682468";
	private String Pancard_number = "12345678";
	private String number = "1234567890";
	static int ae = 0;
	static int civilscore = 800;

	static double Available_Balance = 60000;

	public double Withdraw(double a)
	{
		Available_Balance = Available_Balance - a;
		return Available_Balance;
	}
	public double Deposit(double b)
	{
		Available_Balance = Available_Balance + b;
		return Available_Balance;
	}
	public double Loan(double c)
	{
		Available_Balance = c;
		return Available_Balance;
	}


	public void display()
	{
		cv.sleep1();
		System.out.println(cv.yellow+"\n\n\n \t\t\t\t\t\t\t    W E L C O M E   T O   T H E   S B I   B A N K"+cv.reset);
		Display.display2();
		cv.sleep1();
		System.out.println(cv.blue+"\n\n \t\t\t\t\t\t\t\t\t  Login   -  1  "+cv.reset);
		System.out.println(cv.violet+" \t\t\t\t\t\t\t\t\t  Signup  -  2  "+cv.reset);
		System.out.println(cv.red+" \t\t\t\t\t\t\t\t\t  Exit    -  3 "+cv.reset);
		ae = 0;
		int ag = Integer.parseInt(cv.sc.nextLine());
		if(ag==1)
			login();
		else if(ag==2)
			signup();

		if(ae>=1)
		{
			while(true)
			{
				System.out.println(cv.blue+"\n\t\t\t\t\t\t\t\t\t  Withdraw    -   1  "+cv.reset);
				System.out.println(cv.violet+"  \t\t\t\t\t\t\t\t\t  Deposit     -   2  "+cv.reset);
				System.out.println(cv.skyblue+"  \t\t\t\t\t\t\t\t\t  Loan        -   3  "+cv.reset);
				System.out.println(cv.red+"  \t\t\t\t\t\t\t\t\t  Exit        -   4  "+cv.reset);
				int d = Integer.parseInt(cv.sc.nextLine());
				if(d==1)
				{
					System.out.println("\n \t\t\t\t\t\t\t\t Your Available_Balance = "+Available_Balance);
					System.out.println(cv.green+"\n \t\t\t\t\t\t <-<-<-<-<-<- Please Entered the Withdraw amount ->->->->->->"+cv.reset);
					double e = Double.parseDouble(cv.sc.nextLine());
					System.out.println("\n \t\t\t\t\t\t\t\t Balance          	 =  "+Available_Balance);
					System.out.println("   \t\t\t\t\t\t\t\t Withdraw Amount  	 =  "+e);
					Available_Balance = Withdraw(e);
					System.out.println(cv.blue+"   \t\t\t\t\t\t\t\t                            --------"+cv.reset);
					System.out.println(cv.violet+"   \t\t\t\t\t\t\t\t Available_Balance       =  "+Available_Balance+cv.reset);
					System.out.println(cv.blue+"   \t\t\t\t\t\t\t\t                            --------"+cv.reset);
					System.out.println(cv.yellow+"\n\n \t\t\t\t\t\t\t $$$$$$$$$$  Transaction Successful  $$$$$$$$$$ "+cv.reset);
					System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t  Again Transaction   -  1 "+cv.reset);
					System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t  Exit                -  2 "+cv.reset);
					int f = Integer.parseInt(cv.sc.nextLine());
					if(f==1)
						continue;
					else 
						break;		
				}
				else if(d==2)
				{
					System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t Your Available_Balance = "+cv.reset+cv.violet+Available_Balance+cv.reset);
					System.out.println(cv.green+"\n \t\t\t\t\t\t <-<-<-<-<-<- Please Entered the Deposit amount ->->->->->->"+cv.reset);
					double g = Double.parseDouble(cv.sc.nextLine());
					System.out.println("\n \t\t\t\t\t\t\t\t Balance          	 =  "+Available_Balance);
					System.out.println("   \t\t\t\t\t\t\t\t Deposit Amount  	 =  "+g);
					Available_Balance = Deposit(g);
					System.out.println(cv.blue+"   \t\t\t\t\t\t\t\t                            --------"+cv.reset);
					System.out.println(cv.violet+"   \t\t\t\t\t\t\t\t Available_Balance       =  "+Available_Balance+cv.reset);
					System.out.println(cv.blue+"   \t\t\t\t\t\t\t\t                            --------"+cv.reset);
					System.out.println(cv.yellow+"\n\n \t\t\t\t\t\t\t $$$$$$$$$$  Deposited Successful  $$$$$$$$$$"+cv.reset);
					System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t   Again Transaction   -  1 "+cv.reset);
					System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t   Exit                -  2  "+cv.reset);
					int h = Integer.parseInt(cv.sc.nextLine());
					if(h==1)
						continue;
					else 
						break;
				}
				else if(d==3)
				{
					System.out.println(cv.green+"\n \t\t\t\t\t\t\t\t    You are selected the Loan "+cv.reset);
					System.out.println("\n \t\t\t\t\t\t\t <-<-<-<-<-<- Enter the Pancard_Number ->->->->->-> ");
					String Pancard_number = cv.sc.nextLine();
					System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t  Please wait we are checking Pancard_number "+cv.reset);
					cv.sleep();
					if(Pancard_number.equals(getPancard_number()))
					{
						System.out.println("\n \t\t\t\t\t\t\t\t\t  Your civil score = "+civilscore);
						if(civilscore>600)
						{
							System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t\t  personal Loan  -  1  "+cv.reset);
							System.out.println(cv.violet+"\n \t\t\t\t\t\t\t\t\t  Car Loan       -  2  "+cv.reset);
							System.out.println(cv.skyblue+"\n \t\t\t\t\t\t\t\t\t  Home Loan      -  3  "+cv.reset);
							int ah = Integer.parseInt(cv.sc.nextLine());
							if(ah==1)
								System.out.println(cv.green+"\n \t\t\t\t\t\t\t     You are Eligible to Personal Loan "+cv.reset);
							else if(ah==2)
								System.out.println(cv.green+"\n \t\t\t\t\t\t\t     You are Eligible to Car Loan "+cv.reset);
							else if(ah==3)
								System.out.println(cv.green+"\n \t\t\t\t\t\t\t     You are Eligible to Home Loan "+cv.reset);
							else if(ah==4)
								break;
							System.out.println("\n \t\t\t\t\t\t\t  Please Enter How much money Loan do you want ? ");
							double loan = Double.parseDouble(cv.sc.nextLine());
							System.out.println("\n \t\t\t\t\t\t  Please Enter the How many years you want to pay that the loan ");
							int years = Integer.parseInt(cv.sc.nextLine());
							double intrest = (0.03*loan)*years;
							double total_amount = loan+intrest;
							System.out.println("\n \t\t\t\t\t\t\t Tenure for per annum is 3% for the amount   =  "+intrest);
							double month = total_amount/(2*12);
							System.out.println(" \t\t\t\t\t\t\t EMI for per month the amount is             =  "+month);
							System.out.println(" \t\t\t\t\t\t\t Total Loan amount and Total Intrest         =  "+ total_amount);
							System.out.println(cv.violet+"\n \t\t\t\t\t\t\t\t\t  Loan  -  1 "+cv.reset);
							System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t\t  Exit  -  2 "+cv.reset);
							int i = Integer.parseInt(cv.sc.nextLine());
							if(i==1)
							{
								System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t\t  Withdraw  -  1 "+cv.reset);
								System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t\t  Exit      -  2 "+cv.reset);
								int j = Integer.parseInt(cv.sc.nextLine());
								if(j==1)
								{
									System.out.println("\n \t\t\t\t\t\t\t\t Available_Balance = "+Loan(loan));
									System.out.println("\n \t\t\t\t\t\t\t Please Enter How much amount do you want Withdraw ");
									double o = Double.parseDouble(cv.sc.nextLine());
									System.out.println("\n \t\t\t\t\t\t\t\t Balance          	 =  "+Available_Balance);
									System.out.println("   \t\t\t\t\t\t\t\t Withdraw Amount  	 =  "+o);
									Available_Balance = Withdraw(o);
									System.out.println(cv.blue+"   \t\t\t\t\t\t\t\t                            --------"+cv.reset);
									System.out.println(cv.violet+"   \t\t\t\t\t\t\t\t Available_Balance       =  "+Available_Balance+cv.reset);
									System.out.println(cv.blue+"   \t\t\t\t\t\t\t\t                            --------"+cv.reset);
									System.out.println(cv.yellow+"\n \t\t\t\t\t\t\t   $$$$$$$$$$  TRANSACTION SUCCESSFUL  $$$$$$$$$$ "+cv.reset);
									System.out.println(cv.green+"\n \t\t\t\t\t\t\t\t\t  Transaction  -  1 "+cv.reset);
									System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t\t  Exit         -  2 "+cv.reset);
									int k = Integer.parseInt(cv.sc.nextLine());
									if(k==1)
										continue;
									else 
										break;
								}
								else 
								{
									System.out.println(cv.green+"\n \t\t\t\t\t\t\t\t\t  Transaction  -  1 "+cv.reset);
									System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t\t  Exit         -  2 "+cv.reset);
									int l = Integer.parseInt(cv.sc.nextLine());
									if(l==1)
										continue;
									else 
										break;
								}
							}
							else
							{
								System.out.println(cv.green+"\n \t\t\t\t\t\t\t\t\t  Transaction  -  1 "+cv.reset);
								System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t\t  Exit         -  2 "+cv.reset);
								int m = Integer.parseInt(cv.sc.nextLine());
								if(m==1)
									continue;
								else 
									break;
							}
						}
						else 
						{
							System.out.println("\n \t\t\t\t\t\t\t  Your civilscore is not Greater than 600 ");
							System.out.println(cv.red+"\n \t\t\t\t\t\t\t  Sorry you are not Eligible to Loan "+cv.reset);
							break;
						}
					}
					else
					{
						System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t  You Entered the wrong Pancard_Number "+cv.reset);
						System.out.println(cv.blue+"\t\t\t\t\t\t\t\t  Please Enter the Mobile Number ");
						String number = cv.sc.nextLine();
						if(number.equals(getnumber()))
						{
							while(true)
							{
								System.out.println(cv.green+"\t\t\t\t\t\t\t\t Please wait the OTP is Generating ");
								int OTP = 1000+(int)(Math.random()*8999);
								cv.sleep();
								System.out.println(cv.blue+"\t\t\t\t\t\t\t\t  Your OTP  = "+OTP);
								System.out.println(cv.violet+"\t\t\t\t\t\t\t\t  Please Enter the OTP ");
								int AA = Integer.parseInt(cv.sc.nextLine());
								if(AA==OTP)
								{
									System.out.println(cv.yellow+" \t\t\t\t\t\t\t\t  Your Pancard_Number = "+getPancard_number());
									cv.sleep1();
									break;
								}
								else
								{
									System.out.println(cv.red+"\t\t\t\t\t\t\t\t  You Entered the Invalid OTP ");
								}
							}

						}
						else
						{
							System.out.println(cv.red+"\t\t\t\t\t\t\t\t You Entered the Wrong Mobile Number");
							System.out.println(cv.blue+"\t\t\t\t\t\t\t\t  1 . SBI Bank process ");
							System.out.println(cv.violet+"\t\t\t\t\t\t\t\t 2 . Exit ");
							int AB = Integer.parseInt(cv.sc.nextLine());
							if(AB==1)
								display();
							else	
								break;
						}
						
					}
				}
				else
					break;
			}
		}
		else
		{
			System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t Please Login to SBI Account "+cv.reset);
			System.out.println(cv.violet+"\n \t\t\t\t\t\t\t\t\t  Login  -  1 "+cv.reset);
			System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t\t  Exit  -  2  "+cv.reset);
			int af = Integer.parseInt(cv.sc.nextLine());
			if(af==1)
				display();
		}
	}

	public void username(String username)
	{
		this.username = username;
	}
	public void Account_number(String Account_number)
	{
		this.Account_number = Account_number;
	}
	public void Pancard_number(String Pancard_number)
	{
		this.Pancard_number = Pancard_number;
	}
	public void number(String number)
	{
		this.number = number;
	}
	public String getusername()
	{
		return username;
	}
	public String getAccount_number()
	{
		return Account_number;
	}
	public String getPancard_number()
	{
		return Pancard_number;
	}
	public String getnumber()
	{
		return number;
	}

	public void login()
	{
		System.out.println("\n \t\t\t\t\t\t\t <-<-<-<-<-<- Enter the username ->->->->->-> ");
		String username = cv.sc.nextLine();

		System.out.println(" \t\t\t\t\t\t\t <-<-<-<-<-<- Enter the Acount_Number ->->->->->-> ");
		String Account_number  = cv.sc.nextLine();

		if(username.equals(getusername()) && Account_number.equals(getAccount_number()))
		{
			System.out.println(cv.yellow+"\n \t\t\t\t\t\t\t\t   L O G I N   S U C C E S S F U L  "+cv.reset);
			ae++;
		}

		else if(!(username.equals(getusername())) && (!Account_number.equals(getAccount_number())))
		{
			System.out.println("\n \t\t\t\t\t\t  You entered the wrong username & password ");
			while(true)
			{
				System.out.println("\n \t\t\t\t\t\t\t <-<-<-<-<-<- Enter the 10 digits mobile number ->->->->->-> ");
				String number = cv.sc.nextLine();
				int LLLL = number.length();
				if(number.equals(getnumber()) && LLLL==10)
				{
					System.out.println("\n \t\t\t\t\t\t Please wait while we are sending OTP to your mobile number ");
					cv.sleep();
					int otp = 1000+(int)(Math.random()*8999);
					System.out.println(cv.skyblue+"\n \t\t\t\t\t\t\t\t  Yout OTP is = "+otp+cv.reset);
					System.out.println("\n \t\t\t\t\t\t <-<-<-<-<-<- Please Enter your OTP ->->->->->-> ");
					int n = Integer.parseInt(cv.sc.nextLine());
					if(n==otp)
					{
						System.out.println(cv.yellow+"\n \t\t\t\t\t\t O T P   M A T C H E D   S U C C E S S F U L L Y "+cv.reset);
						System.out.println(" \n\n \t\t\t\t\t\t\t\t  Your Username = "+getusername());
						System.out.println(" \t\t\t\t\t\t\t\t  Your Account_number = "+getAccount_number());
						System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t  Login press  -  1 "+cv.reset);
						System.out.println(cv.red+" \t\t\t\t\t\t\t\t  Exit press  -  2 "+cv.reset); 
						int o = Integer.parseInt(cv.sc.nextLine());
						if(o==1)
						{ 
							login();
							break;
						}
						else
							break;
					}
					else
					{
						System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t Entered the wrong OTP "+cv.reset);
						System.out.println(cv.violet+"\n \t\t\t\t\t\t\t\t  Resend OTP  -  1 "+cv.reset);
						System.out.println(cv.red+" \t\t\t\t\t\t\t\t  Exit press  -  2 "+cv.reset); 
						int P = Integer.parseInt(cv.sc.nextLine());
						if(P==1)
							continue;
						else
							break; 	
					}
				}
				else
				{
					System.out.println("\n \t\t\t\t\t\t\t\t Entered the wrong mobile number ");
					System.out.println(cv.violet+" \t\t\t\t\t\t\t\t  Reenter Mobile_Number  -  1"+cv.reset);
					System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t  Login press  -  2 "+cv.reset);
					System.out.println(cv.red+" \t\t\t\t\t\t\t\t  Exit press  -  3 "+cv.reset); 
					int q = Integer.parseInt(cv.sc.nextLine());
					if(q==2)
					{ 
						login();
						break;
					}
					else if(q==1)
						continue;
					else
						break; 
				}
			}

		}
		else if(!(username.equals(getusername())) && Account_number.equals(getAccount_number()))
		{
			System.out.println("\n \t\t\t\t\t\t\t\t  Entered the Wrong Username ");
			while(true)
			{
				System.out.println("\n \t\t\t\t\t\t <-<-<-<-<-<- Enter the 10 digits mobile number ->->->->->-> ");
				String number = cv.sc.nextLine();
				int LL = number.length();
				if(number.equals(getnumber()) && LL==10)
				{
					System.out.println("\n \t\t\t\t\t\t Please wait while we are sending OTP to your mobile number ");
					cv.sleep();
					int otp = 1000+(int)(Math.random()*8999);
					System.out.println("\n \t\t\t\t\t\t\t\t  Yout OTP is = "+otp);
					System.out.println("\n \t\t\t\t\t\t <-<-<-<-<-<- Please Enter your OTP ->->->->->-> ");
					int r = Integer.parseInt(cv.sc.nextLine());
					if(r==otp)
					{
						System.out.println(cv.yellow+"\n \t\t\t\t\t\t O T P   M A T C H E D   S U C C E S S F U L L Y "+cv.reset);
						System.out.println(" \n\n \t\t\t\t\t\t\t\t  Your Username = "+getusername());
						System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t  Login press  -  1 "+cv.reset);
						System.out.println(cv.red+" \t\t\t\t\t\t\t\t  Exit press  -  2 "+cv.reset); 
						int s = Integer.parseInt(cv.sc.nextLine());
						if(s==1)
						{ 
							login();
							break;
						}
						else
							break;
					}
					else
					{
						System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t Entered the wrong OTP "+cv.reset);
						System.out.println(cv.violet+"\n \t\t\t\t\t\t\t\t  Resend OTP  -  1 "+cv.reset);
						System.out.println(cv.red+" \t\t\t\t\t\t\t\t  Exit  -  2 "+cv.reset); 
						int t = Integer.parseInt(cv.sc.nextLine());
						if(t==1)
							continue;
						else
							break; 	
					}
				}
				else
				{
					System.out.println("\n \t\t\t\t\t\t\t\t Entered the wrong mobile number ");
					System.out.println(cv.blue+" \t\t\t\t\t\t\t\t  Reenter the Mobile_Number  -  1"+cv.reset);
					System.out.println(cv.violet+"\n \t\t\t\t\t\t\t\t  Login press  -  2 "+cv.reset);
					System.out.println(cv.red+" \t\t\t\t\t\t\t\t  Exit press  -  3 "+cv.reset); 
					int u = Integer.parseInt(cv.sc.nextLine());
					if(u==2)
					{ 
						login();
						break;
					}
					else if(u==1)
						continue;
					else
						break; 
				}
			}
		}
		else if(username.equals(getusername()) && !(Account_number.equals(getAccount_number())))
		{
			System.out.println("\n \t\t\t\t\t\t\t\t  Entered the Wrong Account_Number  ");
			while(true)
			{
				System.out.println("\n \t\t\t\t\t\t <-<-<-<-<-<- Enter the 10 digits mobile number ->->->->->-> ");
				String number = cv.sc.nextLine();
				int LLL = number.length();
				if(number.equals(getnumber()) && LLL==10)
				{
					System.out.println("\n \t\t\t\t\t\t Please wait while we are sending OTP to your mobile number ");
					cv.sleep();
					int otp = 1000+(int)(Math.random()*8999);
					System.out.println("\n \t\t\t\t\t\t\t\t  Your OTP is = "+otp);
					System.out.println("\n \t\t\t\t\t\t <-<-<-<-<-<- Please Enter your OTP ->->->->->-> ");
					int v = Integer.parseInt(cv.sc.nextLine());
					if(v==otp)
					{
						System.out.println(cv.yellow+"\n \t\t\t\t\t\t O T P   M A T C H E D   S U C C E S S F U L L Y "+cv.reset);
						System.out.println(" \n\n \t\t\t\t\t\t\t\t  Your Username = "+getusername());
						System.out.println(" \t\t\t\t\t\t\t\t  Your Account_number = "+getAccount_number());
						System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t  Login  -  1 "+cv.reset);
						System.out.println(cv.red+" \t\t\t\t\t\t\t\t  Exit  -  2 "+cv.reset); 
						int w = Integer.parseInt(cv.sc.nextLine());
						if(w==1)
						{ 
							login();
							break;
						}
						else
							break;
					}
					else
					{
						System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t Entered the wrong OTP "+cv.reset);
						System.out.println(cv.violet+"\n \t\t\t\t\t\t\t\t  Resend OTP  -  1 "+cv.reset);
						System.out.println(cv.red+" \t\t\t\t\t\t\t\t  Exit  -  2 "+cv.reset); 
						int x = Integer.parseInt(cv.sc.nextLine());
						if(x==1)
							continue;
						else
							break; 	
					}
				}
				else
				{
					System.out.println("\n \t\t\t\t\t\t\t\t Entered the wrong mobile number ");
					System.out.println(cv.blue+" \t\t\t\t\t\t\t\t  Reenter the Mobile_Number  -  1"+cv.reset);
					System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t  Login  -  2 "+cv.reset);
					System.out.println(cv.red+" \t\t\t\t\t\t\t\t  Exit   -  3 "+cv.reset); 
					int y = Integer.parseInt(cv.sc.nextLine());
					if(y==2)
					{ 
						login();
						break;
					}
					else if(y==1)
						continue;
					else
						break; 
				}
			}

		}
	}

	public void signup()
	{
		System.out.println("\n \t\t\t\t\t\t\t\t  Create a new SBI account press '1' ");
		int  z= Integer.parseInt(cv.sc.nextLine());
		if(z!=1)
			System.out.println("\n \t\t\t\t\t\t\t\t You are not create the any SBI account ");
		else
		{
			System.out.println("\n \t\t\t\t\t\t <-<-<-<-<-<- Enter the Username ->->->->->-> ");
			username(cv.sc.nextLine());
			System.out.println("\n \t\t\t\t\t\t <-<-<-<-<-<- Enter the Pancard_number ->->->->->-> ");
			Pancard_number(cv.sc.nextLine());
			while(true)
			{
				System.out.println("\n \t\t\t\t\t\t <-<-<-<-<-<- Enter the 10 digits Mobile_number ->->->->->-> ");
				String number = cv.sc.nextLine();
				int L = number.length();
				if(L==10)
				{
					number(number);
					System.out.println("\n \t\t\t\t\t\t Please wait while we are sending OTP to your mobile number ");
					cv.sleep();
					int otp = 1000+(int)(Math.random()*8999);
					System.out.println("\n \t\t\t\t\t\t\t\t  Yout OTP is = "+otp);
					System.out.println("\n \t\t\t\t\t\t <-<-<-<-<-<- Please Enter your OTP ->->->->->-> ");
					int ab = Integer.parseInt(cv.sc.nextLine());
					if(ab==otp)
					{
						System.out.println(cv.yellow+"\n \t\t\t\t\t\t O T P   M A T C H E D   S U C C E S S F U L L Y "+cv.reset);
						System.out.println("\n \t\t\t\t\t\t  Please wait Now you are generating a SBI Account_Number ");
						cv.sleep();
						System.out.println("\n\n \t\t\t\t\t\t\t\t  Your Account_number = "+getAccount_number());
						System.out.println(cv.violet+"\n \t\t\t\t\t\t\t\t  Login  -  1 "+cv.reset);
						System.out.println(cv.red+" \t\t\t\t\t\t\t\t  Exit  -  2 "+cv.reset); 
						int ac = Integer.parseInt(cv.sc.nextLine());
						if(ac==1)
						{ 
							login();
							break;
						}
						else
							break;
					}
					else 
					{
						System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t  Entered the Wrong OTP "+cv.reset);
						System.out.println(cv.violet+"\n \t\t\t\t\t\t\t\t  You want resend the OTP -  1  "+cv.reset);
						System.out.println(cv.red+" \t\t\t\t\t\t\t\t  You want Exit  -  2  "+cv.reset);
						int ad = Integer.parseInt(cv.sc.nextLine());
						if(ad==1)
							continue;
						else 
							break;
					}
				
				}
				else
				{
					System.out.println("\n \t\t\t\t\t\t\t  You Entered the not contain 10 digits Mobile_Number ");
					System.out.println(cv.blue+" \t\t\t\t\t\t\t\t  Reenter the Mobile_Number  -  1"+cv.reset);
					System.out.println(cv.red+" \t\t\t\t\t\t\t\t  Exit                      -  1"+cv.reset);
					int re = Integer.parseInt(cv.sc.nextLine());
					if(re==1)
						continue;
					else
						break;
				}
			}
		}
	}
}



class ICICIBank implements CVBANK
{
	private String username = "pravin";
	private String Account_number = "24682468";
	private String Pancard_number = "12345678";
	private String number = "7995171323";
	static int ae = 0;
	static int civilscore = 400;

	static double Available_Balance = 80000;
	public double Withdraw(double a)
	{
		Available_Balance = Available_Balance - a;
		return Available_Balance;
	}
	public double Deposit(double b)
	{
		Available_Balance = Available_Balance + b;
		return Available_Balance;
	}
	public double Loan(double c)
	{
		Available_Balance = c;
		return Available_Balance;
	}
	public void display()
	{
		cv.sleep1();
		System.out.println("\n\n\n \t\t\t\t\t\t\t  W E L C O M E   T O   T H E   I C I C I   B A N K");
		cv.sleep1();
		Display.display2();
		cv.sleep1();
		System.out.println(cv.blue+"\n\n \t\t\t\t\t\t\t\t\t  Login   -  1  "+cv.reset);
		System.out.println(cv.violet+" \t\t\t\t\t\t\t\t\t  Signup  -  2  "+cv.reset);
		System.out.println(cv.red+" \t\t\t\t\t\t\t\t\t  Exit    -  3 "+cv.reset);
		ae = 0;
		int ag = Integer.parseInt(cv.sc.nextLine());
		if(ag==1)
			login();
		else if(ag==2)
			signup();

		if(ae>=1)
		{
			while(true)
			{
				System.out.println(cv.blue+"\n\t\t\t\t\t\t\t\t\t  Withdraw    -   1  "+cv.reset);
				System.out.println(cv.violet+"  \t\t\t\t\t\t\t\t\t  Deposit     -   2  "+cv.reset);
				System.out.println(cv.skyblue+"  \t\t\t\t\t\t\t\t\t  Loan        -   3  "+cv.reset);
				System.out.println(cv.red+"  \t\t\t\t\t\t\t\t\t  Exit        -   4  "+cv.reset);
				int d = Integer.parseInt(cv.sc.nextLine());
				if(d==1)
				{
					System.out.println("\n \t\t\t\t\t\t\t\t Your Available_Balance = "+Available_Balance);
					System.out.println("\n \t\t\t\t\t\t <-<-<-<-<-<- Please Entered the Withdraw amount ->->->->->->");
					double e = Double.parseDouble(cv.sc.nextLine());
					System.out.println("\n \t\t\t\t\t\t\t\t Balance          	 =  "+Available_Balance);
					System.out.println("   \t\t\t\t\t\t\t\t Withdraw Amount  	 =  "+e);
					Available_Balance = Withdraw(e);
					System.out.println(cv.blue+"   \t\t\t\t\t\t\t\t                            --------"+cv.reset);
					System.out.println(cv.violet+"   \t\t\t\t\t\t\t\t Available_Balance       =  "+Available_Balance+cv.reset);
					System.out.println(cv.blue+"   \t\t\t\t\t\t\t\t                            --------"+cv.reset);
					System.out.println(cv.yellow+"\n\n \t\t\t\t\t\t\t $$$$$$$$$$  Transaction Successful  $$$$$$$$$$ "+cv.reset);
					System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t  Again Transaction   -  1 "+cv.reset);
					System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t  Exit                -  2 "+cv.reset);
					int f = Integer.parseInt(cv.sc.nextLine());
					if(f==1)
						continue;
					else 
						break;		
				}
				else if(d==2)
				{
					System.out.println("\n \t\t\t\t\t\t\t\t Your Available_Balance = "+Available_Balance);
					System.out.println("\n \t\t\t\t\t\t <-<-<-<-<-<- Please Entered the Deposit amount ->->->->->->");
					double g = Double.parseDouble(cv.sc.nextLine());
					System.out.println("\n \t\t\t\t\t\t\t\t Balance          	 =  "+Available_Balance);
					System.out.println("   \t\t\t\t\t\t\t\t Deposit Amount  	 =  "+g);
					Available_Balance = Deposit(g);
					System.out.println(cv.blue+"   \t\t\t\t\t\t\t\t                            --------"+cv.reset);
					System.out.println(cv.violet+"   \t\t\t\t\t\t\t\t Available_Balance       =  "+Available_Balance+cv.reset);
					System.out.println(cv.blue+"   \t\t\t\t\t\t\t\t                            --------"+cv.reset);
					System.out.println(cv.yellow+"\n\n \t\t\t\t\t\t\t $$$$$$$$$$  Deposited Successful  $$$$$$$$$$"+cv.reset);
					System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t   Again Transaction   -  1 "+cv.reset);
					System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t   Exit                -  2  "+cv.reset);
					int h = Integer.parseInt(cv.sc.nextLine());
					if(h==1)
						continue;
					else 
						break;
				}
				else if(d==3)
				{
					System.out.println("\n \t\t\t\t\t\t\t\t    You are selected the Loan ");
					System.out.println(cv.green+"\n \t\t\t\t\t\t\t <-<-<-<-<-<- Enter the Pancard_Number ->->->->->-> "+cv.reset);
					String Pancard_number = cv.sc.nextLine();
					if(Pancard_number.equals(getPancard_number()))
					{
						System.out.println("\n \t\t\t\t\t\t\t\t  Please wait we are checking Pancard_number ");
						cv.sleep();
						System.out.println("\n \t\t\t\t\t\t\t\t\t  Your civil score = "+civilscore);
						if(civilscore>600)
						{
							System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t\t  personal Loan  -  '1'  "+cv.reset);
							System.out.println(cv.violet+"\n \t\t\t\t\t\t\t\t\t  Car Loan       -  '2'  "+cv.reset);
							System.out.println(cv.skyblue+"\n \t\t\t\t\t\t\t\t\t  Home Loan      -  '3'  "+cv.reset);
							int ah = Integer.parseInt(cv.sc.nextLine());
							if(ah==1)
								System.out.println(cv.green+"\n \t\t\t\t\t\t\t     You are Eligible to Personal Loan "+cv.reset);
							else if(ah==2)
								System.out.println(cv.green+"\n \t\t\t\t\t\t\t     You are Eligible to Car Loan "+cv.reset);
							else if(ah==3)
								System.out.println(cv.green+"\n \t\t\t\t\t\t\t     You are Eligible to Home Loan "+cv.reset);
							else if(ah==4)
								break;
							System.out.println("\n \t\t\t\t\t\t\t  Please Enter How much money Loan do you want ? ");
							double loan = Double.parseDouble(cv.sc.nextLine());
							System.out.println("\n \t\t\t\t\t\t  Please Enter the How many years you want to pay that the loan ");
							int years = Integer.parseInt(cv.sc.nextLine());
							double intrest = (0.03*loan)*years;
							double total_amount = loan+intrest;
							System.out.println("\n \t\t\t\t\t\t\t Tenure for per annum is 3% for the amount   =  "+intrest);
							double month = total_amount/(2*12);
							System.out.printf(" \t\t\t\t\t\t\t EMI for per month the amount is             =  %.1f\n",month);
							System.out.println(" \t\t\t\t\t\t\t Total Loan amount and Total Intrest         =  "+ total_amount);
							System.out.println(cv.violet+"\n \t\t\t\t\t\t\t\t\t  Loan  -  1 "+cv.reset);
							System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t\t  Exit  -  2 "+cv.reset);
							int i = Integer.parseInt(cv.sc.nextLine());
							if(i==1)
							{
								System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t\t  Withdraw  -  1 "+cv.reset);
								System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t\t  Exit      -  2 "+cv.reset);
								int j = Integer.parseInt(cv.sc.nextLine());
								if(j==1)
								{
									System.out.println("\n \t\t\t\t\t\t\t\t Available_Balance = "+Loan(loan));
									System.out.println("\n \t\t\t\t\t\t\t Please Enter How much amount do you want Withdraw ");
									double o = Double.parseDouble(cv.sc.nextLine());
									System.out.println("\n \t\t\t\t\t\t\t\t Balance          	 =  "+Available_Balance);
									System.out.println("   \t\t\t\t\t\t\t\t Withdraw Amount  	 =  "+o);
									Available_Balance = Withdraw(o);
									System.out.println(cv.blue+"   \t\t\t\t\t\t\t\t                            --------"+cv.reset);
									System.out.println(cv.violet+"   \t\t\t\t\t\t\t\t Available_Balance       =  "+Available_Balance+cv.reset);
									System.out.println(cv.blue+"   \t\t\t\t\t\t\t\t                            --------"+cv.reset);
									System.out.println(cv.yellow+"\n \t\t\t\t\t\t\t   $$$$$$$$$$  TRANSACTION SUCCESSFUL  $$$$$$$$$$ "+cv.reset);
									System.out.println(cv.green+"\n \t\t\t\t\t\t\t\t\t  Transaction  -  1 "+cv.reset);
									System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t\t  Exit         -  2 "+cv.reset);
									int k = Integer.parseInt(cv.sc.nextLine());
									if(k==1)
										continue;
									else 
										break;
								}
								else 
								{
									System.out.println(cv.green+"\n \t\t\t\t\t\t\t\t\t  Transaction  -  1 "+cv.reset);
									System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t\t  Exit         -  2 "+cv.reset);
									int l = Integer.parseInt(cv.sc.nextLine());
									if(l==1)
										continue;
									else 
										break;
								}
							}
							else
							{
								System.out.println(cv.green+"\n \t\t\t\t\t\t\t\t\t  Transaction  -  1 "+cv.reset);
								System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t\t  Exit         -  2 "+cv.reset);
								int m = Integer.parseInt(cv.sc.nextLine());
								if(m==1)
									continue;
								else 
									break;
							}
						}
						else 
						{
							cv.sleep();
							System.out.println(cv.violet+"\n \t\t\t\t\t\t\t\t  Your civilscore is not Greater than 600 "+cv.reset);
							System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t  Sorry you are not Eligible to Loan "+cv.reset);
							break;
						}
					}
					else
					{
						System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t  You Entered the wrong Pancard_Number "+cv.reset);
						System.out.println(cv.blue+"\t\t\t\t\t\t\t\t  Please Enter the Mobile Number ");
						String number = cv.sc.nextLine();
						if(number.equals(getnumber()))
						{
							while(true)
							{
								System.out.println(cv.green+"\t\t\t\t\t\t\t\t Please wait the OTP is Generating ");
								int OTP = 1000+(int)(Math.random()*8999);
								cv.sleep();
								System.out.println(cv.blue+"\t\t\t\t\t\t\t\t  Your OTP  = "+OTP);
								System.out.println(cv.violet+"\t\t\t\t\t\t\t\t  Please Enter the OTP ");
								int AA = Integer.parseInt(cv.sc.nextLine());
								if(AA==OTP)
								{
									System.out.println(cv.yellow+" \t\t\t\t\t\t\t\t  Your Pancard_Number = "+getPancard_number());
									cv.sleep1();
									break;
								}
								else
								{
									System.out.println(cv.red+"\t\t\t\t\t\t\t\t  You Entered the Invalid OTP ");
								}
							}

						}
						else
						{
							System.out.println(cv.red+"\t\t\t\t\t\t\t\t You Entered the Wrong Mobile Number");
							System.out.println(cv.blue+"\t\t\t\t\t\t\t\t  1 .  Bank process ");
							System.out.println(cv.violet+"\t\t\t\t\t\t\t\t 2 . Exit ");
							int AB = Integer.parseInt(cv.sc.nextLine());
							if(AB==1)
								display();
							else	
								break;
						}
					}
				}
				else
					break;
			}
		}
		else
		{
			System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t Please Login to ICICI Account "+cv.reset);
			System.out.println(cv.violet+"\n \t\t\t\t\t\t\t\t\t  Login  -  '1' "+cv.reset);
			System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t\t  Exit  -  '2'  "+cv.reset);
			int af = Integer.parseInt(cv.sc.nextLine());
			if(af==1)
				display();
		}	
	}
	public void username(String username)
	{
		this.username = username;
	}
	public void Account_number(String Account_number)
	{
		this.Account_number = Account_number;
	}
	public void Pancard_number(String Pancard_number)
	{
		this.Pancard_number = Pancard_number;
	}
	public void number(String number)
	{
		this.number = number;
	}
	public String getusername()
	{
		return username;
	}
	public String getAccount_number()
	{
		return Account_number;
	}
	public String getPancard_number()
	{
		return Pancard_number;
	}
	public String getnumber()
	{
		return number;
	}

	public void login()
	{
		System.out.println(cv.blue+"\n \t\t\t\t\t\t\t <-<-<-<-<-<- Enter the username ->->->->->-> "+cv.reset);
		String username = cv.sc.nextLine();

		System.out.println(cv.violet+" \t\t\t\t\t\t\t <-<-<-<-<-<- Enter the Acount_Number ->->->->->-> "+cv.reset);
		String password  = cv.sc.nextLine();

		if(username.equals(getusername()) && Account_number.equals(getAccount_number()))
		{
			System.out.println(cv.yellow+"\n \t\t\t\t\t\t\t  $$$$$$$$$$ L O G I N   S U C C E S S F U L  $$$$$$$$$$"+cv.reset);
			ae++;
		}

		else if(!(username.equals(getusername())) && (!Account_number.equals(getAccount_number())))
		{
			System.out.println("\n \t\t\t\t\t\t  You entered the wrong username & password ");
			while(true)
			{
				System.out.println(cv.green+"\n \t\t\t\t\t\t <-<-<-<-<-<- Enter the 10 digits mobile number ->->->->->-> "+cv.reset);
				String number = cv.sc.nextLine();
				int L = number.length();
				if(number.equals(getnumber()) && L==10)
				{
					System.out.println("\n \t\t\t\t\t\t\t Please wait while we are sending OTP to your mobile number ");
					cv.sleep();
					int otp = 1000+(int)(Math.random()*8999);
					System.out.println(cv.violet+"\n \t\t\t\t\t\t\t\t  Yout OTP is = "+otp+cv.reset);
					System.out.println("\n \t\t\t\t\t\t <-<-<-<-<-<- Please Enter your OTP ->->->->->-> ");
					int n = Integer.parseInt(cv.sc.nextLine());
					if(n==otp)
					{
						System.out.println(cv.yellow+"\n \t\t\t\t\t\t O T P   M A T C H E D   S U C C E S S F U L L Y "+cv.reset);
						System.out.println(cv.blue+" \n\n \t\t\t\t\t\t\t\t  Your Username = "+getusername()+cv.reset);
						System.out.println(cv.violet+" \t\t\t\t\t\t\t  Your Account_number = "+getAccount_number()+cv.reset);
						System.out.println(cv.green+"\n \t\t\t\t\t\t\t\t  Login  -  1 "+cv.reset);
						System.out.println(cv.red+" \t\t\t\t\t\t\t\t  Exit   -  2 "+cv.reset); 
						int o = Integer.parseInt(cv.sc.nextLine());
						if(o==1)
						{ 
							login();
							break;
						}
						else
							break;
					}
					else
					{
						System.out.println("\n \t\t\t\t\t\t Entered the wrong OTP ");
						System.out.println("\n \t\t\t\t\t\t  Resend OTP  -  1 ");
						System.out.println(" \t\t\t\t\t\t  Exit        -  2 "); 
						int P = Integer.parseInt(cv.sc.nextLine());
						if(P==1)
							continue;
						else
							break; 	
					}
				}
				else
				{
					System.out.println("\n \t\t\t\t\t\t\t\t Entered the wrong mobile number ");
					System.out.println(cv.blue+" \t\t\t\t\t\t\t\t  Reenter Mobile_Number  -  1"+cv.reset);
					System.out.println(cv.green+"\n \t\t\t\t\t\t\t\t  Login  -  2 "+cv.reset);
					System.out.println(cv.red+" \t\t\t\t\t\t\t\t  Exit   -  3 "+cv.reset); 
					int q = Integer.parseInt(cv.sc.nextLine());
					if(q==2)
					{ 
						login();
						break;
					}
					else if(q==1)
						continue;
					else
						break; 
				}
			}

		}
		else if(!(username.equals(getusername())) && Account_number.equals(getAccount_number()))
		{
			System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t  Entered the Wrong Username "+cv.reset);
			while(true)
			{
				System.out.println("\n \t\t\t\t\t\t\t <-<-<-<-<-<- Enter the 10 digits mobile number ->->->->->-> ");
				String number = cv.sc.nextLine();
				int LL = number.length();
				if(number.equals(getnumber()) && LL==10)
				{
					System.out.println("\n \t\t\t\t\t\t\t Please wait while we are sending OTP to your mobile number ");
					cv.sleep();
					int otp = 1000+(int)(Math.random()*8999);
					System.out.println(cv.violet+"\n \t\t\t\t\t\t\t\t  Yout OTP is = "+otp+cv.reset);
					System.out.println("\n \t\t\t\t\t\t <-<-<-<-<-<- Please Enter your OTP ->->->->->-> ");
					int r = Integer.parseInt(cv.sc.nextLine());
					if(r==otp)
					{
						System.out.println("\n \t\t\t\t\t\t\t O T P   M A T C H E D   S U C C E S S F U L L Y ");
						System.out.println(" \n\n \t\t\t\t\t\t\t\t  Your Username = "+getusername());
						System.out.println("\n \t\t\t\t\t\t\t\t  Login  -  1 ");
						System.out.println(" \t\t\t\t\t\t\t\t  Exit   -  2 "); 
						int s = Integer.parseInt(cv.sc.nextLine());
						if(s==1)
						{ 
							login();
							break;
						}
						else
							break;
					}
					else
					{
						System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t  Entered the wrong OTP "+cv.reset);
						System.out.println(cv.violet+"\n \t\t\t\t\t\t\t\t  Resend OTP  -  1 "+cv.reset);
						System.out.println(cv.red+" \t\t\t\t\t\t\t\t  Exit        -  2 "+cv.reset); 
						int t = Integer.parseInt(cv.sc.nextLine());
						if(t==1)
							continue;
						else
							break; 	
					}
				}
				else
				{
					System.out.println(cv.red+"'\n \t\t\t\t\t\t\t\t Entered the wrong mobile number "+cv.reset);
					System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t Reenter Mobile_Number  - 1 "+cv.reset);
					System.out.println(cv.green+"\n \t\t\t\t\t\t\t\t  Login  -  2 "+cv.reset);
					System.out.println(cv.red+" \t\t\t\t\t\t\t\t  Exit   -  3 "+cv.reset); 
					int u = Integer.parseInt(cv.sc.nextLine());
					if(u==2)
					{ 
						login();
						break;
					}
					else if(u==1)
						continue;
					else
						break; 
				}
			}
		}
		else if(username.equals(getusername()) && !(Account_number.equals(getAccount_number())))
		{
			System.out.println(cv.red+"\n \t\t\t\t\t\t  Entered the Wrong Account_Number  "+cv.reset);
			while(true)
			{
				System.out.println("\n \t\t\t\t\t\t <-<-<-<-<-<- Enter the mobile number ->->->->->-> ");
				String number = cv.sc.nextLine();
				int LLL = number.length();
				if(number.equals(getnumber()) && LLL==10)
				{
					System.out.println("\n \t\t\t\t\t\t Please wait while we are sending OTP to your mobile number ");
					cv.sleep();
					int otp = 1000+(int)(Math.random()*8999);
					System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t  Yout OTP is = "+otp+cv.reset);
					System.out.println("\n \t\t\t\t\t\t <-<-<-<-<-<- Please Enter your OTP ->->->->->-> ");
					int v = Integer.parseInt(cv.sc.nextLine());
					if(v==otp)
					{
						System.out.println(cv.yellow+"\n \t\t\t\t\t\t O T P   M A T C H E D   S U C C E S S F U L L Y "+cv.reset);
						System.out.println(" \t\t\t\t\t\t\t  Your Account_number = "+getAccount_number());
						System.out.println("\n\n \t\t\t\t\t\t  Your pin number is = 123456");
						System.out.println(cv.green+"\n \t\t\t\t\t\t\t\t  Login   -  1 "+cv.reset);
						System.out.println(cv.red+" \t\t\t\t\t\t\t\t  Exit-  2 "+cv.reset); 
						int w = Integer.parseInt(cv.sc.nextLine());
						if(w==1)
						{ 
							login();
							break;
						}
						else
							break;
					}
					else
					{
						System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t Entered the wrong OTP "+cv.reset);
						System.out.println(cv.green+"\n \t\t\t\t\t\t\t\t  Resend OTP   -  1 "+cv.reset);
						System.out.println(cv.red+" \t\t\t\t\t\t\t\t  Exit         -  2 "+cv.reset); 
						int x = Integer.parseInt(cv.sc.nextLine());
						if(x==1)
							continue;
						else
							break; 	
					}
				}
				else
				{
					System.out.println("\n \t\t\t\t\t\t\t Entered the wrong mobile number ");
					System.out.println(cv.blue+" \t\t\t\t\t\t\t\t  Reenter the Mobile_Number  -  1"+cv.reset);
					System.out.println(cv.green+"\n \t\t\t\t\t\t\t\t  Login  -  2 "+cv.reset);
					System.out.println(cv.red+" \t\t\t\t\t\t\t\t  Exit   -  3 "+cv.reset); 
					int y = Integer.parseInt(cv.sc.nextLine());
					if(y==2)
					{ 
						login();
						break;
					}
					else if(y==1)
						continue;
					else
						break; 
				}
			}

		}
	}

	public void signup()
	{
		System.out.println(cv.green+"\n \t\t\t\t\t\t  Create a new SBI account press '1' "+cv.reset);
		int  z= Integer.parseInt(cv.sc.nextLine());
		if(z!=1)
			System.out.println(cv.red+"\n \t\t\t\t\t\t You are not create the any ICICI account "+cv.reset);
		else
		{
			System.out.println(cv.blue+"\n \t\t\t\t\t\t <-<-<-<-<-<- Enter the Username ->->->->->-> "+cv.reset);
			username(cv.sc.nextLine());
			System.out.println(cv.yellow+"\n \t\t\t\t\t\t <-<-<-<-<-<- Enter the Pancard_number ->->->->->-> "+cv.reset);
			Pancard_number(cv.sc.nextLine());
			while(true)
			{
				System.out.println(cv.violet+"\n \t\t\t\t\t\t <-<-<-<-<-<- Enter the Mobile_number ->->->->->-> "+cv.reset);
				number(cv.sc.nextLine());
				int LLLL = number.length();
				if(LLLL==10)
				{
					System.out.println("\n \t\t\t\t\t\t Please wait while we are sending OTP to your mobile number ");
					cv.sleep();
					int otp = 1000+(int)(Math.random()*8999);
					System.out.println("\n \t\t\t\t\t\t\t\t  Yout OTP is = "+otp);
					System.out.println("\n \t\t\t\t\t\t <-<-<-<-<-<- Please Enter your OTP ->->->->->-> ");
					int ab = Integer.parseInt(cv.sc.nextLine());
					if(ab==otp)
					{
						System.out.println(cv.yellow+"\n \t\t\t\t\t\t       O T P   M A T C H E D   S U C C E S S F U L L Y "+cv.reset);
						System.out.println("\n \t\t\t\t\t\t  Please wait Now you are generating a ICICI Account_Number ");
						cv.sleep();
						System.out.println("\n\n \t\t\t\t\t\t  Your Account_number = "+getAccount_number());
						System.out.println("\n\n \t\t\t\t\t\t  Your pin number is = 123456");
						System.out.println(cv.green+"\n \t\t\t\t\t\t\t\t  Login  -  1 "+cv.reset);
						System.out.println(cv.red+" \t\t\t\t\t\t\t\t  Exit  -  2 "+cv.reset); 
						int ac = Integer.parseInt(cv.sc.nextLine());
						if(ac==1)
						{ 
							login();
							break;
						}
						else
							break;
					}
					else 
					{
						System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t  Entered the Wrong OTP "+cv.reset);
						System.out.println(cv.violet+"\n \t\t\t\t\t\t\t\t  Resend the OTP -  1  "+cv.reset);
						System.out.println(cv.red+" \t\t\t\t\t\t\t\t  Exit           -  2  "+cv.reset);
						int ad = Integer.parseInt(cv.sc.nextLine());
						if(ad==1)
							continue;
						else 
							break;
					}
				}
				else
				{
					System.out.println("\n \t\t\t\t\t\t\t\t  You Entered the number not contain 10 Digits ");
					System.out.println(cv.blue+" \t\t\t\t\t\t\t\t  Reenter the Mobile_Number  -  1"+cv.reset);
					System.out.println(cv.red+" \t\t\t\t\t\t\t\t  Exit                       - 2"+cv.reset);
					int re = Integer.parseInt(cv.sc.nextLine());
					if(re==1)
						continue;
					else
						break;
				}
			}
		}
	}
}







class Bus 
{
	static String source = "HYDERABAD";
	static String destination;
	
	static void display()
	{
		while(true)
		{
			System.out.println("\n\n \t\t\t\t\t\t\t   please Select your Source and Destination below  ");
			System.out.println(cv.white+"\n \t\t\t\t\t\t  1 . "+cv.blue+"H Y D E R A B A D "+cv.green+"  <- - - - - - - - - ->"+ cv.violet+"   B A N G L O R E ");
			System.out.println(cv.white+"\t\t\t\t\t\t  2 . "+cv.violet+"H Y D E R A B A D "+cv.green+"  <- - - - - - - - - ->"+cv.yellow+"    V I Z A G ");
			System.out.println(cv.white+"\t\t\t\t\t\t  3 . "+cv.yellow+"H Y D E R A B A D "+cv.green+"  <- - - - - - - - - ->"+cv.red+"    G O A ");
			System.out.println(cv.white+"\t\t\t\t\t\t  4 . "+cv.red+"H Y D E R A B A D "+cv.green+"  <- - - - - - - - - ->"+cv.skyblue+"    C H E N N A I ");
			System.out.println(cv.red+"\t\t\t\t\t\t  5 . Exit "+cv.reset);
			int af = Integer.parseInt(cv.sc.nextLine());
			if(af==1)
			{
				Display.display6();
				int bn = 1400;
				int bo = 2000;
				int bp = 2000;
				int bq = 3000;
				String destination1 = "BANGLORE";
				display1(bn,bo,bp,bq,destination1);
				break;
			}
			else if(af==2)
			{
				Display.display7();
				int ba = 1200;
				int bc = 1600;
				int bd = 1400;
				int be = 2000;
				String destination2 = "VIZAG";
				display1(ba,bc,bd,be,destination2);
				break;
			}
			else if(af==3)
			{
				Display.display8();
				int bf = 2000;
				int bg = 2600;
				int bh = 3000;
				int bi = 4000;
				String destination3 = "GOA";
				display1(bf,bg,bh,bi,destination3);
				break;
			}
			else if(af==4)
			{
				Display.display9();
				int bj = 1500;
				int bk = 2000;
				int bl = 2400;
				int bm = 3000;
				String destination4 = "CHENNAI";
				display1(bj,bk,bl,bm,destination4);
				break;
			}
			else
				break;

		}
	}

	static void display1(int ee,int ff,int gg,int hh,String Destination)
	{
		System.out.println(cv.green+"\n \t\t\t\t\t\t\t Please select the Travels Names ");
		System.out.println(cv.red+"\n\n\t\t\t\t\t\t\t  1 . O R A N G E   T R A V E L S");
		System.out.println(cv.blue+"\t\t\t\t\t\t\t  2 . K A V E R I   T R A V E L S");
		System.out.println(cv.violet+"\t\t\t\t\t\t\t  3 . I N D U   T R A V E L S");
		System.out.println(cv.skyblue+"\t\t\t\t\t\t\t  4 . I N T E R C I T Y   T R A V E L S");
		System.out.println(cv.red+"\t\t\t\t\t\t\t  5 . Exit"+cv.reset);
		int b = Integer.parseInt(cv.sc.nextLine());
		if(b==1)
		{
			ticket(ee,ff,gg,hh,Destination);
		}
		else if(b==2)
		{
			ticket(ee,ff,gg,hh,Destination);
		}
		else if(b==3)
		{
			ticket(ee,ff,gg,hh,Destination);
		}
		else if(b==4)
		{
			ticket(ee,ff,gg,hh,Destination);
		}
		else 
			display();
	}

	static void ticket(int aa,int bb,int cc,int dd,String Destination1)
	{
		    System.out.println(cv.blue+"\n\t\t\t\t\t\t\t  1 . NON-AC "+cv.reset);
			System.out.println(cv.violet+"\t\t\t\t\t\t\t  2 . AC "+cv.reset);
			System.out.println(cv.red+"\t\t\t\t\t\t\t  3 . Exit "+cv.reset);
			int c = Integer.parseInt(cv.sc.nextLine());
			if(c==1)
			{
				System.out.println(cv.blue+"\n\t\t\t\t\t\t\t  1 . Seater   -   "+aa+cv.reset);
				System.out.println(cv.violet+"\t\t\t\t\t\t\t  2 . Sleeper  -   "+bb+cv.reset);
				System.out.println(cv.red+"\t\t\t\t\t\t\t  3 . Exit ");
				int d = Integer.parseInt(cv.sc.nextLine());
				if(d==1)
				{
					System.out.println("\t\t\t\t\t\t\t Enter the Date [D/M/Y]");
					String k = cv.sc.nextLine();
					System.out.println("\t\t\t\t\t\t\t  Enter No of Seats ");
					int m = Integer.parseInt(cv.sc.nextLine());
					
					new Display().display10();
					System.out.println("\n\t\t\t\t\t\t\t  Please select Seat number  ");
					int drr[] = new int[m];
					for(int i=0;i<m;i++)
						drr[i] = Integer.parseInt(cv.sc.nextLine());

					String arr[] = new String[m];
					int brr[] = new int[m];
					String crr[] = new String[m];
					for(int i=0;i<m;i++)
					{
						System.out.println(cv.yellow+"\t\t\t\t\t\t\t\t    Passenger: "+(i+1)+cv.reset);
						System.out.print(cv.blue+"\n\t\t\t\t\t\t\t\tEnter Your Name   : "+cv.reset);
						arr[i] = cv.sc.nextLine();
						System.out.print(cv.blue+"\t\t\t\t\t\t\t\tEnter Youe Age    : "+cv.reset);
						brr[i] = Integer.parseInt(cv.sc.nextLine());
						while(true)
						{
							System.out.print("\t\t\t\t\t\t\t\t\tEnter Your Gender :");
							String gen = cv.sc.nextLine();
							if(gen.equalsIgnoreCase("female") || gen.equalsIgnoreCase("male") || gen.equalsIgnoreCase("other"))
							{
								crr[i]=gen;
								break;
							}
							else
							{
								System.out.println(cv.red+"\t\t\t\t\tPLEASE ENTER A VALID GENDER"+cv.reset);
							}
						}
						
						System.out.println(cv.reset);
					}
					double tax = 0.06*aa*m;
					double bill = tax+aa*m;

					System.out.println(cv.red+"\t\t\t\t\t\t\t\t\t 1 . Proceed ");
					System.out.println(cv.violet+"\t\t\t\t\t\t\t\t\t 2 . Exit "+cv.reset);
					int ab = Integer.parseInt(cv.sc.nextLine());
					if(ab==1)
					{
							System.out.println("\t\t\t\t\t\t ___________________________________________________________________");
							System.out.println("\t\t\t\t\t\t|               |         |              |             |            | ");
							System.out.println("\t\t\t\t\t\t|     Name      |   Age   |    Gender    |   Seat No   |    Date    | ");
							System.out.println("\t\t\t\t\t\t|_______________|_________|______________|_____________|____________| ");
						for(int i=0;i<m;i++)
						{
							System.out.println("\t\t\t\t\t\t|               |         |              |             |            | ");
							System.out.printf("\t\t\t\t\t\t|   %-8s    |    %2s   |    %-6s    |     %3d     | %-10s |\n",arr[i],brr[i],crr[i],drr[i],k);
							System.out.println("\t\t\t\t\t\t|_______________|_________|______________|_____________|____________| ");
						}
						System.out.printf("\t\t\t\t\t\t|    GST TAX                                    =      |  %9.2f |\n",tax);
						System.out.printf("\t\t\t\t\t\t|    Total Bill Amount                          =      | %10.2f |\n",bill);
						System.out.println("\t\t\t\t\t\t|______________________________________________________|____________|");
				
		
							boolean B = cv.p2.Onlinepay(bill);
							cv.sleep1();
							if(B==true)
							{
								
								System.out.println(cv.yellow+"\n \t\t\t\t\t\t\t P A Y M E N T   S U C C E S S F U L "+cv.reset);
								cv.sleep1();
								System.out.println(cv.green+"\n \t\t\t\t\t\t\t     Your Ticket Has been Booked "+cv.reset);
								System.out.println("\t\t\t\t\t\t ___________________________________________________________________");
								System.out.println("\t\t\t\t\t\t|                                                                   | ");
								System.out.println("\t\t\t\t\t\t|"+cv.blue+"                      C V  B U S  T I C K E T        "+cv.reset+"              | ");
								System.out.println("\t\t\t\t\t\t|"+cv.green+"    SOURCE"+cv.reset+cv.red+"                                           Destination  "+cv.reset+" | ");
								System.out.println("\t\t\t\t\t\t|"+cv.blue+"    "+source+cv.reset+"                                        "+cv.violet+Destination1+cv.reset+"      | ");
								System.out.println("\t\t\t\t\t\t|___________________________________________________________________| ");
								System.out.println("\t\t\t\t\t\t|               |         |              |             |            | ");
								System.out.println("\t\t\t\t\t\t|     Name      |   Age   |    Gender    |   Seat No   |    Date    | ");
								System.out.println("\t\t\t\t\t\t|_______________|_________|______________|_____________|____________| ");
								for(int i=0;i<m;i++)
								{
									System.out.println("\t\t\t\t\t\t|               |         |              |             |            | ");
									System.out.printf("\t\t\t\t\t\t|   %-8s    |    %2s   |    %-6s    |     %3d     | %-10s |\n",arr[i],brr[i],crr[i],drr[i],k);
									System.out.println("\t\t\t\t\t\t|_______________|_________|______________|_____________|____________| ");
								}
									System.out.printf("\t\t\t\t\t\t|    GST TAX                                    =      |  %9.2f |\n",tax);
									System.out.printf("\t\t\t\t\t\t|    Total Bill Amount                          =      | %10.2f |\n",bill);
									System.out.println("\t\t\t\t\t\t|______________________________________________________|____________|");
									System.out.println("\t\t\t\t\t\t|                                                                   |");
									System.out.println("\t\t\t\t\t\t|"+cv.yellow+"                     Thanking You visit Again                      "+cv.reset+"|");
									System.out.println("\t\t\t\t\t\t|___________________________________________________________________|");
							}
							else
							{
								System.out.println("\t\t\t\t\t\t\t  P A Y M E N T   U N S U C C E S S F U L ");
								display();
							}	
							
					}
					else	
						display();

				}
				else if(d==2)
				{
					System.out.println("\t\t\t\t\t\t\t Enter the Date [D/M/Y]");
					String aj = cv.sc.nextLine();
					System.out.println("\t\t\t\t\t\t\t  Enter No of Seats ");
					int ad = Integer.parseInt(cv.sc.nextLine());
					
					new Display().display10();
					System.out.println("\n\t\t\t\t\t\t\t  Please select Seat number [2,4] ");
					int drr1[] = new int[ad];
					for(int i=0;i<ad;i++)
						drr1[i] = Integer.parseInt(cv.sc.nextLine());

					String arr1[] = new String[ad];
					int brr1[] = new int[ad];
					String crr1[] = new String[ad];
					for(int i=0;i<ad;i++)
					{
						System.out.println(cv.yellow+"\t\t\t\t\t\t\t\t    Passenger: "+(i+1)+cv.reset);
						System.out.print(cv.blue+"\n\t\t\t\t\t\t\t\tEnter Your Name   : "+cv.reset);
						arr1[i] = cv.sc.nextLine();
						System.out.print(cv.blue+"\t\t\t\t\t\t\t\tEnter Youe Age    : "+cv.reset);
						brr1[i] = Integer.parseInt(cv.sc.nextLine());
						System.out.print(cv.blue+"\t\t\t\t\t\t\t\tEnter Your Gender : "+cv.reset);
						crr1[i] = cv.sc.nextLine();
						System.out.println(cv.reset);
					}
					
					double tax3 = 0.06*bb*ad;
					double bill3 = tax3+bb*ad;

					System.out.println(cv.red+"\t\t\t\t\t\t\t\t 1 . Proceed ");
					System.out.println(cv.violet+"\t\t\t\t\t\t\t\t 2 . Exit "+cv.reset);
					int ac = Integer.parseInt(cv.sc.nextLine());
					if(ac==1)
					{
						System.out.println("\t\t\t\t\t\t ___________________________________________________________________");
						System.out.println("\t\t\t\t\t\t|               |         |              |             |            | ");
						System.out.println("\t\t\t\t\t\t|     Name      |   Age   |    Gender    |   Seat No   |    Date    | ");
						System.out.println("\t\t\t\t\t\t|_______________|_________|______________|_____________|____________| ");
						for(int i=0;i<ad;i++)
						{
							System.out.println("\t\t\t\t\t\t|               |         |              |             |            | ");
							System.out.printf("\t\t\t\t\t\t|   %-8s    |    %2s   |    %-6s    |     %3d     | %-10s |\n",arr1[i],brr1[i],crr1[i],drr1[i],aj);
							System.out.println("\t\t\t\t\t\t|_______________|_________|______________|_____________|____________| ");
						}
						System.out.printf("\t\t\t\t\t\t|    GST TAX                                    =      |  %9.2f |\n",tax3);
						System.out.printf("\t\t\t\t\t\t|    Total Bill Amount                          =      | %10.2f |\n",bill3);
						System.out.println("\t\t\t\t\t\t|______________________________________________________|____________|");

							boolean E = cv.p2.Onlinepay(bill3);
							cv.sleep1();
							if(E==true)
							{
								System.out.println(cv.yellow+"\n \t\t\t\t\t\t\t P A Y M E N T   S U C C E S S F U L "+cv.reset);
								cv.sleep();
								System.out.println("\t\t\t\t\t\t ___________________________________________________________________");
								System.out.println("\t\t\t\t\t\t|                                                                   | ");
								System.out.println("\t\t\t\t\t\t|"+cv.blue+"                      C V  B U S  T I C K E T        "+cv.reset+"              | ");
								System.out.println("\t\t\t\t\t\t|"+cv.green+"    SOURCE"+cv.reset+cv.red+"                                           Destination  "+cv.reset+" | ");
								System.out.println("\t\t\t\t\t\t|"+cv.blue+"    "+source+cv.reset+"                                        "+cv.violet+Destination1+cv.reset+"      | ");
								System.out.println("\t\t\t\t\t\t|___________________________________________________________________| ");
								System.out.println("\t\t\t\t\t\t|               |         |              |             |            | ");
								System.out.println("\t\t\t\t\t\t|     Name      |   Age   |    Gender    |   Seat No   |    Date    | ");
								System.out.println("\t\t\t\t\t\t|_______________|_________|______________|_____________|____________| ");
								for(int i=0;i<ad;i++)
								{
									System.out.println("\t\t\t\t\t\t|               |         |              |             |            | ");
									System.out.printf("\t\t\t\t\t\t|   %-8s    |    %2s   |    %-6s    |     %3d     | %-10s |\n",arr1[i],brr1[i],crr1[i],drr1[i],aj);
									System.out.println("\t\t\t\t\t\t|_______________|_________|______________|_____________|____________| ");
								}
									System.out.printf("\t\t\t\t\t\t|    GST TAX                                    =      |  %9.2f |\n",tax3);
									System.out.printf("\t\t\t\t\t\t|    Total Bill Amount                          =      | %10.2f |\n",bill3);
									System.out.println("\t\t\t\t\t\t|______________________________________________________|____________|");
									System.out.println("\t\t\t\t\t\t|                                                                   |");
									System.out.println("\t\t\t\t\t\t|"+cv.yellow+"                     Thanking You visit Again                      "+cv.reset+"|");
									System.out.println("\t\t\t\t\t\t|___________________________________________________________________|");
							}
							else
							{
								System.out.println("\t\t\t\t\t\t\t  P A Y M E N T   U N S U C C E S S F U L ");
								display();
							}	
							
					}
					else	
						display();
					
				}
				else 
					display();
			}
			else if(c==2)
			{
				System.out.println(cv.blue+"\t\t\t\t\t\t\t  1 . Seater     -  "+cc+cv.reset);
				System.out.println(cv.violet+"\t\t\t\t\t\t\t  2 . Sleeper    -  "+dd+cv.reset);
				System.out.println(cv.red+"\t\t\t\t\t\t\t  3 . Exit ");
				int e = Integer.parseInt(cv.sc.nextLine());
				if(e==1)
				{
					System.out.println("\t\t\t\t\t\t\t Enter the Date [D/M/Y]");
					String t = cv.sc.nextLine();
					System.out.println("\t\t\t\t\t\t\t  Enter No of Seats ");
					int o = Integer.parseInt(cv.sc.nextLine());
					
					new Display().display10();
					System.out.println("\n\t\t\t\t\t\t\t  Please select Seat number  ");
					int drr2[] = new int[o];
					for(int i=0;i<o;i++)
						drr2[i] = Integer.parseInt(cv.sc.nextLine());

					String arr2[] = new String[o];
					int brr2[] = new int[o];
					String crr2[] = new String[o];
					for(int i=0;i<o;i++)
					{
						System.out.println(cv.yellow+"\t\t\t\t\t\t\t\t    Passenger: "+(i+1)+cv.reset);
						System.out.print(cv.blue+"\n\t\t\t\t\t\t\t\tEnter Your Name   : "+cv.reset);
						arr2[i] = cv.sc.nextLine();
						System.out.print(cv.blue+"\t\t\t\t\t\t\t\tEnter Youe Age    : "+cv.reset);
						brr2[i] = Integer.parseInt(cv.sc.nextLine());
						System.out.print(cv.blue+"\t\t\t\t\t\t\t\tEnter Your Gender : "+cv.reset);
						while(true)
						{
							System.out.print("\t\t\t\t\t\t\t\t\tEnter Your Gender :");
							String gen2 = cv.sc.nextLine();
							if(gen2.equalsIgnoreCase("female") || gen2.equalsIgnoreCase("male") || gen2.equalsIgnoreCase("other"))
							{
								crr2[i]=gen2;
								break;
							}
							else
							{
								System.out.println(cv.red+"\t\t\t\t\tPLEASE ENTER A VALID GENDER"+cv.reset);
							}
						}
						
					}
					double tax1 = 0.06*cc*o;
					double bill1 = tax1+cc*o;

					System.out.println(cv.red+"\t\t\t\t\t\t\t\t 1 . Proceed "+cv.reset);
					System.out.println(cv.violet+"\t\t\t\t\t\t\t\t 2 . Exit "+cv.reset);
					int l = Integer.parseInt(cv.sc.nextLine());
					if(l==1)
					{
						System.out.println("\t\t\t\t\t\t ___________________________________________________________________");
						System.out.println("\t\t\t\t\t\t|               |         |              |             |            | ");
						System.out.println("\t\t\t\t\t\t|     Name      |   Age   |    Gender    |   Seat No   |    Date    | ");
						System.out.println("\t\t\t\t\t\t|_______________|_________|______________|_____________|____________| ");
						for(int i=0;i<o;i++)
						{
							System.out.println("\t\t\t\t\t\t|               |         |              |             |            | ");
							System.out.printf("\t\t\t\t\t\t|   %-8s    |    %2s   |    %-6s    |     %3d     | %-10s |\n",arr2[i],brr2[i],crr2[i],drr2[i],t);
							System.out.println("\t\t\t\t\t\t|_______________|_________|______________|_____________|____________| ");
						}
						System.out.printf("\t\t\t\t\t\t|    GST TAX                                    =      |  %9.2f |\n",tax1);
						System.out.printf("\t\t\t\t\t\t|    Total Bill Amount                          =      | %10.2f |\n",bill1);
						System.out.println("\t\t\t\t\t\t|______________________________________________________|____________|");


							boolean H = cv.p2.Onlinepay(bill1);
							cv.sleep();
							if(H==true)
							{
								System.out.println(cv.yellow+"\n \t\t\t\t\t\t\t P A Y M E N T   S U C C E S S F U L "+cv.reset);
						
								cv.sleep();
								System.out.println("\t\t\t\t\t\t ___________________________________________________________________");
								System.out.println("\t\t\t\t\t\t|                                                                   | ");
								System.out.println("\t\t\t\t\t\t|"+cv.blue+"                      C V  B U S  T I C K E T        "+cv.reset+"              | ");
								System.out.println("\t\t\t\t\t\t|"+cv.green+"    SOURCE"+cv.reset+cv.red+"                                           Destination  "+cv.reset+" | ");
								System.out.println("\t\t\t\t\t\t|"+cv.blue+"    "+source+cv.reset+"                                        "+cv.violet+Destination1+cv.reset+"      | ");
								System.out.println("\t\t\t\t\t\t|___________________________________________________________________| ");
								System.out.println("\t\t\t\t\t\t|               |         |              |             |            | ");
								System.out.println("\t\t\t\t\t\t|     Name      |   Age   |    Gender    |   Seat No   |    Date    | ");
								System.out.println("\t\t\t\t\t\t|_______________|_________|______________|_____________|____________| ");
								for(int i=0;i<o;i++)
								{
									System.out.println("\t\t\t\t\t\t|               |         |              |             |            | ");
									System.out.printf("\t\t\t\t\t\t|   %-8s    |    %2s   |    %-6s    |     %3d     | %-10s |\n",arr2[i],brr2[i],crr2[i],drr2[i],t);
									System.out.println("\t\t\t\t\t\t|_______________|_________|______________|_____________|____________| ");
								}
									System.out.printf("\t\t\t\t\t\t|    GST TAX                                    =      |  %9.2f |\n",tax1);
									System.out.printf("\t\t\t\t\t\t|    Total Bill Amount                          =      | %10.2f |\n",bill1);
									System.out.println("\t\t\t\t\t\t|______________________________________________________|____________|");
									System.out.println("\t\t\t\t\t\t|                                                                   |");
									System.out.println("\t\t\t\t\t\t|"+cv.yellow+"                     Thanking You visit Again                      "+cv.reset+"|");
									System.out.println("\t\t\t\t\t\t|___________________________________________________________________|");
							}
							else
							{
								System.out.println("\t\t\t\t\t\t\t  P A Y M E N T   U N S U C C E S S F U L ");
								display();
							}
							
					}
					else	
						display();

				}
				else if(e==2)
				{
					System.out.println("\t\t\t\t\t\t\t Enter the Date [D/M/Y]");
					String z = cv.sc.nextLine();
					System.out.println("\t\t\t\t\t\t\t  Enter No of Seats ");
					int u = Integer.parseInt(cv.sc.nextLine());
					
					new Display().display10();
					System.out.println("\n\t\t\t\t\t\t\t  Please select Seat number [2,4] ");
					int drr3[] = new int[u];
					for(int i=0;i<u;i++)
						drr3[i] = Integer.parseInt(cv.sc.nextLine());

					String arr3[] = new String[u];
					int brr3[] = new int[u];
					String crr3[] = new String[u];
					
					for(int i=0;i<u;i++)
					{
						System.out.println(cv.yellow+"\t\t\t\t\t\t\t\t    Passenger: "+(i+1)+cv.reset);
						System.out.print(cv.blue+"\n\t\t\t\t\t\t\t\tEnter Your Name   : "+cv.reset);
						arr3[i] = cv.sc.nextLine();
						System.out.print(cv.blue+"\t\t\t\t\t\t\t\tEnter Youe Age    : "+cv.reset);
						brr3[i] = Integer.parseInt(cv.sc.nextLine());
						System.out.print(cv.blue+"\t\t\t\t\t\t\t\tEnter Your Gender : "+cv.reset);
						while(true)
						{
							System.out.print("\t\t\t\t\t\t\t\t\tEnter Your Gender :");
							String gen3 = cv.sc.nextLine();
							if(gen3.equalsIgnoreCase("female") || gen3.equalsIgnoreCase("male") || gen3.equalsIgnoreCase("other"))
							{
								crr3[i]=gen3;
								break;
							}
							else
							{
								System.out.println(cv.red+"\t\t\t\t\tPLEASE ENTER A VALID GENDER"+cv.reset);
							}
						}
						
					}
					double tax2 = 0.06*dd*u;
					double bill2 = tax2+dd*u;

					System.out.println(cv.red+"\t\t\t\t\t\t\t\t 1 . Proceed ");
					System.out.println(cv.violet+"\t\t\t\t\t\t\t\t 2 . Exit "+cv.reset);
					int xy = Integer.parseInt(cv.sc.nextLine());
					if(xy==1)
					{
						System.out.println("\t\t\t\t\t\t ___________________________________________________________________");
						System.out.println("\t\t\t\t\t\t|               |         |              |             |            | ");
						System.out.println("\t\t\t\t\t\t|     Name      |   Age   |    Gender    |   Seat No   |    Date    | ");
						System.out.println("\t\t\t\t\t\t|_______________|_________|______________|_____________|____________| ");
						for(int i=0;i<u;i++)
						{
							System.out.println("\t\t\t\t\t\t|               |         |              |             |            | ");
							System.out.printf("\t\t\t\t\t\t|   %-8s    |    %2s   |    %-6s    |     %3d     | %-10s |\n",arr3[i],brr3[i],crr3[i],drr3[i],z);
							System.out.println("\t\t\t\t\t\t|_______________|_________|______________|_____________|____________| ");
						}
						System.out.printf("\t\t\t\t\t\t|    GST TAX                                    =      |  %9.2f |\n",tax2);
						System.out.printf("\t\t\t\t\t\t|    Total Bill Amount                          =      | %10.2f |\n",bill2);
						System.out.println("\t\t\t\t\t\t|______________________________________________________|____________|");



						boolean J = cv.p2.Onlinepay(bill2);
						cv.sleep();
						if(J==true)
						{
							DateTime.ma();
							System.out.println(cv.yellow+"\n \t\t\t\t\t\t\t P A Y M E N T   S U C C E S S F U L "+cv.reset);
							cv.sleep();
							System.out.println(cv.green+"\n \t\t\t\t\t\t\t     Your Ticket Has been Booked "+cv.reset);
							System.out.println("\t\t\t\t\t\t ___________________________________________________________________");
								System.out.println("\t\t\t\t\t\t|                                                                   | ");
								System.out.println("\t\t\t\t\t\t|"+cv.blue+"                      C V  B U S  T I C K E T        "+cv.reset+"              | ");
								System.out.println("\t\t\t\t\t\t|"+cv.green+"    SOURCE"+cv.reset+cv.red+"                                           Destination  "+cv.reset+" | ");
								System.out.println("\t\t\t\t\t\t|"+cv.blue+"    "+source+cv.reset+"                                        "+cv.violet+Destination1+cv.reset+"      | ");
								System.out.println("\t\t\t\t\t\t|___________________________________________________________________| ");
								System.out.println("\t\t\t\t\t\t|               |         |              |             |            | ");
								System.out.println("\t\t\t\t\t\t|     Name      |   Age   |    Gender    |   Seat No   |    Date    | ");
								System.out.println("\t\t\t\t\t\t|_______________|_________|______________|_____________|____________| ");
								for(int i=0;i<u;i++)
								{
									System.out.println("\t\t\t\t\t\t|               |         |              |             |            | ");
									System.out.printf("\t\t\t\t\t\t|   %-8s    |    %2s   |    %-6s    |     %3d     | %-10s |\n",arr3[i],brr3[i],crr3[i],drr3[i],z);
									System.out.println("\t\t\t\t\t\t|_______________|_________|______________|_____________|____________| ");
								}
									System.out.printf("\t\t\t\t\t\t|    GST TAX                                    =      |  %9.2f |\n",tax2);
									System.out.printf("\t\t\t\t\t\t|    Total Bill Amount                          =      | %10.2f |\n",bill2);
									System.out.println("\t\t\t\t\t\t|______________________________________________________|____________|");
									System.out.println("\t\t\t\t\t\t|                                                                   |");
									System.out.println("\t\t\t\t\t\t|"+cv.yellow+"                     Thanking You visit Again                      "+cv.reset+"|");
									System.out.println("\t\t\t\t\t\t|___________________________________________________________________|");
						}
						else
						{
							System.out.println("\t\t\t\t\t\t\t  P A Y M E N T   U N S U C C E S S F U L ");
							display();
						}	
	
					}
					else	
						display();
				}
				else 
					display();

			}
			else	
				display();

	}
}














class color1
{
	static Scanner sc=new Scanner(System.in);
	static String fred="\u001B[31m";
	static String fgreen="\u001B[32m";
	static String fyellow="\u001B[33m";
	static String fblue="\u001B[34m";
	static String fpurple="\u001B[35m";
	static String fcyan="\u001B[36m";
	static String fwhite="\u001B[37m";
	static String fblack="\u001B[30m";
	static String reset="\u001B[0m";
	static String bblack="\u001B[40m";
	static String bred="\u001B[41m";
	static String bgreen="\u001B[42m";
	static String byellow="\u001B[43m";
	static String bblue="\u001B[44m";
	static String bpurple="\u001B[45m";
	static String bcyan="\u001B[46m";
	static String bwhite="\u001B[47m";
	static String change="\u001B[7m";
	static String thick="\u001B[1m";
	static String blk="\u001B[5m";
	static String ital ="\u001B[3m";
	static String underline="\u001B[4m";
	static void sleep(int a)
	{
		try{
		  Thread.sleep(a);
		}	
		catch(InterruptedException e)
		{
		}
	}
}
class optionprocess extends project1
{
	static double price=0;
	static void passengersname(int n)
	{
		String le=String.valueOf(n);
		int c = Integer.parseInt(le);
        	String ticket = "HYD23";
        	String[][] pass = new String[c+1][3];
        	for(int i=1;i<=c;i++)
        	{
          	 	System.out.println(fred+ital+"Passenger : "+i+reset);
            		System.out.print(fyellow+ital+"\t\tName   :  "+reset);
            		pass[i][0]  = sc.nextLine();
            		System.out.print(fyellow+ital+"\t\tAge    :  "+reset);
            		pass[i][1] = sc.nextLine();
			while(true)
			{
				System.out.print(fyellow+ital+"\t\tGender :  "+reset);
				pass[i][2] = sc.nextLine();
				if(pass[i][2].equalsIgnoreCase("male") || pass[i][2].equalsIgnoreCase("female"))
				{
					break;
				}
				else
					System.out.println(fred+"\t\t\t\tInvalid Gender:"+reset);
			}
		}
            	System.out.println(fyellow+change+thick+"\t\t\t __________________________________________________________________________________________ "+reset);
            	System.out.println(fyellow+change+thick+"\t\t\t|        |                               |              |               |                  |"+reset);
            	System.out.println(fyellow+change+thick+ital+"\t\t\t| SL.No. |        Passenger Name         |      Age     |    Gender     |     Ticket No.   |"+reset);
            	System.out.println(fyellow+change+thick+"\t\t\t|________|_______________________________|______________|_______________|__________________|"+reset);
        	for(int i=1;i<=c;i++)
        	{
            		System.out.printf("\t\t\t"+fred+thick+change+"|  %2d    |    %-25s  |       %2s     |     %-6s    |     %5s%03d     |",(i),pass[i][0],pass[i][1],pass[i][2],ticket,i,reset);
            		System.out.println("\n\t\t\t"+fred+thick+change+"|________|_______________________________|______________|_______________|__________________|"+reset);
        	}
		System.out.println(reset);
	}
	static int selection()
	{
		return Integer.parseInt(sc.nextLine());
	}
	static void billing(int n,double price)
	{
		double result=n*price;
		double result1=result*0.03+result;
		System.out.printf(fblue+thick+ital+"\t\t\tTotal Cost is :  %10.3f \n",result,reset);
		System.out.printf(fblue+thick+ital+"\t\t\tWith GST 3%%   :  %10.3f \n",result*0.03);
		System.out.println(fyellow+thick+ital+"\t\t\t--------------------------");
		System.out.printf(fyellow+thick+ital+"\t\t\tTOTAL COST IS :  %10.3f\n",result1,reset);
		boolean val= cv.p2.Onlinepay(result1);
		if(val==true)
		{
			DateTime.ma();
			System.out.println(fpurple+change+thick+ital+"\n\n\t\t\t\t\t~~~~~~ T I C K E T      S U C C E S S F U L L Y      B O O K E D  ~~~~~~"+reset);
		}
		else
		{
			DateTime.ma();
			System.out.println(fpurple+change+thick+ital+"\n\n\t\t\t\t\t~~~~~~ T I C K E T      S U C C E S S F U L L Y    N O T   B O O K E D  ~~~~~~"+reset);
		}
	}
	static void trainslist()
	{
		System.out.println(bblue+ital+"\t\t\t\t\t SELECT  THE  TRAIN "+reset+"\n");
		System.out.println(fgreen+ital+"1. VANDE BHARATH\t\t2. KONARK EXPRESS\t\t 3. GARIB RATH\t\t 4. VENKATADRI EXPRESS"+reset);
		int x=Integer.parseInt(sc.nextLine());
		if(x==1)
		  vandebharath();
		if(x==2)
		  konarkexpress();
		if(x==3)
		  garibrath();
		if(x==4)
		  venkatadriexpress();
		else if(x>=5 || x==0)
		{
			System.out.println(fred+ital+"\n\t\t\t\tInvalid Input"+reset);
			System.out.println(fblue+change+ital+"Continue Enter:  1"+reset+fblue+change+thick+"\t\t\tFor Exist Enter Any KeY"+reset);
			int n1=Integer.parseInt(sc.nextLine());
			if(n1==1)
				trainslist();
		}
	}
	static void vandebharath()
	{
		System.out.println(" _   _                 _      _     _                     _   _     ");
        	System.out.println("| | | |               | |    | |   | |                   | | | |    ");
        	System.out.println("| | | | __ _ _ __   _| | ___| |_ | |__   __ _ _ __ __ | |_| |_  ");
        	System.out.println("| | | |/ ` | ' \\ / ` |/ _ \\ ' \\| '_ \\ / ` | '__/ _` | __| ' \\ ");
        	System.out.println("\\ \\_/ / (_| | | | | (_| |  __/ |_) | | | | (_| | | | (_| | |_| | | |");
        	System.out.println(" \\___/ \\__,_|_| |_|\\__,_|\\___|_.__/|_| |_|\\__,_|_|  \\__,_|\\__|_| |_|");
        	System.out.println("                                                                  ");
        	System.out.println("                                                                  ");		
		options();
	}
	static void ac()
	{
		price = 1500;
		System.out.println(fpurple+thick+ital+"\t\t\tTicket Cost: "+reset+fyellow+thick+price+reset);
		System.out.print(fblue+thick+ital+"\t\t\tSelect no.of Passengers: "+reset+fyellow+thick);
		int n=Integer.parseInt(sc.nextLine());
		System.out.println(reset);
		passengersname(n);
		billing(n,price);
	}
	static void sleeper()
	{
		price=700;
		System.out.println(fpurple+thick+ital+"\t\t\tTicket Cost: "+reset+fyellow+thick+price+reset);
		System.out.print(fblue+thick+ital+"\t\t\tSelect no.of Passengers: "+reset+fyellow+thick);
		int n=Integer.parseInt(sc.nextLine());
		System.out.println(reset);
		passengersname(n);
		billing(n,price);
	}
	static void sitting()
	{
		price =400;
		System.out.println(fpurple+thick+ital+"\t\t\tTicket Cost: "+reset+fyellow+thick+price+reset);
		System.out.print(fblue+thick+ital+"\t\t\tSelect no.of Passengers: "+reset+fyellow+thick);
		int n=Integer.parseInt(sc.nextLine());
		System.out.println(reset);
		passengersname(n);
		billing(n,price);
	}
	static void options()
	{
		System.out.println(ital+fpurple+change+"PRESS 1"+reset+fgreen+"  -->  "+reset+fpurple+" TO SELECT AC"+reset);
		System.out.println(fcyan+ital+change+"PRESS 2"+reset+fgreen+"  -->  "+reset+fcyan+" TO SELECT SLEEPER"+reset);
		System.out.println(fblue+ital+change+"PRESS 3"+reset+fgreen+"  -->  "+reset+fblue+" TO SELECT 2S"+reset);
		int x1=Integer.parseInt(sc.nextLine());
		if(x1==1)
		   ac();
		else if(x1==2)
		   sleeper();
		else if(x1==3)
		   sitting();
		else
		{
		  System.out.println(ital+fred+"\t\t\t\t\t  Invalid Input");
		  System.out.println(fcyan+thick+change+ital+"\n\t\t\tContinue Press 1:\t\t For Exist Enter Any Key:"+reset);
		  int x2=Integer.parseInt(sc.nextLine());
		  if(x2==1)
		    options();
		}
	}
	static void konarkexpress()
	{
		System.out.println("  _  ______  _   _          _____  _  __  ________   _______  _____  ______  _____ _____ ");
        	System.out.println(" | |/ / __ \\| \\ | |   /\\   |  __ \\| |/ / |  ____\\ \\ / /  __ \\|  __ \\|  ____|/ ____/ ____|");
       	 	System.out.println(" | ' / |  | |  \\| |  /  \\  | |_) | ' /  | |_   \\ V /| |_) | |__) | |_  | (__| (__  ");
        	System.out.println(" |  <| |  | | . ` | / /\\ \\ |  _  /|  <   |  _|   > < |  ___/|  _  /|  __|  \\__ \\\\___ \\ ");
       		System.out.println(" | . \\ |_| | |\\  |/ ____ \\| | \\ \\| . \\  | |___ / . \\| |    | | \\ \\| |____ ____) |___) |");
        	System.out.println(" |_|\\_\\____/|_| \\_/_/    \\_\\_|  \\_\\_|\\_\\ |______/_/ \\_\\_|    |_|  \\_\\______|_____/_____/ ");
        	System.out.println("                                                                                         ");
        	System.out.println("                                                                                         ");
		options();		
	}
	static void garibrath()
	{
	
        	System.out.println("   _____          _____  _____ ____    _____         _______ _    _ ");
        	System.out.println("  / ___|   /\\   |  __ \\|   |  _ \\  |  __ \\     /\\|_   __| |  | |");
        	System.out.println(" | |  __   /  \\  | |__) | | | | |_) | | |__) |   /  \\  | |  | |__| |");
        	System.out.println(" | | |_ | / /\\ \\ |  _  /  | | |  _ <  |  _  /   / /\\ \\ | |  |  __  |");
        	System.out.println(" | |__| |/ ____ \\| | \\ \\ _| |_| |_) | | | \\ \\  / ____ \\  |  | |  | |");
        	System.out.println("  \\_____/_/    \\_\\_|  \\_\\_____|____/  |_|  \\_\\/_/    \\_\\_|  |_|  |_|");
		options();
	}
	static void venkatadriexpress()
	{
		System.out.println(" __      ________ _   _ _  __       _______       _____  _____  _____   ________   _______  _____  ______  _____ _____ ");
        	System.out.println(" \\ \\    / /  ___| \\ | | |/ /    /\\|_   _|/\\   |  __ \\|  __ \\|   _| |  ____\\ \\ / /  __ \\|  __ \\|  ____|/ ____/ ____|");
        	System.out.println("  \\ \\  / /| |__  |  \\| | ' /    /  \\  | |  /  \\  | |  | | |_) | | |   | |_   \\ V /| |_) | |__) | |_  | (__| (__  ");
        	System.out.println("   \\ \\/ / |  _| | . ` |  <    / /\\ \\ | | / /\\ \\ | |  | |  _  /  | |   |  __|   > < |  ___/|  _  /|  __|  \\__ \\\\___ \\ ");
        	System.out.println("    \\  /  | |___| |\\  | . \\  / ____ \\| |/ ____ \\| |__| | | \\ \\ _| |  | |____ / . \\| |    | | \\ \\ |____ ____) |___) |");
        	System.out.println("     \\/   |______|_| \\_|_|\\_\\/_/    \\_\\_/_/    \\_\\_____/|_|  \\_\\_____| |______/_/ \\_\\_|    |_|  \\_\\______|_____/_____/ ");
        	System.out.println("                                                                                                                        ");
        	System.out.println("                                                                                                                        ");
		options();
	}
	static void MAMA()
	{
		String a=null,b=null;
		ArrayList<String> t1=new ArrayList<>(Arrays.asList("TENALI","VIZAG","KADAPA","CHENNAI"));
		ArrayList<String> t2=new ArrayList<>(Arrays.asList("VIJAYWADA","TAMIL-NADU","ANANTAPUR","BANGLORE"));
	 while(true)
	 {
		System.out.println(ital+bpurple+"SELECT STARTING  AND DESTINATION:"+reset);
		int n=selection();
		int m=selection();
		if(n==1 || m==1)
		{
		 	if(n==1)
		  		a=t1.get(n-1);
		 	if(m==1)
			{
		    		b="\t"+t2.get(m-1);
				break;
			}
		}
		 if(n==2 || m==2)
		 {
		  	if(n==2)
		   		a=t1.get(n-1);
		  	if(m==2)
			{
		   		b="\t"+t2.get(m-1);
				break;
			}
		 }
		 if(n==3 || m==3)
		 {
		  	if(n==3)
				a=t1.get(n-1);
		  	if(m==3)
			{
				b="\t"+t2.get(m-1);
				break;
			}
		 }
		 if(n==4 || m==4)
		 {
		  	if(n==4)
		   		a=t1.get(n-1);
		  	if(m==4)
			{
		   		b="\t"+t2.get(m-1);
				break;
			}
		 }
		else if((n>4 || m>4) || (n==0 || m==0))
		{
			if((n>4 || n==0) && (m>4 || n==0))
			{
		  		System.out.println(ital+fred+"\t\t\tInvalid Source And Destination"+reset+"\n");

			}
			else if(n>4 || n==0)
			{
				System.out.println(ital+fred+"\t\t\tInvalid Source "+reset+"\n");
			}
			else if(m>4 || m==0)
			{
				System.out.println(ital+fred+"\t\t\t\tInvalid Destination "+reset+"\n");
			}
		}
	 }
		String[] diagram = {
            				"             * * *                                                       * * *",
            				"            *     *                                                     *     *",
            				"            * (O) *                                                     * (O) *",
            				"             *   *                               * *                     *   *",
            				"               *                                * O *                      *",
            				"      SOURCE       ~~~... ~ ~ ~ ... ~~ ...~~...~ ... ~~~...~~~....         DESTINATION",
            				"       "+a+"           * O * 					              "+b,
            				"                         * * ",
           	 			"",
            				""
        				};

        	for (String line : diagram)
		{
            		for(int i=0;i<=line.length()-1;i++)
            		{
                		if(line.charAt(i)>=65 && line.charAt(i)<=90)
				{
                    			System.out.print("\u001B[31m"+line.charAt(i)+"\u001B[0m");
				}
                		else
				{
                    			System.out.print("\u001B[33m"+line.charAt(i)+"\u001B[0m");
				}
            		}
            		System.out.println();
        	}
     }
}
class project1 extends color1
{
	static void selectionprocess()
	{
		int c=0,c1=0,c2=0;
		System.out.print(fyellow+"\tF R O M"+reset+fyellow+"\t\t\t\t\t\tT O"+reset+"\n");
		String[] t1=new String[]{"TENALI","VIJAYWADA","VIZAG","TAMIL-NADU","KADAPA","ANANTAPUR","CHENNAI","BANGLORE"};
		for(String i : t1)
		{
			c++;
			if(c%2==0)
			{
			   c1++;
			   System.out.print(fred);
			   System.out.printf("%-2d--> ",c1);
			   System.out.print(reset+fgreen);
			   System.out.printf("%3s \n",i);
			   System.out.print(reset);
			}
			else
			{
			   c2++;
			   System.out.print(fred);
			   System.out.printf("%4d--> ",c2);
			   System.out.print(reset+fgreen);
			   System.out.printf("%3s",i);
			   System.out.print("\t\t\t\t\t");
			   System.out.print(reset);
			}
		}
		System.out.println(reset);
		optionprocess.MAMA();
		optionprocess.trainslist();
	}
	static void MMM1()
	{
		String title="~~~~~ W E L C O M E     T O     T R A I N    B O O K I N G ~~~~~";
		for(int i=0;i<=title.length()-1;i++)
		{
			if(i==0)
			   System.out.print("\t\t\t\t\t");
			System.out.print(blk+underline+ital+fcyan+title.charAt(i));
			sleep(70);
		}
		System.out.println(reset+"\n\n");
		selectionprocess();
	}
}
















class Airlines
{
	public static final String rst = "\033[0m";  		// Text Reset

	public static final String b = "\033[0;30m";  	 	// BLACK
    	public static final String r = "\033[0;31m";     		// RED
    	public static final String g = "\033[0;32m";   	 	// GREEN
    	public static final String y = "\033[0;33m";  	 	// YELLOW
    	public static final String bl = "\033[0;34m";    		// BLUE
    	public static final String p = "\033[0;35m";  	 	// PURPLE
    	public static final String c = "\033[0;36m";     		// CYAN
    	public static final String w = "\033[0;37m";    		// WHITE

	public static final String bb = "\033[0;90m";  // BLACK_BRIGHT
    	public static final String rb = "\033[0;91m";    // RED
    	public static final String gb = "\033[0;92m";  // GREEN
    	public static final String yb = "\033[0;93m"; // YELLOW
    	public static final String blb = "\033[0;94m";   // BLUE
    	public static final String pb = "\033[0;95m"; // PURPLE
    	public static final String cb = "\033[0;96m";   // CYAN
    	public static final String wb = "\033[0;97m";  // WHITE
	
	public static final String blk = "\u001B[5m";		//Blink

	public static final String bbg = "\033[40m";  // BLACK
    	public static final String wbg = "\033[47m";  // WHITE

 	static String time;
	static String bording;
	static String destination;
	static String date;
	static String fly;
	static String typ;
	static Scanner obj=new Scanner(System.in);


	static void flight()
	{
		cv.sleep1();
		System.out.println(r+"\t\t\t\t\t\t                                |");cv.sleep1();
        	System.out.println("\t\t\t\t\t\t                          --====|====--");cv.sleep1();
        	System.out.println("\t\t\t\t\t\t                                |");cv.sleep1();
        	System.out.println("\t\t\t\t\t\t                            .-\"\"\"\"\"\"-.");cv.sleep1();
        	System.out.println("\t\t\t\t\t\t                          .'_________'.");cv.sleep1();
        	System.out.println("\t\t\t\t\t\t                         /_/_|__|__|_\\_\\"+rst);cv.sleep1();
        	System.out.println("\t\t\t\t\t\t                        ;'-._       _.-';");cv.sleep1();
        	System.out.println("\t\t\t\t\t\t   ,--------------------|    `-. .-'    |--------------------,");cv.sleep1();
        	System.out.println("\t\t\t\t\t\t    ``\"\"--..__    ___   ;       '       ;   ___    __..--\"\"``");cv.sleep1();
        	System.out.println("\t\t\t\t\t\t              `\"-// \\\\.._\\             /_..// \\\\-\"`");cv.sleep1();
        	System.out.println("\t\t\t\t\t\t                 \\\\_//    '._       _.'    \\\\_//");cv.sleep1();
        	System.out.println("\t\t\t\t\t\t                  `\"`        ``---``        `\"`");cv.sleep1();
        	System.out.println();
			cv.sleep();
        	System.out.println("");
		String asciiArt = 
            	r+blk+"\t\t\t    /$$$$$$  /$$    /$$        "+rst+w+blk+"/$$$$$$  /$$$$$$ /$$$$$$$  /$$       /$$$$$$ /$$   /$$ /$$$$$$$$  /$$$$$$ \n" +
           	r+blk+"\t\t\t   /$$__  $$| $$   | $$"+rst+w+blk+"       /$$__  $$|_  $$_/| $$__  $$| $$      |_  $$_/| $$$ | $$| $$_____/ /$$__  $$\n" +
            	r+blk+"\t\t\t  | $$  \\__/| $$   | $$"+rst+w+blk+"      | $$  \\ $$  | $$  | $$  \\ $$| $$        | $$  | $$$$| $$| $$      | $$  \\__/\n" +
            	r+blk+"\t\t\t  | $$      |  $$ / $$/"+rst+w+blk+"      | $$$$$$$$  | $$  | $$$$$$$/| $$        | $$  | $$ $$ $$| $$$$$   |  $$$$$$ \n" +
            	r+blk+"\t\t\t  | $$       \\  $$ $$/"+rst+w+blk+"       | $$__  $$  | $$  | $$__  $$| $$        | $$  | $$  $$$$| $$__/    \\____  $$\n" +
            	r+blk+"\t\t\t  | $$    $$  \\  $$$/"+rst+w+blk+"        | $$  | $$  | $$  | $$  \\ $$| $$        | $$  | $$\\  $$$| $$       /$$  \\ $$\n" +
            	r+blk+"\t\t\t  |  $$$$$$/   \\  $/"+rst+w+blk+"         | $$  | $$ /$$$$$$| $$  | $$| $$$$$$$$ /$$$$$$| $$ \\  $$| $$$$$$$$|  $$$$$$/\n" +
            	r+blk+"\t\t\t   \\______/     \\_/"+rst+w+blk+"          |__/  |__/|______/|__/  |__/|________/|______/|__/  \\__/|________/ \\______/ \n"+rst;

        	System.out.println(asciiArt);
		System.out.println(r+"\t\t\t    ****************************  "+w+"W E L C O M E  T O  C V  A I R L I N E S"+rst+r+"  ****************************"+rst);
		airselection();
	}
	static void airselection()
	{
		cv.sleep();
		System.out.println();
		System.out.println(p+"\t\t\t\t\t\t\t***********************************************");
		System.out.println("\t\t\t\t\t\t\t|1   H Y D E R A B A D  T O  B A N G K O K    |");
		System.out.println("\t\t\t\t\t\t\t***********************************************"+rst);
		System.out.println();
		System.out.println(y+"\t\t\t\t\t\t\t***********************************************");
		System.out.println("\t\t\t\t\t\t\t|2   H Y D E R A B A D  T O  S I N G A P O R E|");
		System.out.println("\t\t\t\t\t\t\t***********************************************"+rst);
		System.out.println();
		System.out.println(g+"\t\t\t\t\t\t\t***********************************************");
		System.out.println("\t\t\t\t\t\t\t|3   H Y D E R A B A D  T O  G O A            |");
		System.out.println("\t\t\t\t\t\t\t***********************************************");
		System.out.println();
		System.out.println(bl+"\t\t\t\t\t\t\t***********************************************");
		System.out.println("\t\t\t\t\t\t\t|4   H Y D E R A B A D  T O  K A V A L I      |");
		System.out.println("\t\t\t\t\t\t\t***********************************************"+rst);
		System.out.println();
		int place=Integer.parseInt(obj.nextLine());
		if(place==1)
		{
			bording="HYDERABAD";
			destination="BANGKOK";
			hyb();
		}
		else if(place==2)
		{
			bording="HYDERABAD";
			destination="SINGAPORE";
			hys();
		}
		else if(place==3)
		{
			bording="HYDERABAD";
			destination="GOA";
			hyg();
		}
		else if(place==4)
		{
			bording="HYDERABAD";
			destination="KAVALI";
			hyk();
		}
		else
		{
			airselection();
		}
	}
	static void hyb()
	{
    		System.out.println(p+"\t          *****"+rst+blk+"                              -.                 `|.                                                       "+blk+rst+p+"*****     ");
        	System.out.println("\t        *********"+rst+blk+"                            |:\\-,              .| \\.                                                   "+blk+rst+p+"*********   ");
        	System.out.println("\t       ***********"+rst+blk+"                           |: `.------------------------------------.                                "+blk+rst+p+"***********  ");
        	System.out.println("\t       ***********"+rst+blk+"   >>>>>>>>>>>>>>>>>       / /   o o o o o o o o o o o o o.-.o o   (_`.     >>>>>>>>>>>>>>>>>>>>>    "+blk+rst+p+"***********  ");
        	System.out.println("\t        *********"+rst+blk+"                           /_ \\_              .     .=     |'|         `)                              "+blk+rst+p+"*********   ");
        	System.out.println("\t         *******"+rst+blk+"                            ``\"\"\"\"\"\"\"\"\"\"\"//    /  \"\"\"\"\"\" `\"\"\"                                            "+blk+rst+p+"*******    ");
        	System.out.println("\t          *****"+rst+blk+"                                        <//   /_(                                                          "+blk+rst+p+"*****     ");
        	System.out.println("\t           ***"+rst+blk+"                                         //  /                                                               "+blk+rst+p+"***      ");
        	System.out.println("\t            *"+rst+blk+"                                         // /                                                                  "+blk+rst+p+"*       "+rst);
        	System.out.println("\t        HYDERABAD                                    ----'                                                               BANGAKOK   ");
		System.out.println();
		System.out.println(p+blk+"\t\t\t\t\t-----Y O U  N A U G H T Y  B O Y  Y O U  W A N T  M A S S A G E  A A A-----"+rst);
		System.out.println();
		System.out.println(r+"\t\t\t\t\t---PLEASE ENTER THE DATE YOU WANT TO TRAVEL IN SPECIFIC FORMAT"+rst+"(DD/MM/YYYY)---");
		System.out.println("\t\t\t\t\t");
		date=obj.nextLine();
		while(true)
		{
			System.out.println();
			System.out.println("\t\t\t\t\t\tP L E A S E  S E L E C T  T H E  A I R L I N E  Y O U  W A N T");
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t\t**********************************");
			System.out.println("\t\t\t\t\t\t\t\t|"+c+"1   K I N G F I S H E R         "+rst+"|");
			System.out.println("\t\t\t\t\t\t\t\t**********************************");
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t\t**********************************");
			System.out.println("\t\t\t\t\t\t\t\t|"+y+"2   A I R I N D I A             "+rst+"|");
			System.out.println("\t\t\t\t\t\t\t\t**********************************");
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t\t**********************************");
			System.out.println("\t\t\t\t\t\t\t\t|"+g+"3   A I R  A S I A  I N D I A   "+rst+"|");
			System.out.println("\t\t\t\t\t\t\t\t**********************************");
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t\t**********************************");
			System.out.println("\t\t\t\t\t\t\t\t|"+bl+"4   J E T  A I R W A Y S        "+rst+"|");
			System.out.println("\t\t\t\t\t\t\t\t**********************************");
			System.out.println();
			int a=Integer.parseInt(obj.nextLine());
			if(a==1)
			{
				fly="KINGFISHER";
				king();
				break;
			}
			else if(a==2)
			{
				fly="AIR INDIA";
				air();
				break;
			}
			else if(a==3)
			{
				fly="AIR ASIA INDIA";
				nave();
				break;
			}
			else if(a==4)
			{
				fly="JET AIRWAYS";
				a121();
				break;
			}
			else
			{
				System.out.println(c+"\t\t\t\t\t\t\tYOU ENTERED A INVALID OPTION PLEASE SELECT A VALID OPTION"+rst);
			}
		}


	}
	static void hys()
	{
         	System.out.println(y+"\t          *****"+rst+blk+"                              -.                 `|.                                                        "+blk+rst+y+"*****     ");
        	System.out.println("\t        *********"+rst+blk+"                            |:\\-,              .| \\.                                                    "+blk+rst+y+"*********   ");
        	System.out.println("\t       ***********"+rst+blk+"                           |: `.------------------------------------.                                 "+blk+rst+y+"***********  ");
        	System.out.println("\t       ***********"+rst+blk+"   >>>>>>>>>>>>>>>>>       / /   o o o o o o o o o o o o o.-.o o   (_`.     >>>>>>>>>>>>>>>>>>>>      "+blk+rst+y+"***********  ");
        	System.out.println("\t        *********"+rst+blk+"                           /_ \\_              .     .=     |'|         `)                               "+blk+rst+y+"*********   ");
        	System.out.println("\t         *******"+rst+blk+"                            ``\"\"\"\"\"\"\"\"\"\"\"//    /  \"\"\"\"\"\" `\"\"\"                                             "+blk+rst+y+"*******    ");
        	System.out.println("\t          *****"+rst+blk+"                                        <//   /_(                                                           "+blk+rst+y+"*****     ");
        	System.out.println("\t           ***"+rst+blk+"                                         //  /                                                                "+blk+rst+y+"***      ");
        	System.out.println("\t            *"+rst+blk+"                                         // /                                                                   "+blk+rst+y+"*       "+rst);
        	System.out.println("\t        HYDERABAD                                    ----'                                                               SINGAPOUR   ");
		System.out.println();
		System.out.println(r+"\t\t\t\t\t---PLEASE ENTER THE DATE YOU WANT TO TRAVEL IN SPECIFIC FORMAT"+rst+"(DD/MM/YYYY)---");
		System.out.println("\t\t\t\t\t");
		date=obj.nextLine();
		while(true)
		{
			System.out.println();
			System.out.println("\t\t\t\t\t\tP L E A S E  S E L E C T  T H E  A I R L I N E  Y O U  W A N T");
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t   **************************************");
			System.out.println("\t\t\t\t\t\t\t   |"+p+"1   Q A T A R  A I R W A Y S        "+rst+"|");
			System.out.println("\t\t\t\t\t\t\t   **************************************");
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t   **************************************");
			System.out.println("\t\t\t\t\t\t\t   |"+c+"2   L U F T H A N S A               "+rst+"|");
			System.out.println("\t\t\t\t\t\t\t   **************************************");
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t   **************************************");
			System.out.println("\t\t\t\t\t\t\t   |"+g+"3   E M I R A T E S  A I R L I N E S"+rst+"|");
			System.out.println("\t\t\t\t\t\t\t   **************************************");
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t   **************************************");
			System.out.println("\t\t\t\t\t\t\t   |"+bl+"4   J E T  A I R W A Y S            "+rst+"|");
			System.out.println("\t\t\t\t\t\t\t   **************************************");
			int a=Integer.parseInt(obj.nextLine());
			if(a==1)
			{
				fly="QATAR AIRWAYS";
				king();
				break;
			}
			else if(a==2)
			{
				fly="LUFTHANSA";
				air();
				break;
			}
			else if(a==3)
			{
				fly="EMIRATES AIRLINES";
				nave();
				break;
			}
			else if(a==4)
			{
				fly="JET AIRWAYS";
				a121();
				break;
			}
			else
			{
				System.out.println(c+"\t\t\t\t\t\t\tYOU ENTERED A INVALID OPTION PLEASE SELECT A VALID OPTION"+rst);
			}
		}

	}
	static void hyg()
	{
         	System.out.println(g+"\t          *****"+rst+blk+"                              -.                 `|.                                                        "+blk+rst+g+"*****     ");
        	System.out.println("\t        *********"+rst+blk+"                            |:\\-,              .| \\.                                                    "+blk+rst+g+"*********   ");
        	System.out.println("\t       ***********"+rst+blk+"                           |: `.------------------------------------.                                 "+blk+rst+g+"***********  ");
        	System.out.println("\t       ***********"+rst+blk+"   >>>>>>>>>>>>>>>>>       / /   o o o o o o o o o o o o o.-.o o   (_`.     >>>>>>>>>>>>>>>>>>>>>     "+blk+rst+g+"***********  ");
        	System.out.println("\t        *********"+rst+blk+"                           /_ \\_              .     .=     |'|         `)                               "+blk+rst+g+"*********   ");
        	System.out.println("\t         *******"+rst+blk+"                            ``\"\"\"\"\"\"\"\"\"\"\"//    /  \"\"\"\"\"\" `\"\"\"                                             "+blk+rst+g+"*******    ");
        	System.out.println("\t          *****"+rst+blk+"                                        <//   /_(                                                           "+blk+rst+g+"*****     ");
        	System.out.println("\t           ***"+rst+blk+"                                         //  /                                                                "+blk+rst+g+"***      ");
        	System.out.println("\t            *"+rst+blk+"                                         // /                                                                   "+blk+rst+g+"*       "+rst);
        	System.out.println("\t        HYDERABAD                                    ----'                                                                  GOA      ");
		System.out.println();
		System.out.println(r+"\t\t\t\t\t---PLEASE ENTER THE DATE YOU WANT TO TRAVEL IN SPECIFIC FORMAT"+rst+"(DD/MM/YYYY)---");
		System.out.println();
		date=obj.nextLine();
		while(true)
		{
			System.out.println();
			System.out.println("\t\t\t\t\t\tP L E A S E  S E L E C T  T H E  A I R L I N E  Y O U  W A N T");
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t\t**********************************");
			System.out.println("\t\t\t\t\t\t\t\t|"+p+"1   A L A S K A  A I R L I N E S"+rst+"|");
			System.out.println("\t\t\t\t\t\t\t\t**********************************");
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t\t**********************************");
			System.out.println("\t\t\t\t\t\t\t\t|"+y+"2   A I R  A U S T R A L        "+rst+"|");
			System.out.println("\t\t\t\t\t\t\t\t**********************************");
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t\t**********************************");
			System.out.println("\t\t\t\t\t\t\t\t|"+c+"3   A E G E A N  A I R L I N E S"+rst+"|");
			System.out.println("\t\t\t\t\t\t\t\t**********************************");
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t\t**********************************");
			System.out.println("\t\t\t\t\t\t\t\t|"+bl+"4   121 A I R L I N E S         "+rst+"|");
			System.out.println("\t\t\t\t\t\t\t\t**********************************");
			System.out.println();
			int a=Integer.parseInt(obj.nextLine());
			if(a==1)
			{
				fly="ALASKA AIRLINES";
				king();
				break;
			}
			else if(a==2)
			{
				fly="AIR AUSTRAL";
				air();
				break;
			}
			else if(a==3)
			{
				fly="AEGEAN AIRLINES";
				nave();
				break;
			}
			else if(a==4)
			{
				fly="121 AIRLINES";
				a121();
				break;
			}
			else
			{
				System.out.println(c+"\t\t\t\t\t\t\tYOU ENTERED A INVALID OPTION PLEASE SELECT A VALID OPTION"+rst);
			}
		}

	}
	static void hyk()
	{
         	System.out.println(bl+"\t          *****"+rst+blk+"                              -.                 `|.                                                        "+blk+rst+bl+"*****     ");
        	System.out.println("\t        *********"+rst+blk+"                            |:\\-,              .| \\.                                                    "+blk+rst+bl+"*********   ");
        	System.out.println("\t       ***********"+rst+blk+"                           |: `.------------------------------------.                                 "+blk+rst+bl+"***********  ");
        	System.out.println("\t       ***********"+rst+blk+"   >>>>>>>>>>>>>>>>>       / /   o o o o o o o o o o o o o.-.o o   (_`.     >>>>>>>>>>>>>>>>>>>>>     "+blk+rst+bl+"***********  ");
        	System.out.println("\t        *********"+rst+blk+"                           /_ \\_              .     .=     |'|         `)                               "+blk+rst+bl+"*********   ");
        	System.out.println("\t         *******"+rst+blk+"                            ``\"\"\"\"\"\"\"\"\"\"\"//    /  \"\"\"\"\"\" `\"\"\"                                             "+blk+rst+bl+"*******    ");
        	System.out.println("\t          *****"+rst+blk+"                                        <//   /_(                                                           "+blk+rst+bl+"*****     ");
        	System.out.println("\t           ***"+rst+blk+"                                         //  /                                                                "+blk+rst+bl+"***      ");
        	System.out.println("\t            *"+rst+blk+"                                         // /                                                                   "+blk+rst+bl+"*       "+rst);
        	System.out.println("\t        HYDERABAD                                    ----'                                                                 KAVALI    ");
		System.out.println();
		System.out.println(r+"\t\t\t\t\t---PLEASE ENTER THE DATE YOU WANT TO TRAVEL IN SPECIFIC FORMAT"+rst+"(DD/MM/YYYY)---");
		System.out.println("\t\t\t\t\t");
		date=obj.nextLine();
		while(true)
		{
			System.out.println();
			System.out.println("\t\t\t\t\t\tP L E A S E  S E L E C T  T H E  A I R L I N E  Y O U  W A N T");
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t\t**********************************");
			System.out.println("\t\t\t\t\t\t\t\t|"+p+"1   A L A S K A  A I R L I N E S"+rst+"|");
			System.out.println("\t\t\t\t\t\t\t\t**********************************");
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t\t**********************************");
			System.out.println("\t\t\t\t\t\t\t\t|"+y+"2   A I R  A U S T R A L        "+rst+"|");
			System.out.println("\t\t\t\t\t\t\t\t**********************************");
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t\t**********************************");
			System.out.println("\t\t\t\t\t\t\t\t|"+g+"3   A E G E A N  A I R L I N E S"+rst+"|");
			System.out.println("\t\t\t\t\t\t\t\t**********************************");
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t\t**********************************");
			System.out.println("\t\t\t\t\t\t\t\t|"+c+"4   I N D I G O  A I R L I N E S"+rst+"|");
			System.out.println("\t\t\t\t\t\t\t\t**********************************");
			System.out.println();
			int a=Integer.parseInt(obj.nextLine());
			if(a==1)
			{
				fly="ALASKA AIRLINES";
				king();
				break;
			}
			else if(a==2)
			{
				fly="AIR AUSTRAL";
				air();
				break;
			}
			else if(a==3)
			{
				fly="AEGEAN AIRLINES";
				nave();
				break;
			}
			else if(a==4)
			{
				fly="INDIGO AIRLINES";
				a121();
				break;
			}
			else
			{
				System.out.println(c+"\t\t\t\t\t\t\tYOU ENTERED A INVALID OPTION PLEASE SELECT A VALID OPTION"+rst);
			}
		}

	}
	static void king()
	{
		while(true)
		{
			System.out.println(p+blk+"\t\t\t\t\t\t    ___________     __________     __________     __________ ");
			System.out.println("\t\t\t\t\t\t   |           |   |          |   |          |   |          |");      
			System.out.println("\t\t\t\t\t\t   |"+rst+w+" 10:00 AM  "+rst+p+blk+"|   |"+rst+w+" 01:35 PM "+rst+p+blk+"|   |"+rst+w+" 07:35 PM "+rst+p+blk+"|   |"+rst+w+" 11:10 PM "+rst+p+blk+"|");
			System.out.println("\t\t\t\t\t\t   |___________|   |__________|   |__________|   |__________|"+rst);
			System.out.println();
			System.out.println("\t\t\t\t\t\t         1              2               3              4     ");
			System.out.println();
			System.out.println(c+"\t\t\t\t\t\t P L E A S E  E N T E R  T H E  R E S P E C T I V E  T I M I N G"+rst);
			System.out.println();
			int ti=Integer.parseInt(obj.nextLine());
			if(ti<=4)
			{
				if(ti==1)
				{
					time="10:30";
				}
				else if(ti==2)
				{
					time="01:35";
				}
				else if(ti==3)
				{
					time="07:35";
				}
				else
				{
					time="11:10";
				}
				while(true)
				{
					System.out.println();
					System.out.println("\t\t\t\t\t\t\t    P L E A S E  S E L E C T  T H E  C L A S S");
					System.out.println();
					System.out.println(r+"\t\t\t\t\t\t\t\t********************************");
					System.out.println("\t\t\t\t\t\t\t\t|"+rst+w+"1   E C O N O M Y  C L A S S  "+rst+r+"|");
					System.out.println("\t\t\t\t\t\t\t\t********************************");
					System.out.println();
					System.out.println("\t\t\t\t\t\t\t\t********************************");
					System.out.println("\t\t\t\t\t\t\t\t|"+rst+w+"2   P R E M I U M  C L A S S  "+rst+r+"|");
					System.out.println("\t\t\t\t\t\t\t\t********************************"+rst);
					int cla=Integer.parseInt(obj.nextLine());
					if(cla==1)
		        		{
						typ="ECONOMY CLASS";
						econ();
						break;
					}
					else if(cla==2)
					{
						typ="PREMIUM CLASS";
						primum();
						break;
					}
					else
					{
						System.out.println(c+"\t\t\t\t\t\t\t\t   PLEASE ENTER VALID OPTION"+rst);
					}
				}
				break;
			}
			else
			{
				System.out.println(c+"\t\t\t\t\t\t\t\tYOU ENTERED INVALID OPTION "+rst);
			}
		}
	}
	static void air()
	{
		while(true)
		{
			System.out.println(y+blk+"\t\t\t\t\t\t    ___________     __________     __________     __________ ");
			System.out.println("\t\t\t\t\t\t   |           |   |          |   |          |   |          |");      
			System.out.println("\t\t\t\t\t\t   |"+rst+w+" 10:00 AM  "+rst+y+blk+"|   |"+rst+w+" 01:35 PM "+rst+y+blk+"|   |"+rst+w+" 07:35 PM "+rst+y+blk+"|   |"+rst+w+" 11:10 PM "+rst+y+blk+"|");
			System.out.println("\t\t\t\t\t\t   |___________|   |__________|   |__________|   |__________|"+rst);
			System.out.println();
			System.out.println("\t\t\t\t\t\t         1              2               3              4     ");
			System.out.println();
			System.out.println(c+"\t\t\t\t\t\t P L E A S E  E N T E R  T H E  R E S P E C T I V E  T I M I N G"+rst);
			int ti=Integer.parseInt(obj.nextLine());
			if(ti<=4)
			{
				if(ti==1)
				{
					time="10:30";
				}
				else if(ti==2)
				{
					time="01:35";
				}
				else if(ti==3)
				{
					time="07:35";
				}
				else
				{
					time="11:10";
				}
				while(true)
				{
					System.out.println();
					System.out.println("\t\t\t\t\t\t\t    P L E A S E  S E L E C T  T H E  C L A S S");
					System.out.println();
					System.out.println(r+"\t\t\t\t\t\t\t\t********************************");
					System.out.println("\t\t\t\t\t\t\t\t|"+rst+w+"1   E C O N O M Y  C L A S S  "+rst+r+"|");
					System.out.println("\t\t\t\t\t\t\t\t********************************");
					System.out.println();
					System.out.println("\t\t\t\t\t\t\t\t********************************");
					System.out.println("\t\t\t\t\t\t\t\t|"+rst+w+"2   P R E M I U M  C L A S S  "+rst+r+"|");
					System.out.println("\t\t\t\t\t\t\t\t********************************"+rst);
					int cla=Integer.parseInt(obj.nextLine());
					if(cla==1)
		        		{
						typ="ECONOMY CLASS";
						econ();
						break;
					}
					else if(cla==2)
					{
						typ="PREMIUM CLASS";
						primum();
						break;
					}
					else
					{
						System.out.println(c+"\t\t\t\t\t\t\t\t   PLEASE ENTER VALID OPTION"+rst);
					}
				}
				break;
			}
			else
			{
				System.out.println(c+"\t\t\t\t\t\t\t\tYOU ENTERED INVALID OPTION "+rst);
			}
		}
		
	}
	static void nave()
	{
		while(true)
		{
			System.out.println(g+blk+"\t\t\t\t\t\t    ___________     __________     __________     __________ ");
			System.out.println("\t\t\t\t\t\t   |           |   |          |   |          |   |          |");      
			System.out.println("\t\t\t\t\t\t   |"+rst+w+" 10:00 AM  "+rst+g+blk+"|   |"+rst+w+" 01:35 PM "+rst+g+blk+"|   |"+rst+w+" 07:35 PM "+rst+g+blk+"|   |"+rst+w+" 11:10 PM "+rst+g+blk+"|");
			System.out.println("\t\t\t\t\t\t   |___________|   |__________|   |__________|   |__________|"+rst);
			System.out.println();
			System.out.println("\t\t\t\t\t\t         1              2               3              4     ");
			System.out.println();
			System.out.println(c+"\t\t\t\t\t\t P L E A S E  E N T E R  T H E  R E S P E C T I V E  T I M I N G");
			System.out.println();
			int ti=Integer.parseInt(obj.nextLine());
			if(ti<=4)
			{
				if(ti==1)
				{
					time="10:30";
				}
				else if(ti==2)
				{
					time="01:35";
				}
				else if(ti==3)
				{
					time="07:35";
				}
				else
				{
					time="11:10";
				}
				while(true)
				{
					System.out.println();
					System.out.println("\t\t\t\t\t\t\t    P L E A S E  S E L E C T  T H E  C L A S S");
					System.out.println();
					System.out.println(r+"\t\t\t\t\t\t\t\t********************************");
					System.out.println("\t\t\t\t\t\t\t\t|"+rst+w+"1   E C O N O M Y  C L A S S  "+rst+r+"|");
					System.out.println("\t\t\t\t\t\t\t\t********************************");
					System.out.println();
					System.out.println("\t\t\t\t\t\t\t\t********************************");
					System.out.println("\t\t\t\t\t\t\t\t|"+rst+w+"2   P R E M I U M  C L A S S  "+rst+r+"|");
					System.out.println("\t\t\t\t\t\t\t\t********************************"+rst);
					int cla=Integer.parseInt(obj.nextLine());
					if(cla==1)
		        		{
						typ="ECONOMY CLASS";
						econ();
						break;
					}
					else if(cla==2)
					{
						typ="PREMIUM CLASS";
						primum();	
						break;
					}
					else
					{
						System.out.println(c+"\t\t\t\t\t\t\t\t   PLEASE ENTER VALID OPTION"+rst);
					}
				}
				break;
			}
			else
			{
				System.out.println(c+"\t\t\t\t\t\t\t\tYOU ENTERED INVALID OPTION "+rst);
			}
		}
	}
	static void a121()
	{
		while(true)
		{
			System.out.println(bl+blk+"\t\t\t\t\t\t    ___________     __________     __________     __________ ");
			System.out.println("\t\t\t\t\t\t   |           |   |          |   |          |   |          |");      
			System.out.println("\t\t\t\t\t\t   |"+rst+w+" 10:00 AM  "+rst+bl+blk+"|   |"+rst+w+" 01:35 PM "+rst+bl+blk+"|   |"+rst+w+" 07:35 PM "+rst+bl+blk+"|   |"+rst+w+" 11:10 PM "+rst+bl+blk+"|");
			System.out.println("\t\t\t\t\t\t   |___________|   |__________|   |__________|   |__________|"+rst);
			System.out.println();
			System.out.println("\t\t\t\t\t\t         1              2               3              4     ");
			System.out.println();
			System.out.println(c+"\t\t\t\t\t\t P L E A S E  E N T E R  T H E  R E S P E C T I V E  T I M I N G");
			int ti=Integer.parseInt(obj.nextLine());
			if(ti<=4)
			{
				if(ti==1)
				{
					time="10:30";
				}
				else if(ti==2)
				{
					time="01:35";
				}
				else if(ti==3)
				{
					time="07:35";
				}
				else
				{
					time="11:10";
				}
				while(true)
				{
					System.out.println();
					System.out.println("\t\t\t\t\t\t\t    P L E A S E  S E L E C T  T H E  C L A S S");
					System.out.println();
					System.out.println(r+"\t\t\t\t\t\t\t\t********************************");
					System.out.println("\t\t\t\t\t\t\t\t|"+rst+w+"1   E C O N O M Y  C L A S S  "+rst+r+"|");
					System.out.println("\t\t\t\t\t\t\t\t********************************");
					System.out.println();
					System.out.println("\t\t\t\t\t\t\t\t********************************");
					System.out.println("\t\t\t\t\t\t\t\t|"+rst+w+"2   P R E M I U M  C L A S S  "+rst+r+"|");
					System.out.println("\t\t\t\t\t\t\t\t********************************"+rst);
					int cla=Integer.parseInt(obj.nextLine());
					if(cla==1)
		        		{
						typ="ECONOMY CLASS";
						econ();
						break;
					}
					else if(cla==2)
					{
						typ="PREMIUM CLASS";
						primum();
						break;
					}
					else
					{                         		
						System.out.println(c+"\t\t\t\t\t\t\t\t   PLEASE ENTER VALID OPTION");
					}
				}
				break;
			}
			else
			{			  				
				System.out.println(c+"\t\t\t\t\t\t\t\tYOU ENTERED INVALID OPTION ");
			}
		}
	}
	static void econ()
	{
		double amout=3500;
		System.out.println("\t\t\t\t\t\t\t\t    TICKET PRICE ------ "+amout);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t     PLEASE ENTER NUMBER OF SEATS YOU WANT");
		while(true)
		{
			int seats=Integer.parseInt(obj.nextLine());
			if(seats<=4 && seats>0)
			{
				billing(seats,amout);
				break;
			}
			else
			{
				System.out.println(cv.red+"\t\t\t\t\t\tYOU ARE ELEGIBLE TO BOOK ONLY 4 TICKETS AT ONCE");
			}
		}
	}
	static void primum()
	{
		double amout=4500;
		System.out.println("\t\t\t\t\t\t\t\t    TICKET PRICE ------ "+amout);
		System.out.println();
		System.out.println(c+"\t\t\t\t\t\t\t     PLEASE ENTER NUMBER OF SEATS YOU WANT"+rst);
		while(true)
		{
			int seats=Integer.parseInt(obj.nextLine());
			if(seats<=4 && seats>0)
			{
				billing(seats,amout);
				break;
			}
			else
			{
				System.out.println(cv.red+"\t\t\t\t\t\tYOU ARE ELEGIBLE TO BOOK ONLY 4 TICKETS AT ONCE");
			}
		}
	}	
	static void billing(int a,double b)
	{
		System.out.println(c+"\t\t\t\t\t\t\t     PLEASE PROVIDE THE PASSENGER DETAILS"+rst);
		int drr[] = new int[a];
		for(int i=0;i<a;i++)
		{
			int otp=1000+(int)(Math.random()*8999);
			drr[i] = otp;
		}
		String arr[] = new String[a];
		int brr[] = new int[a];
		String crr[] = new String[a];
		for(int i=0;i<a;i++)
		{
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t\t\tPASSENGER ------- "+(i+1));
			System.out.println();
			System.out.print("\t\t\t\t\t\t\t\t\tEnter Your Name   :");
			arr[i] = obj.nextLine();
			System.out.print("\t\t\t\t\t\t\t\t\tEnter Your Age    :");
			brr[i] = Integer.parseInt(obj.nextLine());
			while(true)
			{
				System.out.print("\t\t\t\t\t\t\t\t\tEnter Your Gender :");
				String gen = obj.nextLine();
				if(gen.equalsIgnoreCase("female") || gen.equalsIgnoreCase("male") || gen.equalsIgnoreCase("other"))
				{
					crr[i]=gen;
					break;
				}
				else
				{
					System.out.println(cv.red+"\t\t\t\t\tPLEASE ENTER A VALID GENDER"+cv.reset);
				}
			}
		}
		int fno=1000+(int)(Math.random()*8999);
		double amount=a*b;
		double tax=(double)(5*amount)/100;
		double bill=amount+tax;
		System.out.println(p+"\t\t\t\t\t\t\t\t\t  *************");
		System.out.println("\t\t\t\t\t\t\t\t\t  |"+rst+w+"1   Proceed"+rst+p+"|");
		System.out.println("\t\t\t\t\t\t\t\t\t  *************");
		System.out.println("\t\t\t\t\t\t\t\t\t  *************");
		System.out.println("\t\t\t\t\t\t\t\t\t  |"+rst+w+"2   Exit   "+rst+p+"|");
		System.out.println("\t\t\t\t\t\t\t\t\t  *************"+rst);
		int ab = Integer.parseInt(obj.nextLine());
		if(ab==1)
		{
			
			System.out.println(c+"\t\t\t\t\t\t ______________________________________________________  ");
			System.out.println("\t\t\t\t\t\t|               |         |              |             | ");
			System.out.println("\t\t\t\t\t\t|     Name      |   Age   |    Gender    |   Seat No   | ");
			System.out.println("\t\t\t\t\t\t|_______________|_________|______________|_____________| ");
			for(int i=0;i<a;i++)
			{
				System.out.println("\t\t\t\t\t\t|               |         |              |             |");
				System.out.printf("\t\t\t\t\t\t|   %-9s   |    %-2s   |    %-6s    |     %3d    | \n",arr[i],brr[i],crr[i],drr[i]);
				System.out.println("\t\t\t\t\t\t|_______________|_________|______________|_____________|");
			}
			System.out.printf("\t\t\t\t\t\t|    GST TAX                            =|  %9.2f  |\n",tax);
			System.out.printf("\t\t\t\t\t\t|    AMOUNT                             =| %10.2f  |\n",amount);
			System.out.printf("\t\t\t\t\t\t|    Total Bill Amount                  =| %10.2f  |\n",bill);
			System.out.println("\t\t\t\t\t\t|________________________________________|_____________|"+rst);
			System.out.println();
					    						
			System.out.println(r+"\t\t\t\t\t\t\t\t   *******************");
			System.out.println("\t\t\t\t\t\t\t\t   |"+rst+w+"1   P R O C E E D"+rst+r+"|");
			System.out.println("\t\t\t\t\t\t\t\t   *******************");
			System.out.println("\t\t\t\t\t\t\t\t   *******************");
			System.out.println("\t\t\t\t\t\t\t\t   |"+rst+w+"2   E X I T      "+rst+r+"|");
			System.out.println("\t\t\t\t\t\t\t\t   *******************"+rst);
			while(true)
			{
				int s=Integer.parseInt(obj.nextLine());
				if(s==1)
				{                          			
					boolean po= cv.p2.Onlinepay(bill);
					if(po==true)
					{
							DateTime.ma();
                                                        System.out.println(r+"\t\t\t\t\t************************************************************************");
							System.out.println("\t\t\t\t\t|"+rst+"--------------------"+r+" C  V"+rst+"   A  I  R  L  I  N  E  S--------------------"+r+"|");
							System.out.println("\t\t\t\t\t|***********************************************************************"); 
							System.out.println("\t\t\t\t\t|"+rst+"               |    BOARDING                             DESTINATION  "+r+"|");                                                   														System.out.printf("\t\t\t\t\t|"+rst+"    Q R CODE   |    "+bording+"  >>>>>>>>>>>>>>>>>>>>>>>   %-13S"+r+"|\n",destination); 
							System.out.println("\t\t\t\t\t|"+rst+"   |(<)<)<)<|  |                                                      "+r+"|");            
							System.out.printf("\t\t\t\t\t|"+rst+"   |$$$$$$$$|  |    FLIGTH NANE         :%-20S         "+r+"|\n",fly);  
							System.out.printf("\t\t\t\t\t|"+rst+"   |!!!!!!!!|  |    DATE                :%-12S                 "+r+"|\n",date);                      
							System.out.printf("\t\t\t\t\t|"+rst+"   |&&&&&&&&|  |    CLASS               :%-14S               "+r+"|\n",typ);
							System.out.println("\t\t\t\t\t|"+rst+"   |%%%%%%%%|  |    FLIGTH NO           :CV"+fno+"                       "+r+"|");
							System.out.println("\t\t\t\t\t|"+rst+"   |????????|  |    GATE NO             : 47A                         "+r+"|");
							System.out.println("\t\t\t\t\t|"+rst+"   |########|  |______________________________________________________"+r+"|  ");
							System.out.println("\t\t\t\t\t|"+rst+"   |@@@@@@@@|  |               |         |              |             "+r+"| ");
							System.out.println("\t\t\t\t\t|"+rst+"   |%%%%%%%%|  |     Name      |   Age   |    Gender    |   Seat No   "+r+"| ");
							System.out.println("\t\t\t\t\t|"+rst+"   |$$$$$$$$|  |_______________|_________|______________|_____________"+r+"| ");
							for(int i=0;i<a;i++)
							{
								
								System.out.println("\t\t\t\t\t|"+rst+"   |%%%%%%%%|  |               |         |              |             "+r+"|");
								System.out.printf("\t\t\t\t\t|"+rst+"   |########|  |   %-9s   |    %-2s   |    %-6s    |     %3d    "+r+"| \n",arr[i],brr[i],crr[i],drr[i]);
								System.out.println("\t\t\t\t\t|"+rst+"   |::::::::|  |_______________|_________|______________|_____________"+r+"|");
							}
							System.out.printf("\t\t\t\t\t|"+rst+"   |()()()()|  |    GST TAX                            =|  %9.2f  "+r+"|\n",tax);
							System.out.printf("\t\t\t\t\t|"+rst+"   |@@@@@@@@|  |    AMOUNT                             =| %10.2f  "+r+"|\n",amount);
							System.out.printf("\t\t\t\t\t|"+rst+"   |########|  |    Total Bill Amount                  =| %10.2f  "+r+"|\n",bill);
							System.out.println("\t\t\t\t\t|"+rst+"   |$$$$$$$$|  |________________________________________|_____________"+r+"|");
							System.out.println("\t\t\t\t\t|"+rst+"                                                                      "+r+"|");
							System.out.println("\t\t\t\t\t|"+rst+"               -----------HAVE A NICE TRIP-----------                 "+r+"|");
							System.out.println("\t\t\t\t\t|"+rst+"                                                                      "+r+"|");
							System.out.println("\t\t\t\t\t|"+rst+"               ********THANK YOU VISIT AGAIN*********                 "+r+"|");
							System.out.println("\t\t\t\t\t|"+rst+"                                                                      "+r+"|");
							System.out.println("\t\t\t\t\t|"+rst+"                GATE CLOSES 40 MINUTES BEFORE DEPATURE                "+r+"|");
							System.out.println("\t\t\t\t\t************************************************************************"+rst);

                                        }
					else
					{
							DateTime.ma();
							System.out.println(p+"\t\t\t\t\t\t\t\tTICKETS ARE NOT BOOKED");
							System.out.println("\t\t\t\t\t\t\t\t    OOO SHIT - _ -!!!!"+rst);
					}
					break;	
			     

				}
				else if(s==2)
				{                          			
					System.out.println(r+"\t\t\t\t\t\t\t\t\t\tSUCESS TERMINATED"+rst);
					break;
				}
				else
				{                           					
					System.out.println(bl+"\t\t\t\t\t\t\tINVALID INPUT"+rst);
				}
			}

		}
		else
		{                           						
			System.out.println(g+"\t\t\t\t\t\t\t\t-----SUCESSFULLY TERMINATED-----"+rst);
		}
		
	}
				
}









class color
{
	static String fred="\u001B[31m";
	static String fgreen="\u001B[32m";
	static String fyellow="\u001B[33m";
	static String fblue="\u001B[34m";
	static String fpurple="\u001B[35m";
	static String fcyan="\u001B[36m";
	static String fwhite="\u001B[37m";
	static String fblack="\u001B[30m";
	static String reset="\u001B[0m";
	static String bblack="\u001B[40m";
	static String bred="\u001B[41m";
	static String bgreen="\u001B[42m";
	static String byellow="\u001B[43m";
	static String bblue="\u001B[44m";
	static String bpurple="\u001B[45m";
	static String bcyan="\u001B[46m";
	static String bwhite="\u001B[47m";
	static String change="\u001B[7m";
	static String thick="\u001B[1m";
	static String blk = "\u001B[5m";
	static void sleep()
	{
		try{
		  Thread.sleep(100);
		}	
		catch(InterruptedException e)
		{
		}
	}
}
class MOVIE extends color
{
	static Scanner obj=new Scanner(System.in);
	color x=new color();
	static String theater;
	static String showtime;
	static String date;
	static String movie;
	static int seatno[];
	static void sleep()
	{
		try{
		  Thread.sleep(1000);
		}	
		catch(InterruptedException e)
		{
		}
	}
	static void MM1()
	{
		selection();
	}
	static void selection()
	{
		System.out.println();
		System.out.println(fred+thick+blk+"\t\t\t\t   /$$$$$$$   /$$$$$$  /$$   /$$        /$$$$$$  /$$$$$$$$ /$$$$$$$$ /$$$$$$  /$$$$$$  /$$$$$$$$");sleep();
        	System.out.println("\t\t\t\t  | $$__  $$ /$$__  $$| $$  / $$       /$$__  $$| $$____/| $$_____/|  $$/ /$$_  $$| $$_____/    ");sleep();
        	System.out.println("\t\t\t\t  | $$  \\ $$| $$  \\ $$|  $$/ $$/      | $$  \\ $$| $$      | $$        | $$  | $$  \\__/| $$      ");sleep();
        	System.out.println("\t\t\t\t  | $$$$$$$ | $$  | $$ \\  $$$$/       | $$  | $$| $$$$$   | $$$$$     | $$  | $$      | $$$$$   "+reset);sleep();
        	System.out.println(fwhite+thick+blk+"\t\t\t\t  | $$__  $$| $$  | $$  >$$  $$       | $$  | $$| $$__/   | $$__/     | $$  | $$      | $$__/   ");sleep();
        	System.out.println("\t\t\t\t  | $$  \\ $$| $$  | $$ /$$/\\  $$      | $$  | $$| $$      | $$        | $$  | $$    $$| $$      ");sleep();
        	System.out.println("\t\t\t\t  | $$$$$$$/|  $$$$$$/| $$  \\ $$      |  $$$$$$/| $$      | $$       /$$$$$$|  $$$$$$/| $$$$$$$$");sleep();
        	System.out.println("\t\t\t\t  |_______/  \\______/ |__/  |__/       \\______/ |__/      |__/      |______/ \\______/ |________/");sleep();
		System.out.println(blk+fblack+"\n\n\t\t\t\t  ********************************** WELCOME TO THE MOVIE WORLD *********************************"+reset);sleep();
		System.out.println();
		System.out.println(fred+thick+"\t\t\t\t  ************	          **********		       ************		*************"+reset);sleep();
		System.out.println(fred+thick+"\t\t\t\t  |  SALAAR  |	          |  KALKI |		       |  DEVARA  |		|  KANGUVA  |"+reset);sleep();
		System.out.println(fred+thick+"\t\t\t\t  ************	          **********		       ************		*************"+reset);sleep();
		System.out.println(fwhite+thick+"\t\t\t\t       1		      2			             3 		               4"+reset);sleep();
		int a=Integer.parseInt(obj.nextLine());
		if(a==1)
		{
			movie="S A L A A R"; 
			sal();
		}
		else if(a==2)
		{
			movie="K A L K I";
			kal();
		}
		else if(a==3)
		{
			movie="D E V A R A";
			dev();
		}
		else if(a==4)
		{
			movie="K A N G U V A";
			kag();
		}
		else
		{
			System.out.println("\t\t\t\t\t\t\tPLEASE ENTER A VALID OPTION");
			selection();
		}
	}
	static void seating()
	{
		System.out.println(fwhite+thick+"\t\t\t\t    PLEASE SELECT YOUR SEATS");
		System.out.println("\t\t\t\t    ------------------------------------------------------------------------------------------------"+reset);
		System.out.println(fred+"\t\t\t\t    |01||02||03||04||05||06||07||08||09||11||12||..||13||14||15||16||17||18||19||20||21||22||23||24|"+reset);
		System.out.println(fwhite+thick+"\t\t\t\t    ------------------------------------------------------------------------------------------------"+reset);
		System.out.println();
		System.out.println(fwhite+thick+"\t\t\t\t          -----------------------------------------------------------------------------------"+reset);
		System.out.println(fred+"\t\t\t\t          |25||26||27|||28||29||30||31||32||33||34|35|36||37||38||39||39||40||41||42||43||44|"+reset);
		System.out.println(fwhite+thick+"\t\t\t\t          -----------------------------------------------------------------------------------"+reset);
		System.out.println();
		System.out.println(fwhite+thick+"\t\t\t\t                 --------------------------------------------------------------------"+reset);
		System.out.println(fred+"\t\t\t\t                 |45||46||47||48||59||50||51||52||53||54||55||56||57||58||59||60||61|"+reset);
		System.out.println(fwhite+thick+"\t\t\t\t                 --------------------------------------------------------------------"+reset);
		System.out.println();
		System.out.println(fwhite+thick+"\t\t\t\t                           ------------------------------------------------"+reset);
		System.out.println(fred+"\t\t\t\t                           |62||63||64||65||66||67||68||69||70||71||72||73|"+reset);
		System.out.println(fwhite+thick+"\t\t\t\t                           ------------------------------------------------"+reset);
		System.out.println();
		System.out.println(fblack+thick+"\t\t\t\t    ---------------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t    |-----------------------------"+reset+fwhite+thick+blk+"*************SCREEN*************"+reset+fblack+thick+"------------------------------|");
		System.out.println("\t\t\t\t    ---------------------------------------------------------------------------------------------"+reset);
		System.out.println();
		
	}
	static void billing(int a)
	{
		double price=250*a;
		double gst=(7*price)/100;
		double bill=price+gst;
		System.out.println();
		System.out.println(fred+"\t\t\t\t\t\t\t\t\tTHE PRICE          = "+price);
		System.out.println("\t\t\t\t\t\t\t\t\tTHE GST TAX        =  "+gst+reset);
		System.out.println(fwhite+thick+"\t\t\t\t\t\t\t\t\t............................"+reset);
		System.out.println(fgreen+"\t\t\t\t\t\t\t\t\tTHE BILL           = "+bill+reset);
		System.out.println(fwhite+thick+"\t\t\t\t\t\t\t\t\t..........................."+reset);
		System.out.println();
		System.out.println(fred+blk+"\t\t\t\t\t\t\t\t\t**************");
		System.out.println("\t\t\t\t\t\t\t\t\t|1   PROCEED |");
		System.out.println("\t\t\t\t\t\t\t\t\t**************");
		System.out.println("\t\t\t\t\t\t\t\t\t**************");
		System.out.println("\t\t\t\t\t\t\t\t\t|2   EXIT    |");
		System.out.println("\t\t\t\t\t\t\t\t\t**************"+reset);
		int pro=Integer.parseInt(obj.nextLine());
		if(pro==1)
		{
			boolean we = cv.p2.Onlinepay(bill);
			if(we==true)	
			{
				DateTime.ma();
				System.out.println(fcyan+"\t\t\t\t\t\t\t************************************************************");
				System.out.println("\t\t\t\t\t\t\t|               @ TICKETS SUCESSFULLY BOOKED               |");
				System.out.printf("\t\t\t\t\t\t\t|                  %-30S          |\n",theater);
				System.out.println("\t\t\t\t\t\t\t|**********************************************************|");
				System.out.printf("\t\t\t\t\t\t\t|        MOVIE NAME        :        %-14S         |\n",movie);
				System.out.println("\t\t\t\t\t\t\t|                                                          |");
				System.out.printf("\t\t\t\t\t\t\t|        SHOW TIME         :        %-7S               |\n",showtime);      
				System.out.println("\t\t\t\t\t\t\t|                                                          |");
				System.out.printf("\t\t\t\t\t\t\t|        DATE              :        %-10S             |\n",date);
				System.out.println("\t\t\t\t\t\t\t|                                                          |");
				System.out.printf("\t\t\t\t\t\t\t|        SHOW TIME         :        %-10S             |\n",showtime);
				System.out.println("\t\t\t\t\t\t\t|                                                          |");
				System.out.println("\t\t\t\t\t\t\t|        SEAT NO           :        BALCONY                |");
				for(int i=0;i<a;i++)
				{
					
					System.out.printf("\t\t\t\t\t\t\t|                                    %-2d                    |\n",seatno[i]);
				}
				System.out.printf("\t\t\t\t\t\t\t|        THE PRICE         :       %-10.2f              |\n",price);
				System.out.printf("\t\t\t\t\t\t\t|        THE GST TAX       :        %-9.2f              |\n",gst);
				System.out.println("\t\t\t\t\t\t\t|        .....................................             |");
				System.out.printf("\t\t\t\t\t\t\t|        THE BILL          :       %-10S              |\n",bill);
				System.out.println("\t\t\t\t\t\t\t|        ....................................              |");
				System.out.println("\t\t\t\t\t\t\t|                                                          |");
				System.out.println("\t\t\t\t\t\t\t|                                                          |");
				System.out.println("\t\t\t\t\t\t\t|                                                          |");
				System.out.println("\t\t\t\t\t\t\t|            ---------THANK YOU----------                  |");
				System.out.println("\t\t\t\t\t\t\t|           ---------VISIT AGAIN----------                 |");
				System.out.println("\t\t\t\t\t\t\t************************************************************");
				System.out.println("\t\t\t\t\t\t\t|                 @ C V  B O X O F F I C E                 |");
				System.out.println("\t\t\t\t\t\t\t************************************************************"+reset);
				System.out.println();
				
			}
			else
			{
				System.out.println("\t\t\t\t\tTICKETS ARE NOT BOOKED");
				System.out.println("\t\t\t\t\tOH  SHUT!!!!!!");
			}
		}
		else
		{
			DateTime.ma();
			System.out.println("\t\t\t\t\tSUCESSFULLY TERMINATED");
		}
				
	}	
	static void sal()
	{
		System.out.println();
		System.out.println();
		System.out.println(fyellow+blk+"\t\t\t\t\t\t    $$$$$$\\   $$$$$$\\  $$\\        $$$$$$\\   $$$$$$\\  $$$$$$$\\  ");sleep();
        	System.out.println(fyellow+blk+"\t\t\t\t\t\t   $$  __$$\\ $$  __$$\\ $$ |      $$  __$$\\ $$  __$$\\ $$  __$$\\ ");sleep();
        	System.out.println(fyellow+blk+"\t\t\t\t\t\t   $$ /  \\__|$$ /  $$ |$$ |      $$ /  $$ |$$ /  $$ |$$ |  $$ |");sleep();
        	System.out.println(fyellow+blk+"\t\t\t\t\t\t   \\$$$$$$\\  $$$$$$$$ |$$ |      $$$$$$$$ |$$$$$$$$ |$$$$$$$  |");sleep();
        	System.out.println(fyellow+blk+"\t\t\t\t\t\t    \\____$$\\ $$  __$$ |$$ |      $$  __$$ |$$  __$$ |$$  __$$< ");sleep();
        	System.out.println(fyellow+blk+"\t\t\t\t\t\t   $$\\   $$ |$$ |  $$ |$$ |      $$ |  $$ |$$ |  $$ |$$ |  $$ |");sleep();
        	System.out.println(fyellow+blk+"\t\t\t\t\t\t   \\$$$$$$  |$$ |  $$ |$$$$$$$$\\ $$ |  $$ |$$ |  $$ |$$ |  $$ |");sleep();
        	System.out.println(fyellow+blk+" \t\t\t\t\t\t   \\______/ \\__|  \\__|\\________|\\__|  \\__|\\__|  \\__|\\__|  \\__|"+reset);sleep();
        	System.out.println("                                                            ");
		System.out.println(fyellow+blk+"\t\t\t\t\t\t   ................JAVA STAR CHARAN IN AND AS................"+reset);sleep();
		System.out.println();
		System.out.println(fwhite+thick+"\t\t\t\t\t\t\t\t    PLEASE SELECT YOUR THEATRE"+reset);
		System.out.println();
		System.out.println(fyellow+"\t\t\t\t\t\t   ************************	    ************************");
		System.out.println("\t\t\t\t\t\t   |   PVR PRESTON PRIME  |	    |   IVOX ASHOKA MALL   |");
		System.out.println("\t\t\t\t\t\t   ************************	    ************************"+reset);
		System.out.println(fwhite+thick+"\t\t\t\t\t\t\t      1			               2"+reset);
		int a=Integer.parseInt(obj.nextLine());
		if(a==1)
		{
			theater="PVR PRESTON PRIME";
			System.out.println(fblue+thick+"\t\t\t\t\t\t      Please Enter The Date In The Specified Format(DD/MM/YYYY)"+reset);
			date=obj.nextLine();
			while(true)
			{
				System.out.println(fyellow+blk+"\t\t\t\t\t\t    PVR PRESTON PRIME, GACHIBOWLI, HYDERBAD"+reset);
				System.out.println(fwhite+thick+"\t\t\t\t\t\t    ......................................................"+reset+fyellow+"1km"+reset);
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("\t\t\t\t\t\t    ....................."+fyellow+"ABOUT MOVIE"+reset+"..........................");
				System.out.println(fwhite+thick+"\t\t\t\t\t\t    .....DETAIL...............................................");
				System.out.println("\t\t\t\t\t\t    .....*RELEASED IN ALL LANGUAGES...........................");
				System.out.println("\t\t\t\t\t\t    .....*DRAMA & ACTION......................................");
				System.out.println();
				System.out.println();
				System.out.println(fyellow+blk+"\t\t\t\t\t\t    SALAAR IS A WORLD WIDE FILM DIRECTED BY PRASHANTH NEEL");
				System.out.println("\t\t\t\t\t\t    STARRING CHARAN AND SHRUTHI HAASAN IN THE LEAD ROLES"+reset);
				System.out.println();
				System.out.println();
				System.out.println(fwhite+thick+"\t\t\t\t\t\t    SHOW LISTING"+reset);
				System.out.println();
				System.out.println(fgreen+"\t\t\t\t\t\t    -------------   ------------   ------------   ------------");
				System.out.println("\t\t\t\t\t\t    | 10:00 AM  |   | 01:35 PM |   | 07:35 PM |   | 11:10 PM |");
				System.out.println("\t\t\t\t\t\t    |    2D     |   |    2D    |   |    2D    |   |    2D    |");
				System.out.println("\t\t\t\t\t\t    -------------   ------------   ------------   ------------"+reset);
				System.out.println(fwhite+thick+"\t\t\t\t\t\t          1              2               3              4     ");
				System.out.println();
				System.out.println();
				System.out.println(fwhite+thick+"\t\t\t\t\t\t    ..............."+reset+fgreen+"PLEASE ENTER RESPECTIVE SHOW"+reset+fwhite+thick+".................."+reset);
				int c=Integer.parseInt(obj.nextLine());
				if(c==1)
				{
					showtime="10:00 AM";
					seating();
					System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER NO OF SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else if(c==2)
				{
					showtime="01:35 PM";
					seating();
					System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else if(c==3)
				{
					showtime="07:35 PM";
					seating();
					System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else if(c==4)
				{
					showtime="11:10 PM";
					seating();
					System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else
				{
					System.out.println(fred+blk+"\t\t\t\t\t\t\t\t\t  PLEASE ENTER A VALID OPTION"+reset);
				}
			}
		}
		else if(a==2)
		{
			theater="IVOX ASHOKA MALL";
			System.out.println(fblue+"\t\t\t\t\t\t      Please Enter The Date In The Specified Format(DD/MM/YYYY)"+reset);
			date=obj.nextLine();
			while(true)
			{
				System.out.println(fyellow+"\t\t\t\t\t\t    IVOX ASHOKA MALL, KUKATAPALLY, HYDERBAD"+reset);
				System.out.println(fwhite+thick+"\t\t\t\t\t\t    ......................................................"+reset+fyellow+"1km"+reset);
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println(fwhite+thick+"\t\t\t\t\t\t    ....................."+reset+fyellow+"ABOUT MOVIE"+reset+".........................."+reset);
				System.out.println(fwhite+thick+"\t\t\t\t\t\t    .....DETAIL...............................................");
				System.out.println("\t\t\t\t\t\t    .....*RELEASED IN ALL LANGUAGES...........................");
				System.out.println("\t\t\t\t\t\t    .....*DRAMA & ROMANTIC...................................."+reset);
				System.out.println();
				System.out.println();
				System.out.println(fblue+"\t\t\t\t\t\t    SALAAR IS A WORLD WIDE FILM DIRECTED BY PRASHANTH NEEL");
				System.out.println("\t\t\t\t\t\t    STARRING CHARAN AND SHRUTHI HASSAN IN THE LEAD ROLES"+reset);
				System.out.println();
				System.out.println();
				System.out.println(fwhite+thick+"\t\t\t\t\t\t    SHOW LISTING"+reset);
				System.out.println();
				System.out.println(fred+"\t\t\t\t\t\t    -------------   ------------   ------------   ------------");
				System.out.println("\t\t\t\t\t\t    | 10:00 AM  |   | 01:35 PM |   | 07:35 PM |   | 11:10 PM |");
				System.out.println("\t\t\t\t\t\t    |    2D     |   |    2D    |   |    2D    |   |    2D    |");
				System.out.println("\t\t\t\t\t\t    -------------   ------------   -------------  ------------"+reset);
				System.out.println(fwhite+thick+"\t\t\t\t\t\t          1              2               3              4     "+reset);
				System.out.println();
				System.out.println();
				System.out.println(fwhite+thick+"\t\t\t\t\t\t    ........"+reset+fyellow+"PLEASE ENTER RESPECTIVE SHOW"+reset+fwhite+thick+"......................"+reset);
				int b=Integer.parseInt(obj.nextLine());
				if(b==1)
				{
					showtime="10:00 AM";
					seating();
					System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : ");
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else if(b==2)
				{
					showtime="01:35 PM";
					seating();
					System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else if(b==3)
				{
					showtime="07:35 PM";
					seating();
					System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else if(b==4)
				{
					showtime="11:10 PM";
					seating();
					System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else
				{
					System.out.println(fred+blk+"\t\t\t\t\t\t\t\t\t  PLEASE ENTER A VALID OPTION"+reset);
				}
			}
		}
		else
		{
			System.out.println(fred+blk+"\t\t\t\t\t\t\tPLEASE ENTER A VALID OPTION"+reset);
			sal();
		}
	}
	static void kal()
	{
		System.out.println();
		System.out.println();	
		System.out.println(fpurple+blk+"\t\t\t\t\t\t\t    $$\\   $$\\  $$$$$$\\  $$\\       $$\\   $$\\ $$$$$$\\ ");sleep();
        	System.out.println("\t\t\t\t\t\t\t    $$ | $$  |$$  __$$\\ $$ |      $$ | $$  |\\_$$  _|");sleep();
        	System.out.println("\t\t\t\t\t\t\t    $$ |$$  / $$ /  $$ |$$ |      $$ |$$  /   $$ |  ");sleep();
        	System.out.println("\t\t\t\t\t\t\t    $$$$$  /  $$$$$$$$ |$$ |      $$$$$  /    $$ |  "+reset);sleep();
        	System.out.println(fwhite+thick+"\t\t\t\t\t\t\t    $$  $$<   $$  __$$ |$$ |      $$  $$<     $$ |  ");sleep();
        	System.out.println("\t\t\t\t\t\t\t    $$ |\\$$\\  $$ |  $$ |$$ |      $$ |\\$$\\    $$ |  ");sleep();
        	System.out.println("\t\t\t\t\t\t\t    $$ | \\$$\\ $$ |  $$ |$$$$$$$$\\ $$ | \\$$\\ $$$$$$\\ ");sleep();
        	System.out.println("\t\t\t\t\t\t\t    \\__|  \\__|\\__|  \\__|\\________|\\__|  \\__|\\______|"+reset);sleep();
        	System.out.println("                                                ");
		System.out.println(fpurple+"\t\t\t\t\t\t\t    .........."+reset+fpurple+"REBEL STAR PRABHAS IN AND AS"+reset+fpurple+".........."+reset);sleep();;
		System.out.println();
		System.out.println(fwhite+thick+"\t\t\t\t\t\t\t\t       PLEASE SELECT YOUR THEATRE"+reset);
		System.out.println();
		System.out.println(fpurple+"\t\t\t\t\t\t\t    *******************         ********************");
		System.out.println("\t\t\t\t\t\t\t    |   AMB CINEMAS   |         |   INORBIT MALL   |");
		System.out.println("\t\t\t\t\t\t\t    *******************         ********************"+reset);
		System.out.println(fwhite+"\t\t\t\t\t\t\t\t     1			       2"+reset);
		int a=Integer.parseInt(obj.nextLine());
		if(a==1)
		{
			theater="AMB CINEMAS";
			System.out.println(fyellow+"\t\t\t\t\t\t      Please Enter The Date In The Specified Format(DD/MM/YYYY)"+reset);
			date=obj.nextLine();
			while(true)
			{
				System.out.println(fpurple+"\t\t\t\t\t\t        AMB CINEMAS, GACHIBOWLI, HYDERBAD"+reset);
				System.out.println(fwhite+thick+"\t\t\t\t\t\t        ......................................................"+reset+fpurple+"1km"+reset);
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println(fwhite+thick+"\t\t\t\t\t\t        ....................."+fpurple+"ABOUT MOVIE"+reset+fwhite+thick+".........................."+reset);
				System.out.println(fwhite+thick+"\t\t\t\t\t\t        .....DETAIL...............................................");
				System.out.println("\t\t\t\t\t\t        .....*RELEASED IN ALL LANGUAGES...........................");
				System.out.println("\t\t\t\t\t\t        .....*DRAMA & ROMANTIC...................................."+reset);
				System.out.println();
				System.out.println();
				System.out.println(fpurple+"\t\t\t\t\t\t        KALKI IS A WORLD WIDE FILM DIRECTED BY NAG ASHWIN");
				System.out.println("\t\t\t\t\t\t        STARRING PRABHAS AND DEEPIKA PADUKONE IN THE LEAD ROLES"+reset);
				System.out.println();
				System.out.println();
				System.out.println(fwhite+"\t\t\t\t\t\t        SHOW LISTING"+reset);
				System.out.println();
				System.out.println(fpurple+"\t\t\t\t\t\t        -------------   ------------   ------------   ------------");
				System.out.println("\t\t\t\t\t\t        | 10:00 AM  |   | 01:35 PM |   | 07:35 PM |   | 11:10 PM |");
				System.out.println("\t\t\t\t\t\t        |    2D     |   |    2D    |   |    2D    |   |    2D    |");
				System.out.println("\t\t\t\t\t\t        -------------   ------------   -------------  ------------"+reset);
				System.out.println(fwhite+thick+"\t\t\t\t\t\t              1              2               3              4     "+reset);
				System.out.println();
				System.out.println();
				System.out.println(fwhite+thick+"\t\t\t\t\t\t        ........"+reset+fpurple+"PLEASE ENTER RESPECTIVE SHOW"+reset+fwhite+thick+"......................"+reset);
				int c=Integer.parseInt(obj.nextLine());
				if(c==1)
				{
					showtime="10:00 AM";
					seating();
					System.out.print(fpurple+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else if(c==2)
				{
					showtime="01:35 PM";
					seating();
					System.out.print(fpurple+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else if(c==3)
				{
					showtime="07:35 PM";
					seating();
					System.out.print("\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : ");
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else if(c==4)
				{
					showtime="11:10 PM";
					seating();
					System.out.print(fpurple+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else
				{
					System.out.println(fred+blk+"\t\t\t\t\t\t\t\t\t  PLEASE ENTER A VALID OPTION"+reset);
				}
			}
		}
		else if(a==2)
		{
			theater="INORBIT MALL";
			System.out.println(fyellow+"\t\t\t\t\t\t    Please Enter The Date In The Specified Format(DD/MM/YYYY)");
			date=obj.nextLine();
			while(true)
			{
				System.out.println(fpurple+"\t\t\t\t\t\t        INORBIT MALL, MADHAPUR, HYDERBAD"+reset);
				System.out.println(fwhite+thick+"\t\t\t\t\t\t        ......................................................"+reset+fpurple+"1km"+reset);
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println(fwhite+thick+"\t\t\t\t\t\t        ....................."+reset+fpurple+"ABOUT MOVIE"+reset+fwhite+thick+".........................."+reset);
				System.out.println(fwhite+thick+"\t\t\t\t\t\t        .....DETAIL...............................................");
				System.out.println("\t\t\t\t\t\t        .....*RELEASED IN ALL LANGUAGES...........................");
				System.out.println("\t\t\t\t\t\t        .....*DRAMA & ROMANTIC...................................."+reset);
				System.out.println();
				System.out.println();
				System.out.println(fpurple+"\t\t\t\t\t\t        KALKI IS A WORLD WIDE FILM DIRECTED BY NAG ASHWIN");
				System.out.println("\t\t\t\t\t\t        STARRING PRABHAS AND SHRUTHI HASSAN IN THE LEAD ROLES"+reset);
				System.out.println();
				System.out.println();
				System.out.println(fwhite+thick+"\t\t\t\t\t\t        SHOW LISTING"+reset);
				System.out.println();
				System.out.println(fpurple+"\t\t\t\t\t\t        -------------   ------------   ------------   ------------");
				System.out.println("\t\t\t\t\t\t        | 10:00 AM  |   | 01:35 PM |   | 07:35 PM |   | 11:10 PM |");
				System.out.println("\t\t\t\t\t\t        |    2D     |   |    2D    |   |    2D    |   |    2D    |");
				System.out.println("\t\t\t\t\t\t        -------------   ------------   -------------  ------------"+reset);
				System.out.println(fwhite+thick+"\t\t\t\t\t\t              1              2               3              4     "+reset);
				System.out.println();
				System.out.println();
				System.out.println(fwhite+thick+"\t\t\t\t\t\t        ........"+reset+fpurple+"PLEASE ENTER RESPECTIVE SHOW"+reset+fwhite+thick+"......................"+reset);
				int b=Integer.parseInt(obj.nextLine());
				if(b==1)
				{
					showtime="10:00 AM";
					seating();
					System.out.print(fpurple+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;

				}
				else if(b==2)
				{
					showtime="01:35 PM";
					seating();
					System.out.print(fpurple+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else if(b==3)
				{
					showtime="07:35 PM";
					seating();
					System.out.print(fpurple+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else if(b==4)
				{
					showtime="11:10 PM";
					seating();
					System.out.print(fpurple+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else
				{
					System.out.println(fred+blk+"\t\t\t\t\t\t\t\t\t  PLEASE ENTER  A VALID OPTION");
				}
			}
		}
		else
		{
			System.out.println("\t\t\t\t\t\t\t    PLEASE ENTER A VALID OPTION"+reset);
			kal();
		}
	}
	static void dev()
	{
		System.out.println();
		System.out.println();
		System.out.println(fcyan+thick+blk+"\t\t\t\t\t\t     /$$$$$$$  /$$$$$$$$ /$$    /$$  /$$$$$$  /$$$$$$$   /$$$$$$ ");sleep();
        	System.out.println("\t\t\t\t\t\t    | $$__  $$| $$____/ | $$   | $$ /$$_  $$ | $$__  $$ /$$__  $$");sleep();
        	System.out.println("\t\t\t\t\t\t    | $$  \\ $$| $$      | $$   | $$| $$  \\ $$| $$  \\ $$| $$  \\ $$");sleep();
        	System.out.println("\t\t\t\t\t\t    | $$  | $$| $$$$$   |  $$ / $$/| $$$$$$$$| $$$$$$$/| $$$$$$$$"+reset);sleep();
        	System.out.println(fwhite+thick+"\t\t\t\t\t\t    | $$  | $$| $$_/     \\  $$ $$/ | $$_  $$ | $$__  $$| $$__  $$");sleep();
        	System.out.println("\t\t\t\t\t\t    | $$  | $$| $$        \\  $$$/  | $$  | $$| $$  \\ $$| $$  | $$");sleep();
        	System.out.println("\t\t\t\t\t\t    | $$$$$$$/| $$$$$$$$   \\  $/   | $$  | $$| $$  | $$| $$  | $$");sleep();
        	System.out.println("\t\t\t\t\t\t    |_______/ |________/    \\_/    |__/  |__/|__/  |__/|__/  |__/"+reset);sleep();
		System.out.println();
        	System.out.println(fcyan+thick+"\t\t\t\t\t\t    .................. YOUNG TIGER NTR IN AND AS ................"+reset);sleep();
        	System.out.println();
		System.out.println(fwhite+thick+"\t\t\t\t\t\t\t\t       PLEASE SELECT YOUR THEATRE"+reset);
		System.out.println();
		System.out.println(fcyan+thick+"\t\t\t\t\t\t\t    --------------------     --------------------");
		System.out.println("\t\t\t\t\t\t\t    |    NEXAS MALL    |     |   MIRAJ CINEMAS  |");
		System.out.println("\t\t\t\t\t\t\t    --------------------     --------------------"+reset);
		System.out.println(fwhite+thick+"\t\t\t\t\t\t\t	       1		         2"+reset);
		int a=Integer.parseInt(obj.nextLine()); 
		if(a==1)
		{
			theater="NEXAS MALL";
			System.out.println(fred+thick+"\t\t\t\t\t\t      Please Enter The Date In The Specified Format(DD/MM/YYYY)"+reset);
			date=obj.nextLine();
			while(true)
			{
				System.out.println(fcyan+thick+"\t\t\t\t\t\t      NEXAS MALL, KUKATPALLY, HYDERBAD"+reset);
				System.out.println(fwhite+thick+"\t\t\t\t\t\t      ......................................................"+reset+fcyan+thick+"1km"+reset);
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println(fwhite+thick+"\t\t\t\t\t\t      ....................."+reset+fcyan+"ABOUT MOVIE"+reset+fwhite+thick+".........................."+reset);
				System.out.println(fwhite+thick+"\t\t\t\t\t\t      .....DETAIL...............................................");
				System.out.println("\t\t\t\t\t\t      .....*RELEASED IN ALL LANGUAGES...........................");
				System.out.println("\t\t\t\t\t\t      .....*DRAMA & ROMANTIC...................................."+reset);
				System.out.println();
				System.out.println();
				System.out.println(fcyan+thick+blk+"\t\t\t\t\t\t      DEVARA IS A PAN INDIAN FILM DIRECTED BY KORATALA SIVA");
				System.out.println("\t\t\t\t\t\t      STARRING NTR AND JANHVI KAPOOR IN THE LEAD ROLES"+reset);
				System.out.println();
				System.out.println();
				System.out.println(fwhite+thick+"\t\t\t\t\t\t      SHOW LISTING"+reset);
				System.out.println();
				System.out.println(fcyan+thick+"\t\t\t\t\t\t      -------------   ------------   ------------   ------------");
				System.out.println("\t\t\t\t\t\t      | 10:00 AM  |   | 01:35 PM |   | 07:35 PM |   | 11:10 PM |");
				System.out.println("\t\t\t\t\t\t      |    2D     |   |    2D    |   |    2D    |   |    2D    |");
				System.out.println("\t\t\t\t\t\t      -------------   ------------   -------------  ------------"+reset);
				System.out.println(fwhite+thick+"\t\t\t\t\t\t            1              2               3              4     "+reset);
				System.out.println();
				System.out.println();
				System.out.println(fwhite+thick+"\t\t\t\t\t\t      ........"+reset+fcyan+thick+"PLEASE ENTER RESPECTIVE SHOW"+reset+fcyan+thick+"......................"+reset);
				int c=Integer.parseInt(obj.nextLine());
				if(c==1)
				{
					showtime="10:00 AM";
					seating();
					System.out.print(fcyan+thick+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else if(c==2)
				{
					showtime="01:35 PM";
					seating();
					System.out.print(fcyan+thick+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else if(c==3)
				{
					showtime="07:35 PM";
					seating();
					System.out.print(fcyan+thick+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else if(c==4)
				{
					showtime="11:10 PM";
					seating();
					System.out.print(fcyan+thick+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else
				{
					System.out.println(fred+"\t\t\t\t\t\t\t\t\t  PLEASE ENTER A VALID OPTION"+reset);
				}
			}
		}
		else if(a==2)
		{
			theater="MIRAJ CINEMAS";
			System.out.println(fred+thick+"\t\t\t\t\t\t      Please Enter The Date In The Specified Format(DD/MM/YYYY)"+reset);
			date=obj.nextLine();
			while(true)
			{
				System.out.println(fcyan+thick+"\t\t\t\t\t\t      MIRAJ CINEMAS, BALANAGAR, HYDERBAD"+reset);
				System.out.println(fwhite+thick+"\t\t\t\t\t\t      ......................................................"+reset+fcyan+thick+"1km"+reset);
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println(fwhite+thick+"\t\t\t\t\t\t      ....................."+reset+fcyan+thick+"ABOUT MOVIE"+reset+fwhite+thick+".........................."+reset);
				System.out.println(fwhite+thick+"\t\t\t\t\t\t      .....DETAIL...............................................");
				System.out.println("\t\t\t\t\t\t      .....*RELEASED IN ALL LANGUAGES...........................");
				System.out.println("\t\t\t\t\t\t      .....*DRAMA & ROMANTIC...................................."+reset);
				System.out.println();
				System.out.println();
				System.out.println(fcyan+thick+"\t\t\t\t\t\t      DEVARA IS A PAN INDIAN FILM DIRECTED BY KORATALA SIVA");
				System.out.println("\t\t\t\t\t\t      STARRING NTR AND JANHVI KAPOOR IN THE LEAD ROLES"+reset);
				System.out.println();
				System.out.println();
				System.out.println(fwhite+thick+"\t\t\t\t\t\t      SHOW LISTING"+reset);
				System.out.println();
				System.out.println(fcyan+thick+"\t\t\t\t\t\t      -------------   ------------   ------------   ------------");
				System.out.println("\t\t\t\t\t\t      | 10:00 AM  |   | 01:35 PM |   | 07:35 PM |   | 11:10 PM |");
				System.out.println("\t\t\t\t\t\t      |    2D     |   |    2D    |   |    2D    |   |    2D    |");
				System.out.println("\t\t\t\t\t\t      -------------   ------------   -------------  ------------"+reset);
				System.out.println(fwhite+thick+"\t\t\t\t\t\t            1              2               3              4     "+reset);
				System.out.println();
				System.out.println();
				System.out.println(fwhite+thick+"\t\t\t\t\t\t      ........"+reset+fcyan+thick+"PLEASE ENTER RESPECTIVE SHOW"+reset+fwhite+theater+"......................"+reset);
				int b=Integer.parseInt(obj.nextLine());
				if(b==1)
				{
					showtime="10:00 AM";
					seating();
					System.out.print(fcyan+thick+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else if(b==2)
				{
					showtime="01:35 PM";
					seating();
					System.out.print(fcyan+thick+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else if(b==3)
				{
					showtime="07:35 PM";
					seating();
					System.out.print(fcyan+thick+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else if(b==4)
				{
					showtime="11:10 PM";
					seating();
					System.out.print(fcyan+thick+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else
				{
					System.out.println(fred+blk+"\t\t\t\t\t\t\t\t\t  PLEASE ENTER A VALID OPTION");
				}
			}
		}
		else
		{
			System.out.println("\t\t\t\t\t\t\t\t  PLEASE ENTER A VALID OPTION"+reset);
			dev();
		}
	}
	static void kag()
	{
		System.out.println();
		System.out.println();
		System.out.println(fyellow+thick+blk+"\t\t\t\t\t     /$$   /$$  /$$$$$$  /$$   /$$  /$$$$$$  /$$   /$$ /$$    /$$  /$$$$$$ ");sleep();
        	System.out.println("\t\t\t\t\t    | $$  /$$/ /$$__  $$| $$$ | $$ /$$__  $$| $$  | $$| $$   | $$ /$$__  $$");sleep();
       		System.out.println("\t\t\t\t\t    | $$ /$$/ | $$  \\ $$| $$$$| $$| $$  \\__/| $$  | $$| $$   | $$| $$  \\ $$");sleep();
        	System.out.println("\t\t\t\t\t    | $$$$$/  | $$$$$$$$| $$ $$ $$| $$ /$$$$| $$  | $$|  $$ / $$/| $$$$$$$$"+reset);sleep();
        	System.out.println(fwhite+thick+"\t\t\t\t\t    | $$  $$  | $$__  $$| $$  $$$$| $$|_  $$| $$  | $$ \\  $$ $$/ | $$__  $$");sleep();
        	System.out.println("\t\t\t\t\t    | $$\\  $$ | $$  | $$| $$\\  $$$| $$  \\ $$| $$  | $$  \\  $$$/  | $$  | $$");sleep();
        	System.out.println("\t\t\t\t\t    | $$ \\  $$| $$  | $$| $$ \\  $$|  $$$$$$/|  $$$$$$/   \\  $/   | $$  | $$");sleep();
        	System.out.println("\t\t\t\t\t    |__/  \\__/|__/  |__/|__/  \\__/ \\______/  \\______/     \\_/    |__/  |__/"+reset);sleep();
        	System.out.println("                                                                       ");
        	System.out.println(fyellow+thick+"\t\t\t\t\t    ........................... SURIYA IN AND AS .........................");sleep();
		System.out.println();
		System.out.println(fwhite+thick+"\t\t\t\t\t\t\t            PLEASE SELECT YOUR THEATRE"+reset);
		System.out.println();
		System.out.println(fyellow+thick+"\t\t\t\t\t        -------------------------          -------------------------");
		System.out.println("\t\t\t\t\t        |      AAA CINEMAS      |          |   PRASADS MULTIPLEX   |");
		System.out.println("\t\t\t\t\t        -------------------------          -------------------------"+reset);
		System.out.println(fwhite+thick+"\t\t\t\t\t\t          1			 	          2"+reset);
		int a=Integer.parseInt(obj.nextLine());
		if(a==1)
		{
			theater="AAA CINEMAS";
			System.out.println(fcyan+thick+"\t\t\t\t\t\t      Please Enter The Date In The Specified Format(DD/MM/YYYY)");
			date=obj.nextLine();
			while(true)
			{
				System.out.println(fyellow+thick+"\t\t\t\t\t       AAA CINEMAS, AMEERPET, HYDERBAD");
				System.out.println(fwhite+thick+"\t\t\t\t\t       ......................................................"+reset+fyellow+thick+"1km"+reset);
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println(fwhite+thick+"\t\t\t\t\t       ....................."+reset+fyellow+thick+"ABOUT MOVIE"+reset+fwhite+thick+".........................."+reset);
				System.out.println(fwhite+thick+"\t\t\t\t\t       .....DETAIL...............................................");
				System.out.println("\t\t\t\t\t       .....*RELEASED IN ALL LANGUAGES...........................");
				System.out.println("\t\t\t\t\t       .....*DRAMA & ROMANTIC...................................."+reset);
				System.out.println();
				System.out.println();
				System.out.println(fyellow+thick+"\t\t\t\t\t       KANGUVA IS A PAN INDIAN FILM DIRECTED BY SIVA");
				System.out.println("\t\t\t\t\t       STARRING SURIYA AND DISHA PATANI IN THE LEAD ROLES"+reset);
				System.out.println();
				System.out.println();
				System.out.println(fwhite+thick+"\t\t\t\t\t       SHOW LISTING"+reset);
				System.out.println();
				System.out.println("fyellow+thick+\t\t\t\t\t       -------------   ------------   ------------   ------------");
				System.out.println("\t\t\t\t\t       | 10:00 AM  |   | 01:35 PM |   | 07:35 PM |   | 11:10 PM |");
				System.out.println("\t\t\t\t\t       |    2D     |   |    2D    |   |    2D    |   |    2D    |");
				System.out.println("\t\t\t\t\t       -------------   ------------   -------------  ------------"+reset);
				System.out.println(fwhite+thick+"\t\t\t\t\t             1              2               3              4     "+reset);
				System.out.println();
				System.out.println();
				System.out.println(fwhite+thick+"\t\t\t\t\t       ........"+reset+fyellow+thick+"PLEASE ENTER RESPECTIVE SHOW"+reset+fwhite+thick+"......................"+reset);
				int c=Integer.parseInt(obj.nextLine());
				if(c==1)
				{
					showtime="10:00 AM";
					seating();
					System.out.print(fyellow+thick+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else if(c==2)
				{
					showtime="01:35 PM";
					seating();
					System.out.print(fyellow+thick+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else if(c==3)
				{
					showtime="07:35 PM";
					seating();
					System.out.print(fyellow+thick+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else if(c==4)
				{
					showtime="11:10 PM";
					seating();
					System.out.print(fyellow+thick+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else
				{
					System.out.println(fred+blk+"\t\t\t\t\t\t\t\t\t  PLEASE ENTER A VALID OPTION"+reset);
				}
			}
		}
		else if(a==2)
		{
			theater="PRASADS MULTIPLEX";
			System.out.println(fcyan+thick+"\t\t\t\t\t\t    Please Enter The Date In The Specified Format(DD/MM/YYYY)");
			date=obj.nextLine();
			while(true)
			{
				System.out.println(fyellow+thick+"\t\t\t\t\t       PRASADS MULTIPLEX, KHAIRTABA, HYDERBAD"+reset);
				System.out.println(fwhite+thick+"\t\t\t\t\t       ......................................................"+reset+fyellow+thick+"1km"+reset);
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println(fwhite+thick+"\t\t\t\t\t       ....................."+reset+fyellow+thick+"ABOUT MOVIE"+reset+fwhite+thick+".........................."+reset);
				System.out.println(fwhite+thick+"\t\t\t\t\t       .....DETAIL...............................................");
				System.out.println("\t\t\t\t\t       .....*RELEASED IN ALL LANGUAGES...........................");
				System.out.println("\t\t\t\t\t       .....*DRAMA & ROMANTIC...................................."+reset);
				System.out.println();
				System.out.println();
				System.out.println(fyellow+thick+"\t\t\t\t\t       KANGUVA IS A PAN INDIAN FILM DIRECTED BY SIVA");
				System.out.println("\t\t\t\t\t       STARRING SURIYA AND DISHA PATANI IN THE LEAD ROLES"+reset);
				System.out.println();
				System.out.println();
				System.out.println(fwhite+thick+"\t\t\t\t\t       SHOW LISTING"+reset);
				System.out.println();
				System.out.println(fyellow+thick+"\t\t\t\t\t       -------------   ------------   ------------   ------------");
				System.out.println("\t\t\t\t\t       | 10:00 AM  |   | 01:35 PM |   | 07:35 PM |   | 11:10 PM |");
				System.out.println("\t\t\t\t\t       |    2D     |   |    2D    |   |    2D    |   |    2D    |");
				System.out.println("\t\t\t\t\t       -------------   ------------   -------------  ------------"+reset);
				System.out.println(fwhite+thick+"\t\t\t\t\t             1              2               3              4     "+reset);
				System.out.println();
				System.out.println();
				System.out.println(fwhite+thick+"\t\t\t\t\t       ........"+reset+fyellow+thick+"PLEASE ENTER A RESPECTIVE SHOW"+reset+fwhite+thick+"......................"+reset);
				int b=Integer.parseInt(obj.nextLine());
				if(b==1)
				{
					showtime="10:00 AM";
					seating();
					System.out.print(fyellow+thick+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else if(b==2)
				{
					showtime="01:35 PM";
					seating();
					System.out.print(fyellow+thick+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else if(b==3)
				{
					showtime="07:35 PM";
					seating();
					System.out.print(fyellow+thick+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else if(b==4)
				{
					showtime="11:10 PM";
					seating();
					System.out.print(fyellow+thick+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS YOU WANT : "+reset);
					while(true)
					{
						int seats=Integer.parseInt(obj.nextLine());
						if(seats<5)
						{
							System.out.print(fgreen+"\t\t\t\t\t\t\t\tPLEASE ENTER YOUR SEATS NUMBERS YOU WANT : "+reset);
							seatno=new int[seats];
							for(int i=0;i<seats;i++)
							{
								seatno[i]=Integer.parseInt(obj.nextLine());
							}
							billing(seats);
							break;
						}
						else
						{
							System.out.println("\t\t\t\t\t\tPLEASE ENTER NUMBER LESS THAN 5");
						}
					}
					break;
				}
				else
				{
					System.out.print(fred+blk+"\t\t\t\t\t\t\t\t\t  PLEASE ENTER A VALID OPTION");
				}
			}
		}
		else
		{
			System.out.println("\t\t\t\t\t\t\t\t\t  PLEASE ENTER A VALID OPTION"+reset);
			kag();
		}
	}
}











class Restaurant 
{

	public static final String rst = "\033[0m";  		// Text Reset
	public static final String blk = "\u001B[5m";		//Blink

    	public static final String r = "\033[0;31m";     	// RED
    	public static final String g = "\033[0;32m";   		// GREEN
    	public static final String y = "\033[0;33m";  		// YELLOW
    	public static final String bl = "\033[0;34m";    	// BLUE
    	public static final String p = "\033[0;35m";  		// PURPLE
    	public static final String c = "\033[0;36m";     	// CYAN
    	public static final String w = "\033[0;37m";    	// WHITE

    	public static final String ru = "\033[4;31m";    	// RED_underline
   	public static final String gu = "\033[4;32m";  	// GREEN
    	public static final String yu = "\033[4;33m"; 		// YELLOW
    	public static final String bu = "\033[4;34m";   	// BLUE
    	public static final String pu = "\033[4;35m"; 		// PURPLE
    	public static final String cu = "\033[4;36m";   	// CYAN
    	public static final String wu = "\033[4;37m";  	// WHITE
	
    static Scanner sc = new Scanner(System.in);
    static double amount = 0f;
    static double bill = 0f;
    static double tax = 0f;
    static String[] itemname = new String[100];
    static int[] quantity = new int[100];
    static double[] price = new double[100];
    static double overall = 0f;
    static int count = -1;
    static int z = 0;
    static String flat="";
    static String landmark;
    static int pincode;
	static void sleep()
	{
		try{
		  Thread.sleep(1000);
		}	
		catch(InterruptedException e)
		{
		}
	}
    static void MN() 
    {
	
	System.out.println();
        System.out.println(p+blk+"\t\t\t\t\t  /$$$$$$  /$$    /$$        /$$$$$$  /$$$$$$$  /$$$$$$  /$$$$$$  /$$     /$$");sleep();
        System.out.println(p+blk+"\t\t\t\t\t /$$__  $$| $$   | $$       /$$__  $$| $$__  $$|_  $$_/ /$$__  $$|  $$   /$$/");sleep();
        System.out.println(p+blk+"\t\t\t\t\t| $$  \\__/| $$   | $$      | $$  \\__/| $$  \\ $$  | $$  | $$  \\__/ \\  $$ /$$/");sleep();
        System.out.println(p+blk+"\t\t\t\t\t| $$      |  $$ / $$/      |  $$$$$$ | $$$$$$$/  | $$  | $$        \\  $$$$/");sleep();
        System.out.println(y+blk+"\t\t\t\t\t| $$       \\  $$ $$/        \\____  $$| $$____/   | $$  | $$         \\  $$/");sleep();
        System.out.println(y+blk+"\t\t\t\t\t| $$    $$  \\  $$$/         /$$  \\ $$| $$        | $$  | $$    $$    | $$");sleep();
        System.out.println(y+blk+"\t\t\t\t\t|  $$$$$$/   \\  $/         |  $$$$$$/| $$       /$$$$$$|  $$$$$$/    | $$");sleep();
        System.out.println(y+blk+"\t\t\t\t\t \\______/     \\_/           \\______/ |__/      |______/ \\______/     |__/"+rst);sleep();
        System.out.println();
        System.out.println();

	System.out.println(r+"PLEASE ENTER LOCATION "+rst);sleep();
	System.out.println();
	System.out.println(bl+"PLEASE ENTER FLAT NO:"+rst);sleep();
	flat=sc.nextLine();
	System.out.println();
	System.out.println(bl+"PLEASE ENTER LAND MARK:"+rst);sleep();
	landmark=sc.nextLine();
	System.out.println(bl+"PLEASE ENTER PIN CODE:"+rst);sleep();
	pincode=Integer.parseInt(sc.nextLine());
	
	
        selection();
    }

    static void menu() {
	System.out.println(r+"\t\t\t\t\t\t\t\t _____________________________________________");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"   S.NO    "+rst+r+"|"+rst+"          CATEGORIES             "+rst+r+"|");
	System.out.println("\t\t\t\t\t\t\t\t|___________|_________________________________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"      1    "+rst+r+"|"+rst+"		NON-VEG		      "+rst+r+"|");
	System.out.println("\t\t\t\t\t\t\t\t|___________|_________________________________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"      2    "+rst+r+"|"+rst+"		  VEG  		      "+rst+r+"|");
	System.out.println("\t\t\t\t\t\t\t\t|___________|_________________________________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"      3    "+rst+r+"|"+rst+"		DESSERTS	      "+rst+r+"|");
	System.out.println("\t\t\t\t\t\t\t\t|___________|_________________________________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"      4    "+rst+r+"|"+rst+"		BAKERY ITEMS	      "+rst+r+"|");
	System.out.println("\t\t\t\t\t\t\t\t|___________|_________________________________|"+rst);

        int a = Integer.parseInt(sc.nextLine());
        if (a == 1) 
	{
            nonveg();
        } 
	else if (a == 2) 
	{
            veg();
        } 
	else if (a == 3) 
	{
            desserts();
        } else if (a == 4) {
            bakeryitems();
        } else {
            System.out.println(r+"\t\t\t\t\t\t\t\tINVALID INPUT PLEASE ENTER A VALID INPUT"+rst);
            System.out.println(c+"\t\t\t\t\t\t\t\tPRESS 1 TO SELECT AGAIN OR ANY NUMBER TO EXIT"+rst);
            int b = Integer.parseInt(sc.nextLine());
            if (b == 1) {
                menu();
            }
        }
    }

    static void selection() 
    {
	System.out.println(r+"\t\t\t\t------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t|-------"+w+blk+"S E L E C T  T H E  R E S T A U R A N T  T H A T  Y O U  W A N T  T O  O R D E R"+rst+r+"-------|");
	System.out.println("\t\t\t\t------------------------------------------------------------------------------------------------"+rst);
        System.out.println();
	System.out.println();
	System.out.println(cv.red+cv.blink+"\t\t\t\t\t\tONLY IF YOU ORDER ABOVE 2000 YOU ARE ELIGIBLE FOR DISCOUNT OF 500"+cv.reset);
	System.out.println();
	System.out.println();       
	System.out.println(bl+"\t\t  ******************************"+rst+g+"\t\t\t******************************"+rst+c+"\t\t\t***************************"+rst);
	System.out.println(bl+"\t\t  |1   MEHFIL RESTAURANT       |"+rst+g+"\t\t\t| 2   LUCKY  RESTAURANT      |"+rst+c+"\t\t\t|3     CHUTNEYS HUB       |"+rst);
	System.out.println(bl+"\t\t  ******************************"+rst+g+"\t\t\t******************************"+rst+c+"\t\t\t***************************"+rst);
	System.out.println();
	System.out.println();
	System.out.println(p+"\t\t  ******************************"+rst+"\t\t\t******************************"+rst+y+"\t\t\t***************************"+rst);
	System.out.println(p+"\t\t  |4  BAWARCHI  RESTAURANT     |"+rst+"\t\t\t|5   NAIDU GARI KUNDA BIRYANI|"+rst+y+"\t\t\t|6  CHARAN GARI RUCHULU   |"+rst);
	System.out.println(p+"\t\t  ******************************"+rst+"\t\t\t******************************"+rst+y+"\t\t\t***************************"+rst);
        int c = Integer.parseInt(sc.nextLine());
        if (c <= 6) 
	{
		menu();
        } 
	else 
	{
            System.out.println(r+"\t\t\t\t\t\t\t\tINVALID INPUT PLEASE ENTER A VALID INPUT"+rst);
            System.out.println(c+"\t\t\t\t\t\t\t\tPRESS 1 TO SELECT AGAIN OR ANY NUMBER TO EXIT"+rst);
            int d = Integer.parseInt(sc.nextLine());
            if (d == 1) 
	    {
                selection();
            }
	    else
	    {
		System.out.println(r+blk+"\t\t\t\t\t\t\t\t    TERMINATED SUCCESSFULLY"+rst);
	    }
        }
    }

    static void nonveg() 
    {
	System.out.println(bl+"\t\t\t*******************"+rst+r+"\t\t\t*********************"+rst+p+"\t\t\t***********************"+rst);
        System.out.println(bl+"\t\t\t|1 FOR SOUPS      |"+rst+r+"\t\t\t|2 FOR STARTERS     |"+rst+p+"\t\t\t|3  FOR BIRYANIS      |"+rst);
	System.out.println(bl+"\t\t\t*******************"+rst+r+"\t\t\t*********************"+rst+p+"\t\t\t***********************"+rst);
        int e = Integer.parseInt(sc.nextLine());
        if (e == 1) 
	{
            soups();
        } 
	else if (e == 2) 
	{
            starters();
        } 
	else if (e == 3) 
	{
            biryanis();
        } 
	else 
	{
            System.out.println(r+"\t\t\t\t\t\t\t\tINVALID INPUT PLEASE ENTER A VALID INPUT"+rst);
            System.out.println(c+"\t\t\t\t\t\t\t\tPRESS 1 TO SELECT AGAIN OR ANY NUMBER TO EXIT"+rst);
            int f = Integer.parseInt(sc.nextLine());
            if (f == 1) {
                nonveg();
            }
        }
    }

    static void veg() 
    {
        System.out.println(bl+"\t\t\t*******************"+rst+r+"\t\t\t*********************"+rst+p+"\t\t\t***********************"+rst);
        System.out.println(bl+"\t\t\t|1 FOR SOUPS      |"+rst+r+"\t\t\t|2 FOR STARTERS     |"+rst+p+"\t\t\t|3  FOR BIRYANIS      |"+rst);
	System.out.println(bl+"\t\t\t*******************"+rst+r+"\t\t\t*********************"+rst+p+"\t\t\t***********************"+rst);
        int e = Integer.parseInt(sc.nextLine());
        if (e == 1) {
            vegsoups();
        } else if (e == 2) {
            vegstarters();
        } else if (e == 3) {
            vegbiryanis();
        } else {
            System.out.println(r+"\t\t\t\t\t\t\t\tINVALID INPUT PLEASE ENTER A VALID INPUT"+rst);
            System.out.println(c+"\t\t\t\t\t\t\t\tPRESS 1 TO SELECT AGAIN OR ANY NUMBER TO EXIT"+rst);
            int f = Integer.parseInt(sc.nextLine());
            if (f == 1) {
                veg();
            }
        }
    }

    static void bakeryitems() 
    {
	System.out.println(y+"\t\t  *******************"+rst+bl+"\t\t\t*********************"+rst+g+"\t\t\t***********************"+rst+p+"\t\t\t*******************"+rst);
        System.out.println(y+"\t\t  |1     CAKES      |"+rst+bl+"\t\t\t|2      PIZZAS      |"+rst+g+"\t\t\t|3      PUFFS         |"+rst+p+"\t\t\t|4  COOL DRINKS   |"+rst);
	System.out.println(y+"\t\t  *******************"+rst+bl+"\t\t\t*********************"+rst+g+"\t\t\t***********************"+rst+p+"\t\t\t*******************"+rst);
        int e = Integer.parseInt(sc.nextLine());
        if (e == 1) 
	{
            cakes();
        } 
	else if (e == 2) 
	{
            pizzas();
        } 
	else if (e == 3) 
	{
            pufs();
        } 
	else if (e == 4) 
	{
            beverages();
        } 
	else 
	{
            System.out.println(r+"\t\t\t\t\t\t\t\tINVALID INPUT PLEASE ENTER A VALID INPUT"+rst);
            System.out.println(c+"\t\t\t\t\t\t\t\tPRESS 1 TO SELECT AGAIN OR ANY NUMBER TO EXIT"+rst);
            int f = Integer.parseInt(sc.nextLine());
            if (f == 1) {
                bakeryitems();
            }
        }
    }

    static void desserts() {
	System.out.println(bl+"\t\t\t\t\t\t\t\t__________________________________________________");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"  SO.NO  "+rst+bl+"|"+rst+"           ITEMS          "+rst+bl+"|"+rst+"    PRICE  "+rst+bl+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    1    "+rst+bl+"|"+rst+"       DOUBLE KA MEETA    "+rst+bl+"|"+rst+"   150Rs   "+rst+bl+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    2    "+rst+bl+"|"+rst+"     APRICOT DELIGHT      "+rst+bl+"|"+rst+"   240Rs   "+rst+bl+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    3    "+rst+bl+"|"+rst+"          RAS MALAI       "+rst+bl+"|"+rst+"   119Rs   "+rst+bl+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    4    "+rst+bl+"|"+rst+"         KALA JAMUN       "+rst+bl+"|"+rst+"   199Rs   "+rst+bl+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    5    "+rst+bl+"|"+rst+"        FRUIT SALAD       "+rst+bl+"|"+rst+"   201Rs   "+rst+bl+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|"+rst);
        int e = Integer.parseInt(sc.nextLine());
        if (e == 1) {
            z = ++count;
            itemname[z] = "D O U B L E  K A  M E E T A                    ";
            billing("D O U B L E  K A  M E E T A", 150f);
        } else if (e == 2) {
            z = ++count;
            itemname[z] = "A P R I C O T  D E L I G H T                   ";
            billing("A P R I C O T  D E L I G H T", 240f);
        } else if (e == 3) {
            z = ++count;
            itemname[z] = "R A S  M A L A I                               ";
            billing("R A S  M A L A I", 199f);
        } else if (e == 4) {
            z = ++count;
            itemname[z] = "K A L A  J A M U N                             ";
            billing("K A L A  J A M U N", 199f);
        } else if (e == 5) {
            z = ++count;
            itemname[z] = "F R U I T  S A L A D                           ";
            billing("F R U I T  S A L A D", 201f);
        } else {
            System.out.println(r+"\t\t\t\t\t\t\t\t INVALID INPUT PLEASE ENTER A VALID INPUT"+rst);
            System.out.println(c+"\t\t\t\t\t\t\t\t PRESS 1 TO SELECT AGAIN OR ANY NUMBER TO EXIT"+rst);
            int f = Integer.parseInt(sc.nextLine());
            if (f == 1) {
                desserts();
            }
        }
    }

    static void soups() {
	System.out.println(y+"\t\t\t\t\t\t\t\t _____________________________________________________");	
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"   SO.NO  "+rst+y+"|"+rst+"           ITEMS         "+rst+y+"|"+rst+"	PRICE	      "+rst+y+"|");
	System.out.println("\t\t\t\t\t\t\t\t|__________|_________________________|________________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"	1  "+rst+y+"|"+rst+"	    CHICKEN SOUP     "+rst+y+"|"+rst+"	        200rs "+rst+y+"|");
	System.out.println("\t\t\t\t\t\t\t\t|__________|_________________________|________________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"	2  "+rst+y+"|"+rst+"	     MUTTON SOUP     "+rst+y+"|"+rst+"	        250rs "+rst+y+"|");
	System.out.println("\t\t\t\t\t\t\t\t|__________|_________________________|________________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"	3  "+rst+y+"|"+rst+"      CHICKEN THAI SOUP  "+rst+y+"|"+rst+"	        240rs "+rst+y+"|");
	System.out.println("\t\t\t\t\t\t\t\t|__________|_________________________|________________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"	4  "+rst+y+"|"+rst+"     CHICKEN CLEAR SOUP  "+rst+y+"|"+rst+"	        199rs "+rst+y+"|");
	System.out.println("\t\t\t\t\t\t\t\t|__________|_________________________|________________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"	5  "+rst+y+"|"+rst+"  	     FISH SOUP       "+rst+y+"|"+rst+"	        300rs "+rst+y+"|");
	System.out.println("\t\t\t\t\t\t\t\t|__________|_________________________|________________|"+rst);

        int g = Integer.parseInt(sc.nextLine());
        if (g == 1) {
            String name = "C H I C K E N  S O U P                          ";
            z = ++count;
            itemname[z] = name;
            amount = 200f;
            billing(name, amount);
        } else if (g == 2) {
            String name = "M U T T O N  S O U P                            ";
            z = ++count;
            itemname[z] = name;
            amount = 250f;
            billing(name, amount);
        } else if (g == 3) {
            String name = "C H I C K E N  T H A I  S O U P                 ";
            z = ++count;
            itemname[z] = name;
            amount = 240f;
            billing(name, amount);
        } else if (g == 4) {
            String name = "C H I C K E N  C L E A R  S O U P               ";
            z = ++count;
            itemname[z] = name;
            amount = 199f;
            billing(name, amount);
        } else if (g == 5) {
            String name = "F I S H  S O U P                                ";
            z = ++count;
            itemname[z] = name;
            amount = 300f;
            billing(name, amount);
        } else {
            System.out.println(r+"\t\t\t\t\t\t\t\t INVALID INPUT PLEASE ENTER A VALID INPUT"+rst);
            System.out.println(c+"\t\t\t\t\t\t\t\t PRESS 1 TO SELECT AGAIN OR ANY NUMBER TO EXIT"+rst);
            int h = Integer.parseInt(sc.nextLine());
            if (h == 1) {
                soups();
            }
        }
    }

    static void vegsoups() {
	System.out.println(c+"\t\t\t\t\t\t\t\t__________________________________________________");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"  SO.NO  "+rst+c+"|"+rst+"           ITEMS          "+rst+c+"|"+rst+"    PRICE  "+rst+c+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    1    "+rst+c+"|"+rst+"    VEG MANCHOW SOUP      "+rst+c+"|"+rst+"   50Rs    "+rst+c+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    2    "+rst+c+"|"+rst+"       VEG CORN SOUP      "+rst+c+"|"+rst+"   50Rs    "+rst+c+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    3    "+rst+c+"|"+rst+"        TOMATO SOUP       "+rst+c+"|"+rst+"   149Rs   "+rst+c+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    4    "+rst+c+"|"+rst+"       MUSHROOM SOUP      "+rst+c+"|"+rst+"   199Rs   "+rst+c+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    5    "+rst+c+"|"+rst+"     MINT GINGER SOUP     "+rst+c+"|"+rst+"   135Rs   "+rst+c+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|"+rst);
        int g = Integer.parseInt(sc.nextLine());
        if (g == 1) {
            String name = "V E G M A N C H O W  S O U P                    ";
            z = ++count;
            itemname[z] = name;
            amount = 50f;
            billing(name, amount);
        } else if (g == 2) {
            String name = "V E G  C O R N  S O U P                         ";
            z = ++count;
            itemname[z] = name;
            amount = 50f;
            billing(name, amount);
        } else if (g == 3) {
            String name = "T O M A T O  S O U P                            ";
            z = ++count;
            itemname[z] = name;
            amount = 149f;
            billing(name, amount);
        } else if (g == 4) {
            String name = "M U S H R O O M  S O U P                        ";
            z = ++count;
            itemname[z] = name;
            amount = 199f;
            billing(name, amount);
        } else if (g == 5) {
            String name = "M I N T  G I N G E R  S O U P                   ";
            z = ++count;
            itemname[z] = name;
            amount = 135f;
            billing(name, amount);
        } else {
            System.out.println(r+"\t\t\t\t\t\t\t\tInvalid Input Please Select A Valid Input"+rst);
            System.out.println(c+"\t\t\t\t\t\t\t\tPRESS 1 TO SELECT AGAIN OR ANY NUMBER TO EXIT"+rst);
            int h = Integer.parseInt(sc.nextLine());
            if (h == 1) {
                vegsoups();
            }
        }
    }

    static void starters() {
	System.out.println(p+"\t\t\t\t\t\t\t\t__________________________________________________");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"  SO.NO  "+rst+p+"|"+rst+"           ITEMS          "+rst+p+"|"+rst+"    PRICE  "+rst+p+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    1    "+rst+p+"|"+rst+"        CHICKEN 65        "+rst+p+"|"+rst+"   119Rs   "+rst+p+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    2    "+rst+p+"|"+rst+""+rst+"    CHICKEN MANCHURIYA    "+rst+p+"|"+rst+"   299Rs   "+rst+p+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    3    "+rst+p+"|"+rst+"     CHICKEN LOLLIPOP     "+rst+p+"|"+rst+"   179Rs   "+rst+p+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    4    "+rst+p+"|"+rst+"     PEPPER CHICKEN       "+rst+p+"|"+rst+"   149Rs   "+rst+p+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    5    "+rst+p+"|"+rst+"        APPOLO FISH       "+rst+p+"|"+rst+"   399Rs   "+rst+p+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|"+rst);
        int g = Integer.parseInt(sc.nextLine());
        if (g == 1) {
            String name = "C H I C K E N  6 5                              ";
            z = ++count;
            itemname[z] = name;
            amount = 119f;
            billing(name, amount);
        } else if (g == 2) {
            String name = "C H I C K E N  M A N C H U R I Y                ";
            z = ++count;
            itemname[z] = name;
            amount = 299f;
            billing(name, amount);
        } else if (g == 3) {
            String name = "C H I C K E N  L O L L I P O P                  ";
            z = ++count;
            itemname[z] = name;
            amount = 179f;
            billing(name, amount);
        } else if (g == 4) {
            String name = "P E P P E R  C H I C K E N                      ";
            z = ++count;
            itemname[z] = name;
            amount = 149f;
            billing(name, amount);
        } else if (g == 5) {
            String name = "A P P O L O  F I S H                            ";
            z = ++count;
            itemname[z] = name;
            amount = 399f;
            billing(name, amount);
        } else {
            System.out.println(r+"\t\t\t\t\t\t\t\tInvalid Input Please Select A Valid Input"+rst);
            System.out.println(c+"\t\t\t\t\t\t\t\tPRESS 1 TO SELECT AGAIN OR ANY NUMBER TO EXIT"+rst);
            int h = Integer.parseInt(sc.nextLine());
            if (h == 1) {
                starters();
            }
        }
    }

    static void vegstarters() {
	System.out.println(g+"\t\t\t\t\t\t\t\t__________________________________________________");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"  SO.NO  "+rst+g+"|"+rst+"           ITEMS          "+rst+g+"|"+rst+"    PRICE  "+rst+g+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    1    "+rst+g+"|"+rst+"      PANEER TIKKA        "+rst+g+"|"+rst+"   330Rs   "+rst+g+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    2    "+rst+g+"|"+rst+"       BABY CORN 65       "+rst+g+"|"+rst+"   330Rs   "+rst+g+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    3    "+rst+g+"|"+rst+"    MALAI PANEER TIKKA    "+rst+g+"|"+rst+"   330Rs   "+rst+g+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    4    "+rst+g+"|"+rst+"     GOBI MANCHURIYA      "+rst+g+"|"+rst+"   190Rs   "+rst+g+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    5    "+rst+g+"|"+rst+"    MUSHROOM MANCHURIYA   "+rst+g+"|"+rst+"   190Rs   "+rst+g+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|"+rst);
        int g = Integer.parseInt(sc.nextLine());
        if (g == 1) {
            String name = "P A N E E R  T I K K A                          ";
            z = ++count;
            itemname[z] = name;
            amount = 330f;
            billing(name, amount);
        } else if (g == 2) {
            String name = "B A B Y  C O R N  65                            ";
            z = ++count;
            itemname[z] = name;
            amount = 330f;
            billing(name, amount);
        } else if (g == 3) {
            String name = "M A L A I  P A N E E R  T I K K A               ";
            z = ++count;
            itemname[z] = name;
            amount = 330f;
            billing(name, amount);
        } else if (g == 4) {
            String name = "G O B I  M A N C H U R I A                      ";
            z = ++count;
            itemname[z] = name;
            amount = 190f;
            billing(name, amount);
        } else if (g == 5) {
            String name = "M U S H R O O M  M A N C H U R I A              ";
            z = ++count;
            itemname[z] = name;
            amount = 190f;
            billing(name, amount);
        } else {
            System.out.println(r+"\t\t\t\t\t\t\t\tInvalid Input Please Select A Valid Input"+rst);
            System.out.println(c+"\t\t\t\t\t\t\t\tPRESS 1 TO SELECT AGAIN OR ANY NUMBER TO EXIT"+rst);
            int h = Integer.parseInt(sc.nextLine());
            if (h == 1) {
                vegstarters();
            }
        }
    }

    static void biryanis() {
	System.out.println(r+"\t\t\t\t\t\t\t\t__________________________________________________");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"  SO.NO  "+rst+r+"|"+rst+"           ITEMS          "+rst+r+"|"+rst+"    PRICE  "+rst+r+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    1    "+rst+r+"|"+rst+"    CHICKEN DUM BIRYANI   "+rst+r+"|"+rst+"   199Rs   "+rst+r+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    2    "+rst+r+"|"+rst+"      MUTTON BIRYANI      "+rst+r+"|"+rst+"   299Rs   "+rst+r+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    3    "+rst+r+"|"+rst+"       MIXED BIRYANI      "+rst+r+"|"+rst+"   350Rs   "+rst+r+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    4    "+rst+r+"|"+rst+" CHICKEN MUGALAYI BIRYANI "+rst+r+"|"+rst+"   380Rs   "+rst+r+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    5    "+rst+r+"|"+rst+"        FISH BIRYANI      "+rst+r+"|"+rst+"   280Rs   "+rst+r+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|"+rst);
        int g = Integer.parseInt(sc.nextLine());
        if (g == 1) {
            String name = "C H I C K E N  D U M  B I R Y A N I             ";
            z = ++count;
            itemname[z] = name;
            amount = 199f;
            billing(name, amount);
        } else if (g == 2) {
            String name = "M U T T O N  B I R Y A N I                      ";
            z = ++count;
            itemname[z] = name;
            amount = 299f;
            billing(name, amount);
        } else if (g == 3) {
            String name = "M I X E D  B I R Y A N I                        ";
            z = ++count;
            itemname[z] = name;
            amount = 350f;
            billing(name, amount);
        } else if (g == 4) {
            String name = "C H I C K E N  M U G A L A Y I  B I R Y A N I   ";
            z = ++count;
            itemname[z] = name;
            amount = 380f;
            billing(name, amount);
        } else if (g == 5) {
            String name = "F I S H  B I R Y A N I                          ";
            z = ++count;
            itemname[z] = name;
            amount = 280f;
            billing(name, amount);
        } else {
            System.out.println(r+"\t\t\t\t\t\t\t\tInvalid Input Please Select A Valid Input"+rst);
            System.out.println(c+"\t\t\t\t\t\t\t\tPRESS 1 TO SELECT AGAIN OR ANY NUMBER TO EXIT"+rst);
            int h = Integer.parseInt(sc.nextLine());
            if (h == 1) {
                biryanis();
            }
        }
    }

    static void cakes() {
	System.out.println(p+"\t\t\t\t\t\t\t\t___________________________________________________________");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"  S.NO   "+rst+p+"|"+rst+"           ITEMS          "+rst+p+"|"+rst+"   Grams   "+rst+p+"|"+rst+"  PRICE  "+rst+p+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|_________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    1    "+rst+p+"|"+rst+"    BUTTER SCOTCH CAKE    "+rst+p+"|"+rst+"   500Gm   "+rst+p+"|"+rst+"  550Rs  "+rst+p+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|_________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    2    "+rst+p+"|"+rst+"      PINE APPLE CAKE     "+rst+p+"|"+rst+"   500Gm   "+rst+p+"|"+rst+"  550Rs  "+rst+p+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|_________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    3    "+rst+p+"|"+rst+"     CHOC0LATE CAKE       "+rst+p+"|"+rst+"   500Gm   "+rst+p+"|"+rst+"  499Rs  "+rst+p+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|_________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    4    "+rst+p+"|"+rst+"        BROWNIE CAKE      "+rst+p+"|"+rst+"   500Gm   "+rst+p+"|"+rst+"  450Rs  "+rst+p+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|_________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    5    "+rst+p+"|"+rst+"      RED VELET CAKE      "+rst+p+"|"+rst+"   500Gm   "+rst+p+"|"+rst+"  500Rs  "+rst+p+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|_________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    6    "+rst+p+"|"+rst+"        BLACK FOREST      "+rst+p+"|"+rst+"   500Gm   "+rst+p+"|"+rst+"  550Rs  "+rst+p+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|_________|"+rst);
        int ca = Integer.parseInt(sc.nextLine());
        if (ca == 1) {
            String name = "B U T T E R  S C O T C H  C A K E              ";
            z = ++count;
            itemname[z] = name;
            amount = 550f;
            billing(name, amount);
        } else if (ca == 2) {
            String name = "P I N E  A P P L E  C A K E                    ";
            z = ++count;
            itemname[z] = name;
            amount = 550f;
            billing(name, amount);
        } else if (ca == 3) {
            String name = "C H O C 0 L A T E  C A K E                     ";
            z = ++count;
            itemname[z] = name;
            amount = 499f;
            billing(name, amount);
        } else if (ca == 5) {
            String name = "R E D  V E L E T  C A K E                      ";
            z = ++count;
            itemname[z] = name;
            amount = 500f;
            billing(name, amount);
        } else if (ca == 4) {
            String name = "B R O W N I E  C A K E                         ";
            z = ++count;
            itemname[z] = name;
            amount = 450f;
            billing(name, amount);
        } else if (ca == 6) {
            String name = "B L A C K  F O R E S T                         ";
            z = ++count;
            itemname[z] = name;
            amount = 550f;
            billing(name, amount);
        } else {
            System.out.println(r+"\t\t\t\t\t\t\t\tInvalid Input Please Select A Valid Input"+rst);
            System.out.println(c+"\t\t\t\t\t\t\t\tPRESS 1 TO SELECT AGAIN OR ANY NUMBER TO EXIT"+rst);
            int h = Integer.parseInt(sc.nextLine());
            if (h == 1) {
                cakes();
            }
        }
    }

    static void beverages() {
	System.out.println(bl+"\t\t\t\t\t\t\t\t__________________________________________________");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"  SO.NO  "+rst+bl+"|"+rst+"           ITEMS          "+rst+bl+"|"+rst+"    PRICE  "+rst+bl+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    1    "+rst+bl+"|"+rst+"            COKE          "+rst+bl+"|"+rst+"    80Rs   "+rst+bl+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    2    "+rst+bl+"|"+rst+"         PEPSI BLACK      "+rst+bl+"|"+rst+"    90Rs   "+rst+bl+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    3    "+rst+bl+"|"+rst+"      OREA MILK SHAKE     "+rst+bl+"|"+rst+"   100Rs   "+rst+bl+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    4    "+rst+bl+"|"+rst+"    CHOCOLATE MILK SHAKE  "+rst+bl+"|"+rst+"   120Rs   "+rst+bl+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    5    "+rst+bl+"|"+rst+"    NUTELLA MILK SHAKE    "+rst+bl+"|"+rst+"   200Rs   "+rst+bl+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    6    "+rst+bl+"|"+rst+"     MANGO MILK SHAKE     "+rst+bl+"|"+rst+"    90Rs   "+rst+bl+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|"+rst);
        int x = Integer.parseInt(sc.nextLine());
        if (x == 1) {
            String name = "C O K E                                       ";
            z = ++count;
            itemname[z] = name;
            amount = 80f;
            billing(name, amount);
        } else if (x == 2) {
            String name = "P E P S I  B L A C K                          ";
            z = ++count;
            itemname[z] = name;
            amount = 90f;
            billing(name, amount);
        } else if (x == 3) {
            String name = " O R E A  M I L K  S H A K E                  ";
            z = ++count;
            itemname[z] = name;
            amount = 100f;
            billing(name, amount);
        } else if (x == 4) {
            String name = "C H O C O L A T E  M I L K S H A K E            ";
            z = ++count;
            itemname[z] = name;
            amount = 120f;
            billing(name, amount);
        } else if (x == 5) {
            String name = "N U T E L L A  M I L K S H A K E              ";
            z = ++count;
            itemname[z] = name;
            amount = 200f;
            billing(name, amount);
        } else if (x == 6) {
            String name = "M A N G O  M I L K S H A K E                  ";
            z = ++count;
            itemname[z] = name;
            amount = 90f;
            billing(name, amount);
        } else {
            System.out.println("Select Valid Option");
	    System.out.println(p+blk+"\t\t\t\t\t\t**************************");
            System.out.println("\t\t\t\t\t\t|1   SELECT OPTIONS      |");
	    System.out.println("\t\t\t\t\t\t**************************"+blk+rst);
	    System.out.println("\t\t\t\t\t\t**************************");
	    System.out.println(g+blk+"\t\t\t\t\t\t2   PRESS ANY KEY TO EXIT|");
	    System.out.println("\t\t\t\t\t\t**************************"+blk+g);
            int ka = Integer.parseInt(sc.nextLine());
            if (ka == 1)
                beverages();
            else
                System.out.println(r+"\t\t\t\t\t\t\t\tYou Have Entered Not A Valid Option So Terminated SuccessFully"+rst);

        }
    }

    static void vegbiryanis() {
	System.out.println(g+"\t\t\t\t\t\t\t\t\t__________________________________________________");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"  SO.NO  "+rst+g+"|"+rst+"           ITEMS          "+rst+g+"|"+rst+"    PRICE  "+rst+g+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    1    "+rst+g+"|"+rst+"        VEG BIRYANI       "+rst+g+"|"+rst+"   199Rs   "+rst+g+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    2    "+rst+g+"|"+rst+"      PANEER BIRYANI      "+rst+g+"|"+rst+"   229Rs   "+rst+g+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    3    "+rst+g+"|"+rst+"      MUSHROOM BIRYANI    "+rst+g+"|"+rst+"   250Rs   "+rst+g+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    4    "+rst+g+"|"+rst+"        KAJU BIRYANI      "+rst+g+"|"+rst+"   270Rs   "+rst+g+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+"    5    "+rst+g+"|"+rst+"    JACK FRUIT BIRYANI    "+rst+g+"|"+rst+"   289Rs   "+rst+g+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|"+rst);
        int g = Integer.parseInt(sc.nextLine());
        if (g == 1) {
            String name = "V E G  B I R Y A N I                          ";
            z = ++count;
            itemname[z] = name;
            amount = 199f;
            billing(name, amount);
        } else if (g == 2) {
            String name = "P A N E E R  B I R Y A N I                    ";
            z = ++count;
            itemname[z] = name;
            amount = 229f;
            billing(name, amount);
        } else if (g == 3) {
            String name = "M U S H R O O M  B I R Y A N I                ";
            z = ++count;
            itemname[z] = name;
            amount = 250f;
            billing(name, amount);
        } else if (g == 4) {
            String name = "K A J U  B I R Y A N I                        ";
            z = ++count;
            itemname[z] = name;
            amount = 270f;
            billing(name, amount);
        } else if (g == 5) {
            String name = "J A C K  F R U I T  B I R Y A N I             ";
            z = ++count;
            itemname[z] = name;
            amount = 289f;
            billing(name, amount);
        } else {
            System.out.println(r+"\t\t\t\t\t\t\t\tInvalid Input Please Select A Valid Input"+rst);
            System.out.println(c+"\t\t\t\t\t\t\t\tPRESS 1 TO SELECT AGAIN OR ANY NUMBER TO EXIT"+rst);
            int h = Integer.parseInt(sc.nextLine());
            if (h == 1) {
                vegbiryanis();
            }
        }
    }

    static void pizzas() {
	System.out.println("\t\t\t\t\t\t\t\t___________________________________________________________");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+r+"  SO.NO  "+rst+"|"+rst+r+"           ITEMS          "+rst+"|"+rst+r+"   PIECES  "+rst+"|"+rst+r+"  PRICE  "+rst+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|_________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+r+"    1    "+rst+"|"+rst+r+"         CORN CHEESE      "+rst+"|"+rst+r+"     8     "+rst+"|"+rst+r+"  190Rs  "+rst+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|_________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+r+"    2    "+rst+"|"+rst+r+"       CHICKEN TIKKA      "+rst+"|"+rst+r+"     8     "+rst+"|"+rst+r+"  215Rs  "+rst+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|_________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+r+"    3    "+rst+"|"+rst+r+"       PANEER TIKKA       "+rst+"|"+rst+r+"     8     "+rst+"|"+rst+r+"  215Rs  "+rst+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|_________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+r+"    4    "+rst+"|"+rst+r+"         MORROCCAN        "+rst+"|"+rst+r+"     8     "+rst+"|"+rst+r+"  215Rs  "+rst+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|_________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+r+"    5    "+rst+"|"+rst+r+"    M A R G H R N T A     "+rst+"|"+rst+r+"     8     "+rst+"|"+rst+r+"  239Rs  "+rst+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|_________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+r+"    6    "+rst+"|"+rst+r+"   PEPPER BARBECUE PIZZA  "+rst+"|"+rst+r+"     8     "+rst+"|"+rst+r+"  200Rs  "+rst+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|_________|"+rst);
        System.out.println("enter valid option");
        int ca = Integer.parseInt(sc.nextLine());
        if (ca == 1) {
            String name = "C O R N  C H E E S E                          ";
            z = ++count;
            itemname[z] = name;
            amount = 190f;
            billing(name, amount);
        } else if (ca == 2) {
            String name = "C H I C K E N  T I K K A                      ";
            z = ++count;
            itemname[z] = name;
            amount = 550f;
            billing(name, amount);
        } else if (ca == 3) {
            String name = "P A N E E R  T I K K A                        ";
            z = ++count;
            itemname[z] = name;
            amount = 215f;
            billing(name, amount);
        } else if (ca == 5) {
            String name = "M A R G H R N T A                             ";
            z = ++count;
            itemname[z] = name;
            amount = 239f;
            billing(name, amount);
        } else if (ca == 4) {
            String name = "M O R R O C C A N                             ";
            z = ++count;
            itemname[z] = name;
            amount = 215f;
            billing(name, amount);
        } else if (ca == 6) {
            String name = "P E P P E R  B A R B E C U E  P I Z Z A         ";
            z = ++count;
            itemname[z] = name;
            amount = 550f;
            billing(name, amount);
        } else {
            System.out.println(r+"\t\t\t\t\t\t\t\tInvalid Input Please Select A Valid Input"+rst);
            System.out.println(c+"\t\t\t\t\t\t\t\tPress 1 To Select Again Or Any Number To Exit"+rst);
            int h = Integer.parseInt(sc.nextLine());
            if (h == 1) {
                pizzas();
            }
        }
    }

    static void pufs() {
	System.out.println("\t\t\t\t\t\t\t\t__________________________________________________");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+y+"  SO.NO  "+rst+"|"+rst+y+"           ITEMS          "+rst+"|"+rst+y+"    PRICE  "+rst+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+y+"|    1    "+rst+"|"+rst+y+"        CHICKEN PUFF      "+rst+"|"+rst+y+"    80Rs   "+rst+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+y+"    2    "+rst+"|"+rst+y+"         EGG PUFF         "+rst+"|"+rst+y+"    70Rs   "+rst+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+y+"    3    "+rst+"|"+rst+y+"        PANNER PUFF       "+rst+"|"+rst+y+"    800Rs  "+rst+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+y+"    4    "+rst+"|"+rst+y+"        CHICKEN ROLL      "+rst+"|"+rst+y+"   100Rs   "+rst+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|");
	System.out.println("\t\t\t\t\t\t\t\t|"+rst+y+"    5    "+rst+"|"+rst+y+"          EGG ROLL        "+rst+"|"+rst+y+"    90Rs   "+rst+"|");
	System.out.println("\t\t\t\t\t\t\t\t|_________|__________________________|___________|"+rst);
        int n = Integer.parseInt(sc.nextLine());
        if (n == 1) {
            String name = "C H I C K E N  P U F F                        ";
            z = ++count;
            itemname[z] = name;
            amount = 80f;
            billing(name, amount);

        } else if (n == 2) {
            String name = "E G G  P U F F                                ";
            z = ++count;
            itemname[z] = name;
            amount = 70f;
            billing(name, amount);
        } else if (n == 3) {
            String name = "P A N N E R  P U F F                          ";
            z = ++count;
            itemname[z] = name;
            amount = 70f;
            billing(name, amount);
        } else if (n == 4) {
            String name = "C H I C K E N  R O L L                        ";
            z = ++count;
            itemname[z] = name;
            amount = 100f;
            billing(name, amount);
        } else if (n == 5) {
            String name = "E G G  R O L L                                ";
            z = ++count;
            itemname[z] = name;
            amount = 90f;
            billing(name, amount);
        } else {
            System.out.println(r+"\t\t\t\t\t\t\t\tInvalid Input Please Select A Valid Input"+rst);
            System.out.println(c+"\t\t\t\t\t\t\t\tPress 1 To Select Again Or Any Number To Exit"+rst);
            int h = Integer.parseInt(sc.nextLine());
            if (h == 1) {
                pufs();

            } else
                System.out.println("\t\t\t\t\t\t\t\tYou Have Entered Not A Valid Option So Terminated SuccessFully");

        }
    }

    static void billing(String name, double amount) {
        System.out.println("\t\t\t\t\t\t\t\t    Please Enter The Quantity You Want");
        int i = Integer.parseInt(sc.nextLine());
        quantity[z] = i;
        price[z] = quantity[z] * amount;

        if (i <= 0) {
            System.out.println("\t\t\t\t\t\t\t\t    Please Enter the Valid Number");
            billing(name, amount);
        } else {
            tax = tax + (double) (2 * amount * i) / 100;
            bill = bill + tax + (amount * i);
            System.out.println("\t\t\t\t\t\t"+name    +       + i +" -Q       "+ (i * amount));
	    System.out.println();
            System.out.println(bl+"\t\t\t\t\t\t\t\t   1 To Add More Items"+rst+r+"\n\t\t\t\t\t\t\t\t   2 For To Make a Payment or Press Any Key To Exit"+rst);
            int j = Integer.parseInt(sc.nextLine());
            if (j == 1) 
	    {
                selection();
            } 
            else if (j == 2) 
            {
                display();
            } 
	    else 
	    {
                System.out.println(r+"\t\t\t\t\t\t\t\t       TERMINATED SUCCESSFULLY"+rst);
            }
        }
    }
    static void display() 
    {
	DateTime.ma();
	System.out.println(p+"\t\t\t\t\t*************************************************************************************"+rst);
        System.out.println(y+"\t\t\t\t\t ITEM_NAME                                     QUANTITY                     PRICE"+rst);
	System.out.println(p+"\t\t\t\t\t*************************************************************************************"+rst);
        System.out.println();
        for (int i = 0; i <= count; i++) 
	{
            System.out.print("\t\t\t\t\t"+itemname[i]  );
            for(int j=0;j<50-itemname[i].length();j++)
			System.out.print(" ");
		System.out.print(quantity[i]);
		int m=quantity[i];
		int c=0;
		while(m>0)
		{
		m=m/10;
		c++;
		}
		for(int j=0;j<25-c;j++)
		System.out.print(" ");
		System.out.print(price[i]);
		System.out.println();
            overall += price[i];
        }
        System.out.println(p+"\t\t\t\t\t*************************************************************************************"+rst);
        System.out.println(y+"\t\t\t\t\t\t\t\t\t\t\t\t  OVERALL PRICE  = " + overall);
	System.out.println(p+"\t\t\t\t\t*************************************************************************************"+rst);
	System.out.println();
	System.out.println();
	if(overall>1000)
	{
		System.out.println(cv.red+cv.blink+"\t\t\t\t\t\tYOU ARE ELIGIBLE FOR DISCOUNT OF 500"+cv.reset);
		overall=overall-500;
		System.out.print(cv.green+cv.blink+"\t\t\t\t\t\tFINAL AMOUNT IS "+cv.reset);
		System.out.println(overall);
	}
	else
	{
		System.out.println(cv.green+cv.blink+"\t\t\t\t\t\tYOU ARE NOT ELIGIBLE FOR DISCOUNT"+cv.reset);
	}
	boolean tr= cv.p2.Onlinepay(overall);
	if(tr==true)
	{		
		System.out.println(r+"\t\t\t\t\t\tFLAT NO :"+flat+rst);
		System.out.println(r+"\t\t\t\t\t\tLAND MARK :"+landmark+rst);
		System.out.println(r+"\t\t\t\t\t\tPIN CODE :"+pincode+rst);
		System.out.println(cv.yellow+"\n\t\t\t\t\t\t\t SUCESSFULLY YOUR IS TAKEN BY YOUR DELIVERY TEAM"+cv.reset);
		System.out.println(cv.red+"\n\t\t\t\t\t\t\t SUCESSFULLY YOUR IS ORDER IS TAKEN BY RESTUARANT"+cv.reset);
		System.out.println(cv.green+"\n\t\t\t\t\t\t\t SUCESSFULLY YOUR DELIVERY BOY PRABHAKAR TAKEN THE ORDER"+cv.reset);
		System.out.println(cv.red+"\n\t\t\t\t\t\t\t PRABHAKAR"+cv.reset);
		System.out.println(cv.green+"\n\t\t\t\t\t\t\t PREVIOUS RATING---3.7/5"+cv.reset);
		System.out.println(cv.yellow+"\n\t\t\t\t\t\t\t PRABHAKAR"+cv.reset);
		System.out.println(cv.red+"\n\t\t\t\t\t\t\t PLEASE WAIT AT DOOR"+cv.reset);	
	}
	else
	{
		System.out.println(cv.red+"\t\t\t\t\t\t\t YOUR ORDER IS CANCELLED"+cv.red);
	}
    }
}














class Oy
{
	static Scanner obj=new Scanner(System.in);
	
	public static final String rst = "\033[0m";  		// Text Reset

	public static final String b = "\033[0;30m";  	// BLACK
    	public static final String r = "\033[0;31m";     	// RED
    	public static final String g = "\033[0;32m";   	// GREEN
    	public static final String y = "\033[0;33m";  	// YELLOW
    	public static final String bl = "\033[0;34m";    	// BLUE
    	public static final String p = "\033[0;35m";  	// PURPLE
    	public static final String c = "\033[0;36m";     	// CYAN
    	public static final String w = "\033[0;37m";    	// WHITE

    	public static final String ru = "\033[4;31m";    	// RED
   	public static final String gu = "\033[4;32m";  	// GREEN
    	public static final String yu = "\033[4;33m"; 	// YELLOW
    	public static final String bu = "\033[4;34m";   	// BLUE
    	public static final String pu = "\033[4;35m"; 	// PURPLE
    	public static final String cu = "\033[4;36m";   	// CYAN
    	public static final String wu = "\033[4;37m";  	// WHITE
	
	public static final String blk = "\u001B[5m";	//Blink

	

	public static boolean ac(String a)
	{
	return a.matches("[a-z A-Z]+");
	}


	void billing(int y)
	       {
		System.out.print(c+"\t\t\t\t\t\t\tENTER YOUR NAME            : "+rst);
		String a=obj.nextLine();
            
              while(!ac(a))
		{
		System.out.print("\t\t\t\t\t\t\tPLEASE ENTER CORRECT NAME  : ");
		a=obj.nextLine();
		}
               

		System.out.print(c+"\t\t\t\t\t\t\tENTER YOUR MOBILE NUMBER   : "+rst);
		String b=obj.nextLine();
                while(b.length()!=10)
		{
		System.out.print("\t\t\t\t\t\t\tPLEASE ENTER YOUR VALID MOBILE NUMBER : ");
                 b=obj.nextLine();
		}
		System.out.print(c+"\t\t\t\t\t\t\tENTER YOUR AADHAR NUMBER   : "+rst);

		String c=obj.nextLine();
 		while(c.length()!=12)
		{
		System.out.print("\t\t\t\t\t\t\tPLEASE ENTER VALID YOUR 12 DIGITS AADHAR NUMBER : ");
                 c=obj.nextLine();
		}
		double d=1500;
		System.out.println();
		System.out.println(p+"\t\t\t\t\t\t\t\t*****************************");
		System.out.printf("\t\t\t\t\t\t\t\t|"+rst+"Original Cost      = %-6.1f"+p+"|\n",d);
		double x=(5*1500*y)/100;
		System.out.printf("\t\t\t\t\t\t\t\t|"+rst+"CV Tax Amount      =  %-5.1f"+p+"|\n",x);
		double z=x+(1500*y);
		System.out.printf("\t\t\t\t\t\t\t\t|"+rst+"Your Bill          = %-6.1f"+p+"|\n",z);
		System.out.println("\t\t\t\t\t\t\t\t*****************************"+rst);
		System.out.println();
		System.out.println();
		System.out.println(cv.red+"\t\t\t\t\t\tIF YOUR BILL IS ABOVE 2000 YOU ARE ELIGIBLE FOR DISCOUNT"+cv.reset);
		System.out.println();
		System.out.println(cv.green+"\t\t\t\t\t\tIF YOUR ARE FROM 121/120 BATCH YOU ARE ELIGIBLE FOR DISCOUNT AND PLEASE ENTER 1"+cv.reset);
		System.out.println();
		System.out.println(cv.yellow+"\t\t\t\t\t\tIF YOUR ARE FROM OTHER BATCH YOU ARE ELIGIBLE FOR NORMAL DISCOUNT AND PLEASE ENTER 2"+cv.reset);
		System.out.println();
		int rf=Integer.parseInt(obj.nextLine());
		if(rf==1)
		{
			System.out.print(cv.red+"\t\t\t\t\t\t THE COST OF THE ROOM IS : "+cv.reset);
			z=100;
			System.out.println("100");
		}
		else if(rf==2)
		{
			System.out.println(cv.green+"\t\t\t\t\t\tYOU ARE ELIGIBLE FOR DISCOUNT"+cv.reset);
			System.out.println();
			System.out.print(cv.red+"\t\t\t\t\t\tDISCOUNT AMOUNT IS : "+cv.reset);
			System.out.println("1000");
			z=z-1000;
			System.out.print(cv.red+"\t\t\t\t\t\tFINAL AMOUNT IS : "+cv.reset);
			System.out.println(z);
		}
		else
		{
			System.out.println(cv.red+"\t\t\t\t\t\tYOU ARE NOT ELIGIBLE FOR DISCOUNT"+cv.reset);
		}	
		boolean df= cv.p2.Onlinepay(z);
		if(df==true)
		{
			DateTime.ma();
			System.out.println(r+"\t\t\t\t\t\t\t||||||||||||||||||||||||||||||||||||||||||||");
			System.out.println("\t\t\t\t\t\t\t|                                          |");
			System.out.println("\t\t\t\t\t\t\t|"+rst+"        @ SUCESSFULLY BOOKED ROOM         "+r+"|");
			System.out.println("\t\t\t\t\t\t\t|"+rst+"                                          "+r+"|");
			System.out.println("\t\t\t\t\t\t\t|"+rst+"                                          "+r+"|");
			System.out.print("\t\t\t\t\t\t\t|"+rst+"     Name         :"+a);
			for(int i=1;i<25-a.length()-1;i++)
			System.out.print(" ");
			System.out.print(""+r+"|");
			System.out.println();
			System.out.print("\t\t\t\t\t\t\t|"+rst+"     Mobile Number:"+b);
			for(int i=1;i<25-b.length()-1;i++)
			System.out.print(" ");
			System.out.print(""+r+"|");
			System.out.println();
			System.out.print("\t\t\t\t\t\t\t|"+rst+"     Aadhar Number:"+c);
			for(int i=1;i<25-c.length()-1;i++)
			System.out.print(" ");
			System.out.print(""+r+"|");
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t|"+rst+"                                          "+r+"|");
			System.out.print("\t\t\t\t\t\t\t|"+rst+"     Actual Amount="+d);
			String l=Double.toString(x);
			for(int i=1;i<25-l.length()-2;i++)
			System.out.print(" ");
			System.out.print(""+r+"|");
			System.out.println();
			System.out.print("\t\t\t\t\t\t\t|"+rst+"     CV Tax Amount= "+x);
			String le=Double.toString(x);
			for(int i=1;i<25-le.length()-2;i++)
			System.out.print(" ");
			System.out.print(""+r+"|");
			System.out.println();
			System.out.print("\t\t\t\t\t\t\t|"+rst+"     Your Bill    ="+z);
			String lens=Double.toString(z);
			for(int i=1;i<26-lens.length()-2;i++)
			System.out.print(" ");
			System.out.print(""+r+"|");
			System.out.println();
			System.out.println("\t\t\t\t\t\t\t|"+rst+"                                          "+r+"|");
			System.out.println("\t\t\t\t\t\t\t|"+rst+"                                          "+r+"|");
			System.out.println("\t\t\t\t\t\t\t|"+rst+"          *****THANK YOU*****             "+r+"|");
			System.out.println("\t\t\t\t\t\t\t|"+rst+"                                          "+r+"|");
			System.out.println("\t\t\t\t\t\t\t|"+rst+"         *****VISIT AGAIN*****            "+r+"|");
			System.out.println("\t\t\t\t\t\t\t|"+rst+"                                          "+r+"|");
			System.out.println("\t\t\t\t\t\t\t||||||||||||||||||||||||||||||||||||||||||||"+rst);
			System.out.println();
			
		}
		else
		{
			DateTime.ma();
			System.out.print(r+"\t\t\t\t\t\t\t\tBooking Not Sucesssful - _ -"+rst);
		}
		
	}
	void  r1()
	{
		cv.sleep();
		System.out.println("\t\t\t\t\t\t\tHERE YOUR SANITISED ROOM");cv.sleep3();
		System.out.println(c+"\t\t\t\t\t\t\t*******************************************");cv.sleep3();
		System.out.println("\t\t\t\t\t\t\t*"+rst+"    .    !__________!    .    ______     "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"   /_\\   |____  ____|   /_\\   |__*__|    "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"  __|__  {____}{____}  __|__  |__*__|    "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"__|_*_|__%%%%%%%%%%%%__|_*_|__|__*__|_   "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"  |   | %%%%%%%%%%%%%% |   |  |/   \\|    "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"       %%%%%%%%%%%%%%%%                  "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"      %%%%%%%%%%%%%%%%%%                 "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"     %%%%%%%%%%%%%%%%%%%%                "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"    /||||||||||||||||||||\\               "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"    |||||||||||||||||||||||              "+c+"*");cv.sleep3();
		System.out.println("\t\t\t\t\t\t\t*******************************************"+rst);
		System.out.println();
		cv.sleep();
		System.out.println(pu+"\t\t\t\t\t\t\tAMENITIES :"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\t@ FREE WIFI");
		System.out.println("\t\t\t\t\t\t\t\t@ AC");
		System.out.println("\t\t\t\t\t\t\t\t@ TV");
		System.out.println("\t\t\t\t\t\t\t\t@ GEYSER");
		System.out.println("\t\t\t\t\t\t\t\t@ POWER BACKUP");
		System.out.println();
		cv.sleep();
		System.out.println(gu+"\t\t\t\t\t\t\tABOUT THIS OYO :"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\tA Space for new-age travelers");
		System.out.println();
		cv.sleep();
		System.out.println(bl+"\t\t\t\t\t\t\tHOUSE POLICIES :"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\tCHECK-IN          CHECK-OUT");
		System.out.println("\t\t\t\t\t\t\t\t12:00 PM           11:00 AM");
		System.out.println();
		cv.sleep();
		System.out.println(ru+"\t\t\t\t\t\t\tCANCELLATION POLICY :"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\t@This booking is non-refundable");
		System.out.println("\t\t\t\t\t\t\t\t@FREE CANCELLATION WAS AVALIABLE TILL 9:0AM");
		System.out.println();
		cv.sleep();
		System.out.println(yu+"\t\t\t\t\t\t\tRULES AND REGULATION :"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\tCouples are welcome");		
		System.out.println("\t\t\t\t\t\t\t\tGuests are check in using any local or ");
		System.out.println("\t\t\t\t\t\t\t\toutstation ID proof(PAN Card not accepted");
		System.out.println();
		System.out.print(c+"\t\t\t\t\t\t\tENTER NO OF ROOMS YOU WANT : "+rst);
		int a=Integer.parseInt(obj.nextLine());
		billing(a);
	}
	void  r2()
	{
		cv.sleep();
		System.out.println("\t\t\t\t\t\t\tHERE YOUR SANITISED ROOM");cv.sleep3();
		System.out.println(c+"\t\t\t\t\t\t\t*******************************************");cv.sleep3();
		System.out.println("\t\t\t\t\t\t\t*"+rst+"    .    !__________!    .    ______     "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"   /_\\   |____  ____|   /_\\   |__*__|    "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"  __|__  {____}{____}  __|__  |__*__|    "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"__|_*_|__%%%%%%%%%%%%__|_*_|__|__*__|_   "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"  |   | %%%%%%%%%%%%%% |   |  |/   \\|    "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"       %%%%%%%%%%%%%%%%                  "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"      %%%%%%%%%%%%%%%%%%                 "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"     %%%%%%%%%%%%%%%%%%%%                "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"    /||||||||||||||||||||\\               "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"    |||||||||||||||||||||||              "+c+"*");cv.sleep3();
		System.out.println("\t\t\t\t\t\t\t*******************************************"+rst);
		System.out.println();
		cv.sleep();
		System.out.println(pu+"\t\t\t\t\t\t\tAMENITIES :"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\t@ FREE WIFI");
		System.out.println("\t\t\t\t\t\t\t\t@ AC");
		System.out.println("\t\t\t\t\t\t\t\t@ TV");
		System.out.println("\t\t\t\t\t\t\t\t@ GEYSER");
		System.out.println("\t\t\t\t\t\t\t\t@ POWER BACKUP");
		System.out.println();
		cv.sleep();
		System.out.println(gu+"\t\t\t\t\t\t\tABOUT THIS OYO :"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\tA Space for new-age travelers");
		System.out.println();
		cv.sleep();
		System.out.println(bl+"\t\t\t\t\t\t\tHOUSE POLICIES :"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\tCHECK-IN          CHECK-OUT");
		System.out.println("\t\t\t\t\t\t\t\t12:00 PM           11:00 AM");
		System.out.println();
		cv.sleep();
		System.out.println(ru+"\t\t\t\t\t\t\tCANCELLATION POLICY :"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\t@This booking is non-refundable");
		System.out.println("\t\t\t\t\t\t\t\t@FREE CANCELLATION WAS AVALIABLE TILL 9:0AM");
		System.out.println();
		cv.sleep();
		System.out.println(yu+"\t\t\t\t\t\t\tRULES AND REGULATION :"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\tCouples are welcome");		
		System.out.println("\t\t\t\t\t\t\t\tGuests are check in using any local or ");
		System.out.println("\t\t\t\t\t\t\t\toutstation ID proof(PAN Card not accepted");
		System.out.println();
		System.out.print(c+"\t\t\t\t\t\t\tENTER NO OF ROOMS YOU WANT : "+rst);
		int a=Integer.parseInt(obj.nextLine());
		billing(a);
	}
	void  r3()
	{
		cv.sleep();
		System.out.println("\t\t\t\t\t\t\tHERE YOUR SANITISED ROOM");cv.sleep3();
		System.out.println(c+"\t\t\t\t\t\t\t*******************************************");cv.sleep3();
		System.out.println("\t\t\t\t\t\t\t*"+rst+"    .    !__________!    .    ______     "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"   /_\\   |____  ____|   /_\\   |__*__|    "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"  __|__  {____}{____}  __|__  |__*__|    "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"__|_*_|__%%%%%%%%%%%%__|_*_|__|__*__|_   "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"  |   | %%%%%%%%%%%%%% |   |  |/   \\|    "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"       %%%%%%%%%%%%%%%%                  "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"      %%%%%%%%%%%%%%%%%%                 "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"     %%%%%%%%%%%%%%%%%%%%                "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"    /||||||||||||||||||||\\               "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"    |||||||||||||||||||||||              "+c+"*");cv.sleep3();
		System.out.println("\t\t\t\t\t\t\t*******************************************"+rst);
		System.out.println();
		cv.sleep();
		System.out.println(pu+"\t\t\t\t\t\t\tAMENITIES :"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\t@ FREE WIFI");
		System.out.println("\t\t\t\t\t\t\t\t@ AC");
		System.out.println("\t\t\t\t\t\t\t\t@ TV");
		System.out.println("\t\t\t\t\t\t\t\t@ GEYSER");
		System.out.println("\t\t\t\t\t\t\t\t@ POWER BACKUP");
		System.out.println();
		cv.sleep();
		System.out.println(gu+"\t\t\t\t\t\t\tABOUT THIS OYO :"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\tA Space for new-age travelers");
		System.out.println();
		cv.sleep();
		System.out.println(bl+"\t\t\t\t\t\t\tHOUSE POLICIES :"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\tCHECK-IN          CHECK-OUT");
		System.out.println("\t\t\t\t\t\t\t\t12:00 PM           11:00 AM");
		System.out.println();
		cv.sleep();
		System.out.println(ru+"\t\t\t\t\t\t\tCANCELLATION POLICY :"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\t@This booking is non-refundable");
		System.out.println("\t\t\t\t\t\t\t\t@FREE CANCELLATION WAS AVALIABLE TILL 9:0AM");
		System.out.println();
		cv.sleep();
		System.out.println(yu+"\t\t\t\t\t\t\tRULES AND REGULATION :"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\tCouples are welcome");		
		System.out.println("\t\t\t\t\t\t\t\tGuests are check in using any local or ");
		System.out.println("\t\t\t\t\t\t\t\toutstation ID proof(PAN Card not accepted");
		System.out.println();
		System.out.print(c+"\t\t\t\t\t\t\tENTER NO OF ROOMS YOU WANT : "+rst);
		int a=Integer.parseInt(obj.nextLine());
		billing(a);

	}
	void  r4()
	{
		cv.sleep();
		System.out.println("\t\t\t\t\t\t\tHERE YOUR SANITISED ROOM");cv.sleep3();
		System.out.println(c+"\t\t\t\t\t\t\t*******************************************");cv.sleep3();
		System.out.println("\t\t\t\t\t\t\t*"+rst+"    .    !__________!    .    ______     "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"   /_\\   |____  ____|   /_\\   |__*__|    "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"  __|__  {____}{____}  __|__  |__*__|    "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"__|_*_|__%%%%%%%%%%%%__|_*_|__|__*__|_   "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"  |   | %%%%%%%%%%%%%% |   |  |/   \\|    "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"       %%%%%%%%%%%%%%%%                  "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"      %%%%%%%%%%%%%%%%%%                 "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"     %%%%%%%%%%%%%%%%%%%%                "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"    /||||||||||||||||||||\\               "+c+"*");cv.sleep3();
        	System.out.println("\t\t\t\t\t\t\t*"+rst+"    |||||||||||||||||||||||              "+c+"*");cv.sleep3();
		System.out.println("\t\t\t\t\t\t\t*******************************************"+rst);
		System.out.println();
		cv.sleep();
		System.out.println(pu+"\t\t\t\t\t\t\tAMENITIES :"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\t@ FREE WIFI");
		System.out.println("\t\t\t\t\t\t\t\t@ AC");
		System.out.println("\t\t\t\t\t\t\t\t@ TV");
		System.out.println("\t\t\t\t\t\t\t\t@ GEYSER");
		System.out.println("\t\t\t\t\t\t\t\t@ POWER BACKUP");
		System.out.println();
		cv.sleep();
		System.out.println(gu+"\t\t\t\t\t\t\tABOUT THIS OYO :"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\tA Space for new-age travelers");
		System.out.println();
		cv.sleep();
		System.out.println(bl+"\t\t\t\t\t\t\tHOUSE POLICIES :"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\tCHECK-IN          CHECK-OUT");
		System.out.println("\t\t\t\t\t\t\t\t12:00 PM           11:00 AM"+rst);
		System.out.println();
		cv.sleep();
		System.out.println(ru+"\t\t\t\t\t\t\tCANCELLATION POLICY :"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\t@This booking is non-refundable");
		System.out.println("\t\t\t\t\t\t\t\t@FREE CANCELLATION WAS AVALIABLE TILL 9:0AM");
		System.out.println();
		cv.sleep();
		System.out.println(yu+"\t\t\t\t\t\t\tRULES AND REGULATION :"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\tCouples are welcome");		
		System.out.println("\t\t\t\t\t\t\t\tGuests are check in using any local or ");
		System.out.println("\t\t\t\t\t\t\t\toutstation ID proof(PAN Card not accepted");
		System.out.println();
		System.out.print(c+"\t\t\t\t\t\t\tENTER NO OF ROOMS YOU WANT : "+rst);
		int a=Integer.parseInt(obj.nextLine());
		billing(a);

	}
	void OYO()
	{
		System.out.println();
		System.out.print("\t\t\t\t\t\t\t\tPLEASE ENTER YOUR AGE : ");
		int age=Integer.parseInt(obj.nextLine());
		if(age>=18)
		{
			System.out.println();
			System.out.println(r+"\t\t\t\t\t\t\t%%%%%%%%%%%%%%%%%%%	%%%%%%%%%%%%%%%%%%%");
			System.out.println("\t\t\t\t\t\t\t%"+r+rst+"   FOR SINGLES"+r+"   %     %"+rst+"   FOR COUPLES"+r+"   %");
			System.out.println("\t\t\t\t\t\t\t%%%%%%%%%%%%%%%%%%%	%%%%%%%%%%%%%%%%%%%"+rst);
			System.out.println("\t\t\t\t\t\t		1			2		");
			int a=Integer.parseInt(obj.nextLine());
			if(a==1)	
			{
				friends();
			}
			else if(a==2)
			{
				couples();
			}
			else
			{
				System.out.print(r+"\t\t\t\t\t\t\t\tPLEASE ENTER A VALID NUMBER"+rst);
				System.out.println();
				OYO();
			}
		}
		else
		{
			System.out.println();
			System.out.print(r+blk+"\t\t\t\t\t\t\t\t Sorry Your Age Below 18 -_-"+rst);
		}
	}
	void friends()
	{
		System.out.println(p+blk+"\t\t\t\t\t\t\t********  WELCOME TO PRIVATE PARTY ********"+rst);
		System.out.println();
		System.out.println(bl+blk+"\t\t\t\t\t\t\t********  ENJOY YOUR PRIVATE SPACE ********"+rst);
		System.out.println();
		System.out.println(r+"\t\t\t\t\t\t      -----------------------------------------------");
		System.out.println("\t\t\t\t\t\t      |"+rst+blk+"  N0TE: 3 MEMBERS ARE ALLOWED FOR EACH ROOM  "+rst+r+"|");
		System.out.println("\t\t\t\t\t\t      -----------------------------------------------"+rst);
		System.out.println();
		System.out.println(g+"\t\t\t\t\t\t\t   PLEASE SELECT YOUR LOCATION TO EXPLORE"+rst);
		System.out.println();
		System.out.println(c+"\t\t\t\t\t    ---------------  ---------------  ---------------  ---------------");
		System.out.println("\t\t\t\t\t    |"+rst+"  HYDERABAD  "+c+"|  |"+rst+"  BANGALORE  "+c+"|  |"+rst+"     GOA     "+c+"|  |"+rst+"    VIZAG    "+c+"|");
		System.out.println("\t\t\t\t\t    |"+rst+"      1      "+c+"|  |"+rst+"      2      "+c+"|  |"+rst+"      3      "+c+"|  |"+rst+"      4      "+c+"|");      
		System.out.println("\t\t\t\t\t    ---------------  ---------------  ---------------  ---------------"+rst);

		int a=Integer.parseInt(obj.nextLine());
		if(a==1)
		{
			hyd();
		}
		else if(a==2)
		{
			bng();
		}
		else if(a==3)
		{
			goa();
		}
		else if(a==4)
		{
			viz();
		}
		else
		{
			System.out.println(r+"\t\t\t\t\t\t\tINVALID INPUT PLEASE ENTER A VALID INPUT..."+rst);
			System.out.println();
			friends();
		}
	}
	void hyd()
	{
		System.out.println("\t\t\t\t\t\t\t\t     "+cu+blk+"WELCOME TO HYDERABAD"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t     PLEASE SELECT YOUR PLACE TO STAY");
		System.out.println();
		System.out.println(r+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    | 1 - Chaitanya's Residency OYO  |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		System.out.println(g+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |      2 - Charan's Inn OYO      |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		System.out.println(p+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |   3 - Praveen's Horizon OYO    |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		System.out.println(bl+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |   4 - Naveen's Westside OYO    |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		int a=Integer.parseInt(obj.nextLine());
		if(a==1)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+r+blk+" Welcome to Chaitanya's Residency OYO "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(r+"\t\t\t\t\t\t\t.........................KPHB COLONY - 1KM"+rst);
			System.out.println("\t\t\t\t\t\t\t"+wu+"Rating"+rst+" : 4.8/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Raj Kumar:Good room near by airport.");
			System.out.println("\t\t\t\t\t\t\t *Suresh:Good rooms in a very good price.");
			System.out.println();
			r1();
		}
		else if(a==2)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+y+blk+"  Welcome to Charan's Residency OYO   "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(y+"\t\t\t\t\t\t\t............................AMEERPET - 5KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.6/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Balu:Room is so small and all things are not working.");
			System.out.println("\t\t\t\t\t\t\t *Siva:Well maintained room but room service may be better.");
			System.out.println();
			r2();
		}
		else if(a==3)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+p+blk+"  Welcome to Praveen's Residency OYO  "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(p+"\t\t\t\t\t\t\t............................MADHAPUR - 8KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.5/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Rajesh:Nice service staff with good behaviour.");
			System.out.println("\t\t\t\t\t\t\t *Ashish:Very good hotel and staff.");
			System.out.println();
			r3();
		}
		else if(a==4)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+bl+blk+"   Welcome to Naveen's Residency OYO  "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(bl+"\t\t\t\t\t\t\t.....................HI - TECH CITY - 11KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.7/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Naveen:Nice ambiance and appreciable.");
			System.out.println("\t\t\t\t\t\t\t *Dileep:Neat and Clean with affordable price.");
			System.out.println();
			r4();
		}
		else
		{
			System.out.println(r+"\t\t\t\t\t\t\tINVALID INPUT PLEASE ENTER A VALID INPUT..."+rst);
			System.out.println();
			hyd();
		}
	}
	void bng()
	{
		System.out.println(c+blk+"\t\t\t\t\t\t\t\t   WELCOME TO BANGALORE"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t     PLEASE SELECT YOUR PLACE TO STAY");
		System.out.println(r+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |   1 - MahaLakshmi Grand OYO    |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		System.out.println(y+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |       2 - HSR Layouts OYO      |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		System.out.println(p+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |  3 - Marathahalli Hillside OYO |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		System.out.println(bl+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |     4 - Jasmine Resorts OYO    |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		int a=Integer.parseInt(obj.nextLine());
		if(a==1)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+r+blk+"   Welcome to MahaLakshmi Grand OYO   "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(r+"\t\t\t\t\t\t\t..........................JAYANAGAR - 11KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.5/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Sivraj:Good Service.");
			System.out.println("\t\t\t\t\t\t\t *Ranjit:Hotel is full of sounds and disturbance.");
			System.out.println();
			r1();
		}
		else if(a==2)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+y+blk+"      Welcome to HSR Layouts OYO      "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(y+"\t\t\t\t\t\t\t.......................KORAMANGALA - 3.7KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.7/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : ");
			System.out.println("\t\t\t\t\t\t\t *Akshay:Room is very dirty and bedbugs.");
			System.out.println("\t\t\t\t\t\t\t *Abhishek:Worst hotel and staff are not behaving good.");
			System.out.println();
			r2();
		}
		else if(a==3)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+p+blk+" Welcome to Marthahalli Hillside OYO  "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(p+"\t\t\t\t\t\t\t........................MARATHALLI - 1.1KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.8/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Ravi:Neat and Clean with affordable price.");
			System.out.println("\t\t\t\t\t\t\t *Varun:I dont like anything.");
			System.out.println();
			r3();
		}
		else if(a==4)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+bl+blk+"    Welcome to Jasmine Resorts OYO    "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(bl+"\t\t\t\t\t\t\t........................BASAVANAGUDI - 8KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.6/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Mani:It was nice place to stay.");
			System.out.println("\t\t\t\t\t\t\t *Lokesh:Services of the hotel is good.");
			System.out.println();
			r4();
		}
		else
		{
			System.out.println(r+"\t\t\t\t\t\t\tINVALID INPUT PLEASE ENTER A VALID INPUT..."+rst);
			System.out.println();
			bng();
		}
	}
	void goa()
	{
		System.out.println(c+blk+"\t\t\t\t\t\t\t\t       WELCOME TO GOA"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t     PLEASE SELECT YOUR PLACE TO STAY");
		System.out.println(r+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |       1 - Vascodogam OYO       |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		System.out.println(y+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |       2 - Blue Dawn OYO        |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		System.out.println(p+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |      3 - Royal Layouts OYO     |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		System.out.println(bl+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |       4 - American Fab OYO     |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);

		int a=Integer.parseInt(obj.nextLine());
		if(a==1)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+r+blk+"       Welcome to Vascodogam OYO      "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(r+"\t\t\t\t\t\t\t...........................SINQUERIM - 9KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.5/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Mahesh:Great Place to stay.");
			System.out.println("\t\t\t\t\t\t\t *Dinesh:Excellent clean and neat rooms");
			System.out.println();
			r1();
		}
		else if(a==2)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+y+blk+"        Welcome to Blue Dawn OYO      "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(y+"\t\t\t\t\t\t\t.............................ANJUNA - 12KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.3/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Prakash:Bed was not comfort.");
			System.out.println("\t\t\t\t\t\t\t *Prabha:Very high price.");
			System.out.println();
			r2();
		}
		else if(a==3)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+p+blk+"     Welcome to Royal Layouts OYO     "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(p+"\t\t\t\t\t\t\t..............................BAGA - 1.3KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.9/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Sunny:Hotel is average.");
			System.out.println("\t\t\t\t\t\t\t *Chandu:Beds are very comfortable.");
			System.out.println();
			r3();
		}
		else if(a==4)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+bl+blk+"     Welcome to American Fab OYO      "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(bl+"\t\t\t\t\t\t\t.........................CALANGUTE - 1.9KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.8/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Krishna:Rooms and bathrooms are not clean.");
			System.out.println("\t\t\t\t\t\t\t *Kala:Affordable price.");
			System.out.println();
			r4();
		}
		else
		{
			System.out.println(r+"\t\t\t\t\t\t\tINVALID INPUT PLEASE ENTER A VALID INPUT..."+rst);
			System.out.println();
			goa();
		}
	}
	void viz()
	{
		System.out.println(c+blk+"\t\t\t\t\t\t\t\t     WELCOME TO VIZAG"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t     PLEASE SELECT YOUR PLACE TO STAY");
		System.out.println(r+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |       1- Happy Elite OYO       |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		System.out.println(y+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |    2 - Balu's Greenpark OYO    |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		System.out.println(p+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |       3 - Sravan Fabs OYO      |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		System.out.println(bl+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |       4 - Couples Time OYO     |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		int a=Integer.parseInt(obj.nextLine());
		if(a==1)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+r+blk+"      Welcome to Happy Elite OYO      "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(r+"\t\t\t\t\t\t\t..........................SIRIPURAM - 10KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.4/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Sumit:Hotel is comfortable with all facilities.");
			System.out.println("\t\t\t\t\t\t\t *Abhi:Neat and Clean with affordable price.");
			System.out.println();
			r1();
		}
		else if(a==2)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+y+blk+"    Welcome to Balu's Greenpark OYO   "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(y+"\t\t\t\t\t\t\t..........................GAJUWAKA - 1.7KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.7/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Gowtham:Very well maintained and good staff.");
			System.out.println("\t\t\t\t\t\t\t *Abhiram:The room is good with the aminities.");
			System.out.println();
			r2();
		}
		else if(a==3)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+p+blk+"      Welcome to Sravan Fabs OYO      "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(p+"\t\t\t\t\t\t\t....................JAGADAMBA CENTER - 1KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.8/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Pritam:Neat and Clean with affordable price.");
			System.out.println("\t\t\t\t\t\t\t *Reddy:Nice room with AC,TV,Geyser etc...");
			System.out.println();
			r3();
		}
		else if(a==4)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+bl+blk+"      Welcome to Couples Time OYO     "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(bl+"\t\t\t\t\t\t\t......................SEETHAMMADHARA - 9KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.5/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Kalpana:Rooms are not giving at OYO rates.");
			System.out.println("\t\t\t\t\t\t\t *Prabakat:Beds are not clean.");
			System.out.println();
			r4();
		}
		else
		{
			System.out.println(r+"\t\t\t\t\t\t\tINVALID INPUT PLEASE ENTER A VALID INPUT..."+rst);
			System.out.println();
			viz();
		}
	}
	void couples()
	{
		System.out.println(blk+"\t\t\t\t\t\t\t************  YOU NAUGHTY BOY  ************");
		System.out.println();
		System.out.println(p+blk+"\t\t\t\t\t\t\t********  WELCOME TO PRIVATE PARTY ********");
		System.out.println();
		System.out.println(bl+blk+"\t\t\t\t\t\t\t********  ENJOY YOUR PRIVATE SPACE ********");
		System.out.println();
		System.out.println(r+"\t\t\t\t\t\t      -----------------------------------------------");
		System.out.println("\t\t\t\t\t\t      |"+rst+"  N0TE: 2 MEMBERS ARE ALLOWED FOR EACH ROOM  "+r+"|");
		System.out.println("\t\t\t\t\t\t      -----------------------------------------------"+rst);
		System.out.println();
		System.out.println(g+"\t\t\t\t\t\t\t   PLEASE SELECT YOUR LOCATION TO EXPLORE"+rst);
		System.out.println();
		System.out.println(c+"\t\t\t\t\t    ---------------  ---------------  ---------------  ---------------");
		System.out.println("\t\t\t\t\t    |"+rst+"  DARJEELING "+c+"|  |"+rst+"     OOTY    "+c+"|  |"+rst+"    LADAKH   "+c+"|  |"+rst+"   KASHMIR   "+c+"|");
		System.out.println("\t\t\t\t\t    |"+rst+"      1      "+c+"|  |"+rst+"      2      "+c+"|  |"+rst+"      3      "+c+"|  |"+rst+"      4      "+c+"|");      
		System.out.println("\t\t\t\t\t    ---------------  ---------------  ---------------  ---------------"+rst);

		int a=Integer.parseInt(obj.nextLine());
		if(a==1)
		{
			DAR();
		}
		else if(a==2)
		{
			OOTY();
		}
		else if(a==3)
		{
			LADAKH();
		}
		else if(a==4)
		{
			KASHMIR();
		}
		else
		{
			System.out.println(r+"\t\t\t\t\t\t\tINVALID INPUT PLEASE ENTER A VALID INPUT..."+rst);
			System.out.println();
			couples();
		}
	}
	void DAR()
	{
		System.out.println(c+blk+"\t\t\t\t\t\t\t\t  WELCOME TO DARJEELING"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t     PLEASE SELECT YOUR PLACE TO STAY"+rst);
		System.out.println(r+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |       1 - Merry Gold OYO       |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		System.out.println(y+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |     2 - Maruthi Luxury OYO     |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		System.out.println(p+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |      3 - Flagship Stay OYO     |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		System.out.println(bl+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |        4 - Home Stay OYO       |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		int a=Integer.parseInt(obj.nextLine());
		if(a==1)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+r+blk+"       Welcome to Merry Gold OYO      "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(r+"\t\t\t\t\t\t\t.........................BAIRATISAL - 10KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.5/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Aasit Puri:Awesome staff behaviour&cleaning rooms.");
			System.out.println("\t\t\t\t\t\t\t *Shyam:Hotel is good and services are so good.");
			System.out.println();
			r1();
		}
		else if(a==2)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+y+blk+"     Welcome to Maruthi Luxury OYO    "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(y+"\t\t\t\t\t\t\t..........................SILIGURI - 2.6KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.9/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Avinash:The hotel ambiance was delightful.");
			System.out.println("\t\t\t\t\t\t\t *Ziaul Islam:Services are good overall it is nice.");
			System.out.println();
			r2();
		}
		else if(a==3)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+p+blk+"     Welcome to Flagship Stay OYO     "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(p+"\t\t\t\t\t\t\t.............................LALMAN - 15KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.0/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Alam:Disappointing!!.");
			System.out.println("\t\t\t\t\t\t\t *Aali:Rooms are not same as shown.");
			System.out.println();
			r3();
		}
		else if(a==4)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+bl+blk+"       Welcome to Home Stay OYO       "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(bl+"\t\t\t\t\t\t\t..........................KURSEONG - 7.3KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.6/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Rajat Rai:Beautiful view ever....");
			System.out.println("\t\t\t\t\t\t\t *Ranjan:Neat and Clean with affordable price.");
			System.out.println();
			r4();
		}
		else
		{
			System.out.println(r+"\t\t\t\t\t\t\tINVALID INPUT PLEASE ENTER A VALID INPUT..."+rst);
			System.out.println();
			DAR();
		}
	}
	void KASHMIR()
	{
		System.out.println(c+blk+"\t\t\t\t\t\t\t\t   WELCOME TO KASHMIR"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t     PLEASE SELECT YOUR PLACE TO STAY");
		System.out.println(r+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |      1 - Green Resorts OYO     |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		System.out.println(y+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |      2 - Grand Inayat OYO      |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		System.out.println(p+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |   3 - Connecting Kashmir OYO   |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		System.out.println(bl+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |        4 - City Star OYO       |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		int a=Integer.parseInt(obj.nextLine());
		if(a==1)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+r+blk+"     Welcome to Green Resorts OYO     "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(r+"\t\t\t\t\t\t\t..........................SRINAGAR - 2.1KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.7/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Ajay:Nyc hotel and staff is very good.");
			System.out.println("\t\t\t\t\t\t\t *Praveen:Room is very clean and neat");
			System.out.println();
			r1();
		}
		else if(a==2)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+y+blk+"    Welcome to Jasmine Resorts OYO    "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(y+"\t\t\t\t\t\t\t...........................KUPWARA - 6.5KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 3.3/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Mahanth:Hotel is not good at all.");
			System.out.println("\t\t\t\t\t\t\t *Rajesh:Only Jasmine smell.");
			System.out.println();
			r2();
		}
		else if(a==3)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+p+blk+"    Welcome to Jasmine Resorts OYO    "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(p+"\t\t\t\t\t\t\t.........................BARAMULLA - 2.5KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.8/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Lokesh:Very Good Experience.");
			System.out.println();
			r3();
		}
		else if(a==4)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+bl+blk+"    Welcome to Jasmine Resorts OYO    "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(bl+"\t\t\t\t\t\t\t..........................ACHHABAL - 7.8KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.4/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Sivayya:Not a pleasent stay.");
			System.out.println("\t\t\t\t\t\t\t *Siva:Best homestay with deleicious food.");
			System.out.println();
			r4();
		}
		else
		{
			System.out.println(r+"\t\t\t\t\t\t\tINVALID INPUT PLEASE ENTER A VALID INPUT..."+rst);
			System.out.println();
			KASHMIR();
		}
	}
	void OOTY()
	{
		System.out.println(c+blk+"\t\t\t\t\t\t\t\t      WELCOME TO OOTY"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t     PLEASE SELECT YOUR PLACE TO STAY");
		System.out.println(r+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |       1 - Moon Light OYO       |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		System.out.println(y+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |      2 - Heavenly Stay OYO     |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		System.out.println(p+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |      3 - Star Cottages OYO     |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		System.out.println(bl+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |      4 - Let's Catchup OYO     |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		int a=Integer.parseInt(obj.nextLine());
		if(a==1)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+r+blk+"       Welcome to Moon Light OYO      "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(r+"\t\t\t\t\t\t\t........................ANNA NAGAR - 5.6KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.6/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Gopi:Affordable price.");
			System.out.println("\t\t\t\t\t\t\t *Hemanth:Neat and Clean.");
			System.out.println();
			r1();
		}
		else if(a==2)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+y+blk+"     Welcome to Heavenly Stay OYO     "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(y+"\t\t\t\t\t\t\t...........................BICKETTY - 13KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.3/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Chaitanya:Neat and Clean with affordable price.");
			System.out.println("\t\t\t\t\t\t\t *Charan:Outside is so cool but room is very hot.");
			System.out.println();
			r2();
		}
		else if(a==3)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+p+blk+"     Welcome to Star Cottages OYO    "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(p+"\t\t\t\t\t\t\t.........................DAVISDALE - 3.4KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.8/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Ram:Neat and Clean .");
			System.out.println("\t\t\t\t\t\t\t *Ajay:Maintanence is not so good.");
			System.out.println();
			r3();
		}
		else if(a==4)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+bl+blk+"     Welcome to Let's Catchup OYO     "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(bl+"\t\t\t\t\t\t\t...........................COONOOR - 4.1KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.5/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : +rst");
			System.out.println("\t\t\t\t\t\t\t *Prabakar:Beds are not Clean");
			System.out.println("\t\t\t\t\t\t\t *Dileep:Rooms have very less space.");
			System.out.println();
			r4();
		}
		else
		{
			System.out.println(r+"\t\t\t\t\t\t\tINVALID INPUT PLEASE ENTER A VALID INPUT..."+rst);
			System.out.println();
			OOTY();
		}
	}
	void LADAKH()
	{
		System.out.println(c+blk+"\t\t\t\t\t\t\t\t     WELCOME TO LADAKH"+rst);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t     PLEASE SELECT YOUR PLACE TO STAY");
		System.out.println(r+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |     1 - Swathi's Hotel OYO     |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		System.out.println(y+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |       2 - Tuni's Stay OYO      |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		System.out.println(p+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |     3 - Bala's Cottages OYO    |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		System.out.println(bl+"\t\t\t\t\t\t\t    ----------------------------------");
		System.out.println("\t\t\t\t\t\t\t    |     4 - Prabha's Catchup OYO   |");
		System.out.println("\t\t\t\t\t\t\t    ----------------------------------"+rst);
		int a=Integer.parseInt(obj.nextLine());
		if(a==1)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+r+blk+"     Welcome to Swathi's Hotel OYO    "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t.............................NUBRA - 3.9KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.6/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Chaitanya:Room is very neat and clean.");
			System.out.println("\t\t\t\t\t\t\t *Dinesh:More Disturbances are getting from outside.");
			System.out.println();
			r1();
		}
		else if(a==2)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+y+blk+"      Welcome to Tuni's Stay OYO      "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(y+"\t\t\t\t\t\t\t............................KHALSI - 5.4KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.4/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Rajesh:Neat and Clean with affordable price.");
			System.out.println("\t\t\t\t\t\t\t *Deepak:Don't Go Waste of Money.");
			System.out.println();
			r2();
		}
		else if(a==3)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+p+blk+"    Welcome to Bala's Cottages OYO    "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println(p+"\t\t\t\t\t\t\t...............................LEH - 2.2KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.7/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *John:Neat and Clean with affordable price.");
			System.out.println("\t\t\t\t\t\t\t *Prabakar:Affordable Price.");
			System.out.println();
			r3();
		}
		else if(a==4)
		{
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t||"+bl+blk+"    Welcome to Prabha's Catchup OYO   "+rst+"||");
			System.out.println("\t\t\t\t\t\t\t==========================================");
			System.out.println("\t\t\t\t\t\t\t...........................ZANSKAR - 1.8KM"+rst);
			System.out.println("\t\t\t\t\t\t\tRating : 4.9/5");
			System.out.println();
			System.out.println(g+"\t\t\t\t\t\t\tReview : "+rst);
			System.out.println("\t\t\t\t\t\t\t *Prabakar:Neat and Clean with affordable price.");
			System.out.println("\t\t\t\t\t\t\t *Anil:No any sound disturbance.");
			System.out.println();
			r4();
		}
		else
		{
			System.out.println(r+"\t\t\t\t\t\t\tINVALID INPUT PLEASE ENTER A VALID INPUT..."+rst);
			System.out.println();
			LADAKH();
		}
	}
	static void HOTEL()
	{
		System.out.println(r+blk+"                        \n                        \n\t\t\t\t\t\t     OOOOOOOOO"+rst+w+blk+"     YYYYYYY       YYYYYYY"+rst+r+blk+"     OOOOOOOOO     \n\t\t\t\t\t\t   OO:::::::::OO"+rst+w+blk+"   Y:::::Y       Y:::::Y"+rst+r+blk+"   OO:::::::::OO   \n\t\t\t\t\t\t OO:::::::::::::OO"+rst+w+blk+" Y:::::Y       Y:::::Y"+rst+r+blk+" OO:::::::::::::OO \n\t\t\t\t\t\tO:::::::OOO:::::::O"+rst+w+blk+"Y::::::Y     Y::::::Y"+rst+r+blk+"O:::::::OOO:::::::O\n\t\t\t\t\t\tO::::::O   O::::::O"+rst+w+blk+"YYY:::::Y   Y:::::YYY"+rst+r+blk+"O::::::O   O::::::O\n\t\t\t\t\t\tO:::::O     O:::::O"+rst+w+blk+"   Y:::::Y Y:::::Y"+rst+r+blk+"   O:::::O     O:::::O\n\t\t\t\t\t\tO:::::O     O:::::O"+rst+w+blk+"    Y:::::Y:::::Y"+rst+r+blk+"    O:::::O     O:::::O\n\t\t\t\t\t\tO:::::O     O:::::O"+rst+w+blk+"     Y:::::::::Y"+rst+r+blk+"     O:::::O     O:::::O\n\t\t\t\t\t\tO:::::O     O:::::O"+rst+w+blk+"      Y:::::::Y"+rst+r+blk+"      O:::::O     O:::::O\n\t\t\t\t\t\tO:::::O     O:::::O"+rst+w+blk+"       Y:::::Y"+rst+r+blk+"       O:::::O     O:::::O\n\t\t\t\t\t\tO::::::O   O::::::O"+rst+w+blk+"       Y:::::Y"+rst+r+blk+"       O::::::O   O::::::O\n\t\t\t\t\t\tO:::::::OOO:::::::O"+rst+w+blk+"       Y:::::Y"+rst+r+blk+"       O:::::::OOO:::::::O\n\t\t\t\t\t\t OO:::::::::::::OO"+rst+w+blk+"     YYYY:::::YYYY"+rst+r+blk+"     OO:::::::::::::OO \n\t\t\t\t\t\t   OO:::::::::OO"+rst+w+blk+"       Y:::::::::::Y"+rst+r+blk+"       OO:::::::::OO   \n\t\t\t\t\t\t     OOOOOOOOO"+rst+w+blk+"         YYYYYYYYYYYYY"+rst+r+blk+"         OOOOOOOOO     \n                        \n                        "+rst);

		Oy g=new Oy();
		g.OYO();
	}
}









class DateTime 
{
    static void ma() 
    {
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = dateFormat.format(currentDate);
        System.out.println("Current Date and Time: " + formattedDateTime);
    }
}









class Onlinepay 
{
	static double amount ;
	static private long pin = 123456;


	boolean Onlinepay(double a)
	{
		System.out.println(cv.green+"\n \t\t\t\t\t\t\t\tPlease Select the payment Method "+cv.reset);
		System.out.println(Airlines.g+"\t\t\t\t\t\t\t\t************************");
		System.out.println("\t\t\t\t\t\t\t\t|"+Airlines.rst+Airlines.w+"1   P H O N E  P A Y  "+Airlines.rst+Airlines.g+"|");
		System.out.println("\t\t\t\t\t\t\t\t************************");
		System.out.println("\t\t\t\t\t\t\t\t************************");
		System.out.println("\t\t\t\t\t\t\t\t|"+Airlines.rst+Airlines.w+"2   G O O G L E  P A Y"+Airlines.rst+Airlines.g+"|");
		System.out.println("\t\t\t\t\t\t\t\t************************");
		System.out.println("\t\t\t\t\t\t\t\t************************");
		System.out.println("\t\t\t\t\t\t\t\t|"+Airlines.rst+Airlines.w+"3   P A Y T M         "+Airlines.rst+Airlines.g+"|");
		System.out.println("\t\t\t\t\t\t\t\t************************");
		System.out.println("\t\t\t\t\t\t\t\t************************");
		System.out.println("\t\t\t\t\t\t\t\t|"+Airlines.rst+Airlines.w+"4   E X I T           "+Airlines.rst+Airlines.g+"|");
		System.out.println("\t\t\t\t\t\t\t\t************************"+Airlines.rst);
		int A = Integer.parseInt(cv.sc.nextLine());
		if(A==1)
		{
			boolean h = payment(a);
			if(h==true)
				return true;
			else
				return false;
		}
		else if(A==2)
		{
			boolean i = payment(a);
			if(i==true)
				return true;
			else	
				return false;
		}
		else if(A==3)
		{
			boolean j = payment(a);
			if(j==true)
				return true;
			else	
				return false;
		}
		else	
			return false;

	}


	boolean payment(double B)
	{
		System.out.println(cv.yellow+"\n \t\t\t\t\t\t\t\tPlease select Bank payment "+cv.reset);
		System.out.println("\n \t\t\t\t\t\t\t\t  1 ."+cv.blue+" SBI BANK ");
		System.out.println(" \t\t\t\t\t\t\t\t  2 ."+cv.violet+" ICICI BANK ");
		System.out.println(" \t\t\t\t\t\t\t\t  3 ."+cv.red+" Exit ");
		int af = Integer.parseInt(cv.sc.nextLine());
		if(af==1)
		{
			if(B<=SBIBank.Available_Balance)
			{
				while(true)
				{
					System.out.println(cv.green+"\n \t\t\t\t\t\t\t\t  Enter the UPI PIN "+cv.reset);
					long pin = Long.parseLong(cv.sc.nextLine());
					if(pin==getpin())
					{
						System.out.println("\n \t\t\t\t\t\t\t\t  Available_Balance  =  "+SBIBank.Available_Balance);
						amount = cv.p.Withdraw(B);
						cv.sleep();
						System.out.println(" \t\t\t\t\t\t\t\t  Billing Amount       =  "+B);
						cv.sleep();
						System.out.println("\t\t\t\t\t\t\t\t                          ________");
						System.out.println("\n \t\t\t\t\t\t\t\t  Available_Balance    =  "+amount);
						System.out.println("\t\t\t\t\t\t\t\t                          --------");
						return true;
					}
					else
					{
						System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t You Entered the wrong UPI PIN ");
						System.out.println(" \t\t\t\t\t\t\t\t  1 ."+cv.blue+" Reenter UPI PIN ");
						System.out.println(" \t\t\t\t\t\t\t\t  2 ."+cv.violet+" Reset UPI PIN ");
						System.out.println(" \t\t\t\t\t\t\t\t  3 ."+cv.red+" Exit "+cv.reset);
						int i = Integer.parseInt(cv.sc.nextLine());
						if(i==1)
							continue;
						else if(i==2)
						{
							System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t  Enter the Mobile number "+cv.reset);
							String number = cv.sc.nextLine();
							if(number.equals(cv.p.getnumber()))
							{
								System.out.println(cv.violet+"\n \t\t\t\t\t\t\t\t Please wait the OTP is sending to mobile number "+cv.reset);
								cv.sleep();
								int otp = 1000+(int)(Math.random()*8999);
								System.out.println(cv.red+"\t\t\t\t\t\t\t\t  Your OTP  =  "+otp+cv.reset);
								System.out.println(cv.green+"\t\t\t\t\t\t\t\t  Please Enter the OTP "+cv.reset);
								int b = Integer.parseInt(cv.sc.nextLine());
								if(b==otp)
								{
									System.out.println(cv.skyblue+"\n \t\t\t\t\t\t\t  Enter the New UPI PIN ");
									long E = Long.parseLong(cv.sc.nextLine());
									pin(E);
									System.out.println(cv.green+"\n \t\t\t\t\t\t\t\t  1 . Login ");
									System.out.println(cv.red+" \t\t\t\t\t\t\t\t  2 . Exit "+cv.reset);
									int c = Integer.parseInt(cv.sc.nextLine());
									if(c==1)
										continue;
									else
										return false;
								}
								else
								{
									System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t  You Entered the Invalid OTP ");
									System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t  1 . Resending OTP ");
									System.out.println(cv.red+" \t\t\t\t\t\t\t\t  2 . Exit "+cv.reset);
									int d = Integer.parseInt(cv.sc.nextLine());
									if(d==1)
										continue;
									else
										return false;
								}
							}
							else
							{
									System.out.println(cv.red+" \t\t\t\t\t\t\t\t  You Entered the Wrong Mobile_Number"+cv.reset);
									return false;
							}
						}
						else	
							return false;
					}
				}
			}
			else	
				return false;

		}
		else  if(af==2)
		{
			if(B<=ICICIBank.Available_Balance)
			{
				while(true)
				{
					System.out.println("\n \t\t\t\t\t\t\t\t  Available_Balance  =  "+ICICIBank.Available_Balance);
					System.out.println(cv.green+"\n \t\t\t\t\t\t\t\t  Enter the UPI PIN "+cv.reset);
					long pin = Long.parseLong(cv.sc.nextLine());
					if(pin==getpin())
					{
						System.out.println("\n \t\t\t\t\t\t\t\t  Available_Balance  =  "+ICICIBank.Available_Balance);
						amount = cv.p1.Withdraw(B);
						cv.sleep();
						System.out.println(" \t\t\t\t\t\t\t\t  Billing Amount       =  "+B);
						cv.sleep();
						System.out.println("\t\t\t\t\t\t\t\t                          ________");
						System.out.println("\n \t\t\t\t\t\t\t\t  Available_Balance    =  "+amount);
						System.out.println("\t\t\t\t\t\t\t\t                          --------");
						return true;
					}
					else
					{
						System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t You Entered the wrong UPI PIN "+cv.reset);
						System.out.println(" \t\t\t\t\t\t\t\t  1 ."+cv.blue+" Reenter UPI PIN ");
						System.out.println(" \t\t\t\t\t\t\t\t  2 ."+cv.violet+" Reset UPI PIN ");
						System.out.println(" \t\t\t\t\t\t\t\t  3 ."+cv.red+" Exit ");
						int e = Integer.parseInt(cv.sc.nextLine());
						if(e==1)
							continue;
						else if(e==2)
						{
							System.out.println(cv.green+"\n \t\t\t\t\t\t\t\t  Enter the Mobile number "+cv.reset);
							String number = cv.sc.nextLine();
							if(number.equals(cv.p1.getnumber()))
							{
								System.out.println("\n \t\t\t\t\t\t\t Please wait the OTP is sending to mobile number ");
								cv.sleep();
								int otp = 1000+(int)(Math.random()*8999);
								System.out.println(cv.blue+"\t\t\t\t\t\t\t\t  Your OTP  =  "+otp);
								System.out.println(cv.violet+"\t\t\t\t\t\t\t\t  Please Enter the OTP ");
								int f = Integer.parseInt(cv.sc.nextLine());
								if(f==otp)
								{
									System.out.println(cv.green+"\n \t\t\t\t\t\t\t\t  Enter the New UPI PIN "+cv.reset);
									long D = Long.parseLong(cv.sc.nextLine());
									pin(D);
									System.out.println(cv.green+"\n \t\t\t\t\t\t\t\t  1 . Login ");
									System.out.println(cv.red+" \t\t\t\t\t\t\t\t  2 . Exit "+cv.reset);
									int g = Integer.parseInt(cv.sc.nextLine());
									if(g==1)
										continue;
									else
										return false;
								}
								else
								{
									System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t  You Entered the Invalid OTP ");
									System.out.println(cv.green+"\n \t\t\t\t\t\t\t\t  1 . Resending OTP ");
									System.out.println(cv.red+" \t\t\t\t\t\t\t\t  2 . Exit "+cv.reset);
									int h = Integer.parseInt(cv.sc.nextLine());
									if(h==1)
										continue;
									else
										return false;
								}
							}
							else
							{
									System.out.println(cv.red+" \t\t\t\t\t\t\t\t  You Entered the Wrong Mobile_Number"+cv.reset);
									return false;
							}
							
						}
						else	
							return false;
					}
				}
			}
			else 
				return false;
		}
		else
			return false;

	}

	void pin(long pin)
	{
		this.pin = pin;
	}
	long getpin()
	{
		return pin;
	}

}













class user 
{
	static void Bankuser()
	{
		while(true)
		{
			
			System.out.println(cv.blue+"\n \t\t\t\t\t\t\t\t\t SBI Bank    -  1 ");
			System.out.println(cv.violet+"\n \t\t\t\t\t\t\t\t\t ICICI Bank  -  2 ");
			System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t\t Exit        -  3 "+cv.reset);
			int r = Integer.parseInt(cv.sc.nextLine());
			if(r==1)
			{
				Display.display11();
				cv.p.display();
				System.out.println(cv.blue+"\n\n \t\t\t\t\t\t\t\t   Banking process  -  1 "+cv.reset);
				System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t    Exit              -  2 "+cv.reset);
				int s = Integer.parseInt(cv.sc.nextLine());
				if(s==1)
					continue;
				else
					break;
			}
			else if(r==2)
			{ 
				Display.display12();
				cv.p1.display();
				System.out.println(cv.blue+"\n\n \t\t\t\t\t\t\t\t  Banking process  -  1 "+cv.reset);
				System.out.println(cv.red+"\n \t\t\t\t\t\t\t\t  Exit             -  2 "+cv.reset);
				int t = Integer.parseInt(cv.sc.nextLine());
				if(t==1)
					continue;
				else 
					break;
			}
			else
				break;
		}
	}



	static void Ticketuser()
	{
		while(true)
		{
			System.out.println("\t\t\t\t\t\t\t\t  1 ."+cv.blue+"  Bus ");
			System.out.println("\t\t\t\t\t\t\t\t  2 ."+cv.violet+"  Train ");
			System.out.println("\t\t\t\t\t\t\t\t  3 ."+cv.skyblue+"  Flight  ");
			System.out.println("\t\t\t\t\t\t\t\t  4 ."+cv.green+"  Movie ");
			System.out.println("\t\t\t\t\t\t\t\t  5 ."+cv.red+"  Exit  "+cv.reset);
			int A = Integer.parseInt(cv.sc.nextLine());
			if(A==1)
			{
					Bus.display();
					System.out.println("\n\n\t\t\t\t\t\t\t\t 1 ."+cv.green+" Ticket process "+cv.reset);
					System.out.println("\t\t\t\t\t\t\t\t 2 ."+cv.red+" Exit  "+cv.reset);
					int B = Integer.parseInt(cv.sc.nextLine());
					if(B==1)
						continue;
					else	
						break;

			}
			else if(A==2)
			{
					project1.MMM1();
					System.out.println("\n\n\t\t\t\t\t\t\t\t 1 ."+cv.green+" Ticket process "+cv.reset);
					System.out.println("\t\t\t\t\t\t\t\t 2 ."+cv.red+" Exit  "+cv.reset);
					int C = Integer.parseInt(cv.sc.nextLine());
					if(C==1)
						continue;
					else	
						break;
			}
			else if(A==3)
			{
					Airlines.flight();
					System.out.println("\n\n\t\t\t\t\t\t\t\t 1 ."+cv.green+" Ticket process "+cv.reset);
					System.out.println("\t\t\t\t\t\t\t\t 2 ."+cv.red+" Exit  "+cv.reset);
					int D = Integer.parseInt(cv.sc.nextLine());
					if(D==1)
						continue;
					else	
						break;
			}
			else if(A==4)
			{
					MOVIE.MM1();
					System.out.println("\n\n\t\t\t\t\t\t\t\t 1 ."+cv.green+" Ticket process "+cv.reset);
					System.out.println("\t\t\t\t\t\t\t\t 2 ."+cv.red+" Exit  "+cv.reset);
					int E = Integer.parseInt(cv.sc.nextLine());
					if(E==1)
						continue;
					else	
						break;
			}
			else 
				break;
		}
	}



	static void Restaurentuser()
	{
		while(true)
		{
			Restaurant.MN();
			System.out.println("\n\n\t\t\t\t\t\t\t\t 1 ."+cv.green+" Hotel process "+cv.reset);
			System.out.println("\t\t\t\t\t\t\t\t 2 ."+cv.red+" Exit  "+cv.reset);
			int G = Integer.parseInt(cv.sc.nextLine());
			if(G==1)
				continue;
			else	
				break;
		}
	}



	static void Hoteluser()
	{
		while(true)
		{
			Oy.HOTEL();
			System.out.println("\n\n\t\t\t\t\t\t\t\t 1 ."+cv.green+" Hotel process "+cv.reset);
			System.out.println("\t\t\t\t\t\t\t\t 2 ."+cv.red+" Exit  "+cv.reset);
			int F = Integer.parseInt(cv.sc.nextLine());
			if(F==1)
				continue;
			else	
				break;
		}

	}
} 











class Display 
{
	static void display()
	{
		while(true)
		{

		System.out.println("\n\n\n");
		System.out.println(cv.green+"\t\t\t\t * * * * * * * * * * * * * * * * * * *"+cv.reset+cv.blue+"\t\t              * * * * * * * * * * * * * * * * * * * *    ");cv.sleep1();
		System.out.println(cv.green+"\t\t\t\t *                                   *"+cv.reset+cv.blue+"\t\t              *                                     *   ");cv.sleep1();
        System.out.println(cv.green+"\t\t\t\t *                **                 *"+cv.reset+cv.blue+"\t\t              *    _____________________________    *   ");cv.sleep1();
        System.out.println(cv.green+"\t\t\t\t *             **    **              *"+cv.reset+cv.blue+"\t\t              *    |                           |    *   ");cv.sleep1();
        System.out.println(cv.green+"\t\t\t\t *           **        **            *"+cv.reset+cv.blue+"\t\t              *    |                           |    *   ");cv.sleep1();
        System.out.println(cv.green+"\t\t\t\t *         **            **          *"+cv.reset+cv.blue+"\t\t              *    |        TICKETS            |    *   ");cv.sleep1();
        System.out.println(cv.green+"\t\t\t\t *       **                **        *"+cv.reset+cv.blue+"\t\t              *    |      ____________         |    *   ");cv.sleep1();
        System.out.println(cv.green+"\t\t\t\t *     **       "+cv.yellow+"CV BANK"+cv.reset+cv.green+"      **      *"+cv.reset+cv.blue+"\t\t              *    |                           |    *   ");cv.sleep1();cv.sleep1();
        System.out.println(cv.green+"\t\t\t\t *     *************************     * "+cv.reset+cv.blue+"\t\t              *    |   DATE  :  [MM/DD/YYYY]   |    *   ");cv.sleep1();
        System.out.println(cv.green+"\t\t\t\t *     ***        ***        ***     * "+cv.reset+cv.blue+"\t\t              *    |                           |    *   ");cv.sleep1();
        System.out.println(cv.green+"\t\t\t\t *     ***        ***        ***     * "+cv.reset+cv.blue+"\t\t              *    |   TIME  :  [HH:MM AM/PM]  |    *   ");cv.sleep1();
        System.out.println(cv.green+"\t\t\t\t *     ***        ***        ***     * "+cv.reset+cv.blue+"\t\t              *    |                           |    *   ");cv.sleep1();
        System.out.println(cv.green+"\t\t\t\t *     ***        ***        ***     * "+cv.reset+cv.blue+"\t\t              *    |   SEAT  :  [SECTION A-1]  |    *   ");cv.sleep1();
        System.out.println(cv.green+"\t\t\t\t *     ***        ***        ***     * "+cv.reset+cv.blue+"\t\t              *    |                           |    *   ");cv.sleep1();
        System.out.println(cv.green+"\t\t\t\t *     ***        ***        ***     * "+cv.reset+cv.blue+"\t\t              *    |   PRICE :  $ XX.XX        |    *   ");cv.sleep1();
        System.out.println(cv.green+"\t\t\t\t *     *************************     * "+cv.reset+cv.blue+"\t\t              *    |                           |    *   ");cv.sleep1();
        System.out.println(cv.green+"\t\t\t\t *     *************************     * "+cv.reset+cv.blue+"\t\t              *    |                           |    *   ");cv.sleep1();
        System.out.println(cv.green+"\t\t\t\t *     *************************     * "+cv.reset+cv.blue+"\t\t              *    |---------------------------|    *   ");cv.sleep1();
		System.out.println(cv.green+"\t\t\t\t *                                   * "+cv.reset+cv.blue+"\t\t              *                                     *   ");cv.sleep1();   
        System.out.println(cv.green+"\t\t\t\t * * * * * * * * * * * * * * * * * * *"+cv.reset+cv.blue+"\t\t              * * * * * * * * * * * * * * * * * * * *   "+cv.reset);cv.sleep1();

		System.out.println("\n \t\t\t\t\t    Banking -  1                                                   Tickets  -  2 ");



		System.out.println("\n\n\n");cv.sleep();cv.sleep1();
		System.out.println(cv.violet+"\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * *"+cv.reset+"              * * * * * * * * * * * * * * * * * * * * * * * * * * * *");cv.sleep1();
		System.out.println(cv.violet+"\t\t\t\t*                                               *"+cv.reset+"              *                                                     *");cv.sleep1();
		System.out.println(cv.violet+"\t\t\t\t*        __                        @@;,         *"+cv.reset+"              *                    _ _.-'`-._ _                     *");cv.sleep1();
        System.out.println(cv.violet+"\t\t\t\t*      (  ;          ?           :  );          *"+cv.reset+"              *                   ;.'________'.;                    *");cv.sleep1();
        System.out.println(cv.violet+"\t\t\t\t*     _| |_  |  |   ||  |  |     _| |_          *"+cv.reset+"              *        _________n.[____________].n_________         *");cv.sleep1();
        System.out.println(cv.violet+"\t\t\t\t*    |  \\  \\  \\/    ||   \\/ ___ /  /  |         *"+cv.reset+"              *       |\"\"_\"\"_\"\"_\"\"||==||==||==||\"\"_\"\"_\"\"_\"\"]        *");cv.sleep1();
        System.out.println(cv.violet+"\t\t\t\t*    __|   |\\ __||____||___||______/|   |       *"+cv.reset+"              *       |\"\"\"\"\"\"\"\"\"\"\"\"||..||..||..||\"\"\"\"\"\"\"\"\"\"\"|       *");cv.sleep1();
        System.out.println(cv.violet+"\t\t\t\t*    |||   | |_______    _________| |   |||     *"+cv.reset+"              *       |LI LI LI LI||LI||LI||LI||LI LI LI LI|        * ");cv.sleep1();
        System.out.println(cv.violet+"\t\t\t\t*    |||   |____     |   |      ____|   |||     *"+cv.reset+"              *       |.. .. .. ..||..||..||..||.. .. .. ..|        *");cv.sleep1();
        System.out.println(cv.violet+"\t\t\t\t*    \\ \\______  )    |   |     /  ______/ /     *"+cv.reset+"              *       |LI LI LI LI||LI||LI||LI||LI LI LI LI|        *");cv.sleep1();
        System.out.println(cv.violet+"\t\t\t\t*     ||    | | |    |   |    /___|     ||      *"+cv.reset+"              *    ,,;;,;;;,;;;,;;;,;;;,;;;,;;;,;;,;;;,;;;,;;,,     *");cv.sleep1();
        System.out.println(cv.violet+"\t\t\t\t*     ||    | | |_  /| | |\\   _| ||     ||      *"+cv.reset+"              *   ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;    * ");cv.sleep1();
        System.out.println(cv.violet+"\t\t\t\t*     ||    | \\__, / | | | \\  \\<__/ |   ||      *"+cv.reset+"              *   ;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;    *");cv.sleep1();
		System.out.println(cv.violet+"\t\t\t\t*                                               *"+cv.reset+"              *                                                     * ");cv.sleep1();
		System.out.println(cv.violet+"\t\t\t\t* * * * * * * * * * * * * * * * * * * * * * * * *"+cv.reset+"              * * * * * * * * * * * * * * * * * * * * * * * * * * * *  ");cv.sleep1();



			System.out.println("\n \t\t\t\t\t     Restaurents  -   3                                                    Hotels  -  4 ");

			int f = Integer.parseInt(cv.sc.nextLine());
			if(f==1)
			{
				user.Bankuser();
				System.out.println("\n\n \t\t\t\t\t\t\t\t\t  1 ."+cv.green+"  Home page  "+cv.reset);
				System.out.println("\n \t\t\t\t\t\t\t\t\t  2 ."+cv.red+"  Exit "+cv.reset);
				int m = Integer.parseInt(cv.sc.nextLine());
				if(m==1)
					continue;
				else	
					break;
			}
			else if(f==2)
			{
				display1();
				user.Ticketuser();
				System.out.println("\n\n \t\t\t\t\t\t\t\t  1 ."+cv.green+"  Home page  "+cv.reset);
				System.out.println(" \t\t\t\t\t\t\t\t  2 ."+cv.red+"  Exit "+cv.reset);
				int ah = Integer.parseInt(cv.sc.nextLine());
				if(ah==1)
					continue;
				else	
					break;
			}
			else if(f==3)
			{
				user.Restaurentuser();
				System.out.println("\n\n \t\t\t\t\t\t\t\t\t  1 ."+cv.green+"  Home page  "+cv.reset);
				System.out.println(" \t\t\t\t\t\t\t\t\t  2 ."+cv.red+"  Exit "+cv.reset);
				int ai = Integer.parseInt(cv.sc.nextLine());
				if(ai==1)
					continue;
				else	
					break;
			}
			else if(f==4)
			{
				user.Hoteluser();
				System.out.println("\n\n \t\t\t\t\t\t\t\t  1 ."+cv.green+"  Home page  "+cv.reset);
				System.out.println(" \t\t\t\t\t\t\t\t  2 ."+cv.red+"  Exit "+cv.reset);
				int aj = Integer.parseInt(cv.sc.nextLine());
				if(aj==1)
					continue;
				else	
					break;
			}
		}
	}




	static void display1()
	{
		System.out.println("\n\n\n");
		System.out.println(cv.red+"\t\t\t     _______________________         "+cv.reset+cv.green+cv.violet+"\t             OO O o o o...      ______________________ ___________________     ");cv.sleep1();
        System.out.println(cv.red+"\t\t\t     |   |    |    |    | |  \\      "+cv.reset+cv.green+cv.violet+"\t            O     ____          |                    | |                 |     ");cv.sleep1();
        System.out.println(cv.red+"\t\t\t     |___|____|____|____|_|___\\     "+cv.reset+cv.green+cv.violet+"\t          ][_n_i_| (   ooo___   |     CV TRAIN       | |     CV TRAIN    |     ");cv.sleep1();
        System.out.println(cv.red+"\t\t\t     |         CV BUS   | |    \\    "+cv.reset+cv.green+cv.violet+"\t          (__________|_[______]_|____________________|_|_________________|     ");cv.sleep1();
        System.out.println(cv.red+"\t\t\t     '--(o)(o)------------(o)--'     "+cv.reset+cv.green+cv.violet+"\t         (0)--(0)--(0)--(0)    (0)      (0)     (0)   (0)     (0)    (0)     "+cv.reset);cv.sleep1();

		System.out.println("\n\t\t\t\t       1 . Bus                                                        2 . Train");
			
		System.out.println("\n\n\n");
		System.out.println(cv.blue+"\t\t\t                      _____                                   "+cv.reset+cv.skyblue+"                                                                   ");cv.sleep1();
        System.out.println(cv.blue+"\t\t\t	              \\   \\                                       "+cv.reset+cv.skyblue+"                                                            ");cv.sleep1();
        System.out.println(cv.blue+"\t\t\t  _______              \\   \\                                "+cv.reset+cv.skyblue+"              _________________________________________           ");cv.sleep1();
        System.out.println(cv.blue+"\t\t\t  |    \\                \\  `\\                              "+cv.reset+cv.skyblue+"              |                                         |              ");cv.sleep1();
        System.out.println(cv.blue+"\t\t\t  |      __\\__---------------------------------._.           "+cv.reset+cv.skyblue+"            |                                         |              ");cv.sleep1();
        System.out.println(cv.blue+"\t\t\t  __|---~~~__o_o_o_o_o_o_o_o_o_o_o_o_o_o_o_o_o_o_[][]\\__     "+cv.reset+cv.skyblue+"            |               CV THEATER                |              ");cv.sleep1();
        System.out.println(cv.blue+"\t\t\t  |___        CV PLANE         /~      )   CV PLANE    \\__   "+cv.reset+cv.skyblue+"            |                                         |              ");cv.sleep1();	
        System.out.println(cv.blue+"\t\t\t  ~~~---..._______________/     ,/_____________________/      "+cv.reset+cv.skyblue+"           |_________________________________________|              ");cv.sleep1();
        System.out.println(cv.blue+"\t\t\t  		         /     /                                    "+cv.reset+cv.yellow+"     *******************************************              ");cv.sleep1();
        System.out.println(cv.blue+"\t\t\t  	                 /    /                                 "+cv.reset+cv.white+"          |1|  |2| |3| |4| |5| |6| |7| |8| |9| |10|            ");cv.sleep1();
        System.out.println(cv.blue+"\t\t\t  	                /___,/                                  "+cv.reset+cv.white+"      |11| |12| |13| |14| |15| |16| |17| |18| |19| |20|          ");cv.sleep1();	
        System.out.println(cv.blue+"\t\t\t                                                              "+cv.reset+cv.white+"   |21| |22| |23| |24| |25| |26| |27| |28| |29| |30| |31| |32|   "+cv.reset);cv.sleep1();

		System.out.println("\n\t\t\t\t\t   3 . Flight                                                             4 . Movie"); 
	}






	static void display2()
	{
		System.out.println(cv.green+"\t\t\t\t\t\t\t\t ___________________________________  ");cv.sleep1();
        System.out.println("\t\t\t\t\t\t\t\t |#######====================#######| ");cv.sleep1();
        System.out.println("\t\t\t\t\t\t\t\t |#(1)*  RESERVE BANK OF INDIA *(1)#| ");cv.sleep1();
        System.out.println("\t\t\t\t\t\t\t\t |#**          /===\\   ********  **#| ");cv.sleep1();
        System.out.println("\t\t\t\t\t\t\t\t |*# {G}      | (\") |             #*| ");cv.sleep1();
        System.out.println("\t\t\t\t\t\t\t\t |#*  ******  | /v\\ |    O N E    *#| ");cv.sleep1();
        System.out.println("\t\t\t\t\t\t\t\t |#(1)         \\===/            (1)#| ");cv.sleep1();
        System.out.println("\t\t\t\t\t\t\t\t |##=========ONE RUPEE ===========##|  ");cv.sleep1();
        System.out.println("\t\t\t\t\t\t\t\t ------------------------------------   "+cv.reset);cv.sleep1();
	}
	

	static void display6()
	{
		System.out.println(cv.red+"\t\t\t\t\t\t                                  __________________                  ");
        System.out.println(cv.red+"\t\t\t\t\t\t                                  |   |    |    | |  \\                ");
        System.out.println(cv.blue+"\t\t\t\t\t\t H Y D E R A B A D"+cv.green+"   > > > > >"+cv.red+"    |___|____|____|_|___\\ "+cv.green+"   > > > > >"+cv.violet+"   B A N G L O R E ");
        System.out.println(cv.red+"\t\t\t\t\t\t                                  |             | |    \\                   ");
        System.out.println(cv.red+"\t\t\t\t\t\t                                  `--(o)(o)-------(o)--'                   "+cv.reset);
	}

	static void display7()
	{
		System.out.println(cv.red+"\t\t\t\t\t\t                                  __________________                  ");
        System.out.println(cv.red+"\t\t\t\t\t\t                                  |   |    |    | |  \\                ");
        System.out.println(cv.violet+"\t\t\t\t\t\t H Y D E R A B A D"+cv.green+"   > > > > >"+cv.red+"    |___|____|____|_|___\\ "+cv.green+"   > > > > >"+cv.yellow+"   V I Z A G ");
        System.out.println(cv.red+"\t\t\t\t\t\t                                  |             | |    \\                   ");
        System.out.println(cv.red+"\t\t\t\t\t\t                                  `--(o)(o)-------(o)--'                   "+cv.reset);
	}

	static void display8()
	{
		System.out.println(cv.red+"\t\t\t\t\t\t                                  __________________                  ");
        System.out.println(cv.red+"\t\t\t\t\t\t                                  |   |    |    | |  \\                ");
        System.out.println(cv.yellow+"\t\t\t\t\t\t H Y D E R A B A D"+cv.green+"   > > > > >"+cv.red+"    |___|____|____|_|___\\ "+cv.green+"   > > > > >"+cv.red+"   G O A ");
        System.out.println(cv.red+"\t\t\t\t\t\t                                  |             | |    \\                   ");
        System.out.println(cv.red+"\t\t\t\t\t\t                                  `--(o)(o)-------(o)--'                   "+cv.reset);
	}

	static void display9()
	{
		System.out.println(cv.red+"\t\t\t\t\t\t                                  __________________                  ");
        System.out.println(cv.red+"\t\t\t\t\t\t                                  |   |    |    | |  \\                ");
        System.out.println(cv.red+"\t\t\t\t\t\t H Y D E R A B A D"+cv.green+"   > > > > >"+cv.red+"    |___|____|____|_|___\\ "+cv.green+"   > > > > >"+cv.skyblue+"   C H E N N A I ");
        System.out.println(cv.red+"\t\t\t\t\t\t                                  |             | |    \\                   ");
        System.out.println(cv.red+"\t\t\t\t\t\t                                  `--(o)(o)-------(o)--'                   "+cv.reset);
	}

	static void display10()
	{
		System.out.println(cv.violet+"\n");
		System.out.println("\t\t\t\t\t _____________________________       _________________________________               ");
		System.out.println("\t\t\t\t\t |   _______________________  |      |   ______________________      |                ");
		System.out.println("\t\t\t\t\t |  | LOWER SEATER/SLEEPER |  |      |   |    UPPER  SLEEPER   |     |                 ");
		System.out.println("\t\t\t\t\t |  |______________________|  |      |   |_____________________|     |                  ");
		System.out.println("\t\t\t\t\t |  _______       __________  |      |  _________       __________   |                   ");
		System.out.println("\t\t\t\t\t |  |     |       |        |  |      |  |        |      |         |  |                    ");
		System.out.println("\t\t\t\t\t |  |  1  |       |        |  |      |  |        |      |         |  |                     ");
		System.out.println("\t\t\t\t\t |  |_____|       |        |  |      |  |        |      |         |  |                    ");
		System.out.println("\t\t\t\t\t |  _______       |    7   |  |      |  |   10   |      |   11    |  |                    ");
		System.out.println("\t\t\t\t\t |  |     |       |        |  |      |  |        |      |         |  |                    ");
		System.out.println("\t\t\t\t\t |  |  2  |       |        |  |      |  |        |      |         |  |                    ");
		System.out.println("\t\t\t\t\t |  |_____|       |________|  |      |  |________|      |_________|  |                    ");
		System.out.println("\t\t\t\t\t |  _______        _________  |      |  __________      __________   |                    ");
		System.out.println("\t\t\t\t\t |  |     |       |        |  |      |  |        |      |         |  |                    ");
		System.out.println("\t\t\t\t\t |  |  3  |       |        |  |      |  |        |      |         |  |                    ");
		System.out.println("\t\t\t\t\t |  |_____|       |        |  |      |  |        |      |         |  |                    ");
		System.out.println("\t\t\t\t\t |  _______       |    8   |  |      |  |   12   |      |   13    |  |                    ");
		System.out.println("\t\t\t\t\t |  |     |       |        |  |      |  |        |      |         |  |                    ");
		System.out.println("\t\t\t\t\t |  |  4  |       |        |  |      |  |        |      |         |  |                    ");
		System.out.println("\t\t\t\t\t |  |_____|       |________|  |      |  |________|      |_________|  |                    ");
		System.out.println("\t\t\t\t\t |  _______       _________   |      |  __________      __________   |                     ");
		System.out.println("\t\t\t\t\t |  |     |       |        |  |      |  |        |      |         |  |                    ");
		System.out.println("\t\t\t\t\t |  |  5  |       |        |  |      |  |        |      |         |  |                    ");
		System.out.println("\t\t\t\t\t |  |_____|       |        |  |      |  |        |      |         |  |                    ");
		System.out.println("\t\t\t\t\t |  _______       |    9   |  |      |  |   14   |      |   15    |  |                    ");
		System.out.println("\t\t\t\t\t |  |     |       |        |  |      |  |        |      |         |  |                    ");
		System.out.println("\t\t\t\t\t |  |  6  |       |        |  |      |  |        |      |         |  |                    ");
		System.out.println("\t\t\t\t\t |  |_____|       |________|  |      |  |________|      |_________|  |                      ");
		System.out.println("\t\t\t\t\t |____________________________|      |_______________________________|                     "+cv.reset);
	}
	

	static void display11()
	{
		String asciiArt =
    	"\t __          ________ _      _____ ____  __  __ ______         _______ ____          _____ ____ _____         ____          _   _ _  __\n" +
    	"\t \\ \\        / /  ____| |    / ____/ __ \\|  \\/  |  ____|       |__   __/ __ \\        / ____|  _ \\_   _|       |  _ \\   /\\   | \\ | | |/ /\n" +
    	"\t  \\ \\  /\\  / /| |__  | |   | |   | |  | | \\  / | |__             | | | |  | |      | (___ | |_) || |         | |_) | /  \\  |  \\| | ' / \n" +
    	"\t   \\ \\/  \\/ / |  __| | |   | |   | |  | | |\\/| |  __|            | | | |  | |       \\___ \\|  _ < | |         |  _ < / /\\ \\ | . ` |  <  \n" +
    	"\t    \\  /\\  /  | |____| |___| |___| |__| | |  | | |____           | | | |__| |       ____) | |_) || |_        | |_) / ____ \\| |\\  | . \\ \n" +
    	"\t     \\/  \\/   |______|______\\_____\\____/|_|  |_|______|          |_|  \\____/       |_____/|____/_____|       |____/_/    \\_\\_| \\_|_|\\_\\\n" +
    	"\t                                                                                                                                    \n" +
    	"\t                                                                                                                                      ";
		System.out.println(asciiArt);        
			
	}

	static void display12()
	{
		System.out.println("\r\n" + //
            cv.violet+"\t\t\t\t \u2591\u2588\u2588\u2557\u2591\u2591\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2557\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2557\u2588\u2588\u2557\u2591\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2557\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2557\u2591\u2588\u2588\u2588\u2557\u2591\u2591\u2591\u2588\u2588\u2588\u2557\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2557\u2003\u2003\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2557\u2591\u2588\u2588\u2588\u2588\u2588\u2557\u2591\r\n" + //
            cv.violet+"\t\t\t\t \u2591\u2588\u2588\u2551\u2591\u2591\u2588\u2588\u2557\u2591\u2591\u2588\u2588\u2551\u2588\u2588\u2554\u2550\u2550\u2550\u2550\u255D\u2588\u2588\u2551\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2554\u2550\u2550\u2588\u2588\u2557\u2588\u2588\u2554\u2550\u2550\u2588\u2588\u2557\u2588\u2588\u2588\u2588\u2557\u2591\u2588\u2588\u2588\u2588\u2551\u2588\u2588\u2554\u2550\u2550\u2550\u2550\u255D\u2003\u2003\u255A\u2550\u2550\u2588\u2588\u2554\u2550\u2550\u255D\u2588\u2588\u2554\u2550\u2550\u2588\u2588\u2557\r\n" + //
            cv.violet+"\t\t\t\t \u2591\u255A\u2588\u2588\u2557\u2588\u2588\u2588\u2588\u2557\u2588\u2588\u2554\u255D\u2588\u2588\u2588\u2588\u2588\u2557\u2591\u2591\u2588\u2588\u2551\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2551\u2591\u2591\u255A\u2550\u255D\u2588\u2588\u2551\u2591\u2591\u2588\u2588\u2551\u2588\u2588\u2554\u2588\u2588\u2588\u2588\u2554\u2588\u2588\u2551\u2588\u2588\u2588\u2588\u2588\u2557\u2591\u2591\u2003\u2003\u2591\u2591\u2591\u2588\u2588\u2551\u2591\u2591\u2591\u2588\u2588\u2551\u2591\u2591\u2588\u2588\u2551\r\n" + //
            cv.violet+"\t\t\t\t \u2591\u2591\u2588\u2588\u2588\u2588\u2554\u2550\u2588\u2588\u2588\u2588\u2551\u2591\u2588\u2588\u2554\u2550\u2550\u255D\u2591\u2591\u2588\u2588\u2551\u2591\u2591\u2591\u2591\u2591\u2588\u2588\u2551\u2591\u2591\u2588\u2588\u2557\u2588\u2588\u2551\u2591\u2591\u2588\u2588\u2551\u2588\u2588\u2551\u255A\u2588\u2588\u2554\u255D\u2588\u2588\u2551\u2588\u2588\u2554\u2550\u2550\u255D\u2591\u2591\u2003\u2003\u2591\u2591\u2591\u2588\u2588\u2551\u2591\u2591\u2591\u2588\u2588\u2551\u2591\u2591\u2588\u2588\u2551\r\n" + //
            cv.violet+"\t\t\t\t \u2591\u2591\u255A\u2588\u2588\u2554\u255D\u2591\u255A\u2588\u2588\u2554\u255D\u2591\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2557\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2557\u255A\u2588\u2588\u2588\u2588\u2588\u2554\u255D\u255A\u2588\u2588\u2588\u2588\u2588\u2554\u255D\u2588\u2588\u2551\u2591\u255A\u2550\u255D\u2591\u2588\u2588\u2551\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2557\u2003\u2003\u2591\u2591\u2591\u2588\u2588\u2551\u2591\u2591\u2591\u255A\u2588\u2588\u2588\u2588\u2588\u2554\u255D\r\n" + //
            cv.violet+"\t\t\t\t \u2591\u2591\u2591\u255A\u2550\u255D\u2591\u2591\u2591\u255A\u2550\u255D\u2591\u2591\u255A\u2550\u2550\u2550\u2550\u2550\u2550\u255D\u255A\u2550\u2550\u2550\u2550\u2550\u2550\u255D\u2591\u255A\u2550\u2550\u2550\u2550\u255D\u2591\u2591\u255A\u2550\u2550\u2550\u2550\u255D\u2591\u255A\u2550\u255D\u2591\u2591\u2591\u2591\u2591\u255A\u2550\u255D\u255A\u2550\u2550\u2550\u2550\u2550\u2550\u255D\u2003\u2003\u2591\u2591\u2591\u255A\u2550\u255D\u2591\u2591\u2591\u2591\u255A\u2550\u2550\u2550\u2550\u255D\u2591\r\n" + //
            cv.violet+"\t\t\t\t \r\n" + //
            cv.violet+"\t\t\t\t\t\t \u2588\u2588\u2557\u2591\u2588\u2588\u2588\u2588\u2588\u2557\u2591\u2588\u2588\u2557\u2591\u2588\u2588\u2588\u2588\u2588\u2557\u2591\u2588\u2588\u2557\u2003\u2003\u2588\u2588\u2588\u2588\u2588\u2588\u2557\u2591\u2591\u2588\u2588\u2588\u2588\u2588\u2557\u2591\u2588\u2588\u2588\u2557\u2591\u2591\u2588\u2588\u2557\u2588\u2588\u2557\u2591\u2591\u2588\u2588\u2557\r\n" + //
            cv.violet+"\t\t\t\t\t\t \u2588\u2588\u2551\u2588\u2588\u2554\u2550\u2550\u2588\u2588\u2557\u2588\u2588\u2551\u2588\u2588\u2554\u2550\u2550\u2588\u2588\u2557\u2588\u2588\u2551\u2003\u2003\u2588\u2588\u2554\u2550\u2550\u2588\u2588\u2557\u2588\u2588\u2554\u2550\u2550\u2588\u2588\u2557\u2588\u2588\u2588\u2588\u2557\u2591\u2588\u2588\u2551\u2588\u2588\u2551\u2591\u2588\u2588\u2554\u255D\r\n" + //
            cv.violet+"\t\t\t\t\t\t \u2588\u2588\u2551\u2588\u2588\u2551\u2591\u2591\u255A\u2550\u255D\u2588\u2588\u2551\u2588\u2588\u2551\u2591\u2591\u255A\u2550\u255D\u2588\u2588\u2551\u2003\u2003\u2588\u2588\u2588\u2588\u2588\u2588\u2566\u255D\u2588\u2588\u2588\u2588\u2588\u2588\u2588\u2551\u2588\u2588\u2554\u2588\u2588\u2557\u2588\u2588\u2551\u2588\u2588\u2588\u2588\u2588\u2550\u255D\u2591\r\n" + //
            cv.violet+"\t\t\t\t\t\t \u2588\u2588\u2551\u2588\u2588\u2551\u2591\u2591\u2588\u2588\u2557\u2588\u2588\u2551\u2588\u2588\u2551\u2591\u2591\u2588\u2588\u2557\u2588\u2588\u2551\u2003\u2003\u2588\u2588\u2554\u2550\u2550\u2588\u2588\u2557\u2588\u2588\u2554\u2550\u2550\u2588\u2588\u2551\u2588\u2588\u2551\u255A\u2588\u2588\u2588\u2588\u2551\u2588\u2588\u2554\u2550\u2588\u2588\u2557\u2591\r\n" + //
            cv.violet+"\t\t\t\t\t\t \u2588\u2588\u2551\u255A\u2588\u2588\u2588\u2588\u2588\u2554\u255D\u2588\u2588\u2551\u255A\u2588\u2588\u2588\u2588\u2588\u2554\u255D\u2588\u2588\u2551\u2003\u2003\u2588\u2588\u2588\u2588\u2588\u2588\u2566\u255D\u2588\u2588\u2551\u2591\u2591\u2588\u2588\u2551\u2588\u2588\u2551\u2591\u255A\u2588\u2588\u2588\u2551\u2588\u2588\u2551\u2591\u255A\u2588\u2588\u2557\r\n" + //
            cv.violet+"\t\t\t\t\t\t \u255A\u2550\u255D\u2591\u255A\u2550\u2550\u2550\u2550\u255D\u2591\u255A\u2550\u255D\u2591\u255A\u2550\u2550\u2550\u2550\u255D\u2591\u255A\u2550\u255D\u2003\u2003\u255A\u2550\u2550\u2550\u2550\u2550\u255D\u2591\u255A\u2550\u255D\u2591\u2591\u255A\u2550\u255D\u255A\u2550\u255D\u2591\u2591\u255A\u2550\u2550\u255D\u255A\u2550\u255D\u2591\u2591\u255A\u2550\u255D"+cv.reset);
    

	}
}











class login
{
	private String user_name="sivaiah";
	private String password="123456";
	private String phone="9347866522";
	void setu(String u)
	{
		this.user_name=u;
	}
	void setp(String p)
	{
		this.password=p;
	}
	void setph(String ph)
	{
		this.phone=ph;
	}
	void setup(String u,String p)
	{
		this.user_name=u;
		this.password=p;
	}
	String getu()
	{
		return user_name;
	}
	String getp()
	{
		return password;
	}
	String getph()
	{
		return phone;
	}
}

class colors extends login
{
	static String fviolet="\u001B[35m";
	static String fred="\u001B[31m";
	static String fgreen="\u001B[32m";
	static String fyellow="\u001B[33m";
	static String fblue="\u001B[34m";
	static String fskyblue="\u001B[36m";
	static String fcyan="\u001B[36m";
	static String bred="\u001B[101m";
	static String bgreen="\u001B[102m";
	static String byellow="\u001B[103m";
	static String bblue="\u001B[104m";
	static String bviolet="\u001B[105m";
	static String bskyblue="\u001B[106m";
	static String underline="\u001B[4m";
	static String reset="\u001B[0m";
	static String change="\u001B[7m";
	static String thick="\u001B[1m";
	static void clear()
	{
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}
	static void sleep(int a)
	{
		try{
			Thread.sleep(a);
		}
		catch(InterruptedException e)
		{
			System.out.println("hello");
		}
	
	}
}

class project extends colors
{
	static Scanner sc=new Scanner(System.in);
	static project y=new project();
	static String u;
	static String p;
	static String ph;
	static int va = 0;
	static int da;
	static void loginprocess()
	{
		System.out.println(fskyblue+thick+"Enter your user_name & password:"+reset);
		System.out.print("\tuser_name:  "+thick+fyellow);
		u=sc.nextLine();
		System.out.print(reset+"\tpassword :  "+thick+fyellow);
		p=sc.nextLine();
		System.out.println(reset);
		if(u.equalsIgnoreCase(y.getu()) && p.equalsIgnoreCase(y.getp()))
		{
			String t1="L O G I N    S U C C E S S";
			for(int i=0;i<=t1.length()-1;i++)
			{
				if(i==0)
				    System.out.print("\n\t\t\t\t\t");
				System.out.print(thick+fskyblue+underline+t1.charAt(i));
				sleep(50);
			}
			va++;
			System.out.println(reset);
		}
		else if(!(u).equalsIgnoreCase(y.getu()) && !(p).equalsIgnoreCase(y.getp()))
		{
			System.out.println(fred+"\t\t\t\t\t\tWrong User_name & Password");
			System.out.println(fskyblue+change+"PRESS: 1"+reset+fblue+thick+"  -->  login again\n"+reset);
			System.out.println(fskyblue+change+"PRESS: 2"+reset+fblue+thick+"  -->  Reset Your user_name & password"+reset);
			System.out.println(fskyblue+change+"PRESS: 3"+reset+fblue+thick+"  -->  exit"+reset);
			int n=Integer.parseInt(sc.nextLine());
			while(true)
			{
				if(n==1)
				{
			   		loginprocess();
					break;
				}
				else if(n==2)
				{
					System.out.println("\t\t\tEnter phone number to reset username & password:");
					while(true)
					{
						ph=sc.nextLine();
						int len=ph.length();
						if(len==10)
						{
							if(ph.equals(y.getph()))
							{
								System.out.println(fred+thick+"\t\t\tPLEASE WAIT WHILE GENERATING OTP.....");
					  			sleep(1500);
								while(true)
				  				{
									int otp=1000+(int)(Math.random()*8999);
									System.out.println(fblue+thick+"\t\t\tYOUR OTP IS:  "+otp+reset);
									System.out.print("Enter your otp:");
									int x=Integer.parseInt(sc.nextLine());
									if(x==otp)
									{
										System.out.println("\t\t\t\t\t\tOTP MATCHED");
										System.out.print("\t\t\t\t\t\tUSER NAME  :-----");sleep(2000);
										System.out.println(y.getu());
										System.out.print("\t\t\t\t\t\tPASSWORD  :-----");sleep(2000);
										System.out.println(y.getp());sleep(2000);
										System.out.println();
										System.out.println();
										M1();	
										break;
									}
									else
									{
										System.out.println(fred+"\t\t\tOTP NOT MATCHED"+reset);
										System.out.println(fgreen+"\t\t\tPLEASE WAIT WHILE RE-GENERATING OTP....."+reset);
										sleep(2000);
									}
			  					}
							}
							else
							{
								System.out.println("YOU ARE NOT A USER");
								System.out.println(fred+"\t\t\t\t\t1---SIGNUP"+reset);
								System.out.println(fgreen+"\t\t\t\t\t2---EXIT "+reset);
								int se=Integer.parseInt(sc.nextLine());
								while(true)
								{
									if(se==1)
									{
										signup();
										break;
									}
									else if(se==2)
									{
										break;
									}
									else
									{
										System.out.println(fyellow+"INVALID INPUT"+reset);
									}
								}
									
							}
							break;
						}
						else
						{
							System.out.println(fred+"\t\t\t\tYOU ENTER INVALID PHONE NUMBER"+reset);
							System.out.println(fgreen+"\t\t\t\tPLEASE ENTER VALID PHONE NUMBER"+reset);
						}
					}
					break;
				}
				else if(n==3)
				{
					break;
				}
				else
				{
			 	 	System.out.println(fred+"\t\t\t\t\tYour Entered Wrong Number:"+reset);
				}
			}
		}
		else if(!(u).equalsIgnoreCase(y.getu()))
		{
			System.out.println(fred+"\t\t\t\t\tWrong User_Name:");
			System.out.println(fskyblue+change+"PRESS: 1"+reset+fblue+thick+"  -->  LOGIN AGAIN"+reset);
			System.out.println(fskyblue+change+"PRESS: 2"+reset+fblue+thick+"  -->  RESET"+reset);
			System.out.println(fskyblue+change+"PRESS: 3"+reset+fblue+thick+"  -->  EXIT"+reset);
			while(true)
			{
				int ga = Integer.parseInt(sc.nextLine());
				if(ga==2)
				{
					System.out.println(fred+thick+"\t\t\tEnter phone number to reset username :"+reset);
					while(true)
					{
						ph=sc.nextLine();
						int len=ph.length();
						if(len==10)
						{
							if(ph.equals(y.getph()))
							{
								System.out.println(fred+thick+"\t\t\tPLEASE WAIT WHILE GENERATING OTP.....");
					  			sleep(1500);
								while(true)
				  				{
									int otp=1000+(int)(Math.random()*8999);
									System.out.println(fblue+thick+"\t\t\tYOUR OTP IS:  "+otp+reset);
									System.out.print("Enter your otp:");
									int x=Integer.parseInt(sc.nextLine());
									if(x==otp)
									{
										System.out.println("OTP MATCHED");
										System.out.println(fgreen+"\t\t\tenter your user name"+reset);
										u=sc.nextLine();
										y.setu(u);
										System.out.println("\t\t\t\t\t\t\t\t  Username is updated successfully");
										System.out.println("\t\t\t\t\t\t\t\t Youe username = "+y.getu());
										System.out.println(fred+"\t\t\t\t\t\t\t\t  1 .  Login "+reset);
										System.out.println(fgreen+"\t\t\t\t\t\t\t\t+  2 .  Exit "+reset);
										while(true)
										{
											int gb = Integer.parseInt(sc.nextLine());
											if(gb==1)
											{
												loginprocess();
												break;
											}
											else if(ga==2)
											{
												System.out.println(fred+"\t\t\t\t\t\t\t\t  Terminated successfully"+reset);
												break;
											}
											else
											{
												System.out.println(fred+"please enter valid option"+reset);
											}
										}	
										break;
									}
									else
									{
										System.out.println(fred+"\t\t\tOTP NOT MATCHED"+reset);
										System.out.println(fgreen+"\t\t\tPLEASE WAIT WHILE RE-GENERATING OTP....."+reset);
										sleep(2000);
									}
			  					}
							}
							else
							{
								System.out.println("ENTER A VALID USER");
								System.out.println(fred+"\t\t\t\t\t1---SIGNUP"+reset);
								System.out.println(fgreen+"\t\t\t\t\t2---EXIT "+reset);
								int se=Integer.parseInt(sc.nextLine());
								while(true)
								{
									if(se==1)
									{
										signup();
										break;
									}
									else if(se==2)
									{
										break;
									}
									else
									{
										System.out.println(fred+"INVALID INPUT"+reset);
									}
								}
									
							}
							break;
						}
						else
						{
							System.out.println(fred+"\t\t\t\tYOU ENTER INVALID PHONE NUMBER"+reset);
							System.out.println(fgreen+"\t\t\t\tPLEASE ENTER VALID PHONE NUMBER"+reset);
						}
					}
					break;
				}
				else if(ga==1)
				{
					loginprocess();
					break;
				}
				else if(ga==3)
				{
					System.out.print("Sucessfully terminated");
					break;
				}
				else
				{	
					System.out.println("PLEASE ENTER VALID INPUT");
				}
			}
			  
		}
		else
		{
			System.out.println(fred+"\t\t\t\t\tWrong Password:");
			System.out.println(fskyblue+change+"PRESS: 1"+reset+fblue+thick+"  -->  LOGIN AGAIN"+reset);
			System.out.println(fskyblue+change+"PRESS: 2"+reset+fblue+thick+"  -->  RESET"+reset);
			System.out.println(fskyblue+change+"PRESS: 3"+reset+fblue+thick+"  -->  EXIT"+reset);
			while(true)
			{
				int ga = Integer.parseInt(sc.nextLine());
				if(ga==2)
				{
					System.out.println("\t\t\tEnter phone number to reset password :");
					while(true)
					{
						ph=sc.nextLine();
						int len=ph.length();
						if(len==10)
						{
							if(ph.equals(y.getph()))
							{
								System.out.println(fred+thick+"\t\t\tPLEASE WAIT WHILE GENERATING OTP.....");
					  			sleep(1500);
								while(true)
				  				{
									int otp=1000+(int)(Math.random()*8999);
									System.out.println(fblue+thick+"\t\t\tYOUR OTP IS:  "+otp+reset);
									System.out.print("Enter your otp:");
									int x=Integer.parseInt(sc.nextLine());
									if(x==otp)
									{
										System.out.println("OTP MATCHED");
										System.out.println("enter your password");
										p=sc.nextLine();
										y.setp(p);
										System.out.println("\t\t\t\t\t\t\t\t  password is updated successfully");
										System.out.println("\t\t\t\t\t\t\t\t Youe password = "+y.getp());
										System.out.println("\t\t\t\t\t\t\t\t  1 .  Login ");
										System.out.println("\t\t\t\t\t\t\t\t  2 .  Exit ");
										while(true)
										{
											int gb = Integer.parseInt(sc.nextLine());
											if(gb==1)
											{
												loginprocess();
												break;
											}
											else if(ga==2)
											{
												System.out.println(fred+"\t\t\t\t\t\t\t\t  Terminated successfully"+reset);
												break;
											}
											else
											{
												System.out.println(fred+"please enter valid option"+reset);
											}
										}	
										break;
									}
									else
									{
										System.out.println(fred+"\t\t\tOTP NOT MATCHED"+reset);
										System.out.println(fgreen+"\t\t\tPLEASE WAIT WHILE RE-GENERATING OTP....."+reset);
										sleep(2000);
									}
			  					}
							}
							else
							{
								System.out.println("\t\t\t\t\tYOUR INVALID USER");
								System.out.println(fred+"\t\t\t\t\t1---SIGNUP"+reset);
								System.out.println(fgreen+"\t\t\t\t\t2---EXIT "+reset);
								int se=Integer.parseInt(sc.nextLine());
								while(true)
								{
									if(se==1)
									{
										signup();
										break;
									}
									else if(se==2)
									{
										break;
									}
									else
									{
										System.out.println(fred+"INVALID INPUT"+reset);
									}
								}
									
							}
							break;
						}
						else
						{
							System.out.println(fred+"\t\t\t\tYOU ENTER INVALID PHONE NUMBER"+reset);
							System.out.println(fred+"\t\t\t\tPLEASE ENTER VALID PHONE NUMBER"+reset);
						}
					}
					break;
				}
				else if(ga==1)
				{
					loginprocess();
					break;
				}
				else if(ga==3)
				{
					System.out.print(fred+"Sucessfully terminated"+reset);
					break;
				}
				else
				{	
					System.out.println(fgreen+"PLEASE ENTER VALID INPUT"+reset);
				}
			}
			  
			
		}
	}
	static void M1( )
	{
		while(true)
		{
			System.out.println(thick+change+underline+"\t\t\t\t1. SIGNUP\t\t\t\t2. LOG IN\t\t\t\t3. EXIT  "+reset);
			System.out.print(fyellow+thick);
			int n=Integer.parseInt(sc.nextLine());
			System.out.print(reset);
			if(n==1)
			{
				signup();
				break;
			}
			else if(n==2)
			{
				loginprocess();
				break;
			}
			else if(n==3)
			{
				break;
			}
			else
			{
				System.out.println(fyellow+change+thick+"\n\t\t\tINVALID INPUT"+reset);
			}
		}
	}
	static void signup()
	{
		System.out.println(fred+thick+underline+"Enter New user_name and password:"+reset);
		System.out.print("\tuser_name:");
		System.out.print(fyellow+thick);
		u=sc.nextLine();
		System.out.print(reset+"\tpassword:"+fyellow+thick);
		p=sc.nextLine();
		System.out.print(reset+fred+thick+underline+"\nPLEASE ENTER NEW PHONE NUMBER:"+reset);
		System.out.print(fyellow+thick);
		ph=sc.nextLine();
		System.out.print(reset);
		String z=String.valueOf(ph.length());
		while(true)
		{
			if(z.equals("10"))
			{
				y.setu(u);y.setp(p);y.setph(ph);
				System.out.println(fred+thick+"\t\t\t\tPLEASE WAIT WHILE GENERATING OTP....."+reset);
				sleep(1700);
		  		while(true)
		  		{
					int otp=1000+(int)(Math.random()*8999);
					System.out.print(fgreen+thick+"\t\t\t\tYOUR OTP IS:"+reset+"  ");
					sleep(200);
					String otp1=String.valueOf(otp);
					int len=otp1.length();
					for(int i=0;i<len;i++)
					{
						System.out.print(change+thick+otp1.charAt(i));
						sleep(800);
					}
					System.out.println(reset);
					System.out.print(fblue+thick+"Enter your otp:"+reset);
					System.out.print(fyellow+thick);
					int x=Integer.parseInt(sc.nextLine());
					System.out.print(reset);
					if(x==otp)
					{
						System.out.println(fgreen+thick+"\n\t\t\t\t\tOTP MATCHED"+reset+"\n");
						sleep(500);
						String intro="ACCOUNT SUCCESSFULLY CREATED";
						for(int i=0;i<=intro.length()-1;i++)
						{
							if(i==0)
							System.out.print("\t\t\t\t\t");
							System.out.print(thick+change+underline+intro.charAt(i));
							sleep(50);
						}
						System.out.print(reset);
						break;
					}
					else
					{
						System.out.println(fred+"\t\t\tOTP NOT MATCHED\n"+reset);
						sleep(500);
						System.out.println(fred+thick+"\t\t\t\tPLEASE WAIT WHILE RE-GENERATED OTP....."+reset);
						sleep(1700);
					}
		   		}	
				break;
			}
		     	else
		     	{
				System.out.println(fred+"\n\t\t\tINVALID PHONE NUMBER:");
				System.out.println(fgreen+"\t\t\tPHONE NUMBER MUST BE CONTAIN :   "+reset+thick+"10"+fgreen+"  DIGITS"+reset);
				System.out.print(fcyan+thick+"\n\n\t\t\tPLEASE ENTER VALID PHONE NUMBER:   "+reset);
				System.out.print(fyellow);
				ph=sc.nextLine();
				System.out.print(reset);
				z=String.valueOf(ph.length());
			}
		}
		System.out.println(reset);
		sleep(500);
		System.out.println(fyellow+change+thick+"\n\t\t\t PRESS:1"+reset+fyellow+thick+" --> See your account credentials."+reset);
		System.out.println(fyellow+change+thick+"\n\t\t\t PRESS:2"+reset+fyellow+thick+" --> For login."+reset);
		System.out.print(fyellow+thick);
		while(true)
		{
			int s=Integer.parseInt(sc.nextLine());
			System.out.print(reset);
			if(s==1)
			{
				System.out.println(underline+fviolet+"\t\t\t USER_NAME:  "+reset+fyellow+change+y.getu()+reset+underline+fviolet+"\t\t"+"PASSWORD: "+reset+fyellow+change+y.getp()+reset+underline+fviolet+"\t\tPHONE:"+reset+fyellow+change+y.getph()+reset);
				System.out.println();
				System.out.println();
				System.out.println(fred+" 1 Login "+reset);
				System.out.println();
				System.out.println();
				System.out.println(fgreen+" 2 Exit"+reset);
				while(true)
				{
					int A = Integer.parseInt(sc.nextLine());
					if(A==1)
					{
						loginprocess();
						break;
					}
					else if(A==2)
					{
						da=1;	
						break;
					}
					else
					{
						System.out.println(fred+"\t\t\t\tINVALID INPUT"+reset);
					}
				}
				break;
			}
			else if(s==2)
			{
				loginprocess();
				break;
			}
			else
			{
				System.out.println(fred+"\t\t\t\tINVALID INPUT"+reset);
				System.out.println(fgreen+"\t\t\t\tPLEASE ENTER CORRECT OPTION"+reset);
			}
		}
	}
}










class MultiBook Console
{	
	public static void main(String args[])
	{
		System.out.println(cv.yellow+"\n\n \t\t\t\t\t\t  M U L T I B O O K    C O N S O L E  \n\n"+cv.reset);
		
		project.M1();
		if(project.va>0 && project.da!=1)
		{
			Display.display();
		}
		else
		{	
			System.out.println(cv.red+"\t\t\t\t\t\t\t  You are not Login to the MULTIBOOK CONSOLE "+cv.reset);
		}
		System.out.println();
		System.out.println();
		System.out.println(cv.yellow+cv.blink+"\t\t\t\t\t\t   T H A N K I N G    Y O U    V I S I T    A G A I N "+cv.reset);
	}
}		