package org.pojo;

import org.base.ReUsable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmationPojo extends ReUsable {
	public BookingConfirmationPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="order_no")
	private WebElement orderNo;
	
	@FindBy(id="total_price")
	private WebElement price;
	
	@FindBy(id ="logout")
	private WebElement logoutBtn;

	public WebElement getOrderNo() {
		return orderNo;
	}

	public WebElement getPrice() {
		return price;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}

	
}
