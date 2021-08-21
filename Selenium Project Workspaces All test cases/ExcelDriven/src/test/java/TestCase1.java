import java.io.IOException;
import java.util.ArrayList;

public class TestCase1 {

	public static void main(String[] args) throws IOException {
		
		DataDriving dd = new DataDriving();
		ArrayList<String> data = dd.getData("Delete Profile");
		
		
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
		
	}
}
