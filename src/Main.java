import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Product[]products=new Product[5];
       products[0]=new Product(1,"Milk",68.0,15);
        products[1]=new Product(2,"Meat",680.0,20);
        products[2]=new Product(3,"Banana",120.0,0);
        products[3]=new Product(4,"Onion",30.0,15);
        products[4]=new Product(5,"Rise",160.0,0);
        for(Product product:products){
            System.out.println(" | "+
            product.getName()+"      |  "+
            product.getPrice()+"  |   "+
            product.getDiscount());
        }
        ClientProduct clientProduct0=new ClientProduct();
        clientProduct0.setProduct(products[0]);
        clientProduct0.setQuantity(3.);

        ClientProduct clientProduct1=new ClientProduct();
       clientProduct1.setProduct(products[1]);
        clientProduct1.setQuantity(3.);

        ClientProduct clientProduct2=new ClientProduct();
      clientProduct2.setProduct(products[2]);
        clientProduct2.setQuantity(4.);

        ClientProduct clientProduct3=new ClientProduct();
        clientProduct3.setProduct(products[3]);
        clientProduct3.setQuantity(1.);

        ClientProduct clientProduct4=new ClientProduct();
        clientProduct4.setProduct(products[4]);
        clientProduct4.setQuantity(3.5);
        Cart cart=new Cart();

        Client client1=new Client();
        client1.setName("AA");
        client1.setEmail("aa@gmail.com");
        client1.setCart(cart);
        Client client2=new Client();
        client2.setName("BB");
        client2.setEmail("bb@gmail.com");
        client2.setCart(cart);
        Client client3=new Client();
        client3.setName("CC");
        client3.setEmail("cc@gmail.com");
        client3.setCart(cart);
        System.out.println(client1.getName()+" "+client1.getEmail()+" "+client1.getCart());


        ClientProduct []clientProducts=new ClientProduct[5];
        cart.setClientProducts(clientProducts);
        clientProducts[0]=clientProduct0;
        clientProducts[1]=clientProduct1;
        clientProducts[2]=clientProduct2;
        clientProducts[3]=clientProduct3;
        clientProducts[4]=clientProduct4;

        for(ClientProduct clientProduct:clientProducts){
            System.out.println("|Product Name: "+clientProduct.getProduct().getName()+
                    "  |Price: "+clientProduct.getProduct().getPrice()+
                    "  |Discount: "+clientProduct.getProduct().getDiscount()+
                    "%  |Quantity: "+clientProduct.getQuantity()+
                    "  |  Amount:"+Math.round(clientProduct.getAmount()));
        }



    }
}
