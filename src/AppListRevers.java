import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class AppListRevers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> secondList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the size of your list?");
        int sizeOfNum = sc.nextInt();
        List<Integer> list1 = createList(list, sizeOfNum);
        System.out.println("first list is ");
        System.out.println(list1);
        System.out.println("reverse first list is");
        System.out.println(getReversList(list1));
        System.out.println("What is your second list size?");
        sizeOfNum = sc.nextInt();
        List<Integer> list2 = createList(secondList, sizeOfNum);
        System.out.println("second list is ");
        System.out.println(list2);
        System.out.println("revers second list is ");
        System.out.println(getReversList(list2));
        int numList1 = calculateSumOfList(list1);
        System.out.println("The sum of the numbers in first list is equal to " + numList1);
        int numList2 = calculateSumOfList(list2);
        System.out.println("The sum of the numbers in second list is equal to " + numList2);
        int finalNum = numList1 + numList2;
        System.out.println("The sum of the all list " + finalNum);
        System.out.println("convert number to list" + convertNumToList(finalNum));
    }

    private static List<Integer> getReversList(List<Integer> list) {
//        int num = calculateSumOfList(list);
//        List<Integer> list1 = convertNumToList(num);
//        return list1;
        for(int i = 0 , j = list.size()-1 ; i<j ; i++){
            Integer remove = list.remove(j);
            list.add(i , remove);
        }
        return list;
    }

    private static List<Integer> convertNumToList(int finalNum) {
        List<Integer> list = new ArrayList<>();
        while (finalNum > 0) {
            list.add(finalNum % 10);
            finalNum /= 10;
        }
        return list;
    }

    private static int calculateSumOfList(List<Integer> list) {
        int sum = 0;
        for (Integer i : list) {
            sum = sum * 10 + i;
        }
        return sum;
    }

    private static List<Integer> createList(List<Integer> list, int sizeOfNum) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < sizeOfNum; i++) {
            System.out.println("enter num");
            int numberAddToList = sc.nextInt();
            list.add(numberAddToList);
        }
        return list;
    }
}
