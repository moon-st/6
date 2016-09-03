public class Main {

    public static void main(String[] args) {
        final  PhCollection phCollection = new PhCollection();
        final Menu menu = new Menu();
        menu.addEntry(new MenuEntry("Добавить фотоаппарат в коллекцию") {
            @Override
            public void run() {
            phCollection.addCamToCollection();
            }
        });
        menu.addEntry(new MenuEntry("Добавить объектив в коллекцию") {
            @Override
            public void run() {
            phCollection.addLensToCollection();
            }
        });
        menu.addEntry(new MenuEntry("Обновить эл-т по индексу") {
            @Override
            public void run() {
                int id = menu.choiceId();
                try {
                    phCollection.setItem(id);
                }catch (IndexOutOfBoundsException  e){
                    System.out.println("Элемента с таким индексом не существует");
                }

            }
        });
        menu.addEntry(new MenuEntry("Удалить эл-т по индексу") {
            @Override
            public void run() {
                int id = menu.choiceId();
                phCollection.removeItem(id);
            }
        });
//            menu.addEntry(new MenuEntry("Отсортировать по цене") {
//            @Override
//            public void run() {
//
//            }
//        });
//            menu.addEntry(new MenuEntry("Вычислить среднюю стоимость") {
//            @Override
//            public void run() {
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
        menu.addEntry(new MenuEntry("Вывести все эл-ты на экран") {
            @Override
            public void run() {
                phCollection.PrintCollection();
            }
        });
        menu.run();

        }

    }




