package com.ankit.TwoServicesConnection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Controller {

	@GetMapping("/location")
	public String geoLocation() {
		return "Hello World";
		
	}
	
	@GetMapping("/weather")
	public String showHeat() {
		
		RestTemplate template = new RestTemplate();
		String data = template.getForEntity("http://localhost:8080/weather",String.class).getBody();
		return data;
//		return geoLocation();
	}
	
	@GetMapping("/location/error/{datacode}")
	public int checkForError(@PathVariable int datacode) throws Exception {
		
		if(datacode == 1) {
			throw new Exception();
		}
		else {
			
			return datacode;
		}
	}
}
