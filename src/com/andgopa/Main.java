package com.andgopa;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    String[] strArray = new String[10];
	    int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Andres");

        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        intClassArrayList.add(new IntClass(54));
        Double doubleValue = new Double(12.54);

        ArrayList<Integer> intArrayList = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            //This is Autoboxing
            intArrayList.add(Integer.valueOf(i));
        }

        for (int i = 0; i <= 10; i++) {
            //This is Inboxing
            System.out.println(i + "-->" + intArrayList.get(i).intValue());
        }

        Integer myIntValue = 56;
        int myInt = myIntValue.intValue();

        ArrayList<Double> myDoubleValues = new ArrayList<>();
        for(double dbl = 0.0; dbl <= 10.0; dbl+= 0.5) {
            //Autoboxing
            myDoubleValues.add(Double.valueOf(dbl));
        }

        for (int i = 0; i < myDoubleValues.size(); i++) {
            //Inboxing
            double value = myDoubleValues.get(i).doubleValue();
            System.out.println(value);
        }
    }
}


class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }
}