package MyLovelyMath;

public class MyArray {

    public static int getArrayElementByIndex(int indexNumber) {

        int[] myArray = new int[5];

        for ( int i =0; i < myArray.length; i++) {
            myArray[i] = i;
        }

        return myArray[indexNumber];
        //System.out.println( myArray[indexNumber]);

    }
}
