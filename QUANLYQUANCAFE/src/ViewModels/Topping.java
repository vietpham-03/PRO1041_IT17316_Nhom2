/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ViewModels;

/**
 *
 * @author Admin
 */
public class Topping {

    private String id;
    private String topping;
    private double gia;

    public Topping() {
    }

    public Topping(String topping) {
        this.topping = topping;
    }

    public Topping(String id, String topping, double gia) {
        this.id = id;
        this.topping = topping;
        this.gia = gia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTopping() {
        return topping;
    }

    public void setTopping(String topping) {
        this.topping = topping;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "ToppingModel{" + "id=" + id + ", topping=" + topping + ", gia=" + gia + '}';
    }
}
