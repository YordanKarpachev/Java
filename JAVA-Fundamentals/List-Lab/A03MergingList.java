package ListLab;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class A03MergingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> arr1 =Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        List<Integer> arr2 = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> newList = new ArrayList<>();

        int sizeList1 = arr1.size();
        int sizeList2 = arr2.size();

        if (sizeList1 >sizeList2)
        {
            for (int i = 0; i <sizeList2  ; i ++) {
                newList.add(i + i , arr1.get(i));
                newList.add(i + i +1, arr2.get(i));

            }
            newList.addAll(arr1.subList(sizeList2, sizeList1));

        } else {

            for (int i = 0; i <sizeList1 ; i++) {
                newList.add(i + i , arr1.get(i));
                newList.add(i + i +1, arr2.get(i));

            }  newList.addAll(arr2.subList(sizeList1, sizeList2));
        }
        System.out.println(newList.toString().replaceAll("[\\[\\],]", ""));
    }
}
