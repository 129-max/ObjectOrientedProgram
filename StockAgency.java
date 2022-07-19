import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;

import java.io.IOException;


public class StockAgency {
        static int ch=0;
        public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException, ClassNotFoundException {
            System.out.println("----welcome to Stock Agency--------");
            do {
                System.out.println("1: Create an Account");
                System.out.println("2: Buy a Stock");
                System.out.println("3: Sell the Stock");
                System.out.println("4: print the list of company and person");
                int choice=ObjectOrientedProgram.readInteger();
                switch(choice){
                    case 1:{
                        StockCompanyShare.creatAccount();
                        break;
                    }
                    case 2:{
                        StockCompanyShare.buyStock();
                        break;
                    }

                    case 3:{
                        StockCompanyShare.buyStock();
                        break;}

                    case 4:
                    {
                        CompanyStock.displayStock();
                        CompanyStock.displayStock1();
                    }

                    default:
                        System.out.println("Pls enter proper choice");


                }ch++;}while(ch<100);}

    private static class ObjectOrientedProgram {
        public static int readInteger() {
            return 0;
        }
    }
}

