package fundamentals;

public class DatatypesInJava {
	public static void main(String[] args) {
		int a = 10;
//		int is 4 bytes
		short s = 15;
//		short is 2 bytes
		byte b = 11;
//		byte is 1 byte
		long l = 117;
//		LONG IS 4 BYTES LONG
//		DATA TYPES TO STORE DECIMAL NUMBERS:
		double d = 10.543578999998877777788899999999; 
		float f  = 10.523344444555555554444444444444f;
		System.out.println("The float is: "+f+" and the double is "+d);
//		precision difference is something which is there among double and float. Double is more accurate as it can store more numbers to momre decimal places.
//		DATA TYPES FOR STORING CHARACTERS.
		char ch = 'a';
		
		System.out.println(ch + " is a character");
//		string is a datatype which is use to store the group of characters. 
		String st = "hello world";
		
//		ANOTHER DATATYPE IS BOOLEAN:
		boolean bool = true;
//		boolean can either be true or false notheing else.
		
		System.out.println("that's all about data types");
	}

}
