package mateusz.pepla.evenornot;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;

@Named
@SessionScoped
public class UserBean implements Serializable {

    String num;

    public String getResponse(){
        try{
            int numer = Integer.parseInt(num);
            if (numer % 2 == 0)
                return "even";
            else
                return "odd";

        } catch (Exception e){
            return "index";
        }
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
