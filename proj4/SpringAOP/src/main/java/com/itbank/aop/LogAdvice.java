package com.itbank.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component("log")
public class LogAdvice {
	
	@Pointcut("execution(* com.itbank.aop..*.insert*(..))")
	public void insert() {}
	
	@Pointcut("execution(* com.itbank.aop..*.delete*(..))")
	public void delete() {}
	
	@Pointcut("execution(* com.itbank.aop..*.update*(..))")
	public void update() {}
	
	@Pointcut("execution(* com.itbank.aop..*.select*(..))")
	public void select() {}
	
	
	@Before("insert()")
	public void printLog() {
		System.out.println("LogAdvice's printLog() 호출됨. ==============");
	}
	
	@AfterReturning("delete()")
	public void login() {
		System.out.println("로그인처리 ==============");
	}
	
	@Around("update()")
	public void aroundBang(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("이전호출");
		pjp.proceed();
		System.out.println("이후 호출");
	}
	
	@AfterThrowing("select()")
	public void errorBang() {
		System.out.println("에러 후 호출");
	}
	
	
	
	public void logout() {
		System.out.println("로그아웃 처리 ===========");
	}
	
	public void returnCall() {
		System.out.println("리턴 처리 ==============");
	}
	
	public void errorCall() {
		System.out.println("에러 발생!!!===========");
	}
	
	public void aroundCall(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("어라운드 Before=========");
		pjp.proceed();
		System.out.println("어라운드 After==========");
	}
	
	public void arroudConfirm(ProceedingJoinPoint pjp) throws Throwable{
		System.out.println("확인 전입니다.");
		pjp.proceed();
		System.out.println("확인 완료되었습니다.");
	}
}
