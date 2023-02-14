package ornek;

import java.util.*;

public class ListePratikler
{
    static boolean isvarmi(int dizi[], int sayi)
    {
        for (int each : dizi)
        {
            if (each == sayi)
            {
                return false;
            }

        }return true;


    }


    public static int[] cikarDiziden(int[] diziv, int[] ydizi,int sayi){
        ydizi=new int[diziv.length-1];
        int sabit=0;

        for (int w:diziv)
        {
            if (w == sayi)
            {
                continue;
            }
            ydizi[sabit++]=w;
        }
        return ydizi;
    }

    public static int[] eksikDizi(int[] dizi){
        int sabit=0;
        int[] sepet=new int[dizi.length];
        int[] yeniDizi=new int[dizi.length];

        for (int i = 0; i < dizi.length; i++)
        {    if (i!=0&&sepet[i]==i)
            continue;
            for (int j = i; j < dizi.length; j++)
            {

                if (dizi[i] == dizi[j])
                {
                    sepet[j]=j;

                }
            }yeniDizi[sabit++]=dizi[i];
        }
        return yeniDizi;
    }
    static boolean esitMi(int sayi1,int sayi2)
    {
        if (sayi1==sayi2)
        {
            return false;
        }

        return true;
    }

    public static void ciftleri10olaniYzadir(int[] dizi){

        for (int i = 0; i < dizi.length; i++)
        {
            for (int j = i+1; j < dizi.length; j++)
            {
                if (dizi[i]+dizi[j]==10)
                {
                    System.out.println(dizi[i]+" + "+dizi[j]+" =10");
                }
            }
        }



    }
    public static void azaltma(int sayi){


        while (sayi>0){

            if (sayi%2==0)
            {
                System.out.print(sayi+" ");
            }

            sayi--;
        }
    }
    public static void rasgele(int a, int b)
    {
        Random rnd = new Random();
        int counterA=0;
        int counterB=0;
        for (int i = 0; i < 1000; i++)
        {
            int sayi=rnd.nextInt(0,1000);
            if (sayi==a)
            {
                counterA++;
            }
            else if (sayi==b)
            {
                counterB++;
            }

        }
        System.out.println(a+" sayisi "+counterA+"---"+b+" sayısı "+counterB);
    }

    public static double getOrtalamaKazanc( List<Double> kazanclistesi){


        double ortalama=0.0;
        for (double w:kazanclistesi)
        {
            ortalama+=w;
        }
        return  ortalama/kazanclistesi.size();
    }
    public static void getOrtalamaninustundeKazanc(List<String> listegunler, List<Double> kazanclistesi, double ortalama){

        List<String> listeGunSon=new ArrayList<>();
        for (int i = 0; i < kazanclistesi.size(); i++)
        {
            if (ortalama< kazanclistesi.get(i))
            {
                listeGunSon.add(listegunler.get(i));
            }
        }
        System.out.println("Günlük kazancın ortalamanın üstündeki gunlerin listesi\n"+listeGunSon);
    }

    public static void getOrtalamaninAltindaKazanc(List<String> listegunler, List<Double> kazanclistesi, double ortalama){

        List<String> listeGunSon=new ArrayList<>();
        for (int i = 0; i < kazanclistesi.size(); i++)
        {
            if (ortalama> kazanclistesi.get(i))
            {
                listeGunSon.add(listegunler.get(i));
            }
        }System.out.println("Günlük kazancın ortalamanın altındaki gunlerin listesi\n"+listeGunSon);
    }
    static void musteriSecimi(List<String> liste, List<Integer> listeFiyati, List<Integer> listeKg, List<String> sonUrun, List<Integer> listesonfiyat)
    {
        String urun = "";
        Scanner input = new Scanner(System.in);
        while (!urun.equalsIgnoreCase("Q"))
        {
            System.out.print("lütfen ürün giriniz veya çıkmak için 'Q' ya basınız : ");
            urun = input.next();

            if (liste.contains(urun) && !urun.equalsIgnoreCase("Q"))
            {
                System.out.print("Lütfen almak isteginiz urunun kg mını giriniz : ");
                int kg = input.nextInt();
                sonUrun.add(urun);
                listeKg.add(kg);
                int urunidx = liste.indexOf(urun);
                listesonfiyat.add(listeFiyati.get(urunidx));
            }else System.out.println("hatalı ürün ismi girdiniz");
        }
    }

