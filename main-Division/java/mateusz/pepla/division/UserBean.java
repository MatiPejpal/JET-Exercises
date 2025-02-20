package mateusz.pepla.division;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;

import java.io.Serializable;
import java.security.SecureRandomParameters;

@Named
@SessionScoped
public class UserBean implements Serializable {

    private String first;
    private String second;

    private float result;
    private Boolean divided = false;

    public String processSubmit(){
        int s, f;
        try {
            f = Integer.parseInt(first);
            s = Integer.parseInt(second);
        } catch (Exception e){
            return "index";
        }

        if (s == 0)
            return "divisionError";

        result = f / s;
        divided = true;

        return "index";
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getSecond() {
        return second;
    }

    public void setSecond(String second) {
        this.second = second;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }

    public Boolean getDivided() {
        return divided;
    }

    public void setDivided(Boolean divided) {
        this.divided = divided;
    }
}
