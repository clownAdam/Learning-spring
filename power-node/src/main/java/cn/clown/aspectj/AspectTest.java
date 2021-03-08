package cn.clown.aspectj;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author clown
 * @Aspect：是aspect框架的注解，表示当前类是切面类
 * @date 2021
 */
@Component("aspect")
@Aspect
public class AspectTest {
    /**
     * @before : 前置通知
     * 属性：value切入点表达式，表示切面执行的位置
     * 位置：方法的定义上面
     */
    @Before(value = "execution(* cn.clown.aspectj.impl.SomeServiceImpl.do*(..))")
    public void before(JoinPoint jp) {
        System.out.println("前置通知：在目标方法之前先执行，例如输出日志");
        System.out.println("连接点的方法定义：" + jp.getSignature());
        System.out.println("连接点方法的参数个数：" + jp.getArgs().length);

        Object[] args = jp.getArgs();
        for (Object arg : args) {
            System.out.println(arg);
        }
    }

    @AfterReturning(value = "execution(* cn.clown.aspectj.impl.SomeServiceImpl.doOther(..)))", returning = "result")
    public void after(Object result) {
        //修改目标方法的执行结果
        if (result != null) {
            String s = (String) result;
            result = s.toUpperCase();
        }
        System.out.println("后置通知：在目标方法之后执行的功能增强，例如执行事务处理(切面)" + result);
    }
    @Around(value = "execution(* cn.clown.aspectj.impl.SomeServiceImpl.doAround(..))")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        Object obj = null;
        //增强功能
        System.out.println("环绕通知：在目标方法之前执行的,列入输出日志");
        obj = point.proceed();
        System.out.println("环绕通知：在目标方法之后执行的，列入处理事务");
        return obj;
    }

}
