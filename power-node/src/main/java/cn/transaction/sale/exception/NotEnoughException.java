package cn.transaction.sale.exception;

/**
 * 不充分异常
 * 在定义service层可能会抛出的异常类
 *
 * @author clown
 * @version 1.0
 * @date 2021/3/9 10:17
 */
public class NotEnoughException extends RuntimeException {
    public NotEnoughException() {
        super();
    }

    public NotEnoughException(String message) {
        super(message);
    }
}
