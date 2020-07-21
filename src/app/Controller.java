//=============================================================================
// PROGRAMMER: Jacob Williams  
// PANTHER ID: 6182345
//
// CLASS: COP3337
// SECTION: RVDC
// SEMESTER: Summer 2020
// CLASSTIME: Online
//
// Project: Project 2
// DUE: June 22nd, 2020 @ 11:59 p.m.
//
// CERTIFICATION: I understand FIU’s academic policies, and I certify that this work is my 
//                own and that none of it is the work of any other person.
//=============================================================================

/*
Remember, I will not except late assignments. So please check the due date of the assignment.
IMPORTANT, you must have the File Header shown below with your information entered on the 
file at contains the project main method. If you do not have this header with your 
information, I will take 40% off your assignment grade.
*/


package app;

import entities.Item;
import entities.Logger;
import entities.Person;
import java.util.ArrayList;
import java.util.Random;
import payments.Cash;
import payments.SecureCash;
import payments.credit.CreditCard;
import payments.credit.MasterCard;
import payments.credit.MasterRewards;
import reports.Reporter;
import transactions.SecureTransaction;



public class Controller {

   
    public static void main(String[] args) {
        
System.out.println("//////////////////////////////////////////////");    
System.out.println("Section 1");       
System.out.println("//////////////////////////////////////////////");  

// STEP 1


       // create four items instance 
       // with the following data
       
/*
       item 1  data -> "Mitutoyo 513-403-10E", 
                       "DIAL TEST INDICATOR, BASIC SET, STANDARD, .008 IN, . 0001 IN GRAD, WHITE DIAL ",
                       139.16

       item 2 data -> "Garmin Forerunner 935",
                      "Premium GPS running/triathlon watch with wrist-based heart rate ",
                      284.49
       

       
       item 3 data -> "CROC Classic Clog",
                      "Iconic clog that started a comfort revolution around the world",
                      40.99
       
       item4 data -> "Adidas Ultra Boost PB",
                     "Offers a plush, yet bouncy ride with an updated upper is built for speed.",
                     105.95
       
       item5 data -> "Macbook Pro 13",
                     "1.4GHz quad-core 8th-generation Intel Core i5 processor",
                     1399.00
*/
       
       // YOUR CODE HERE
       Item item1 = new Item("Mitutoyo 513-403-10E", 
                             "DIAL TEST INDICATOR, BASIC SET, STANDARD, .008 IN, . 0001 IN GRAD, WHITE DIAL ",
                             139.16);
       Item item2 = new Item("Garmin Forerunner 935",
                             "Premium GPS running/triathlon watch with wrist-based heart rate ",
                             284.49);
       Item item3 = new Item("CROC Classic Clog",
                             "Iconic clog that started a comfort revolution around the world",
                             40.99);
       Item item4 = new Item("Adidas Ultra Boost PB",
                             "Offers a plush, yet bouncy ride with an updated upper is built for speed.",
                             105.95);
       Item item5 = new Item("Macbook Pro 13",
                             "1.4GHz quad-core 8th-generation Intel Core i5 processor",
                             1399.00);
      
       

        
      
       
       // create 3 person instances 
       // with the following data
/*       
        person1 -> "Ava", "Davis", "704 Brickell Ave", "Superman", 760       
        person2 -> "John", "Smith", "340 S.W. 13 Street", "myPassword123", 680
        person3 -> "Bill", "Johnson", "100 Ocean Dr. S.W. ", "Mom12345", 530
*/    
        // do you have passwords like this ..... :)

 
       // YOUR CODE HERE
       Person person1 = new Person("Ava", 
                                   "Davis", 
                                   "704 Brickell Ave", 
                                   "Superman", 
                                   760);
       Person person2 = new Person("John", 
                                   "Smith", 
                                   "340 S.W. 13 Street", 
                                   "myPassword123", 
                                   680);
       Person person3 = new Person("Bill", 
                                   "Johnson", 
                                   "100 Ocean Dr. S.W. ", 
                                   "Mom12345", 
                                   530);
       
     
System.out.println("");
System.out.println("//////////////////////////////////////////////");    
System.out.println("Section 2");       
System.out.println("//////////////////////////////////////////////");  


// GOTO THE MASTERCARD CLASS AND WRITE THE CODE FOR SECTION 2.1 FIRST
      
        
       // Setting up Ava's wallet
       // Create cash instance for Ava -> person1 with $400
       // make sure that you wrote section 2.1 code before write this code
       // YOUR CODE HERE
       
       Cash cash1 = new Cash(person1,400.00);

       // Create Master Card instance for Ava -> person1 with credit limit of $3500
       // YOUR CODE HERE
       MasterCard masterCard1 = new MasterCard(person1,3500.00);
  
       // add the cash and master card instance to Ava's wallet
       // YOUR CODE HERE
       person1.getWallet().add(cash1);
       person1.getWallet().add(masterCard1);
        

       // runner a financial report on Ava
       //YOUR CODE HERE
       person1.financialReport();
   
        

       // Setting up John's wallet
       // Create cash instance for John -> person2 with $400
       // Create Master Card instance for John -> person2 with credit limit $500
       // Create Master Reward instance for John -> person2 with credit limit $1500
       // YOUR CODE HERE
       Cash cash2 = new Cash(person2, 400.00);
       
       MasterCard masterCard2 = new MasterCard(person2, 500.00);
       
       MasterRewards masterRewards1 = new MasterRewards(person2, 1500.00);
       
       // add the cash, master card and master reward instance to John's wallet
       // YOUR CODE HERE
       person2.getWallet().add(cash2);
       person2.getWallet().add(masterCard2);
       person2.getWallet().add(masterRewards1);
       
       
       // runner a financial report on John
       //YOUR CODE HERE
       person2.financialReport();
       
        
        // Setting up Bill's wallet
       // Create secure cash instance for Bill -> person3 with $1000
       // Create Master Card instance for Bill -> person3 with credit limit $1000
       // Create Master Reward instance for Bill -> person3 with credit limit $1500
       // YOUR CODE HERE
       SecureCash secureCash1 = new SecureCash(person3, 1000.00);
       
       MasterCard masterCard3 = new MasterCard(person3, 1000.00);
       
       MasterRewards masterRewards2 = new MasterRewards(person3, 1500.00);
       
       
        // add the secure cash, master card and master reward instance to Bill's wallet
       // YOUR CODE HERE
       person3.getWallet().add(secureCash1);
       person3.getWallet().add(masterCard3);
       person3.getWallet().add(masterRewards2);
   
       
       // runner a financial report on Bill
       //YOUR CODE HERE
       person3.financialReport();


       
       
       
    
System.out.println("");
System.out.println("//////////////////////////////////////////////");    
System.out.println("Section 3.0");       
System.out.println("//////////////////////////////////////////////");  

// GOTO THE MasterCard.java file write the code for Section 3.1




System.out.println("");
System.out.println("//////////////////////////////////////////////");    
System.out.println("Section 3.2");       
System.out.println("//////////////////////////////////////////////");  
        
            // call the infoReport method on Ava's mastercard
            // YOUR CODE HERE
           masterCard1.infoReport();
            
            // call the infoReport method on John's mastercard
            // YOUR CODE HERE
           masterCard2.infoReport();
            
            // call the infoReport method on Bill's master rewards
            // YOUR CODE HERE
           masterRewards2.infoReport();
           
            

            
            

System.out.println("");
System.out.println("//////////////////////////////////////////////");     
System.out.println("Section 4");       
System.out.println("//////////////////////////////////////////////");  


        //=========================================================
        // people buying stuff
        //=========================================================
        
        System.out.println("\n");
        System.out.println("---------------------------------------------");
        System.out.println(person1.getFirstName() + " " + person1.getLastName() + " buying");
        System.out.println("---------------------------------------------");
        // buying items
        // Ava is buying stuff
        // use the makePurchase method for the following
        // Use Ava's master card to buy item1
        // Use Ava's master card to buy item2
        // Use Ava's cash to buy item2
        
       // YOUR CODE HERE
       makePurchase(masterCard1,item1);
       makePurchase(masterCard1,item2);
       makePurchase(cash1,item2);
       
        
       
        // look at this difference here
        // finish the code below for Ava to buy item5 using her master card
        // MAKE USE YOU GOT THE RIGHT CARD I WILL CHECK THIS
        // COMPLETED CODE BELOW
        
        ((MasterCard)person1.getWallet().get(1)).makePurchase(item5);
        
        
         // run the person financial report on Ava
         // YOUR CODE HERE
         person1.financialReport();
  
       



        System.out.println("\n");
        System.out.println("---------------------------------------------");
        System.out.println(person2.getFirstName() + " " + person2.getLastName() + " buying");
        System.out.println("---------------------------------------------");
       
        // buying items
        // John is buying stuff
        // use the makePurchase method for the following
        // Use John's master card to buy item1
        // Use John's master card to buy item2
        // Use John's master card to buy item3
        // Use John's master card to buy item4
        

        // YOUR CODE HERE
        makePurchase(masterCard2,item1);
        makePurchase(masterCard2,item2);
        makePurchase(masterCard2,item3);
        makePurchase(masterCard2,item4);
        // Use John's cash to buy item2
        // YOUR CODE HERE
        makePurchase(cash2,item2);
        // Use John's master rewards to buy item1
        // Use John's master rewards to buy item2
        // Use John's master rewards to buy item3
        // Use John's master rewards to buy item4
        // Use John's master rewards to buy item5
        // YOUR CODE HERE
        makePurchase(masterRewards1,item1);
        makePurchase(masterRewards1,item2);
        makePurchase(masterRewards1,item3);
        makePurchase(masterRewards1,item4);
        makePurchase(masterRewards1,item5);

        
        // look at this difference here
        // finish the code below for John to buy item1 using her master rewards
        // MAKE USE YOU GOT THE RIGHT CARD I WILL CHECK THIS
        // COMPLETED CODE BELOW

        ((MasterRewards)person2.getWallet().get(2)).makePurchase(item1);
        
         // run the person financial report on John
         // YOUR CODE HERE
         person2.financialReport();
        
        
        
        System.out.println("\n");
        System.out.println("---------------------------------------------");
        System.out.println(person3.getFirstName() + " " + person3.getLastName() + " buying");
        System.out.println("---------------------------------------------");
        
         // buying items
        // Bill is buying stuff
        // use the makePurchase method for the following
        // Use Bill's secure cash to buy item1
        // Use Bill's secure cash to buy item2
        // Use Bill's secure cash to buy item5
        // YOUR CODE HERE
        makePurchase(secureCash1,item1);
        makePurchase(secureCash1,item2);
        makePurchase(secureCash1,item5);
        // Use Bill's master card to buy item4
        // YOUR CODE HERE
        makePurchase(masterCard3,item4);

        // Use Bill's master rewards to buy item3
        // YOUR CODE HERE        
        makePurchase(masterRewards2,item3);
       

        // run the person financial report on Bill
        // YOUR CODE HERE
        person3.financialReport();




System.out.println("");
System.out.println("//////////////////////////////////////////////");     
System.out.println("Section 5");       
System.out.println("//////////////////////////////////////////////");          


        //Class Static Info
        System.out.println("");
        System.out.println("---------------------------------------------------");
        System.out.println("Class Statics");
        System.out.println("---------------------------------------------------");
        
        // complete the system.out.println code to get the right output
        // DO NOT CHANGE THE ACCESS MODIFIER OF THE VARAIBLE IN THE CLASS
        // IF YOU DO THIS YOU WILL GET POINTS TAKEN OFF
        // hint: you may need to add method to the some classes... 
        //       you need figure out which classes. Also you may need to add some 
        //       code to some contsructors
        // COMPLETE CODE BELOW 
              
        System.out.println("Number of Person in System:\t\t\t" + Person.getPersonCount());
        System.out.println("Number of all Cash type transactions:\t\t" + Cash.getCashTransactionCount());
        System.out.println("Number of all Credit Card type transactions:\t" + MasterCard.getCreditTransactionCount());
        System.out.println("---------------------------------------------------");
 
 


System.out.println("");
System.out.println("//////////////////////////////////////////////");     
System.out.println("Section 6");       
System.out.println("//////////////////////////////////////////////");  


        System.out.println("\n\n");
        System.out.println("---------------------------------------------------");
        System.out.println("Logger Data");
        System.out.println("---------------------------------------------------");
        
        // I wish to ssee all the messages store in the logger 
        // write the code to do this
        // HINT: create an Logger  instance and use it
        // YOUR CODE HERE
        Logger logger1 = new Logger();
        logger1.runReports();

        System.out.println("---------------------------------------------------");
     



System.out.println("");
System.out.println("//////////////////////////////////////////////");     
System.out.println("Section 7");       
System.out.println("//////////////////////////////////////////////");    


        // USING Interfaces
        System.out.println("\n\n\n");
        System.out.println("---------------------------------------------------");
        System.out.println("REPORTER INTERFACE");
        System.out.println("---------------------------------------------------");
        
        // Here you are working with interfaces.... 
        // PAY ATTENTION TO TYPES OF AN OBJECT
        // ask yourself the question what are all types the object you are
        // working with can be
        
        
        // processReport is in this class
        // run the process report with Ava (person1)
        // run the process report with the logger object
        // run the process report with Bill's secure cash object
        // run the process report with Ava's master card object
        
        
        // YOU WILL NEED TO ADD CODE THE NEED CLASSES IN THIS STEP TO MAKE IT WORK
        // YOU NEED FIGURE OUT WHICH CLASSES 
        // Hint: look at the UML Diagrams
        // YOUR CODE HERE
        processReports((Reporter)person1);
        processReports((Reporter)logger1);
        processReports((Reporter)secureCash1);
        processReports((Reporter)masterCard1);
      



System.out.println("");
System.out.println("//////////////////////////////////////////////");     
System.out.println("Section 8");       
System.out.println("//////////////////////////////////////////////");          


        System.out.println("\n\n\n");
        System.out.println("---------------------------------------------------");
        System.out.println("SECURE INTERFACE");
        System.out.println("---------------------------------------------------");
        
        // PAY ATTENTION TO TYPES OF AN OBJECT
        // ask yourself the question what are all types the object you are
        // working with can be
        
        // processSecureTransaction is in this class <- Changed here
        // run the processSecureTransaction with Ava's master card object <- Changed here
        // run the processSecureTransactionwith BILL's secure cash object <- Changed here

        // YOUR CODE HERE 
        processSecureTransaction((SecureTransaction)masterCard1);
        processSecureTransaction((SecureTransaction)secureCash1);
        
   


    }// end main()
    
