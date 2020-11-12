package day12.task4;

import java.util.List;

public class MusicBand {

    private String name;
    private int year;
    private List<String> persons;

    public MusicBand(String name, int year, List<String> persons) {
        this.name = name;
        this.year = year;
        this.persons = persons;
    }

    public List<String> getPersons() {
        return persons;
    }

    public void setPersons(List<String> persons) {
        this.persons = persons;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "{name='" + name + '\'' +
                ", year=" + year +
                '}';
    }

    public static void movingPersons (MusicBand a, MusicBand b){
        for(String member: a.getPersons()){
            b.getPersons().add(member);
        }
        a.getPersons().clear();
    }

    public void printMembers(){
        System.out.println(this.persons);
    }

}
