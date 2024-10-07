import java.util.Scanner;

public class KDV {

public static void main(String[] args) {
   

				
    double kdvoran = 0.18;	
		
    Scanner inpScanner = new Scanner(System.in);
    
    System.out.print("Lütfen Tutarı Giriniz :");
    Double tutar = inpScanner.nextDouble();
    System.out.println("KDV'siz Tutar :" +tutar);
    
   
    if (tutar<1000) {
        kdvoran=0.18;
    }else {
        kdvoran=0.08;
    }
    
    
    
    System.out.println("KDV Oranı "+ kdvoran);
    Double Kdvtutar = tutar*kdvoran;
    System.out.println("KDV Tutarı :"+Kdvtutar);
    
    
    double kdvlitutar = tutar+Kdvtutar;
    
    System.out.println("KDV'li Tutar :"+kdvlitutar);
    
    














    
}




}
