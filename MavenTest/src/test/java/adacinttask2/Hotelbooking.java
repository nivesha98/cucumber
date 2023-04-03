package adacinttask2;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.source.Baseclass;

public class Hotelbooking extends Baseclass {

	@BeforeClass
	public static void beforemethod() {

		launchUrl();
		loadUrl("https://adactinhotelapp.com/");
		maximize();
		waits();
	}
	
	@Test
	public void test() throws IOException {
		String usertext = getData("adactin", 1, 0);
		WebElement username = locatorId("username");
		sendkeys(username, usertext);
		String passtext = getData("adactin", 1, 1);
		WebElement password= locatorId("password");
		sendkeys(password, passtext);
		WebElement btnclick = locatorId("login");
		buttonClick(btnclick);
		WebElement loginname = locatorId("username_show");
		String attribute = getAttribute(loginname);
		Assert.assertEquals("verify login name", "Hello Princesan!", attribute);
		String location = getData("adactin", 1,2);
		WebElement locationdata =locatorId("location");
		sendkeys(locationdata, location);
		String hotel = getData("adactin", 1,3);

		WebElement hoteldata = locatorId("hotels");
		sendkeys(hoteldata, hotel);
		String room = getData("adactin", 1,4);
		WebElement roomdata = locatorId("room_type");
		sendkeys(roomdata, room);
		String numberofrooms = getData("adactin", 1,5);
		WebElement numberofrommsroomdata = locatorId("room_nos");
		sendkeys(numberofrommsroomdata, numberofrooms);
		String cheakin = getData("adactin", 1,6);
		WebElement cheakindata = locatorId("datepick_in");
		sendkeys(cheakindata, cheakin);
		String cheakout = getData("adactin", 1,7);
		WebElement cheakoutdata  = locatorId("datepick_out");
		sendkeys(cheakoutdata, cheakout);
		locatorId("Submit").click();
		
		WebElement locatorxpath = locatorxpath("//td[text()='Select Hotel ']");
		String text = locatorxpath.getText();
		System.out.println(text);
		Assert.assertEquals("verifiy selecthotel", "Select Hotel", text);
		locatorId("radiobutton_0").click();
		locatorId("continue").click();
		WebElement locatorxpath2 = locatorxpath("//td[text()='Book A Hotel ']");
		String text2 = locatorxpath2.getText();
		System.out.println(text2);
		Assert.assertEquals("verifiy bookhotel", "Book A Hotel", text2);
		String Fname = getData("adactin", 1,8);
		WebElement Fnamedata = locatorId("first_name");
		sendkeys(Fnamedata, Fname);
		String Lname = getData("adactin", 1,9);
		WebElement Lnamedata = locatorId("last_name");
	    sendkeys(Lnamedata, Lname);
	    String  addressdata= getData("adactin", 1,10);
		WebElement address  = locatorId("address");
		sendkeys(address, addressdata);
		String ccdata = getData("adactin", 1,11);
		WebElement ccnumber = locatorId("cc_num");
		sendkeys(ccnumber, ccdata);
		String cctypedata = getData("adactin", 1,12);
		WebElement cctype= locatorId("cc_type");
		sendkeys(cctype, cctypedata);
		String ccmonthdata = getData("adactin", 1,13);
		WebElement ccmonth= locatorId("cc_exp_month");
	    sendkeys(ccmonth, ccmonthdata);
		String ccyeardata = getData("adactin", 1,14);
		WebElement ccyear= locatorId("cc_exp_year");
		sendkeys(ccyear, ccyeardata);
			String ccvdata = getData("adactin", 1,15);
		WebElement ccvnumber= locatorId("cc_cvv");
		sendkeys(ccvnumber, ccvdata);
		locatorId("book_now").click();
		WebElement locatorxpath3 = locatorxpath("//td[text()='Booking Confirmation ']" );
		String text3 = locatorxpath3.getText();
		System.out.println(text3);
		Assert.assertEquals("verifiybookingconfirmation ", "Booking Confirmation", text3);
	}


		
	}		
