import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Ramazan Pidesi Uygulaması
        //Fırından 1(dahil) ile 10(dahil) arası pide çıkacak. Kuyruktakiler Pideyi almaya çalışacak.

        System.out.println("******Ramazan Pidesi Uygulaması******");

        Queue<String> pide_kuyrugu = new LinkedList<String>();
        Random random = new Random(); // rastgele sayı oluşturmak için random sınıfından obje oluşturduk

        pide_kuyrugu.offer("1.");
        pide_kuyrugu.offer("2.");
        pide_kuyrugu.offer("3.");
        pide_kuyrugu.offer("4.");
        pide_kuyrugu.offer("5.");
        pide_kuyrugu.offer("6.");
        pide_kuyrugu.offer("7.");
        pide_kuyrugu.offer("8.");
        pide_kuyrugu.offer("9.");
        pide_kuyrugu.offer("10.");

        int pide_sayisi = 1 +random.nextInt(10); // 0 ile 9 arası bir değer çıkar rastgele
        //biz 1-10 arası dahil istediğimiz için artı bir ekledik

        System.out.println("Pideler Çıkıyor.");
        System.out.println("Çıkan Pide Sayısı : " + pide_sayisi);

        Thread.sleep(3000 ); // programımızı 3 saniye bekletir

        while (pide_sayisi != 0) {// sıfıra eşit değilse true döner
            //eğer sıfıra eşitse false döner
            //pide bitene kadar devam edecek

            System.out.println(pide_kuyrugu.poll() + " pideyi aldı.");
            pide_sayisi--;
            Thread.sleep(1000);

        }
        System.out.println("Pİde Kalmamıştır...");


    }
}