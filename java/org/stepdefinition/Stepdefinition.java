package org.stepdefinition;

import java.util.Date;

import org.base.ReUsable;
import org.junit.Assert;
import org.pojo.BookingConfirmationPojo;
import org.pojo.HotelDetailPojo;
import org.pojo.LoginPojo;
import org.pojo.PaymentPojo;
import org.pojo.SearchHotelPojo;

import io.cucumber.java.en.*;

public class Stepdefinition extends ReUsable {

	@Given("User needs to land in the Adactin Home Page")
	public void user_needs_to_land_in_the_Adactin_Home_Page() {
		
		openBrowser();
		loadUrl("http://adactinhotelapp.com/");
		windowMaximize();
	}

	@When("User needs to fill the {string} and {string}")
	public void user_needs_to_fill_the_and(String s1, String s2) {
		LoginPojo l= new LoginPojo();
		type(l.getUserName(), s1);
		type(l.getPwd(), s2);
	}

	@When("User needs to click the login button")
	public void user_needs_to_click_the_login_button() {
		LoginPojo l= new LoginPojo();
		btnclick(l.getLoginBtn());
		
	}

	@Then("Verify User is successfully get into the Adactin Hotel booking page")
	public void verify_User_is_successfully_get_into_the_Adactin_Hotel_booking_page() {
		Assert.assertTrue("User not in Adactin Hotel Page", driver.getTitle().contains("AdactIn"));
		System.out.println(new Date());
	}
	
	@Given("User needs to land in the Adactin Search page")
	public void user_needs_to_land_in_the_Adactin_Search_page() {
		System.out.println("User is in hotel Search Page ");	    
	}

	@When("User needs to select Location")
	public void user_needs_to_select_Location() {
		SearchHotelPojo shp = new SearchHotelPojo();
		selectbytext(shp.getLoc(), "Adelaide");
	    
	}

	@When("User needs to select Hotels")
	public void user_needs_to_select_Hotels() {
		SearchHotelPojo shp = new SearchHotelPojo();
		selectbytext(shp.getHotel(), "Hotel Hervey");
	}

	@When("User needs to select Roomtype")
	public void user_needs_to_select_Roomtype() {
		SearchHotelPojo shp = new SearchHotelPojo();
		selectbytext(shp.getRoomType(), "Super Deluxe");
	}

	@When("User needs to select NoOfRooms")
	public void user_needs_to_select_NoOfRooms() {
		SearchHotelPojo shp = new SearchHotelPojo();
		selectbytext(shp.getRoomNo(),"1 - One");
	}

	@When("User needs to select NoOfAdult")
	public void user_needs_to_select_NoOfAdult() {
		SearchHotelPojo shp = new SearchHotelPojo();
		selectbytext(shp.getAdultRoom(),"2 - Two");
	}

	@When("User needs to select NoOfChildren")
	public void user_needs_to_select_NoOfChildren() {
		SearchHotelPojo shp = new SearchHotelPojo();
		selectbytext(shp.getChildRoom(),"0 - None");
	}

	@When("User needs to click the Search button")
	public void user_needs_to_click_the_Search_button() {
		SearchHotelPojo shp = new SearchHotelPojo();
		btnclick(shp.getClickSearch());
	}

	@Then("Verify User is successfullt get into the Hotel details page")
	public void verify_User_is_successfullt_get_into_the_Hotel_details_page() {
		Assert.assertTrue("User not in Hotel details Page", driver.getTitle().contains("AdactIn"));
		System.out.println(new Date());
	}
	
	@Given("User needs to land in the Hotel details Page")
	public void user_needs_to_land_in_the_Hotel_details_Page() {
		System.out.println("User is in hotel details Page ");
	}
	
	@When("User needs to click on the selected Hotel")
	public void user_needs_to_click_on_the_selected_Hotel() {
		HotelDetailPojo hdp= new HotelDetailPojo();
		btnclick(hdp.getSelectBtn());
	}

	@When("user needs to click Continue for proceeding further")
	public void user_needs_to_click_Continue_for_proceeding_further() {
		HotelDetailPojo hdp= new HotelDetailPojo();
		btnclick(hdp.getBtnClick());
	}

	@Then("Verify User is successfully get into the Payment page")
	public void verify_User_is_successfully_get_into_the_Payment_page() {
		Assert.assertTrue("User not in Payment Page", driver.getTitle().contains("AdactIn"));
		System.out.println(new Date());
	}

	@Given("User needs to land in the Hotel Payment Page")
	public void user_needs_to_land_in_the_Hotel_Payment_Page() {
	    System.out.println("User is in Payment Page");
	}

	@When("User needs to fill firstname")
	public void user_needs_to_fill_firstname() {
	    PaymentPojo pp =new PaymentPojo();
	    type(pp.getName(), "Gowtham");
	}

	@When("User needs to fill lastname")
	public void user_needs_to_fill_lastname() {
		PaymentPojo pp =new PaymentPojo();
	    type(pp.getLastName(),"C V");
	}

	@When("User needs to fill address")
	public void user_needs_to_fill_address() {
		PaymentPojo pp =new PaymentPojo();
	    type(pp.getAdd(),"Jamia Nagar");
	}

	@When("User needs to fill ccnum")
	public void user_needs_to_fill_ccnum() {
		PaymentPojo pp =new PaymentPojo();
	    type(pp.getCcnum(),"1452145214521452");
	}

	@When("User needs to select cctype")
	public void user_needs_to_select_cctype() {
		PaymentPojo pp =new PaymentPojo();
		selectbytext(pp.getCctype(), "American Express");
	}

	@When("User needs to select ccmonth")
	public void user_needs_to_select_ccmonth() {
		PaymentPojo pp =new PaymentPojo();
		selectbytext(pp.getCcmonth(),"June");
	}

	@When("User needs to select ccyear")
	public void user_needs_to_select_ccyear() {
		PaymentPojo pp =new PaymentPojo();
		selectbytext(pp.getCcyear(),"2020");
	}

	@When("User needs to fill cvv")
	public void user_needs_to_fill_cvv() {
		PaymentPojo pp =new PaymentPojo();
		type(pp.getCvv(),"159");
	}

	@When("User needs to click the book button")
	public void user_needs_to_click_the_book_button() throws Exception {
		PaymentPojo pp =new PaymentPojo();
		btnclick(pp.getClkbook());
		sleep(8000);
	}

	@Then("Verify User is in the Booking Confirmation Page")
	public void verify_User_is_in_the_Booking_Confirmation_Page() {
		Assert.assertTrue("User not in Confirmation Page", driver.getTitle().contains("AdactIn"));
		System.out.println(new Date());
	
	}
	@Given("User needs to land in the Booking confirmation page")
	public void user_needs_to_land_in_the_Booking_confirmation_page() {
	    System.out.println("User is in Booking confirmation page");
	}

	@When("print the Order no and price")
	public void print_the_Order_no_and_price() {
	    BookingConfirmationPojo bcp = new BookingConfirmationPojo();
	    printtext(bcp.getOrderNo());
	    printtext(bcp.getPrice());
	}

	@When("User needs to click the logout button")
	public void user_needs_to_click_the_logout_button() {
		BookingConfirmationPojo bcp = new BookingConfirmationPojo();
	    btnclick(bcp.getLogoutBtn());
	}

	@Then("Verify User is in logout page")
	public void verify_User_is_in_logout_page() {
		System.out.println("You have successfully logged out. ");
		driver.close();		
	}
}

