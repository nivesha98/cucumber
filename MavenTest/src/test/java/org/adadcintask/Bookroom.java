 package org.adadcintask;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.source.Baseclass;

public class Bookroom {
public static void main(String[] args) throws IOException {
	Baseclass baseclass=new Baseclass();
	baseclass.launchUrl();
	baseclass.loadUrl("https://adactinhotelapp.com/");
	baseclass.maximize();
	baseclass.waits();
	String usertext = baseclass.getData("adactin", 1, 0);
	WebElement username = baseclass.locatorId("username");
	baseclass.sendkeys(username, usertext);
	String passtext = baseclass.getData("adactin", 1, 1);
	WebElement password= baseclass.locatorId("password");
	baseclass.sendkeys(password, passtext);
	WebElement btnclick = baseclass.locatorId("login");
	baseclass.buttonClick(btnclick);
	String location = baseclass.getData("adactin", 1,2);
	WebElement locationdata = baseclass.locatorId("location");
	baseclass.sendkeys(locationdata, location);
	String hotel = baseclass.getData("adactin", 1,3);

	WebElement hoteldata = baseclass.locatorId("hotels");
	baseclass.sendkeys(hoteldata, hotel);
	String room = baseclass.getData("adactin", 1,4);
	WebElement roomdata = baseclass.locatorId("room_type");
	baseclass.sendkeys(roomdata, room);
	String numberofrooms = baseclass.getData("adactin", 1,5);
	WebElement numberofrommsroomdata = baseclass.locatorId("room_nos");
	baseclass.sendkeys(numberofrommsroomdata, numberofrooms);
	String cheakin = baseclass.getData("adactin", 1,6);
	WebElement cheakindata = baseclass.locatorId("datepick_in");
	baseclass.sendkeys(cheakindata, cheakin);
	String cheakout = baseclass.getData("adactin", 1,7);
	WebElement cheakoutdata  = baseclass.locatorId("datepick_out");
	baseclass.sendkeys(cheakoutdata, cheakout);
	baseclass.locatorId("Submit").click();
	baseclass.locatorId("radiobutton_0").click();
	baseclass.locatorId("continue").click();
	String Fname = baseclass.getData("adactin", 1,8);
	WebElement Fnamedata = baseclass.locatorId("first_name");
	baseclass.sendkeys(Fnamedata, Fname);
	String Lname = baseclass.getData("adactin", 1,9);
	WebElement Lnamedata = baseclass.locatorId("last_name");
    baseclass.sendkeys(Lnamedata, Lname);
    String  addressdata= baseclass.getData("adactin", 1,10);
	WebElement address  = baseclass.locatorId("address");
	baseclass.sendkeys(address, addressdata);
	String ccdata = baseclass.getData("adactin", 1,11);
	WebElement ccnumber = baseclass.locatorId("cc_num");
	baseclass.sendkeys(ccnumber, ccdata);
	String cctypedata = baseclass.getData("adactin", 1,12);
	WebElement cctype= baseclass.locatorId("cc_type");
	baseclass.sendkeys(cctype, cctypedata);
	String ccmonthdata = baseclass.getData("adactin", 1,13);
	WebElement ccmonth= baseclass.locatorId("cc_exp_month");
	baseclass.sendkeys(ccmonth, ccmonthdata);
	String ccyeardata = baseclass.getData("adactin", 1,14);
	WebElement ccyear= baseclass.locatorId("cc_exp_year");
	baseclass.sendkeys(ccyear, ccyeardata);
		String ccvdata = baseclass.getData("adactin", 1,15);
	WebElement ccvnumber= baseclass.locatorId("cc_cvv");
	baseclass.sendkeys(ccvnumber, ccvdata);
	baseclass.locatorId("book_now").click();
	
	WebElement orderNo = baseclass.locatorId("order_no");
	String orderIDTxt = baseclass.getAttribute(orderNo);
	baseclass.createData("adactin", 1, 16, orderIDTxt, "C:\\Jayashree java\\MavenTest\\excelsheet\\adacin.xlsx");
	
			
	
	
	
}
}