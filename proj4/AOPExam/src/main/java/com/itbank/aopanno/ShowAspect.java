package com.itbank.aopanno;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component("show_aspect")
public class ShowAspect {
	
	@Pointcut("execution(* com.itbank.aopanno..*.showBefore(..)")
	public void showBefore() {}
	
	@Pointcut("execution(* com.itbank.aopanno..*.showAfter(..)")
	public void showAfter() {}
	
	@Pointcut("execution(* com.itbank.aopanno..*.showGreet(..)")
	public void showGreet() {}
	
	@Pointcut("execution(* com.itbank.aopanno..*.showGive(..)")
	public void showGive() {}  //여기서 return값을 void로 해도 상관이 없는건가
	
	@Pointcut("execution(* com.itbank.aopanno..*.showFail(..)")
	public void showFail() {}
	
	
	@Before("showBefore()")
	public void seat() {
		System.out.println("모든 관람객은 자리에 앉아주세요");
	}
	
	@After("showAfter()")
	public void clap() {
		System.out.println("모든 관람객이 박수를 칩니다.");
	}
	
	@Around("showGreet()")
	public void stageGreet(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("모든 연기자는 무대 앞으로 나와주세요");
		pjp.proceed();
		System.out.println("모든 연기자는 무대 뒤로 나가주세요");
	}
	
	@AfterReturning("showGive()")
	public void beverage() {
		System.out.println("모든 관람객이 음료수를 마십니다.");
	}
	
	@AfterThrowing("showFail()")
	public void failure() {
		System.out.println("우~ 공연이 실패로 끝났군요");
	}
	
	
}
