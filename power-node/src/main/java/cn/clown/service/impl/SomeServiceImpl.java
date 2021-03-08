package cn.clown.service.impl;

import cn.clown.service.SomeService;
import cn.clown.service.tools.ServiceTools;

/**
 * @author clown
 * @date 2021
 */
public class SomeServiceImpl implements SomeService {
    @Override
    public void doSome() {
        ServiceTools.doLog();
        System.out.println("do some...");
        ServiceTools.doTrans();
    }

    @Override
    public void doOther() {
        ServiceTools.doLog();
        System.out.println("do other...");
        ServiceTools.doTrans();
    }


}
