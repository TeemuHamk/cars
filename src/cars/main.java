package cars;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Auto auto1 = new Auto();
		auto1.malli = "Mersu";
		auto1.merkki = "Vayrynen";
		auto1.Bensanmaara = 10;
		auto1.tankkaus = 5;
		auto1.tankkaa(auto1.tankkaus);
		auto1.NaytaTiedot();
		


		Auto auto2 = new Auto("Mercedes", "C-Class", 10);
		auto2.NaytaTiedot();
		// Added comment
		
	}

} // main class ends

class Auto
{ // auto class starts
	
	// Attribuutit
	
	String merkki;
	String malli;
	int Bensanmaara;
	int tankkaus;
	
	// Muodostimet
	
	public Auto()
	{
	merkki="";
	malli="";
	Bensanmaara=0;
	tankkaus=0;
	}
	
	public Auto(String make, String model, int gas)
	{
		
		merkki = make;
		malli = model;
		Bensanmaara = gas;
	}
	
	// Metodit
	
	
	public void jarruta()
	{ // Jarruta alkaa
		
		System.out.print("Auto jarruttaa");
		
	} // Jarruta loppuu
	
	public void kiihdyta()
	{ // kiihdyta alkaa
		
		if (Bensanmaara == 0)
		{
			System.out.println("Tankissa ei ole bensaa");
		}
		else
		{
		System.out.println("Auto kiihdyttaa");
		Bensanmaara = -1;
		}
		
	} // kiihdyta loppuu
	
	public void NaytaTiedot()
	{ // naytatiedot alkaa
		
		System.out.println("Auton merkki: " + merkki);
		System.out.println("Auton malli : " + malli);
		System.out.println("Tankissa bensaa : " + Bensanmaara);
		
	} // naytatiedot loppuu
	
	public void tankkaa(int i1)
	{

		System.out.println("Tankissa on bensaa :" + i1);
		System.out.println("Tankkaus : " + tankkaus);
		i1 = i1 + tankkaus;
		System.out.println("Tankissa bensaa tankkauksen jälkeen: " + i1);
		
		 
		
		
		
	}
	
	
} // Auto class ends