    //----------------------------------------
    // class methods 
    //----------------------------------------  
    
    public static void processReports(Reporter reporter){
        
        // how is this working
        // which object type is excuting this
        // which code is running
        // important you will be tested on this understanding
        reporter.runReports();
           
    }
    
    public static void processSecureTransaction(SecureTransaction secureTransaction){
        
        // how is this working
        // which object type is excuting this
        // which code is running
        // important you will be tested on this understanding
        
        //
        String pin = secureTransaction.generateTransactionSecret();
        
        
        if(secureTransaction instanceof CreditCard){
            String firstName = ((CreditCard)secureTransaction).getCardHolder().getFirstName();
            String lastName = ((CreditCard)secureTransaction).getCardHolder().getLastName();
            
            System.out.println(firstName + " " + lastName + " (MASTER CARD)  secure transaction pin:"  + pin);
            
        }else if(secureTransaction instanceof SecureCash){
            String firstName = ((SecureCash)secureTransaction).getPerson().getFirstName();  
            String lastName = ((SecureCash)secureTransaction).getPerson().getLastName();
            
            System.out.println(firstName + " " + lastName + " (SECURE CASH) secure  transaction pin:"  + pin);
        }//end if-else
           
    }
    
    
    public static void makePurchase(CreditCard creditCard, Item item){
        
            // how is this working
            // which object type is excuting this
            // which code is running
            // important you will be tested on this understanding
            creditCard.makePurchase(item);  
    }
    
    public static void makePurchase(Cash cash, Item item){
        
            // how is this working
            // which object type is excuting this
            // which code is running
            // important you will be tested on this understanding
            cash.makePurchase(item);  
    }
    
     public static void makePurchase(Object obj, Item item){
        
            // how is this working
            // which object type is excuting this
            // which code is running
            // important you will be tested on this understanding
            if(obj instanceof CreditCard){
                ((CreditCard)obj).makePurchase(item); 
            }else if (obj instanceof Cash){
                ((Cash)obj).makePurchase(item);
            }//end if-else            
    }

    
}//end class
