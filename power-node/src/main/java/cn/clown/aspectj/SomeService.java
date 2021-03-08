package cn.clown.aspectj;

/**
 * @author clownAdam
 * @date 2021
 */
public interface SomeService {
    /**
     * doSome
     *
     * @param name
     * @param age
     */
    void doSome(String name, int age);

    /**
     * doOther
     *
     * @param name
     * @param age
     * @return
     */
    String doOther(String name, int age);

    /**
     * doFirst
     *
     * @param name
     * @param age
     * @return
     */
    String doFirst(String name, int age);

    /**
     * 环绕通知
     * @param name
     * @param age
     * @return
     */
    Object doAround(String name,int age);
}
