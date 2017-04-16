package org.extras;

import java.util.Date;


public class MvelHelper {
    public boolean less(Date arg, int diff){
        System.out.println(arg);
        Date currentDate = new Date();
        currentDate.setYear(currentDate.getYear() - diff);
        System.out.println(currentDate);
        return arg.compareTo(currentDate) != -1;
    }

    public boolean old(Date arg, int diff){
        System.out.println(arg);
        Date currentDate = new Date();
        currentDate.setYear(currentDate.getYear() - diff);
        System.out.println(currentDate);
        return arg.compareTo(currentDate) == -1;
    }
}
