import java.util.Scanner;
public class phonetest {
	
		public static void main(String[] args) {
			Scanner scan= new Scanner(System.in);

		Phone Phone1  = new Phone ("Apple", "IphoneX", 2017, 799);

			System.out.println(Phone1.Brand);

			System.out.println(Phone1.PhoneName);	

			System.out.println(Phone1.YearReleased);			

			System.out.println(Phone1.Price);	
		
			
			
			Phone Phone2  = new Phone ("Samsung", "GalaxyX", 2017, 799) ;	 
			
			System.out.println(Phone2.Brand);

			System.out.println(Phone2.PhoneName);	

			System.out.println(Phone2.YearReleased);			

			System.out.println(Phone2.Price);			

			
			}
}
