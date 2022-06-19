
/**
 * Create a class called BankAccount. It should have the following properties: 
1. Two instance/state variables: 
a. double balance… This is how much money is currently in the account. 
b. name…The name of the person owning the account. 
2. Constructor should accept two parameters. 
a. One should be a double variable that is used to initialize the state variable, balance. 
b. The other should be a String that is used to initialize the state variable, name. 
3. Three methods: 
a. deposit…returns nothing…accepts a double that is the amount of money being deposited. 
It is added to the balance to produce a new balance. 
b. withdraw…returns nothing…accepts a double that is the amount of money being taken out of the account. 
It is subtracted from the balance to produce a new balance. 
c. create a method to print out the objects information. 
You could make a new method like printInfo() or override the existing toString() method to print the object.



Next, create a Tester class that has a main( ) method. 
In that method you should input from the keyboard the amount (1000) of money initially to be put
 into the account (via the constructor) along with the name of the person to whom the account belongs. 
 
1. Use these two pieces of data to create a new BankAccount object called myAccount. 
2. Call the deposit method to deposit $505.22. 
3. Print the balance instance variable. 
4. Call the withdraw method to withdraw $100. 
5. Print the remaining balance in this form: 

Example:
What is your name? Sally Jones
What is your initial deposit? 1000
Sally Jones account balance $1000
Would you like to deposit, withdraw or quit? (d, w or q) d
How much? 505.22
Sally Jones account balance $1505.22
Would you like to deposit, withdraw or quit? (d, w or q) w
How much? 100
Sally Jones account balance $1405.22
Would you like to deposit, withdraw or quit? (d, w or q) q
Have a nice day Sally Jones.


 * Larry Tsai
 * 28OCT2019
 */
public class BankAccount
{
    
    private double balance;
private String name;
public BankAccount(){
    name="Larry";
    
  
   
}
 public BankAccount(String name, double balance)
    {
       this.name=name;
    this.balance=balance;
    }
public void balance(double deposit, double withdraw){
   balance+=deposit;
   balance-=withdraw;
}

      public String toString()
    
    {
       return (name+ " account balance: " +balance);
    }
       

}
