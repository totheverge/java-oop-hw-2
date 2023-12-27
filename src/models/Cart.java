package models;

public class Cart {

    int id;
    String shop, name;

    int[] itemPrice;

    public Cart(int id, String shop, String name, int[] itemPrice) {
        this.id = id;
        this.shop = shop;
        this.name = name;
        this.itemPrice = itemPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShop() {
        return shop;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int[] getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(int[] itemPrice) {
        this.itemPrice = itemPrice;
    }

    public void cartTotal(){
        int total = 0;
        for(int x=0;x<this.itemPrice.length;x++){
            total += this.itemPrice[x];
        }
        System.out.println(total);
    }
}
