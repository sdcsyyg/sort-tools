package cn.edu.sdu.oopSort.factory;

import cn.edu.sdu.oopSort.core.SortToolsSupport;
import cn.edu.sdu.oopSort.service.PersonSort;
import cn.edu.sdu.oopSort.service.PersonSortImpl;
import cn.edu.sdu.oopSort.service.PrimitiveSort;
import cn.edu.sdu.oopSort.service.PrimitiveSortImpl;
import cn.edu.sdu.oopSort.service.StringSort;
import cn.edu.sdu.oopSort.service.StringSortImpl;

/**
 * A factory class to get all kinds of sortTools.
 * 
 * @author Yonggang Yuan
 *
 */

public class SortToolsFactory {

    /* Get all kinds of primitive sortTools except String and boolean */
    public static PrimitiveSort<Byte> getInstance4Byte() {
        return PrimitiveSortImpl.sortTool4Byte;
    }

    public static PrimitiveSort<Short> getInstance4Short() {
        return PrimitiveSortImpl.sortTool4Short;
    }

    public static PrimitiveSort<Integer> getInstance4Integer() {
        return PrimitiveSortImpl.sortTool4Integer;
    }

    public static PrimitiveSort<Long> getInstance4Long() {
        return PrimitiveSortImpl.sortTool4Long;
    }

    public static PrimitiveSort<Double> getInstance4Double() {
        return PrimitiveSortImpl.sortTool4Double;
    }

    /* Get a stringSortTool */
    public static StringSort getInstance4String() {
        return StringSortImpl.getInstance();
    }

    /* Get a person-sort-tool as a nor-primitive type sortTool */
    public static PersonSort getInstance4Person() {
        return PersonSortImpl.getInstance();
    }

    /* Get a normal instance to sort all kinds of objects */
    public static SortToolsSupport<Object> getInstance4Normal() {
        return new SortToolsSupport<Object>() {
            // TODO: A simple implementation or nothing.
        };
    }

}
