package cn.edu.sdu.oopSort.exception;

/**
 * EOP: Exception oriented programming
 * @author Yonggang Yuan
 *
 */

@SuppressWarnings("serial")
public class TargetArrayIsNullException extends Exception{

    public TargetArrayIsNullException(String msg) {
        super(msg);
    }

}
