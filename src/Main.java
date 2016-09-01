
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        ArrayList<Phototechnique> photoCollection = new ArrayList<>(100);
        Menu menu = new Menu();
        menu.printMenu();
        Scanner in = new Scanner(System.in);
        int option =0;
        while (option==0){
            try {

                option = in.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Введите корректный номер пункта меню");
                in.nextLine();
            }
        }

        switch (option) {
            case 1:
                //menu.add

            case 2:
                //menu.rewrite
            case 3:
                // menu.dell

            case 4:
                //menu.print
        }

//        photoCollection.add(new Camera("olimpus", 25.0, 3, 2));
//                for (Phototechnique count : photoCollection){
//            count.PrintPhotoObject();
        }

    }




