package rs.ac.bg.fon.np.json_api_caller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import com.google.gson.Gson;

public class Main1 {
	
	public static String BASE_URL = "http://api.ipstack.com";
	public static String ACCESS_KEY = "42f903358d01c3db82bc2bc95a5114d3";


	public static void main(String[] args) {
		
		try {
			
			URL url = new URL(BASE_URL + "/134.201.250.155" + "?access_key=" + ACCESS_KEY);
			
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			
			Gson gson = new Gson();
			
			BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
			
			Ipstack ip = gson.fromJson(br, Ipstack.class);
			
			System.out.print(ip);
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
