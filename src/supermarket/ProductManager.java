/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket;

/**
 *
 * @author Group1
 */
public class ProductManager implements Supermarket{
    private String id,name,qty,price,cat;
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }
    
    
   
    public ProductManager() {
    }

    public  ProductManager(String id, String name, String qty, String price,String cat) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price=price;
        this.cat=cat;
    }
}
