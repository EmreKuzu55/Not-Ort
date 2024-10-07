
import java.util.Scanner;

public class Giris {

public static void main(String[] args) {

    int mat,fizk,kimya,tarih,müzik,Türkçe;
		
    try (Scanner inputScanner = new Scanner(System.in)) {
        System.out.print("Matematik Notunuzu Giriniz :");
        mat = inputScanner.nextInt();
        
        System.out.print("Fizik Notunuzu Giriniz :");
        fizk = inputScanner.nextInt();
        
        System.out.print("Tarih Notunuzu Giriniz :");
        tarih = inputScanner.nextInt();
        
        System.out.print("Kimya Notunuzu Giriniz :");
        kimya = inputScanner.nextInt();
        
        System.out.print("Müzik Notunuzu Giriniz :");
        müzik = inputScanner.nextInt();
        
        System.out.print("Türkçe Notunuzu Giriniz :");
        Türkçe = inputScanner.nextInt();
    }
    
    int Top = (mat+fizk+tarih+Türkçe+kimya+müzik);
    Double sonuc= Top/6.0;
    
    
    System.out.print("Not Ortalamanız :"+sonuc);

    
    if (sonuc>60) {
        System.out.println(" Sınıfı Başarıyla Geçtiniz");
    }else {
        System.out.println(" Maalesef Sınıfı Geçemediniz");
    }
    

}
    
}
