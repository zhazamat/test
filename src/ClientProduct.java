public class ClientProduct {
    private Double quantity;
    private  Double amount;
    private  Product product;

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double getQuantity() {

        return quantity;
    }
    public Double getSum() {
        amount=(product.getPrice()*getQuantity());
        return amount;
    }

    public Double getAmount() {
        if(product.getDiscount()!=0)
        {
            amount=getSum()-getSumDiscount();
        }
        else amount=getSum();
        return amount;
    }
    public Double getSumDiscount(){
        amount=product.getPrice()* (product.getDiscount()*0.01)*getQuantity();
        return  amount;
    }


    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }





}
