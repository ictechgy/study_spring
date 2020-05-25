package com.itbank.di2;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionBean {
	List<String> addr;
	Set<String> hobby;
	Map<String, String> cookie;
	public List<String> getAddr() {
		return addr;
	}
	public void setAddr(List<String> addr) {
		this.addr = addr;
	}
	public Set<String> getHobby() {
		return hobby;
	}
	public void setHobby(Set<String> hobby) {
		this.hobby = hobby;
	}
	public Map<String, String> getCookie() {
		return cookie;
	}
	public void setCookie(Map<String, String> cookie) {
		this.cookie = cookie;
	}
	

	
}	
