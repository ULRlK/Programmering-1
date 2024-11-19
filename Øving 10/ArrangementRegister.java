
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;


public class ArrangementRegister {
    private ArrayList<Arrangement> arrangementer = new ArrayList<>();

    public ArrangementRegister(Arrangement arrangement) {
        this.arrangementer.add(arrangement);
    }

    public ArrangementRegister(ArrayList<Arrangement> arrangementer) {
        for (Arrangement arrangement : arrangementer) {
            if (arrangementer.stream().anyMatch(arr -> arr.getNumber() == arrangement.getNumber() && !arrangement.toString().equals(arr.toString()))) {
                throw new IllegalArgumentException("Arrangement with number " + arrangement.getNumber() + " already exists");
            }
        }
        this.arrangementer = arrangementer;
    }

    public void addArrangement(Arrangement newArrangement) {
        if(this.arrangementer.stream().anyMatch(arr -> arr.getNumber() == newArrangement.getNumber())) {
            throw new IllegalArgumentException("Arrangement with number " + newArrangement.getNumber() + " already exists");
        }
        this.arrangementer.add(newArrangement);

    }

    public void removeArrangement(int number) {
        for (int i = 0; i < this.arrangementer.size(); i++) {
            if (this.arrangementer.get(i).getNumber() == number) {
                this.arrangementer.remove(i);
            }
        }
    }

    public ArrayList<Arrangement> getArrangementer() {
        return this.arrangementer;
    }

    public ArrangementRegister getArrangementPlace(String place) {
        ArrayList<Arrangement> arrangementList = new ArrayList<>();
        for (int i = 0; i < this.arrangementer.size(); i++) {
            if (this.arrangementer.get(i).getPlace().equals(place)) {
                arrangementList.add(this.arrangementer.get(i));
            }
        }
        return new ArrangementRegister(arrangementList);
    }

    public ArrangementRegister getArrangementOrganizer(String organizer) {
        ArrayList<Arrangement> arrangementList = new ArrayList<>();
        for (int i = 0; i < this.arrangementer.size(); i++) {
            if (this.arrangementer.get(i).getOrganizer().equals(organizer)) {
                arrangementList.add(this.arrangementer.get(i));
            }
        }
        return new ArrangementRegister(arrangementList);
    }

    public ArrangementRegister getArrangementType(String type) {
        ArrayList<Arrangement> arrangementList = new ArrayList<>();
        for (int i = 0; i < this.arrangementer.size(); i++) {
            if (this.arrangementer.get(i).getType().equals(type)) {
                arrangementList.add(this.arrangementer.get(i));
            }
        }
        return new ArrangementRegister(arrangementList);
    }

    public ArrangementRegister getArrangementTime(BigInteger timeFrom, BigInteger timeTo) {
        ArrayList<Arrangement> arrangementList = new ArrayList<>();
        for (int i = 0; i < this.arrangementer.size(); i++) {
            if (this.arrangementer.get(i).getTime().compareTo(timeFrom) > 0 && this.arrangementer.get(i).getTime().compareTo(timeTo) < 0) {
                arrangementList.add(this.arrangementer.get(i));
            }
        }
        return new ArrangementRegister(arrangementList);
    }

    public void sortArrangementsByPlace() {
        arrangementer.sort(Comparator.comparing(Arrangement::getPlace, String.CASE_INSENSITIVE_ORDER));
    }

    public void sortArrangementsByType() {
        arrangementer.sort(Comparator.comparing(Arrangement::getType, String.CASE_INSENSITIVE_ORDER));
    }

    public void sortArrangementsByTime() {
        arrangementer.sort(Comparator.comparing(Arrangement::getTime));
    }




}
