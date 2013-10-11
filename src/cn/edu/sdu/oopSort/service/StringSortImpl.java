package cn.edu.sdu.oopSort.service;

import cn.edu.sdu.oopSort.core.SortToolsSupport;

/**
 * 
 * @author Yonggang Yuan
 *
 */

public class StringSortImpl extends SortToolsSupport<String> implements  StringSort {

    /* The singleton instance */
    private static StringSortImpl sortTool4String = new StringSortImpl();

    private StringSortImpl() {}

    public static StringSortImpl getInstance() {
        return sortTool4String;
    }

}
