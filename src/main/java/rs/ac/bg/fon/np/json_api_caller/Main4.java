package rs.ac.bg.fon.np.json_api_caller;

import java.io.FileWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

public class Main4 {

	public static void main(String[] args) {
		
		try(FileWriter fw = new FileWriter("rucni_upis.json")){
			
			JsonObject ip = new JsonObject();
			ip.addProperty("ip", "178.221.21.240");
			ip.addProperty("type", "ipv4");
			ip.addProperty("country_code", "RS");
			ip.addProperty("country_name", "Serbia");
			ip.addProperty("city", "Belgrade");
			ip.addProperty("zip", "11000");
			
			Gson gson = new GsonBuilder().setPrettyPrinting().serializeNulls().create();
			
			gson.toJson(ip, fw);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
