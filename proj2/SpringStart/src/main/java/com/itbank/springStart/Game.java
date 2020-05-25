package com.itbank.springStart;

public interface Game {
	public abstract void move(); //추상메소드. 인터페이스는 구현되어있는 메소드 불가능하다. 오직 틀(추상)만 작성 가능
	public abstract void stop();
	public abstract void fly();
}
