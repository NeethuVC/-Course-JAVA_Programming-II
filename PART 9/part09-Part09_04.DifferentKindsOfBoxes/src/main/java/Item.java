
public class Item {

    private String name;
    private int weight;

    public Item(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public Item(String name) {
        this(name, 0);
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }
   public boolean equals(Object compared) {
        // if the variables are located in the same position, they are equal
        if (this == compared) {
            return true;
        }

        // if the type of the compared object is not SimpleDate, the objects are not equal
        if (!(compared instanceof Item)) {
            return false;
        }

        // convert the Object type compared object
        // into a SimpleDate type object called comparedSimpleDate
        Item comparedSimpleDate = (Item) compared;

        // if the values of the object variables are the same, the objects are equal
        if (this.name.equals(comparedSimpleDate.getName())) {
            return true;
        }

        // otherwise the objects are not equal
        return false;
    }
   public int hashCode(){
       return name.hashCode();
   }

}
