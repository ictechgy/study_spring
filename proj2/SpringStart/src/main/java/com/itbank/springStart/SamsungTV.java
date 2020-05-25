package com.itbank.springStart;

public class SamsungTV implements Tv {
	/* (non-Javadoc)
	 * @see com.itbank.springStart.Tv#powerOn()
	 */
	public void powerOn() {
		System.out.println("삼성 TV 켜짐");
	}
	/* (non-Javadoc)
	 * @see com.itbank.springStart.Tv#powerOff()
	 */
	public void powerOff() {
		System.out.println("삼성 TV 꺼짐");
	}
	/* (non-Javadoc)
	 * @see com.itbank.springStart.Tv#volumeUp()
	 */
	public void volumeUp() {
		System.out.println("삼성 TV 볼륨UP");
	}
	/* (non-Javadoc)
	 * @see com.itbank.springStart.Tv#volumeDown()
	 */
	public void volumeDown() {
		System.out.println("삼성 TV 볼륨DOWN");
	}
}
