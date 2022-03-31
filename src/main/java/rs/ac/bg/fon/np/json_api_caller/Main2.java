package rs.ac.bg.fon.np.json_api_caller;

import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Main2 {

	public static void main(String[] args) {

		Ipstack ip1 = new Ipstack();
		ip1.setIp_address("134.201.250.155");
		ip1.setType("ipv4");
		ip1.setCountry_code("US");
		ip1.setCountry_name("United States");
		ip1.setCity("Los Angeles");
		ip1.setZip("90012");
		
		Ipstack ip2 = new Ipstack();
		ip2.setIp_address("123.123.123.123");
		ip2.setType("ipv4");
		ip2.setCountry_code("CN");
		ip2.setCountry_name("China");
		ip2.setCity("Beijing");
		ip2.setZip("100000");
		
		Ipstack ip3 = new Ipstack();
		ip3.setIp_address("178.221.21.240");
		ip3.setType("ipv4");
		ip3.setCountry_code("RS");
		ip3.setCountry_name("Serbia");
		ip3.setCity("Belgrade");
		ip3.setZip("11000");
		
		Ipstack[] niz = {ip1,ip2,ip3};
		
		try(FileWriter fw = new FileWriter("niz_objekata.json")){
			
			Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
			
			gson.toJson(niz, fw);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
