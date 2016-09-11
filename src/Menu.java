import java.util.List;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private static final String MENU_PATTERN = "%s - %s\n";
    private List<MenuEntry> entries = new ArrayList<>();
    private boolean exit = false;
    public Menu(){
        entries.add(new MenuEntry("Exit") {
            @Override
            public void run() {
                exit = true;

            }
        });
    }
    private void run(){
        while (!exit){
            printMenu();
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            try{
                int choice = Integer.parseInt(in.readLine());
                MenuEntry entry = entries.get(choice-1);
                entry.run();

            } catch (IOException |IndexOutOfBoundsException|IllegalArgumentException  e) {
                System.out.println("wrong input, try again");
                //e.printStackTrace();
            }
        }
    }
    public  void startApplication(Menu menu){
        final PhotoTechniqueCollection collection = new PhotoTechniqueCollection(10);

        menu.addEntry(new MenuEntry("Add element") {
            @Override
            public void run() {
                collection.add();
            }
        });
        menu.addEntry(new MenuEntry("Update element") {
            @Override
            public void run() {
                int id = getInt();
                collection.update(id);
                }

            });

        menu.addEntry(new MenuEntry("Delete element") {
            @Override
            public void run() {
                int id = getInt();
                collection.delete(id);
            }
        });
//        menu.addEntry(new MenuEntry("Sort by price") {
//            @Override
//            public void run() {
//                phCollection.sortByPrice();
//            }
//        });
//        menu.addEntry(new MenuEntry("Average price") {
//            @Override
//            public void run() {
//                System.out.println("Средняя цена:"+phCollection.averagePrice());
//
//            }
//        });
//            menu.addEntry(new MenuEntry("Загрузить из файла") {
//            @Override
//            public void run() {
//
//            }
//        });
//            menu.addEntry(new MenuEntry("Выгрузить в файл") {
//            @Override
//            public void run() {
//
//            }
//        });
        menu.addEntry(new MenuEntry("Print all") {
            @Override
            public void run() {
                collection.printAll();
            }
        });
        menu.run();


    }
    private Menu addEntry(MenuEntry entry){
        int id = entries.size()-1;
        entries.add(id, entry);
        return this;

    }
    private int getInt() {
        Scanner s = new Scanner(System.in);
        int result = Integer.parseInt(s.nextLine());
        return result;
    }

    private void printMenu(){
        StringBuffer buf = new StringBuffer();
        buf.append("\nMenu:\n");
        for (int i = 0; i < entries.size(); i++) {
            MenuEntry entry = entries.get(i);
            String entryFormatted = String.format(MENU_PATTERN, (i + 1), entry.getTitle());
            buf.append(entryFormatted);
        }
        System.out.print(buf.toString());
    }

}
