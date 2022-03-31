package rs.ac.bg.fon.np.json_api_caller;

import com.google.gson.annotations.SerializedName;

public class Ipstack {

	@SerializedName("ip")
	private String ip_address;
	private String type;
	private String country_code;
	private String country_name;
	private String city;
	private String zip;
	
	public String getIp_address() {
		return ip_address;
	}
	public void setIp_address(String ip_address) {
		this.ip_address = ip_address;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getCountry_code() {
		return country_code;
	}
	public void setCountry_code(String country_code) {
		this.country_code = country_code;
	}
	public String getCountry_name() {
		return country_name;
	}
	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Ipstack [ip_address=" + ip_address + ", type=" + type + ", country_code=" + country_code
				+ ", country_name=" + country_name + ", city=" + city + ", zip=" + zip + "]";
	}
	
}
