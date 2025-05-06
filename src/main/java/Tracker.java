import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private List<TrackerEntry> log = new ArrayList<>();

    //TO-DO
    public void addEntry(TrackerEntry entry) {
        log.add(entry);
    }

    //TO-DO
    public TrackerEntry getEntry() {
        return log.getLast();
    }

    public TrackerEntry getEntry(int index) {
        return log.get(index);
    }

    public boolean removeEntry(int index) {
        try {
            log.remove(index);
        } catch (Exception e) {
            System.out.println("Invalid index at " + index);
            return false;
        }
        return true;
    }

    public int getSize() {
        return log.size();
    }

    @Override
    public String toString() {
        String returnString = "";
        int count = 1;
        for (TrackerEntry item : log) {
            returnString += (count++ + ". " + item + "\n");

        }
        return returnString;
    }
}
