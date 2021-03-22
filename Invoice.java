package InvoiceTest;


 class Invoice {
     private String partnumber, description;
     private int quantity;
     private double price;
     
     public void setPartnumber(String partnumber){
         this.partnumber=partnumber;
     }
     public String getPartnumber(){
         return partnumber;
     }
     public void setDescription(String description){
         this.description=description;
     }
     public String getDescription(){
         return description;
     }
     public void setQuantity(int quantity){
         if(quantity>0){
             this.quantity=quantity;
         }
         if(quantity<0){
             quantity=0;
             this.quantity=quantity;
         }
     }
     public int getQuantity(){
         return quantity;
     }
     public void setPrice(double price){
         if(price>0){
             this.price=price;
         }
         if(price<0){
             price=0.0;
             this.price=price;
         }
     }
     public double getPrice(){
         return price;
     }

    }
