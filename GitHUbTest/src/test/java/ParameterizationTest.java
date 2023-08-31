import org.testng.annotations.Test;

public class ParameterizationTest {
	
	@Test
	public void parameterTest()
	{
		String s=System.getProperty("browser");
		System.out.println("Browser selected"+s);
	}
	

}
