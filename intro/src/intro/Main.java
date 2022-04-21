package intro;

public class Main {

	public static void main(String[] args) {
		String internetSubeButonu="Ýnternet Þubesye gir";
		double dolarDun=8.20;
		double dolarBugün= 8.20;
		int vade = 36;
		boolean dustuMu=false;
		
		System.out.println(internetSubeButonu);
		if(dolarBugün<dolarDun) {
			System.out.println("Dolar düþtü resmi");
		}
		else if(dolarBugün>dolarDun) {
			System.out.println("Dolar yükseldi resmi");
		}
		else {
			System.out.println("Dolar eþittir resmi");
		}
		String kredi1="Hýzlý kredi";
		String kredi2="Mutlu emekli kredisi";
		String kredi3="konut Kredisi";
		String kredi4="Çiftçi Kredisi";
		String kredi5="msb kredisi";
		String kredi6="meb kredisi";
		String kredi7="Kültür Bakanlýðý  kredisi";
		
		System.out.println(kredi1); 
		System.out.println(kredi2); 
		System.out.println(kredi3); 
		System.out.println(kredi4); 
		System.out.println(kredi5); 
		System.out.println(kredi6); 
		System.out.println(kredi7);
		
		System.out.println("*****************************************\n\n\n");
		
		String[] krediler =
			{
					"Hýzlý kredi",
					"Mutlu emekli kredisi",
					"konut Kredisi",
					"Çiftçi Kredisi",
					"msb kredisi",
					"meb kredisi",
					"Kültür Bakanlýðý  kredisi"
			};
		for(String kredi:krediler) {
			System.out.println(kredi);
			}System.out.println("*****************************************\n\n\n");
		for(int i=0;i<krediler.length;i++) {
			System.out.println(krediler[i]);
		}
		int sayi1=20;
		int sayi2=30;
	    sayi1=sayi2;
	    sayi2=100;
	    System.out.println(sayi1);
	    int[] sayilar1= {1,2,3,4,5};
	    int[] sayilar2= {10,20,30,40,50};
		sayilar1=sayilar2;
		sayilar2[0]=100;
		System.out.println(sayilar1[0]);
		String sehir1="Ankara";
		String sehir2="Ýstanbul";
		sehir1=sehir2;
		sehir2="izmir";
		System.out.println(sehir1);
	

	}

}
