package cn.edu.sdu.oopSort.service;

import cn.edu.sdu.oopSort.core.SortToolsSupport;

/**
 * 
 * @author Yonggang Yuan
 *
 * @param <T> : Any primitive type such as int, double except String and boolean.
 * 
 */

public class PrimitiveSortImpl<T> extends SortToolsSupport<T> implements PrimitiveSort<T>{

    /** The singleton instances for each encapsulation of primitive type except String Boolean **/

    public static PrimitiveSortImpl<Byte> sortTool4Byte = new PrimitiveSortImpl<Byte>();
    public static PrimitiveSortImpl<Short> sortTool4Short = new PrimitiveSortImpl<Short>();
    public static PrimitiveSortImpl<Integer> sortTool4Integer = new PrimitiveSortImpl<Integer>();
    public static PrimitiveSortImpl<Long> sortTool4Long = new PrimitiveSortImpl<Long>();
    public static PrimitiveSortImpl<Double> sortTool4Double = new PrimitiveSortImpl<Double>();

    private PrimitiveSortImpl () {}

}
