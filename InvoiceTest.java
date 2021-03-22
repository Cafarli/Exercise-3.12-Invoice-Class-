package InvoiceTest;
import java.util.Scanner;

public class InvoiceTest {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        Invoice myInvoice = new Invoice();
        
        System.out.println("Enter a part number : ");
        String mypartnumber = input.next();
        myInvoice.setPartnumber(mypartnumber);
        System.out.println(); 
        
        System.out.println("Enter a part description : ");
        String mydescription = input.next();
        myInvoice.setDescription(mydescription);
        System.out.println(); 
        
        System.out.println("Enter a quantity of the item being purchased : ");
        int myquantity=input.nextInt();
        myInvoice.setQuantity(myquantity);
        System.out.println(); 

        System.out.println("Enter a price per item : ");
        double myprice = input.nextDouble();
        myInvoice.setPrice(myprice);
        System.out.println(); 
        
        System.out.println("Quantity : "+myInvoice.getQuantity());
        System.out.println("Price : "+myInvoice.getPrice());
        System.out.println("Description : "+myInvoice.getDescription());
        System.out.println("Part number : "+myInvoice.getPartnumber());
        
        getInvoiceAmount(myInvoice.getQuantity(),myInvoice.getPrice());
        
    }
        private static void getInvoiceAmount(int quantitynum,double value){
        double amount=quantitynum*value;
        System.out.println("Amount : "+amount);
        }
    }
