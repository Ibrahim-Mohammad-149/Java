package com.javaAdvanced;

class ArrayPrinter <T> {

    public void printArrays(T[] things) {
        for (T thing: things) {
            System.out.println(thing);
        }
    }
}


public class MultipleArrayPrinter {

    public static void main(String[] args) {

        ArrayPrinter arrayPrinter = new ArrayPrinter();
        Integer[] numbers = {1,2,3,4,5,6,7,8,9,0};
        String[] names = {"Ahmad","Mohammad","Maryam","Ibrahim", "Ismael"};
        Boolean[] manyBools = {true,true,false,true,false,true};

        arrayPrinter.printArrays(numbers);
        arrayPrinter.printArrays(names);
        arrayPrinter.printArrays(manyBools);

    }
}