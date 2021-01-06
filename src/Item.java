public class Item {
    private String name;
    private String description;
   
    public Item(String name, String description) {
        super();
        this.name = name;
        this.description = description;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }
}
