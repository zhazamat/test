public class Client {
 private   String name;
 private  String email;

 private Cart cart;
 public Client() {

 }

 public Cart getCart() {
  return cart;
 }

 public void setCart(Cart cart) {
  this.cart = cart;
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }


}
