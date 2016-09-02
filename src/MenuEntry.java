/**
 * Created by Admin on 02.09.2016.
 */
public abstract class MenuEntry {
    private String title;
    public MenuEntry(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public abstract void run();
}
