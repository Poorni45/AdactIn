package org.pojo;

import org.base.ReUsable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentPojo extends ReUsable {
	public PaymentPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement name;
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	@FindBy(id="address")
	private WebElement add;
	
	@FindBy(id="cc_num")
	private WebElement ccnum;
	
	@FindBy(id="cc_type")
	private WebElement cctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement ccmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ccyear;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement clkbook;

	public WebElement getName() {
		return name;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getAdd() {
		return add;
	}

	public WebElement getCcnum() {
		return ccnum;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public WebElement getCcmonth() {
		return ccmonth;
	}

	public WebElement getCcyear() {
		return ccyear;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public WebElement getClkbook() {
		return clkbook;
	}

}
