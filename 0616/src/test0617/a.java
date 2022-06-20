public class a {
    
    public static void main(String[] args) {
        public class TestPolymorphism{ 
            Bank BankPrint = new RbcBank();
            BankPrint.print();
        }
    
        class Bank{
            public void print() {
                System.out.println("Printing passbook for bank");
        }
        }
        
    
        class RbcBank extends Bank{
            public void print() {
               System.out.println("Printing passbook for RBC bank");
        }
    }
 
    
        // public class TestPolymorphism{            
            
        //     }
       
}
}
