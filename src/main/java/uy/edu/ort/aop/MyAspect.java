package uy.edu.ort.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Aspect
public class MyAspect {

    private Logger LOGGER = LoggerFactory.getLogger(getClass());

    @Pointcut("execution(* uy.edu.ort.service.*.*(..))")
    public void myjp() {
    }

    @Around("myjp()")
    public Object metodoAspecto(ProceedingJoinPoint joinPoint) throws Throwable {
        Object object = null;
        LOGGER.info("Inicio metodo del aspecto MyAspect ");
        try {
            // ejecuto metodo interceptado
            object = joinPoint.proceed();
        } catch (Exception e) {
            LOGGER.error(e.getMessage());
        }
        LOGGER.info("Fin metodo del aspecto MyAspect ");

        return object;
    }

    @After("myjp()")
    public void otroMetodoAspecto() {
        LOGGER.info("Otro metodo del aspecto MyAspect ");
    }
}
