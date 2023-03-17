package in.co.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	
	public static void main(String [] args) throws ParseException {
	
	Person p=new Person();
	String i="13/3/23";
	
	p.SetName("Mandloi");
	System.out.println(p.getName());
	
	SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyy");
	Date d=sdf.parse(i);
	System.out.println(sdf.format(d));
	
	p.Setaddress("Vijaynagar");
	System.out.println(p.getaddress());

	}
	}
	
