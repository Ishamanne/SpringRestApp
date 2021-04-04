package com.javainuse.aspect;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class UserAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Before(value="execution(* com.javainuse.model.UserRepoCustomImpl.*(..))")
	public void beforeAdvice() {
		System.out.println("Before Advice method: joint point");
	}
	
	@After(value="execution(* com.javainuse.model.UserRepoCustomImpl.*(..))")
	public void afterAdvice() {
		
		System.out.println("After Advice method ");
	}
//	@Around(value="execution(* com.javainuse.model.UserRepoCustomImpl.*(..))")
//public void aroundAdvice(ProceedingJoinPoint jointpoint) throws Throwable {
//		long stime = System.currentTimeMillis();
//		jointpoint.proceed();
//		long et = System.currentTimeMillis() - stime;
//		System.out.println("In Around "+ et);
//		logger.info("{} is {}",jointpoint,et);
//	}
}

