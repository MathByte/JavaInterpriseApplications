package JavaClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyWeek {

    private List<Day> workingDays;
    private String name;
    public MyWeek() {
    }
    public enum Day {

        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }
    public void setName(String name) {
        this.name = name;
    }
    public String
    getName() {
        return this.name;
    }
    public String getDescription() {
        return "A description of how the week usually goes for " + name;
    }
    public int getNumberDays() {
        return 7;
    }
    public List<Day> getWorkingDays() {
        return this.workingDays;
    }

    public void setWorkingDaysByNumber(String daysNumber) {
        Day dd[] = Day.values();
        this.workingDays = new ArrayList<Day>();
        for(int i = 0; i < Integer.parseInt( daysNumber); i++)
            this.workingDays.add(dd[i]);
    }

    public int getNumberWorkingDays() {
        return this.getWorkingDays().size();
    }
}
