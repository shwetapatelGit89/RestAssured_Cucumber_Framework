package resources;

import java.util.*;

import pojo.AddPlace;
import pojo.Location;

public class TestData {
	AddPlace a = new AddPlace();
	Location location = new Location();
	public AddPlace AddPlaceData(String name, String address)
	{
		location.setLat(-38.383494);
		location.setLng(33.427362);
		List<String> list = new ArrayList<>();
		list.add("shoe park");
		list.add("shop");
		a.setLocation(location);
		a.setName(name);
		a.setAccuracy(50);
		a.setAddress(address);
		a.setLanguage("French-IN");
		a.setPhone_number("(+91) 983 893 3937");
		a.setTypes(list);
	    a.setWebsite("http://google.com");
	    return a;
	}
}
