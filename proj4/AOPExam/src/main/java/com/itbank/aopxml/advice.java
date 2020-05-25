package com.itbank.aopxml;

import org.aspectj.lang.ProceedingJoinPoint;

public class advice {

	public void before() {
		System.out.println("게시판에 글을 추가하려고 합니다.");
	}
	
	public void after() {
		System.out.println("게시판의 글이 삭제되었습니다.");
	}
	
	public void around(ProceedingJoinPoint pjp) throws Throwable {
		System.out.println("게시판의 글을 수정하려고 합니다.");
		pjp.proceed();
		System.out.println("게시판의 글이 수정 완료되었습니다.");
	}
	
	public void returnCall() {
		System.out.println("검색결과가 리턴되었습니다.");
	}
	
	public void errorCall() {
		System.out.println("전체 검색에 문제가 생겼습니다.");
	}
	
}
