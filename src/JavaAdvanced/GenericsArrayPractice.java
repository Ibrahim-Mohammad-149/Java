package com.JavaAdvanced;

class ArrayPrinter <T> {

    public void printArray(T[] things) {
        for (T thing : things) {
            System.out.println(thing);
        }
    }

    public  void printArrayWithNumbers(T[] things) {
        for (int i = 1; i < things.length; i++) {
            System.out.printf("%n%d. %s",i,things[i]);
        }
    }

}

public class GenericsArrayPractice {
    public static void main(String[] args) {

        ArrayPrinter arrayPrinter = new ArrayPrinter();
        Integer[] numbers = {1,2,3,4,5,6,7,8,9,0};
        String[] names = {"Ahmad","Mohammad","Maryam","Ibrahim", "Ismael"};
        Boolean[] manyBools = {true,true,false,true,false,true};
        arrayPrinter.printArray(manyBools);
        arrayPrinter.printArrayWithNumbers(names);

    }
}
