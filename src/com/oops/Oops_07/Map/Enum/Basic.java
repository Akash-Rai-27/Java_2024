package com.oops.Oops_07.Map.Enum;

import java.time.DayOfWeek;

public class Basic {
    enum Week implements A {

        // no inheritance
        // yes can support interfaces as many you wants

        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        Week(){
            System.out.println("Constructor called for "+ this);
        }


        // this is not public or protected
        // so only private and default

        @Override
        public void hello() {
            System.out.println("interface with enums");
        }


    }
    // these are enum constants
    // public static final
    // since its final u cant create child enums
    // type is week


    public static void main(String[] args) {
        Week week;
        week = Week.Monday;
//
//        for (Week date: Week.values()) {
//            System.out.println(date);
//        }

        System.out.println(week.ordinal());

        week.hello();

    }


}
