package ListITEM;

/**
 * Created by gardenia on 2/17/2018.
 */

public class ListItem {
    private String name;
    private String familyName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    public ListItem(String name, String familyName) {
        this.name = name;
        this.familyName = familyName;

    }

    public ListItem() {
    }
}
