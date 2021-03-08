package cn.clown.aspectj.impl;

import cn.clown.aspectj.SomeService;
import org.springframework.stereotype.Component;

/**
 * @author clown
 * @date 2021
 */
@Component("SomeServiceImpl")
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome(String name, int age) {
        System.out.println("执行了业务方法doSome");
    }

    @Override
    public String doOther(String name, int age) {
        System.out.println("执行了业务方法doOther");
        return "run access!";
    }

    @Override
    public String doFirst(String name, int age) {
        System.out.println("执行了业务方法doFirst");
        return "doFirst";
    }

    @Override
    public Object doAround(String name, int age) {
        System.out.println("环绕通知");
        return "hello-环绕通知";
    }
}
