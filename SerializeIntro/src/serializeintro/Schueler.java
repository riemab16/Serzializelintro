
package serializeintro;

import java.time.LocalDate;

public class Schueler {
    private String name;
    private int age;
    private LocalDate birthday;

    public Schueler(String name, int age, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
        this.age = LocalDate.now().getYear()-birthday.getYear();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    
    

}