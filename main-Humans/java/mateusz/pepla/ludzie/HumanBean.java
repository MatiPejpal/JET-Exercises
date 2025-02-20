package mateusz.pepla.ludzie;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;


@Named
@SessionScoped
public class HumanBean implements Serializable {

    public ArrayList<Human> getHumans(){
        ArrayList<Human> humans = new ArrayList<>();
        humans.add(new Human("Elza", "Wojcieszyn", "112"));
        humans.add(new Human("Maciej", "Wojcieszyn", "112"));
        humans.add(new Human("Kruk", "Wawa", "122121"));
        return  humans;
    }

public class Human {

    private String name;
    private String address;
    private String num;

    public Human(String name, String adr, String num){
        this.address = adr;
        this.num = num;
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

}
