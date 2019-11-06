package at.home1;

public class homeAt9 {

	public static void main(String[] args) {
		
		int sayi = 1234, tersi = 0;
        int yedek=sayi;
 
        for(; sayi != 0; sayi = sayi/10) {
        	
            int basamak = sayi % 10;
            tersi = tersi * 10 + basamak;
        }
        
        System.out.println("Sayi      : " + yedek);
        System.out.println("Sayinin Tersi: " + tersi);

	}

}