    static int kasa(List<Integer> listeKg, List<Integer> listefiyat)
    {
        int toplam = 0;
        for (int i = 0; i < listeKg.size(); i++)
        {
            toplam += listeKg.get(i) * listefiyat.get(i);
        }
        return toplam;
    }
    public static void main(String[] args)
    {
       /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
      * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.

        Ipucu:
        Class icinde 3 method olacak
         * main() isimli bir method
         * musteriSecimi() isimli bir method
         * kasa() isimli bir method
         * */

     /*   Scanner input = new Scanner(System.in);
        List<String> liste = new ArrayList<>();
        liste.add("elma");
        liste.add("armut");
        liste.add("cilek");
        liste.add("uzum");
        liste.add("kiraz");
        List<Integer> listeFiyati = new ArrayList<>();
        listeFiyati.add(10);
        listeFiyati.add(20);
        listeFiyati.add(30);
        listeFiyati.add(40);
        listeFiyati.add(50);
        List<Integer> listeKg = new ArrayList<>();
        List<String> seciliUrunListesi = new ArrayList<>();
        List<Integer> seciliUrunlerFiyatListesi = new ArrayList<>();

        musteriSecimi(liste, listeFiyati, listeKg, seciliUrunListesi, seciliUrunlerFiyatListesi);
        int toplamFiyat = kasa(listeKg, seciliUrunlerFiyatListesi);

        System.out.println("Manavdaki urunler listesi \t=\t" + liste);
        System.out.println("Manavdaki urunler Fiyat listesi \t=\t" + listeFiyati);
        System.out.println("Manavdan sectiğimiz urun listesi \t=\t" + seciliUrunListesi);
        System.out.println("Manavdan sectiğimiz urunlerin kg listesi \t=\t" + listeKg);
        System.out.println("Manavdan sectiğimiz urunlerin kg listesi \t=\t" + seciliUrunlerFiyatListesi);
        System.out.println("Aldığımız ürünlere ödediğimiz toplama para =\t" + toplamFiyat);*/


        //5 sayısını listenin sonuna atma
     /*   int[] dizi={3,5,5,6,3,1,7,9};
        List<Integer> liste=new ArrayList<>();

        int[] dizi2=new int[dizi.length];
        int count=0;
        int sonIndex= dizi.length-1;

        for (int i = 0; i < dizi.length; i++)
        {
            if (dizi[i]!=5)
            {
                dizi2[count++]=dizi[i];
            }else {

                dizi2[sonIndex--]=dizi[i];
            }
        }
        System.out.println(Arrays.toString(dizi2));*/

        /* TASK :
         * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
         * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
         * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
         *
         * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
         * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
         * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
         * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
         * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
         *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *           ortalama kazançtan yüksekse o günleri return yap.
         * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
         *           for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
         *           ortalama kazançtan aşağıysa o günleri return yap.
         * */



      /*  String[] arrGunler={"1. Gün Pazartesi","2. Gün Salı","3. Gün Carsamba","" +
                "4. Gün Persembe","5. Gün Cuma","6. Gün Cumartesi","7. Gün Pazar"};
        List<String> listeGunler=new ArrayList<>();
        for (String w:arrGunler)
        {
            listeGunler.add(w);
        }
        List<Double> listeGunlukKazanc=new ArrayList<>();

        Scanner input=new Scanner(System.in);
        int gun=1;
        int counter=0;
        double kazanc=0;
        System.out.println("Lütefen 1 hafta boyunca olan gunluk kazanclarınızı giriniz");

        while (gun!=8){
            System.out.print(arrGunler[counter++]+" kazancınız = ");
            kazanc= input.nextDouble();
            listeGunlukKazanc.add(kazanc);
            gun++;
        }
        System.out.println(listeGunlukKazanc);

       double ortalama= getOrtalamaKazanc(listeGunlukKazanc);

       System.out.println(ortalama);

       getOrtalamaninUstundeKazancGünleri(listeGunler,listeGunlukKazanc,ortalama);

       getOrtalamaninAltindaKazancGünleri(listeGunler,listeGunlukKazanc,ortalama);*/


        //dizimizde tekrar etmeyenleri yazdıralım.liste kullanmadan ve liste kullnarak yapalım.
      /* int[] dizi={1,3,5,6,3,1,7,9};
       List<Integer> liste=new ArrayList<>();

        for (int i = 0; i < dizi.length ; i++)
        {
            for (int j = 0; j < dizi.length ; j++)
            {
                if (dizi[i] != dizi[j])
                {
                    if (!liste.contains(dizi[i]))
                    {
                        liste.add(dizi[i]);
                    }
                }
            }
        }
        System.out.println(liste);*/
         /* Scanner input=new Scanner(System.in);
        String[] arrGunler={"1. Gün Pazartesi","2. Gün Salı","3. Gün Carsamba","" +
                "4. Gün Persembe","5. Gün Cuma","6. Gün Cumartesi","7. Gün Pazar"};
        List<String> gunlerListe=new ArrayList<>();

        for (String w:arrGunler)
        {
            gunlerListe.add(w);
        }

        List<Double> gunlukKazanc=new ArrayList<>();

        int gunSayisi=1;
        double kazanc=0;
        int count=0;
        System.out.println("Lütfen gunluk kazancları giriniz");

        while (gunSayisi!=8){
            System.out.print(arrGunler[count++]+" kazancın = ");
            kazanc=input.nextDouble();
            gunlukKazanc.add(kazanc);
            gunSayisi++;
        }
        System.out.println(gunlukKazanc);
        double ortalamaKzanc=Metodlar.getOrtalamaKazanc(gunlukKazanc);
        System.out.println("Bir Haftalık kazanclarının ortalaması = "+ortalamaKzanc);

      Metodlar.getOrtalamaninustundeKazanc(gunlerListe,gunlukKazanc,ortalamaKzanc);
      Metodlar.getOrtalamaninAltindaKazanc(gunlerListe,gunlukKazanc,ortalamaKzanc);*/

//Rasgele kullabnıcı ADI OLUSTURMA KODU

   /*     Random rnd = new Random();
        Scanner scan= new Scanner(System.in);

        List<String> list = new ArrayList<>();
        list.add("Esra");
        list.add("Sumeyra");
        list.add("Cumali");
        list.add("Ebru");
        list.add("Mehmet");

        System.out.println("Kullanici isminizi giriniz");
        String kullanici= scan.nextLine().trim();

        if(list.contains(kullanici)){
            kullanici=kullanici+ rnd.nextInt(100000);  //int sayi= (int)(Math.random()*100000)
            System.out.println("Kullanici adiniz daha once alinmistir. "+kullanici+ " bu adi kullanabilirsiniz");

        }else
            System.out.println("Kullanici adiniz basariyla olsuturulmustur."+kullanici);*/

/* Mountain Array ==> [0, 2, 5, 3, 1]
        Bir array elemanları en büyük değerine kadar sürekli artan, en büyük değerinden sonra sürekli azalan değer alıyorsa Mauntain Array' dir.
        Mountain Array Değil ==> [5, 2, 7, 1, 4]
        Bir array elemanları en büyük değerine kadar sürekli azalan, en büyük değerinden sonra sürekli artan değer alıyorsa Mauntain Array değildir.*/

     /* int[] dizi = {0,7,51,11,10,3,1};
        List<Integer> liste = new ArrayList<>();
        for (int sayi:dizi)
        {
            liste.add(sayi);
        }
        int tepeNoktasi=0;
        boolean istru = true;

        for (int i = 0; i < liste.size()-1; i++)
        {
            if (istru && liste.get(i)>liste.get(i+1))
            {
                tepeNoktasi++;
                istru=false;
            }
            if (!istru && liste.get(i)< liste.get(i+1))
            {
                tepeNoktasi++;
            }
        }
        if (tepeNoktasi==1)
        {
            System.out.println("mountaindır");
        }else System.out.println("mountain deildir");*/



     /*   List<Integer> myList = new ArrayList<>();

        myList.add(17);
        myList.add(65);
        myList.add(15);
        myList.add(75);
        myList.add(7);
        myList.add(7);

        int counter = 0;

        for (int i = 0; i < myList.size()-1; i++)
        {

                if (myList.get(i)==myList.get(i+1))
                {
                    counter++;
                }
        }
        if (counter == 0)
        {
            System.out.println("benzersiz");
        }else System.out.println("benzerli "+counter);*/



     /*  // Döngüleri kullanarak tamsayılardan oluşan bir listenin tüm öğelerinin benzersiz (tekrarsız)
      //     olup olmadığını kontrol ediniz.
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(10);
        myList.add(15);
        myList.add(7);
        myList.add(7);
        myList.add(10);
        int counter = 0;
        for (int i = 0; i < myList.size(); i++)
        {
            for (int j = i; j < myList.size()-1; j++)
            {
                if (myList.get(i)== myList.get(i+1))
                {
                    counter++;
                    break;
                }
            }
        }
        if (counter == 0)
        {
            System.out.println("benzersiz");
        }else System.out.println("tekrarlı hemide "+ counter+" kere");*/



    /*  //  Listede 15 veya 13 varsa, bu elemanları kaldırınız.

        List<Integer> h = new ArrayList<>();
        h.add(10);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        h.add(13);

        for (int i = 0; i < h.size(); i++)
        {
            if (h.get(i)==15||h.get(i)==31)
            {
                h.remove(h.indexOf(h.get(i)));
                i--;
            }
        }
        System.out.println(h);*/


//sayıya cevirip farklı olanları topla dolar fiyatı 18.50 * ise 21
    /*    List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$54.45");
        myList.add("*12.99");
        myList.add("*23.60");
        double sum=0;
        double dolar=18.50;
        double yildiz=21.0;


        for (int i = 0; i < myList.size(); i++)
        {
            if (myList.get(i).contains("$"))
            {
                String k= myList.get(i).replace("$","");
                double yeni= Double.parseDouble(k);
                sum+=(yeni*dolar);
            }
            else if (myList.get(i).contains("*"))
            {
                String k1= myList.get(i).replace("*","");
                double yeni1= Double.parseDouble(k1);
                sum+=(yeni1*yildiz);
            }

        }
        System.out.println(sum);*/
 /* //aralarındaki fark en az kactır
        List<Integer> liste=new ArrayList<>();

        List<Integer> liste2=new ArrayList<>();

        liste.add(25);
        liste.add(26);
        liste.add(39);
        liste.add(7);
        liste.add(10);
        Collections.sort(liste);
        int kucuk= liste.get(1)- liste.get(0);

        for (int i = 0; i < liste.size()-1 ; i++)
        {
                if (liste.get(i+1)- liste.get(i)<kucuk)
                {
                    kucuk=liste.get(i+1)- liste.get(i);
                }
        }System.out.println(kucuk);

        for (int i = 0; i < liste.size()-1; i++)
        {
            if (liste.get(i+1)- liste.get(i)==kucuk)
            {
                liste2.add(liste.get(i+1));
                liste2.add(liste.get(i));
            }
        }
        System.out.println(liste2);*/


//BELİRLENEN BİR STRİNGİ LİSTEYE YERLEŞTİRME
      /*  List<String> harf=new ArrayList<>();

        harf.add("G");
        harf.add("S");
        harf.add("C");
        harf.add("D");
        String w="";

        while (!w.equals("Q"))
        {
            Scanner scan = new Scanner(System.in);
            w = scan.next().substring(0, 1);

            int idx = harf.indexOf(w);
            if (harf.contains(w))
            {
                harf.set(idx, "bulundu");
            }
        }
        System.out.println(harf);*/


        //maasın 1000 lira üstuyse yuzde 3 zam maasın altındaysa yuzde 7 maasından kes


      /*  List<Double> maas=new ArrayList<>();

        maas.add(2000.0);
        maas.add(500.0);
        maas.add(2500.0);
        maas.add(800.0);

        for (double sayi:maas)
        {
            int idx=maas.indexOf(sayi);
            if (sayi>=1000)
            {
                maas.set(idx,sayi*1.03);
            }else {

                maas.set(idx,sayi*0.93);
            }
        }
        System.out.println(maas);*/


        //map liste yapımı
      /* Map<String,String> liste=new HashMap<>();
        liste.put("1235","ali, fizik, 12");
        liste.put("1236","cumali, kimya, 13");
        liste.put("1237","umit, mat, 14");
        int count=0;

        System.out.println("tc"+" ".repeat(5)+"isim      bölüm      no");
        Set<Map.Entry<String,String>> yeni=liste.entrySet();

        for (Map.Entry<String,String> w:yeni)
        {
         String key=w.getKey();
         String value= w.getValue();
         String[] valueDizi=value.split(", ");

         System.out.printf("%-6s %-10s %-7s %4s",key,valueDizi[0],valueDizi[1],valueDizi[2]);
            System.out.println();
        }*/


        //printf kullanımı tablo
       /* int[] dizikg={3,5,6};
        int[] dizifiyat={10,15,20};
        String[] liste={"Elma","Armut","Çilek"};

        System.out.println("ürün    Miktar   fiyatı    ");
        System.out.println("=".repeat(30));

        for (int i = 0; i < dizikg.length; i++)
        {
            System.out.printf("%-5s %4skg %8s ",liste[i],dizikg[i],dizifiyat[i]);
            System.out.println();
        }*/


        //bir dizide gecen en cok gecen harfi yazdıran kod
    /*    String str = "Learning java is easy";
        String[] dizistr = str.replace(" ", "").split("");
        int count = 0;
        int enCokGecen = 0;
        String k = "";
        List<String> liste = new ArrayList<>();

        for (int i = 0; i < dizistr.length; i++)
        {
            if (!liste.contains(dizistr[i]))
                for (int j = 0; j < dizistr.length; j++)
                {
                    if (dizistr[i].equals(dizistr[j]))
                    {
                        count++;
                    }
                }
            if (enCokGecen < count)
            {
                enCokGecen = count;
                k = dizistr[i];
            }
            count = 0;
        }
        System.out.println(k);*/


        //listeden olusturduğumuz 3elemanlı diziyi cıkarma
   /*     Scanner scan=new Scanner(System.in);

        int[] dizi={5,9,5,75,14,14};
        int count=0;
        int sabit=0;
        int sayilar=0;
        boolean istru=true;
        List<Integer> liste=new ArrayList<>();
        int yeniDizi[] = new int[3];
        int sonDizi[]=new int[dizi.length];

        System.out.println(Arrays.toString(dizi));
        while (count!=3)
        {
            System.out.println("KONTROL sayiları gir");
            sayilar = scan.nextInt();
            yeniDizi[count++] = sayilar;
        }
        System.out.println(Arrays.toString(yeniDizi));

        for (int i = 0; i < dizi.length; i++)
        {
            liste.add(dizi[i] );
        }

            for (int j = 0; j < yeniDizi.length; j++)
            {
                int idx=liste.indexOf(yeniDizi[j]);
                if (liste.contains(yeniDizi[j]))
                {
                    liste.remove(idx);
                    j--;
                }
            }

        System.out.println(liste);*/


        //****Arrays sor metoduyla da strinleri kucukten buyuge sıralamıs en buyugu ve en kucuğu bulma
    /*   String str="Java kolaydır calısmayana ali ki";


        String[] dizi=str.split(" ");
        int kucuk=dizi[0].length();
        int buyuk=dizi[0].length();
        String kucuks="";

        Arrays.sort(dizi,Comparator.comparingInt(String::length));
        System.out.println(dizi[dizi.length-1]);

        for (int i = 0; i < dizi.length; i++)
        {
            for (int j = 1; j < dizi.length; j++)
            {
                if (dizi[i].length()<kucuk)
                {
                    kucuk=dizi[i].length();
                    kucuks=dizi[i];
                }
            }
        }
        System.out.println(kucuks);*/



        /* //tekrar etmeyenleri toplayan kod
        int[] dizi={5,9,5,75,14,14};

        List<Integer> liste=new ArrayList<>();


       for (int i = 0; i < dizi.length ; i++)
        {
            liste.add(dizi[i]);
        }

        int toplam=0;

        for (int i = 0; i < liste.size(); i++)
        {
            int sayindex=liste.indexOf(dizi[i]);
            int saylastindex=liste.lastIndexOf(dizi[i]);
            if (sayindex==saylastindex)
            {
                toplam+=dizi[i];

            }
        }
        System.out.println(toplam);*/


//tekrarsızları listeye koyma
     /*   List<Integer> liste=new ArrayList<>();
        int[] sayi={5,9,5,75,14,14};
        int toplam=0;
        int[] dizi=new int[sayi.length];
        int sabit=0;

       for (int i = 0; i < sayi.length; i++)
        {
            for (int j = 0; j < sayi.length ; j++)
            {
                if (!liste.contains(sayi[i]))
                {
                    liste.add(sayi[i]);
                }
            }

        }
        System.out.println(liste);*/


        //liste sorusu ekleme cıkarma değistirme kodu
      /*  List<Integer> liste = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        boolean isthere = true;
        String mesaj = "";
        while (isthere)
        {
            System.out.print("lütfen işlem yapmak istediğiniz sayıyı giriniz : ");
            int ilkGirilen = scan.nextInt();
            isthere = ilkGirilen > 0 && ilkGirilen < 4;
            if (isthere)
            {
                System.out.print("sayi gir : ");
                int sayi = scan.nextInt();
                int sayindex = liste.indexOf(sayi);
                if (ilkGirilen == 1)
                {
                    liste.add(sayi);
                    System.out.println(mesaj + "Girmiş olduğunuz " + sayi + " listeye eklendi..");
                }
                else if (ilkGirilen == 2)
                {
                    if (liste.contains(sayi))
                    {
                        liste.remove(sayindex);
                        System.out.println("Girmiş olduğunuz " + sayi + " listeden çıkarıldı..");
                    }
                    else System.out.println("Cıkarılacak sayi yok....");
                }
                else if (ilkGirilen == 3)
                {

                    if (liste.contains(sayi))
                    {
                        System.out.print("ikinci sayiyi giriniz : ");
                        int sayi2 = scan.nextInt();

                        liste.set(sayindex, sayi2);
                        System.out.println(sayi + " ve " + sayi2 + " yer değiştirdi....");
                    }
                    else System.out.println("Listede değiştirlecek eleman yok...");
                }
            }
            else
            {
                System.out.println("hatalı bir sayi ile giris yaptınız");
                isthere = false;
            }
        }
        System.out.println(liste);*/


        //l harfi olmayanları yazdıran kod
        /*String[] dizi = {"ali", "veli", "akif", "isa"};
        String harf="l";

        List<String> list = new ArrayList<>();

        for (int i = 0; i < dizi.length; i++)
        {
            if (!dizi[i].contains(harf))
            {
                list.add(dizi[i]);
            }
        }
        String[] yenistr=new String[list.size()];

        for (int i = 0; i < yenistr.length; i++)
        {
            yenistr[i]= list.get(i);
        }
        System.out.println(Arrays.toString(yenistr));*/




      /*  String[] dizi = {"ali", "veli", "akif", "isa"};
        String harf="l";

        List<String> liste = new ArrayList<>();

        for (String str:dizi)
        {
            if (!str.contains(harf))
            {
                liste.add(str);
            }
        } System.out.println(liste);*/


      /*   int[] dizi={0,2,5,3,1,7,3,2};
        Arrays.sort(dizi);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < dizi.length-1; i++)
        {
            if (dizi[i] != dizi[i+1] )
            {
                list.add(dizi[i]);
            }
        }
        if (!list.contains(dizi[dizi.length-1]))
        {
            list.add(dizi[dizi.length-1] );
        }
        int[] yenidizi=new int[list.size()];
        for (int i = 0; i < yenidizi.length ; i++)
        {
            yenidizi[i]=list.get(i);
        }
        System.out.println(Arrays.toString(yenidizi));

        int[] arr={0,2,5,3,1,7,3,2};
        Arrays.sort(dizi);

        List<Integer> liste = new ArrayList<>();

        for (int i = 0; i < arr.length; i++)
        {
            if (!liste.contains(arr[i]))
            {
               liste.add(arr[i]);
            }
        }
        System.out.println(liste);*/


    /*    int[][] cokBoyutluDizi = {{2, 3, 5, 13}, {37, 54,99, 113, 555, 1337}, {0, -7, -9,25,17}};
        int[] silinecekDizi = {5, 17, -9, 54};
        List<List<Integer>> yeniCokBoyutluListe = new ArrayList<>();

        int silinecekIndex = 0;
        int toplam=0;


        for (int i = 0; i < cokBoyutluDizi.length; i++)
        {
            toplam+=cokBoyutluDizi[i].length;
        }
        boolean[] indexDizi=new boolean[toplam];



        for (int i = 0; i < silinecekDizi.length; i++)
        {
            for (int j = 0; j < cokBoyutluDizi.length; j++)
            {
                if (indexDizi[silinecekIndex])
                    continue;
                for (int k = 0; k < cokBoyutluDizi[j].length; k++)
                {
                    if (cokBoyutluDizi[j][k]==silinecekDizi[i])
                    {
                        indexDizi[silinecekIndex]=true;
                    }
                    silinecekIndex++;
                }

            }silinecekIndex=0;
        }

        System.out.println(Arrays.toString(indexDizi));

        for (int i = 0; i < cokBoyutluDizi.length; i++)
        {
            List<Integer> yeniListeIc=new ArrayList<>();

            for (int j = 0; j < cokBoyutluDizi[i].length; j++)
            {
                if (!indexDizi[silinecekIndex])
                {
                    yeniListeIc.add(cokBoyutluDizi[i][j]);
                }
                silinecekIndex++;
            }yeniCokBoyutluListe.add(yeniListeIc);

        }
        System.out.println(yeniCokBoyutluListe);*/
        //Strinbuilder javada bir classdır.String oluşturmaya yarar
        //String class varken niçin strin buiderar ihtiyac duyarız
        //string ınmutable classdır.ama biz bazen mutable strinlere
        //ihtiyac duyarız. stringbuılder bize mutable string verir.
        //ımmutable classlarda var olan deger değiştirilemez.siz varolan degeri değiştirmek istediğinizde
        //yeni bir variable  yeni degerle oluşturulur eski variablin pointera döndürülür
        //Eger bir variableı hicbnir pointer göstermiyorsa garbage collector tarafından silinir.
        //mutable classlarda var olan deger değiştirilebilir

       /* String str="java";

        str="Super java";//yeni adresi superjava olur.heap te digeri yani java tutulur.ama stackte tutulan adres oraya yönlendirir
        System.out.println(str);
        StringBuilder strb=new StringBuilder("Java");//1.yol
        strb=new StringBuilder("super java");//strinbuilder da var olan string direk değiştirilir heapten değistirir

        StringBuilder strb3=new StringBuilder(); //2. yol
        strb3.append("java");
        strb3.append(" is easy");
        strb3.append(" learn").append(" java earn money");
        System.out.println(strb3);
        StringBuilder strb4=new StringBuilder();
        strb3.append("cat");
        int sayi=strb3.length();
        int kapazite =strb3.capacity();//16 yazar 1 kapazite 16 dır.18 karakterliyse var olamnın 2 katının 2 fazlası gelir 34 yazar

        strb3.setCharAt(2,'r');//index 2 yi r ye değigtir
        System.out.println(strb3);

        strb3.delete(7,12);//7 den baslar 12 ye kadar sil
        System.out.println(strb3);
        strb3.reverse();//ters
        System.out.println(strb3);

        String abc="java";
        abc.replace("a","i");//atama pılmadığından strıng buılder gibi deildir.bu durum immutabledir
        System.out.println(abc);

        strb3.insert(3,"xxx");
        System.out.println(strb3);*/




    }
}
