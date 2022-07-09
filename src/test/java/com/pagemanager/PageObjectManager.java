package com.pagemanager;

import com.pages.BookingConfimationPage;
import com.pages.BookingHotelPage;
import com.pages.CancelBookingPage;
import com.pages.LoginPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;
/**
 * 
 * @author Aakash
 *@Description to manage all pages in single class to avoid creating another object
 *@CreationDate 27/06/22
 *
 */
public class PageObjectManager {
	private LoginPage loginPage;
	private SearchHotelPage searchHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookingHotelPage bookingHotelPage;
	private CancelBookingPage cancelBookingPage;
	private BookingConfimationPage bookingConfimationPage;
	
	public LoginPage getLoginPage() {
		//1.if loginPage is null , then we need to ceate object.
		//if loginpage already has object, we use it.

		return (loginPage==null)? loginPage=new LoginPage() :loginPage;
	}
	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage==null)?searchHotelPage=new SearchHotelPage():searchHotelPage;
	}
	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage==null)?selectHotelPage=new SelectHotelPage():selectHotelPage;
	}
	public BookingHotelPage getBookingHotelPage() {
		return (bookingHotelPage==null)?bookingHotelPage=new BookingHotelPage(): bookingHotelPage;
	}
	public CancelBookingPage getCancelBookingPage() {
		return (cancelBookingPage==null)?cancelBookingPage=new CancelBookingPage():cancelBookingPage;
	}
	public BookingConfimationPage getBookingConfimationPage() {
		return (bookingConfimationPage==null)?bookingConfimationPage=new BookingConfimationPage():bookingConfimationPage;
	}

}
