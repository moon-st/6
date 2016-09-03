import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Admin on 24.07.2016.
 */
public class Phototechnique {
    private String manufacturer;
    private double price;


    Phototechnique(String m, double pr){
        manufacturer = m;
        price = pr;
    }

    Phototechnique(){
        manufacturer = "";
        price = 0;
    }
    public void SetManufacturer(String m){
        manufacturer = m;
    }
    public void SetPrice(double pr){
        price = pr;
    }
    public double GetPrice(){
    return price;
    }
    public String GetManufacturer(){
        return manufacturer;
    }
    public void PrintPhotoObject(){
        System.out.println("Производитель: "+ manufacturer);
        System.out.println("Цена: "+ price);
    }
    public void SetPhotoObject(){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите производителя:");
        manufacturer = in.nextLine();
        System.out.println("Введите цену");
        while (price<=0){
            if (price<0) System.out.println("Введите цену корректно");
            try {
                price = Integer.parseInt(in.nextLine());
            }catch (NumberFormatException e){
                System.out.println("Введите цену корректно");
            }

    }}



}
