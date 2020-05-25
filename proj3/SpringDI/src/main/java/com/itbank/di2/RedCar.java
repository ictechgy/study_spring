package com.itbank.di2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("red")
public class RedCar implements Car {

	@Override
	public void start() {
		System.out.println("레드카 달려요");
	}

	@Override
	public void stop() {
		System.out.println("레드카 멈춰요");
	}

	
	AppleSpeaker speaker = new AppleSpeaker();

	@Override
	public void soundUp() {
		//System.out.println("레드카 사운드 UP");
		speaker.soundUp();
	}

	@Override
	public void soundDown() {
		//System.out.println("레드카 사운드 DOWN");
		speaker.soundDown();
	}
	
	//@Autowired //Speaker 타입으로 생성된 객체를 찾아서 주입. 즉 Speaker라는 인터페이스를 상속받은 클래스중 Component로 객체화 된 것을 찾음
	//Speaker speaker2; //만약 이 부분에 AppleSpeaker라고 참조형 변수의 자료형을 만들어놨다면 AppleSpeaker 객체만 찾았을 것이다.
	
	@Autowired
	@Qualifier("banana") //이름을 가지고 한번 더 거름
	Speaker speaker3;
	
	@Autowired
	StrongWindow st;
	public void strongWindow() {
		st.strongWindow();
	}
	
	
}
