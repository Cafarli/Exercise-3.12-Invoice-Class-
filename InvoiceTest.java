package InvoiceTest;
import java.util.Scanner;

public class InvoiceTest {
    public static void main(String[] args) {
        
        
        Invoice Invoice1 = new Invoice("I000001", "Part Number 1", 5, 6.78);
        Invoice Invoice2 = new Invoice("I000002", "Part Number 2", 12, 9.56);
        
        System.out.printf("Invoice’s capabilities: partnumber: %s\n,  description: %s\n,  quantity: %s\n,  price: %s\n",
                Invoice1.getPartnumber(), Invoice1.getDescription(), Invoice1.getQuantity(), Invoice1.getPrice());
        getInvoiceAmount(Invoice1.getQuantity(),Invoice1.getPrice());
        System.out.printf("Invoice’s capabilities: partnumber: %s\n,  description: %s\n,  quantity: %s\n,  price: %s\n",
                Invoice2.getPartnumber(), Invoice2.getDescription(), Invoice2.getQuantity(), Invoice2.getPrice());
        getInvoiceAmount(Invoice2.getQuantity(),Invoice2.getPrice());
        
    }
        private static void getInvoiceAmount(int quantitynum,double value){
        double amount=quantitynum*value;
        System.out.println("Amount : "+amount);
        }
    }
