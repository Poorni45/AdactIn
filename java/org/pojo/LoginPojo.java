package org.pojo;

import org.base.ReUsable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojo extends ReUsable {

	public LoginPojo() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement userName;

	@FindBy(id = "password")
	private WebElement pwd;

	@FindBy(id = "login")
	private WebElement loginBtn;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	
}
