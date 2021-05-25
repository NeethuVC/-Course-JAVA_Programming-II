
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class ChangeHistory {

    private ArrayList<Double> changehistorys;

    public ChangeHistory() {
        changehistorys = new ArrayList<>();
    }

    public void add(double status) {
        changehistorys.add(status);
    }

    public void clear() {
        changehistorys.clear();
    }

    public String toString() {
        return changehistorys.toString();
    }

    public double maxValue() {

        if (changehistorys.size() < 0) {
            return 0;
        }
        double max = 0;
        for (double val : changehistorys) {
            if (max < val) {
                max = val;
            }
        }
        return max;
    }

    public double minValue() {
        if (changehistorys.size() < 0) {
            return 0;
        }
        double min = changehistorys.get(0);
        for (double val : changehistorys) {
            if (min > val) {
                min = val;
            }
        }
        return min;
    }

    public double average() {
         if (changehistorys.size() < 0) {
            return 0;
        }
        double total = 0;
        for (double val : changehistorys) {
            total += val;
        }
        return 1.0 * total / changehistorys.size();
    }
   

}
