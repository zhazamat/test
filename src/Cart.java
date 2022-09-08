public class Cart {

    private ClientProduct []clientProducts;

    public void getClientProducts() {

        for(ClientProduct clientProduct:clientProducts){
            System.out.println(clientProduct.getProduct().getName()+" "+ clientProduct.getProduct().getPrice()+" "+clientProduct.getProduct().getDiscount()+" "+clientProduct.getQuantity()+" | Amount without discount: "+ clientProduct.getSum()+" | Amount discount: "+ clientProduct.getSumDiscount()+" | Amount with discount: "+clientProduct.getAmount());
        }

    }

    public void setClientProducts(ClientProduct[] clientProducts) {
        this.clientProducts = clientProducts;
    }




}
