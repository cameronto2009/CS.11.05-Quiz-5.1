public static class Main {

    /**
     * Given two arrays of integers, write a method called combine that combines the two arrays into one larger array.
     * The method combine will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10,12,14,16};
     * zip(myArray1, myArray2) → {1,3,5,7,9,2,4,6,8,10,12,14,16}
     */
    public class Array {

        public static int[] combine(int[] array1, int[] array2) {

            int[] result = new int[array1.length + array2.length];


            System.arraycopy(array1, 0, result, 0, array1.length);


            System.arraycopy(array2, 0, result, array1.length, array2.length);

            return result;
        }
    }
        return null;

    }

    /**
     * Given two arrays of integers of equal length, write a method called zip that zips together all elements in each array into one larger array.
     * The method zip will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10};
     * zip(myArray1, myArray2) → {1,2,3,4,5,6,7,8,9,10}
     */
    public static void zip(String[] args) {
        int[] myArray1 = {1, 3, 5, 7, 9};
        int[] myArray2 = {2, 4, 6, 8, 10};

        int[] result = zip(myArray1, myArray2);

        for (int num : result) {
            System.out.print(num + " ");
        }
    }

public static int[] zip(int[] array1, int[] array2) {

    int[] zippedArray;


        return null;



    /**
     * Given two arrays of integers of equal length, write a method called product that multiplies each element in the first array by the element at the corresponding index in the second array.
     * The method product will return a new one dimensional array of integers.
     * int[] myArray1 = {1,3,5,7,9};
     * int[] myArray2 = {2,4,6,8,10};=
     * product(myArray1, myArray2) → {2,12,30,56,90}
     */
    class Array { // You can name this class as you like
        public static void product(String[] args) {
            int[] myArray1 = {1, 3, 5, 7, 9};
            int[] myArray2 = {2, 4, 6, 8, 10};

            int[] result = product(myArray1, myArray2);


            for (int value : result) {
                System.out.print(value + " ");
            }
        }

        public static int[] product(int[] array1, int[] array2) {


            int[] productArray = new int[array1.length];




            return productArray;
        }
    }

    /**
     * Given an array of Strings, write a method called capitalCount that calculates the number of capital letters in each String and stores them into an array.
     * The method capitalCount will return a new one dimensional array of integers.
     * There is a catch - you are required to implement *two* methods in order to solve this problem.
     * One of these methods (countCapitalLetters) will be a helper method and will perform the task of counting and returning how many capital letters are in a single word.
     * In other words, the method capitalCount will call (or use) the method countCapitalLetters in order to achieve the desired output.
     * Hint: You can use the statement Character.isAlphabetic( … ) to determine whether a character is an alphabetic character.
     *
     * Method: capitalCount
     * Helper method: countCapitalLetters
     *
     * Hint: 'A' = 65 and 'Z' = 90
     *
     * String[] words = {“Christmas”, “IS”, “comInG”, “!”};
     * capitalCount(words) → {1, 2, 2, 0}
     */
    int[] capitalCount1 = capitalCount;
    public static int[] capitalCount(String[]capitalCount) {
        public class CapitalLetterCounter {
             {
                String[] words = {"Christmas", "IS", "comInG", "!"};
                int[] result = capitalCount(words);


                for (int count : result) {
                    System.out.print(count + " ");
                }
            }

            public static int[] capitalCount(String[] words) {
                int[] capitalCounts = new int[words.length];


                for (int i = 0; i < words.length; i++) {
                    capitalCounts[i] = countCapitalLetters(words[i]);
                }

                return capitalCounts;
            }

            public static int countCapitalLetters(String word) {
                int count = 0;


                for (int i = 0; i < word.length(); i++) {
                    int ch = word.charAt(i);
                    if (Character.isUpperCase(ch)) {
                        count++;
                    }
                }

               return count;
            }
        }
    }
    }

public void main() {
}