package rs.ac.bg.fon.np.json_api_caller;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.LinkedList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Main3 {

	public static void main(String[] args) {
		
		try(FileReader fr = new FileReader("niz_objekata.json")){
			
			List<Ipstack> lista;
			
			Gson gson = new Gson();
			
			Type tipLista = new TypeToken<LinkedList<Ipstack>>() {}.getType();
			
			lista = gson.fromJson(fr, tipLista);
			
			for(Ipstack ip: lista) {
				System.out.println(ip);
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}

	}

}
