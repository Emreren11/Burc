import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        int month,day;

        System.out.print("Doğduğunuz ayı giriniz (1-12): ");
        month= inp.nextInt();
        // İç içe do while kullandım çünkü 1den küçük 12 den büyük olması lazım. && kontrol edildiğinde aralık olmadığı için direk false döndürüyordu
        do { // Burada geçersiz bir sayı girilirse geçerli sayı girene kadar soru soruyoruz
            if(month>12)
            {
                System.out.print("Lütfen 1-12 arasında bir sayı giriniz: ");
                month= inp.nextInt();
            }

            if (month<1){
                do {
                    System.out.print("Lütfen 1-12 arasında bir sayı giriniz: ");
                    month= inp.nextInt();
                }while (month<1);
            }

        }while(month>12);

        System.out.print("Doğduğunuz günü giriniz (1-30): ");
        day= inp.nextInt();
        // Burada da aynı sebepten iç içe do while kullandım
        do { // Burada geçersiz bir sayı girilirse geçerli sayı girene kadar soru soruyoruz
            if(day>30)
            {
                System.out.print("Lütfen 1-30 arasında bir sayı giriniz: ");
                day= inp.nextInt();
            }

            if (day<1){
                do {
                    System.out.print("Lütfen 1-30 arasında bir sayı giriniz: ");
                    day= inp.nextInt();
                }while (day<1);
            }

        }while(day>30);

        if (month==1)
        {
            if (day>21)
                System.out.println("Kova Burcu");
            else
                System.out.println("Oğlak Burcu");
        }
        else if (month==2)
        {
            if (day>19)
                System.out.println("Balık Burcu");
            else
                System.out.println("Kova Burcu");
        }
        else if (month==3)
        {
            if (day>20)
                System.out.println("Koç Burcu");
            else
                System.out.println("Balık Burcu");
        }
        else if (month==4)
        {
            if (day>20)
                System.out.println("Boğa Burcu");
            else
                System.out.println("Koç Burcu");
        }
        else if (month==5)
        {
            if (day>21)
                System.out.println("İkizler Burcu");
            else
                System.out.println("Koç Burcu");
        }
        else if (month==6)
        {
            if (day>22)
                System.out.println("Yengeç Burcu");
            else
                System.out.println("İkizler Burcu");
        }
        else if (month==7)
        {
            if (day>22)
                System.out.println("Aslan Burcu");
            else
                System.out.println("Yengeç Burcu");
        }
        else if (month==8)
        {
            if (day>22)
                System.out.println("Başak Burcu");
            else
                System.out.println("Aslan Burcu");
        }
        else if (month==9)
        {
            if (day>22)
                System.out.println("Terazi Burcu");
            else
                System.out.println("Başak Burcu");
        }
        else if (month==10)
        {
            if (day>22)
                System.out.println("Akrep Burcu");
            else
                System.out.println("Terazi Burcu");
        }
        else if (month==11)
        {
            if (day>21)
                System.out.println("Yay Burcu");
            else
                System.out.println("Akrep Burcu");
        }
        else if (month==12)
        {
            if (day>21)
                System.out.println("Oğlak Burcu");
            else
                System.out.println("Yay Burcu");
        }
/*
Koç Burcu : 21 Mart - 20 Nisan
Boğa Burcu : 21 Nisan - 21 Mayıs
İkizler Burcu : 22 Mayıs - 22 Haziran
Yengeç Burcu : 23 Haziran - 22 Temmuz
Aslan Burcu : 23 Temmuz - 22 Ağustos
Başak Burcu : 23 Ağustos - 22 Eylül
Terazi Burcu : 23 Eylül - 22 Ekim
Akrep Burcu : 23 Ekim - 21 Kasım
Yay Burcu : 22 Kasım - 21 Aralık
Oğlak Burcu : 22 Aralık - 21 Ocak
Kova Burcu : 22 Ocak - 19 Şubat
Balık Burcu : 20 Şubat - 20 Mart
 */

    }
}