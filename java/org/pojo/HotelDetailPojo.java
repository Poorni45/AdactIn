package org.pojo;

import org.base.ReUsable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HotelDetailPojo extends ReUsable{
	public HotelDetailPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement selectBtn;
	
	@FindBy(id = "continue")
	private WebElement btnClick;

	public WebElement getSelectBtn() {
		return selectBtn;
	}

	public WebElement getBtnClick() {
		return btnClick;
	}
	
}
