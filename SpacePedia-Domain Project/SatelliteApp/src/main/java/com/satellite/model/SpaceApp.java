package com.satellite.model;

public class SpaceApp {
	private String name;
	private String username;
	private String password;
	private String confirmPassword;
	public SpaceApp() {
		super();
	}
	public SpaceApp(String name, String username, String password, String confirmPassword) {
		super();
		this.name = name;
		this.username = username;
		this.password = password;
		this.confirmPassword = confirmPassword;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	@Override
	public String toString() {
		return "SpaceApp [name=" + name + ", username=" + username + ", password=" + password + ", confirmPassword="
				+ confirmPassword + "]";
	}
}
