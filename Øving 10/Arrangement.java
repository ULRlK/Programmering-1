import java.math.BigInteger;

public class Arrangement {
    private int number;
    private String name;
    private String place;
    private String organizer;
    private String type;
    private BigInteger time;

    public Arrangement(int number, String name, String place, String organizer, String type, BigInteger time) {
        this.number = number;
        this.name = name;
        this.place = place;
        this.organizer = organizer;
        this.type = type;
        this.time = time;
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name;
    }

    public String getPlace() {
        return this.place;
    }

    public String getOrganizer() {
        return this.organizer;
    }

    public String getType() {
        return this.type;
    }

    public BigInteger getTime() {
        return this.time;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void setOrganizer(String organizer) {
        this.organizer = organizer;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTime(BigInteger time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Arrangement number: " + this.number + ", Name: " + this.name + ", Place: " + this.place + ", Organizer: " + this.organizer + ", Type: " + this.type + ", Time: " + this.time;
    }
    
}
