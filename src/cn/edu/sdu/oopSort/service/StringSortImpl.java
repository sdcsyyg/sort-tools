package cn.edu.sdu.oopSort.service;

/**
 * 
 * @author Yonggang Yuan
 *
 */

public class StringSortImpl implements StringSort {

    /* The singleton instance */
    private static StringSortImpl sortTool4String = new StringSortImpl();

    private StringSortImpl() {}

    public static StringSortImpl getInstance() {
        return sortTool4String;
    }

    @Override
    public String[] bubbleDESC(String[] source) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String[] quickDESC(String[] source) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String[] insertDESC(String[] source) {
        // TODO Auto-generated method stub
        return null;
    }

}
