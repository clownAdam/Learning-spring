package cn.clown.service.impl;

import cn.clown.service.SomeService;

/**
 * some service impl
 *
 * @author clown
 * @date 2021
 */
public class SomeServiceImpl implements SomeService {

    public SomeServiceImpl() {
        super();
        System.out.println("SomeServiceImpl无参数构造方法");
    }

    @Override
    public void doSome() {
        System.out.println("业务方法====doSome()====");
    }
}
