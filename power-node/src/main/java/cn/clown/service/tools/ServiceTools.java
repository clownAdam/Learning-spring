package cn.clown.service.tools;

/**
 * @author clown
 * @date 2021
 */
public final class ServiceTools {
    /**
     * 日志处理
     */
    public static void doLog(){
        System.out.println("非业务功能,日志功能,在方法开始时输出日志");
    }

    /**
     * 事务处理
     */
    public static void doTrans(){
        System.out.println("非业务事务功能,在业务方法执行之后,加入事务");
    }
}
