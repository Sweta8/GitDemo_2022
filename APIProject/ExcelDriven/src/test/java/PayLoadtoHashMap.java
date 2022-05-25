import java.util.HashMap;
import java.util.Map;

public class PayLoadtoHashMap {
	
	
	public static void main(String[] args)
	{
		Map<String, Object> m =new HashMap<String, Object>();
		m.put("name", "sweta");
		m.put("age", 28);
		Map<String, Object> location =new HashMap<String, Object>();
		location.put("lat", 3.189);
		location.put("long", 3.19897);
		m.put("location", location);
		
//		given().log().all().queryParam()
//		.body(m)
//		.when().post()
//		.then().assertThat().statusCope();
		
	}

}
