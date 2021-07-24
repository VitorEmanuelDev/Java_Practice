package compareStrings;

public class TestCompareStrings {
	
	String java01 = "JDK";
	String javinha = "JVM";
	String java02 = "JDK";
	
	public void compareStrings() {
	 System.out.println("Comparing " + java01 + " and " + javinha
             + " : " + java01.equals(javinha));
	 System.out.println("Comparing " + java01 + " and " + java02
             + " : " + java01.equals(java02));
	
	}
}
