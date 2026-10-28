package resources;

public enum APITestResources {

	AddPlace("/maps/api/place/add/json"),
	getPlace("/maps/api/place/get/json");

	String resource;
	APITestResources(String resource){
	
	this.resource=resource;
	}
    public String getResource() {
    	return resource;
    }
}
