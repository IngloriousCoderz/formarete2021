package it.formarete.designpatterns.singleton;

public class JsonSerializer {
	private static JsonSerializer singleton;

//	static {
//		singleton = new JsonSerializer();
//	}

	public static JsonSerializer getInstance() {
		if (singleton == null) {
			System.out.println("Created");
			singleton = new JsonSerializer();
		}
		return singleton;
	}

	private JsonSerializer() {

	}

	public String stringify(Object object) {
		return null;
	}

	public Object fromJson(String json) {
		return null;
	}

	public static void main(String[] args) {
		JsonSerializer serializer = JsonSerializer.getInstance();
		serializer.stringify("{ \"hello\": \"world\" }");

		JsonSerializer serializer2 = JsonSerializer.getInstance();
		serializer2.fromJson(null);
		
		System.out.println(serializer == serializer2);
	}
}
