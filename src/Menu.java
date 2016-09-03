import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private static final String MENU_PATTERN = "%s - %s\n";
    private List<MenuEntry> entries = new ArrayList<>();
    private boolean exit = false;
    public Menu(){
        entries.add(new MenuEntry("Выход") {
            @Override
            public void run() {
                exit = true;

            }
        });
    }
    public void run(){
        while (!exit){
            printMenu();
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            try{
                int choice = Integer.parseInt(in.readLine());
                MenuEntry entry = entries.get(choice-1);
                entry.run();

            } catch (IOException |IndexOutOfBoundsException|NumberFormatException  e) {
                System.out.println("Введите корректный номер пункта меню");
                //e.printStackTrace();
            }
        }
    }
    public Menu addEntry(MenuEntry entry){
        int id = entries.size()-1;
        entries.add(id, entry);
        return this;

    }
    public int choiceId(){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int choiceId=-1;
        System.out.println("Введите индекс элемента");
        while (choiceId<0){
        try{
            choiceId = Integer.parseInt(in.readLine());
        }catch (IOException|NumberFormatException e) {
            System.out.println("Введите корректный индекс");
    }
    }return choiceId;
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






