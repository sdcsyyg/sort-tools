package cn.edu.sdu.oopSort.test;

import cn.edu.sdu.oopSort.bean.Person;
import cn.edu.sdu.oopSort.exception.TargetArrayIsNullException;
import cn.edu.sdu.oopSort.factory.SortToolsFactory;
import cn.edu.sdu.oopSort.service.PersonSort;
import cn.edu.sdu.oopSort.service.PrimitiveSort;
import cn.edu.sdu.oopSort.service.StringSort;

/**
 * 
 * @author Yonggang Yuan
 *
 */

public class SortToolsTest {

    /**
     * As a entrance for testing sort-tools
     * 
     * @param args ： Arguments from console
     * 
     */
    public static void main(String[] args) {
        // Start testing......
        System.out.println("Start testing......");
        primitiveSortToolTest();
        stringSortToolTest();
        personSortToolTest();
        // Finish testing!
        System.out.println("Finish testing!");
    }

    /**
     * Test sortTool for primitive type data
     */
    private static void primitiveSortToolTest() {
        //: #1: Create some primitive type arrays.
        //: #2: Get primitiveSortTool.
        //: #3: Print array before sorting.
        //: #4: Sorting......
        //: #5: Print array after sorting.
        Integer [] foos4int = {111, 132, 11, 43, 33, 56, 77, 88, 89, -23};
        Double [] foos4double = {321.12, 135.23, 13.32, 45.55, 33.56, 56.2, 77.77, 88.88, 89.99, -23.21};

        PrimitiveSort<Integer> sortTool4Integer = SortToolsFactory.getInstance4Integer();
        PrimitiveSort<Double> sortTool4Double = SortToolsFactory.getInstance4Double();

        System.out.println("\n############################################################");
        System.out.println("-----------------------Test sort for primitive------------------");
        System.out.println("############################################################");
        System.out.println("-----------------------Test sort for Integer---------------------------");
        System.out.println("-----------------------Integer array before sorting---------------------------");
        for(int foo : foos4int) {
            System.out.print(foo + "  |  ");
        }
        System.out.println();

        System.out.println("-----------------------Integer array after sorting------------------");
        Integer[] res4int = {};
        try {
            res4int = sortTool4Integer.bubbleDESC(foos4int);
        } catch (TargetArrayIsNullException e) {
            e.printStackTrace();
        }
        for(int foo : res4int) {
            System.out.print(foo + "  |  ");
        }
        System.out.println();

        System.out.println("-----------------------Test sort for Integer------------------");
        System.out.println("-----------------------Double array before sorting------------------");
        for(double foo : foos4double) {
            System.out.print(foo + "  |  ");
        }
        System.out.println();

        System.out.println("-----------------------Double array after sorting------------------");
        Double[] res4Double = {};
        try {
            res4Double = sortTool4Double.bubbleDESC(foos4double);
        } catch (TargetArrayIsNullException e) {
            e.printStackTrace();
        }
        for(double foo : res4Double) {
            System.out.print(foo + "  |  ");
        }
        System.out.println();
    }

    /**
     * Test sortTool for String
     */
    private static void stringSortToolTest() {
        String [] foos4String = {"aa", "ff", "ad", "gf", "rgh", "yyg", "rtp", "ewq", "loip", "ppp"};
        StringSort sortTool4String = SortToolsFactory.getInstance4String();
        System.out.println("\n############################################################");
        System.out.println("-----------------------Test sort for String------------------");
        System.out.println("############################################################");
        System.out.println("-----------------------String array before sorting------------------");
        for(String foo : foos4String) {
            System.out.print(foo + "  |  ");
        }
        System.out.println();
        System.out.println("-----------------------String array after sorting------------------");
        String[] res4String = {};
        try {
            res4String = sortTool4String.bubbleDESC(foos4String);
        } catch (TargetArrayIsNullException e) {
            e.printStackTrace();
        }
        for(String foo : res4String) {
            System.out.print(foo + "  |  ");
        }
        System.out.println();
    }

    /**
     * Test sortTool for Person[Reference]
     */
    private static void personSortToolTest() {
        Person [] foos4Person = {
            new Person("aa", 10, 150.0),
            new Person("bb", 19, 151.0),
            new Person("cc", 16, 157.0),
            new Person("dd", 13, 154.0),
            new Person("ee", 18, 159.0),
            new Person("ff", 12, 152.0),
            new Person("gg", 14, 153.0),
            new Person("hh", 13, 156.0),
            new Person("ii", 17, 158.0),
            new Person("jj", 11, 155.0)
        };
        PersonSort sortTool4Person = SortToolsFactory.getInstance4Person();
        System.out.println("\n############################################################");
        System.out.println("-----------------------Test sort for Person------------------");
        System.out.println("############################################################");
        System.out.println("-----------------------Person array before sorting------------------");
        System.out.println("Name\t|\tAge\t|\tHeight");
        for(Person foo : foos4Person) {
            System.out.println(foo);
        }
        System.out.println("-----------------------Person array after sorting------------------");
        Person[] res4Person = {};
        try {
            res4Person = sortTool4Person.bubbleDESC(foos4Person);
        } catch (TargetArrayIsNullException e) {
            e.printStackTrace();
        }
        for(Person foo : res4Person) {
            System.out.println(foo);
        }
    }

}
