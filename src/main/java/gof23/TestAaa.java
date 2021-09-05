package gof23;


import org.junit.Test;

public class TestAaa {

    @Test
    public void test1(){
//        int[] array = new int[]{4,4,6,5,3,2,8,1,7,5,6,0,10};
        int[] array = new int[]{4,4,6};
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }

        int[] countArray = new int[max+1];
        for (int i = 0; i < array.length; i++) {
            int i1 = countArray[array[i]]++;
            System.out.println(i1 + "---------------");
        }

        System.out.println("------------------");

    }

    @Test
    public void test2(){
        int[] array = new int[]{4,4,6,5,3,2,8,1,7,5,6,0,10};
        int[] sortedArray = countSort(array);
    }

    private static int[] countSort(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max){
                max = array[i];
            }
        }

        int[] countArray = new int[max+1];
        for (int i = 0; i < array.length; i++) {
            countArray[array[i]]++;
        }
        System.out.println(111111);
        return new int[0];
    }
}
