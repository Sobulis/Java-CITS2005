package Projects;

import java.util.ArrayList;

class CheckInRecord {
    String memberName;
    String time;

    public CheckInRecord(String memberName, String time) {
        this.memberName = memberName;
        this.time = time;
    }
}

public class Gym {
    private ArrayList<CheckInRecord> records;

    public Gym() {
        records = new ArrayList<CheckInRecord>();
    }

    public void checkIn(String memberName, String time) {
        records.add(new CheckInRecord(memberName, time));
    }

    public void checkOut(String memberName) {
        for (int i = 0; i < records.size(); i++){
            if (records.get(i).memberName.equals(memberName)){
                records.remove(i);
                return;
            }
        }
    }

    public boolean isInside(String memberName) {
        for (int i = 0; i < records.size(); i++){
            if (records.get(i).memberName.equals(memberName)) return true;
        }
        return false;
    }

    public int countMembersInside() {
        int count = 0;
        for (int i = 0; i < records.size(); i++){
            count ++;
        }
        return count;
    }

    public int countMembersCheckedInAt(String time) {
        int count = 0;
        for (int i = 0; i < records.size(); i ++){
            if (records.get(i).time.equals(time)){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Gym gym = new Gym();

        // Example tests you can run:
         gym.checkIn("Alice", "09:30");
         gym.checkIn("Bob", "10:15");
         gym.checkIn("Tyler", "10:15");
         System.out.println(gym.countMembersCheckedInAt("10:15"));
         System.out.println(gym.isInside("Alice"));
         System.out.println(gym.countMembersInside());
         gym.checkOut("Alice");
         System.out.println(gym.isInside("Alice"));

    }
}
