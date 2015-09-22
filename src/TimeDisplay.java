/*Chris Mabey
 * Mr. Kiedes
 * Lab03st 100 Pt. Version
 * 18 September 2015*/
public class TimeDisplay {
	public static void main(String args[]){
		//Startms = starting miliseconds
		int Startms = 123456789;
		//hr = hours
		int hr = Startms / 3600000;
		//mn = minutes
		int mn = (Startms % 3600000)/ 60000;
		//sc = seconds
		int sc =( (Startms % 3600000) % 60000)/1000;
		//ms = miliseconds
		int ms = ( (Startms % 3600000) % 60000) % 1000;
		
		System.out.println("Lab03, 100 Point Version");
		System.out.println();
		System.out.println("Starting miliseconds:" + Startms);
		System.out.println("Hours:" + hr);
		System.out.println("Minutes:" + mn);
		System.out.println("Seconds:" + sc);
		System.out.println("Miliseconds:" + ms);
		}

}
