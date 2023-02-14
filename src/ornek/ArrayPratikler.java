package ornek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayPratikler
{
    public static void main(String[] args)
    {

        //1. ve 2. en buyuk sayı dizideki
     /*   int[] dizi={3,5,15,6,3,1,7,9};
        int min=dizi[0];
        int max=dizi[0];
        int secm=dizi[0];

        for (int w:dizi)
        {
            max=Math.max(max,w);
            if (w>secm && w<max)
            {
                secm=w;
            }
        }

        System.out.println(max+"--"+secm);*/


        //Bir dizide tekrarlanmayanları bulan kod
 /*  int[] dizi={1,3,5,6,3,1,7,9};
        int[] konteynirDizi=new int[dizi.length];
        int count=0;


        for (int i = 0; i < dizi.length ; i++)
        {
            for (int j = 0; j < dizi.length ; j++)
            {
                if (isFind(konteynirDizi,dizi[j]))
                {
                    konteynirDizi[count++]=dizi[j];
                }
            }
        }
        System.out.println(Arrays.toString(konteynirDizi));*/

        /* int[] dizi = {5,7,5,11,5,3,7};
        int count=0;
        int tekrar=0;
        boolean istru=true;
        int[] yenid=new int[dizi.length];
        int[] sond=new int[dizi.length];

        for (int i = 0; i < dizi.length; i++)
        {
            if (i!=0 && yenid[i]==i)
                continue;
            for (int j = 0; j < dizi.length; j++)
            {
                if (dizi[i]==dizi[j])
                {
                    yenid[j]=j;
                    count++;
                }
            }
            System.out.println(dizi[i]+" sayısının "+count+" tekrarı var");
            sond[tekrar++]=dizi[i];
            count=0;
        }
        System.out.println(Arrays.toString(sond));*/


        //****diziden 3 elemanı silme
   /*  int[] dizi = {5,7,51,11,10,3,1};
        int[] dizi2 = {5,3,51};
        int count=0;
        boolean istru=true;
        int[] yeniDizi=new int[dizi.length- dizi2.length];
        int[] silinecekindex=new int[dizi.length];

        for (int i = 0; i < dizi2.length; i++)
        {
            for (int j = 0; j < dizi.length; j++)
            {
                if (dizi2[i]==dizi[j])
                {
                    silinecekindex[j]=j;
                }
            }
        }
        for (int i = 0; i < dizi.length-1; i++)
        {
            if (istru)
            {
                yeniDizi[count++]=dizi[i];
                istru=false;
            }
            if (i!=silinecekindex[i])
            {
                yeniDizi[count++]=dizi[i];
            }
        }
        System.out.println(Arrays.toString(yeniDizi));*/


//listeden 3 elemanı silme
    /*    int[] dizi = {0, 7, 51, 11, 10, 3, 1};
        int[] dizi2 = {1, 3, 51};
        int count = 0;
        int[] yeniDizi = new int[dizi.length];
        int[] silinecekindex = new int[dizi.length];
        List<Integer> liste = new ArrayList<>();
        for (int sayi : dizi)
        {
            liste.add(sayi);
        }

        for (int i = 0; i < dizi2.length; i++)
        {
            if (liste.contains(dizi2[i]))
            {
                liste.remove(liste.indexOf(dizi2[i]));
            }
        }
        System.out.println(liste);*/
         /*// Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki en küçük ve en büyük öğeler arasındaki farkı konsolda yazdırınız.

        Scanner scan = new Scanner(System.in);
        int sayi= scan.nextInt();
        int sabit=0;
        int[] dizi= new int[sayi];

        while (sayi!=0){
            System.out.println("sayiları gir");
            int sayi2=scan.nextInt();

            dizi[sabit++]=sayi2;
            sayi--;
        }
        System.out.println(Arrays.toString(dizi));*/
   /*   int[] dizi = {3, -21, 61, -7, 6, 9, -9,8};
        Arrays.sort(dizi);

        int max=dizi[0];
        int min=dizi[dizi.length-1];

        //misal sayıdan sonraki en kucuk veya en buyuk sayıyı karsılastırarak bulma kodu

        for (int each:dizi)
        {
                if (each >0)
                {
                    min=Math.min(each,min);
                }
        }
        System.out.println(min);*/


        //ayrıntılı yazmadım sadece cozum gun gir ondan sonraki kac gun sonra hangi gune denk gelir
     /*   Scanner input=new Scanner(System.in);
        int sayi= input.nextInt();
        String gun= input.next();
        int stringidx=0;
        String[]dizi={"pzt","sali","car","per","cum","cmts","pzr"};

        for (int i = 0; i < dizi.length; i++)
        {
            if (dizi[i].equals(gun))
            {
                stringidx=i;
            }

        }

           int index=sayi%7;
           int sonidx=(index+stringidx)%7;

        System.out.println(dizi[sonidx]);*/


        // Kullanıcıdan aldığınız tamsayılar ile bir array oluşturunuz ve bu arraydeki 0 a en yakın küçük ve en büyük öğeleri konsolda yazdırınız.

   /*     Scanner scan=new Scanner(System.in);
        System.out.println("kaç sayı gir");
        int sayi= scan.nextInt();
        int[] dizi=new int[sayi];
        int sabit=0;

        for (int i = 0; i < sayi; i++)
        {
            System.out.println("sayıları gir");
            dizi[sabit++]=scan.nextInt();
        }
        Arrays.sort(dizi);
        int buyuk=dizi[0];
        int kucuk=dizi[dizi.length-1];

        for (int i = 0; i < sayi; i++)
        {
            if (dizi[i]<0)
            {
                buyuk=Math.max(buyuk,dizi[i]);
            }else {
                kucuk=Math.min(kucuk,dizi[i]);
            }

        }
        System.out.println(buyuk+"    "+kucuk);*/


//VERİLEN BİR SAYI DİZİDE VARSA CIKARAN KOD METOD İLE
     /*   int[] dizi={5,9,5,75,14,14};
        int deger=9;
        int[] sepet=new int[dizi.length-1];
        int[] sonDizi=Metodlar.cikarDiziden(dizi,sepet,deger);

        System.out.println(Arrays.toString(sonDizi));*/


        //tekrarsız yeni dizi oluşturma
    /*    int[] dizi={5,9,5,75,14,14};
        int sabit=0;
        int[] sepet=new int[dizi.length];
        int[] yeniDizi=new int[dizi.length];

        for (int i = 0; i < dizi.length; i++)
        {

            for (int j = i; j < dizi.length; j++)
            {

                if (dizi[i] == dizi[j])
                {
                    if (Metodlar.isvarmi(yeniDizi,dizi[i]))
                    {
                        yeniDizi[sabit++]=dizi[i];
                    }

                }
            }
        }

        System.out.println(Arrays.toString(yeniDizi));*/


//sayı tahmin oyunu
     /*   int tahmin=0;
        int can=5;
        int sayiTahmin=0;
        int[] tahminDizi=new int[5];

        Scanner scan=new Scanner(System.in);
        boolean isfind=true;
        Random rnd=new Random();
        int sayirnd= rnd.nextInt(15);

        while (isfind){
            System.out.print("Tahminde bulununuz : ");
            sayiTahmin= scan.nextInt();

            if (sayiTahmin>0&&sayiTahmin<15)
            {

                if (sayiTahmin!=sayirnd)
                {
                    if (sayirnd >sayiTahmin)
                    {
                        System.out.println("Büyük sayı seçin");

                    }else System.out.println("küçük sayı seçin");

                    System.out.println("Kalan hakkınız : "+--can);
                    tahminDizi[tahmin++]=sayiTahmin;

                }else {
                    tahminDizi[tahmin++]=sayiTahmin;
                    System.out.println("Bildiniz : "+tahmin+"."+"sayıda buldunuz"+" tahminiz : "+sayiTahmin);
                    System.out.println("tahminleriniz: "+Arrays.toString(tahminDizi));
                    break;
                }
            }else System.out.println("Hatalı Aralık girdiniz");
            if (can==0)
            {
                System.out.println("Kaybettiniz");
                break;
            }
        }*/

       /*String str="ali okul? Var! 12yada...";
        String sr=str.replaceAll("[^a-zA-Z ]","");
        String[] dizi=sr.split(" ");

        System.out.println(Arrays.toString(dizi));*/

        /*Scanner input = new Scanner(System.in);
        System.out.print("mesafe gir : ");
        int mesafekm = input.nextInt();
        System.out.print("yaş gir : ");
        int yas = input.nextInt();
        System.out.print("yolculuk tip gir : ");
        int tip = input.nextInt();
        double toplam = 0;
        double mesafetoplam = (mesafekm * 0.10);
       if (mesafekm < 0 || tip < 1 || yas < 0 || tip > 2)
        {
            System.out.println("hatalı veri");
        }
        else
        {
            if (yas < 12)
            {
                mesafetoplam *= 0.50;
            }
            else if (yas > 12 && yas < 24)
            {
                 mesafetoplam *= 0.90;
            }
            else if (yas < 65)
            {
                mesafetoplam *= 0.70;
            }
            if (tip == 2)
            {
                mesafetoplam *= 0.80;
            }
        }
        System.out.println(mesafetoplam);*/

//girilen sayi varsa true dönen kod
      /*  Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        boolean isThere = false;
        int[] array = {2, 3, 5, 7};

        for (int i = 0; i < array.length; i++)
        {
            if (number == array[i])
            {
                isThere = true;
                break;
            }
        }
        if (isThere)
            System.out.println("evet");
        else
            System.out.println("hayır");*/



       /* Bir String’ deki kelimelerin kaç defa tekrarlandığını ifade eden kod yazınız.
        (Büyük/küçük harfe duyarlı değil)
        String s = "Apex is easy. Type codes to learn apex. To earn money learn apex."*/

      /*  String cumle = "Apex ıs easy. Type codes to learn apex. To earn money learn apex. ıs that to?";
        cumle = cumle.toUpperCase().replaceAll("\\p{Punct}","");
        String dizi[]=cumle.split(" ");
        String toplam = "";
        int ydizi[]=new int[dizi.length];
        int count=0;
        List<String> liste=new ArrayList<>();

        for (int i = 0; i < dizi.length; i++)
        {
            if (i != 0 && ydizi[i] == i)
                continue;
            for (int j = i+1; j < dizi.length ; j++)
            {
                if (dizi[i].equals(dizi[j]))
                {
                    count++;
                    ydizi[j]=j;
                    if (!liste.contains(dizi[i]))
                    {
                        liste.add(dizi[i]);
                    }
                }
            }
            System.out.println(dizi[i]+"  "+count);
            count=0;
        }
        System.out.println(liste+"    "+count);*/


        /*Scanner input=new Scanner(System.in);
        String kelime= input.next();
        String kelime2= input.next();

        String[] dizi=kelime.toUpperCase().split("");
        Arrays.sort(dizi);
        String[] dizi2=kelime2.toUpperCase().split("");
        Arrays.sort(dizi2);


            if (kelime.length()==kelime2.length() && Arrays.equals(dizi,dizi2) )
            {
                System.out.println("Anagram");
            }
            else if (kelime.isEmpty() && kelime2.isEmpty())
            {
                System.out.println("Anag deil");
            } else {
                System.out.println("Anag deil");
            }*/


//BİR HARFİN BİR KELİMEDE GECİP GECMEDİĞİ VE KAC TANE KELİMEDE GECTİĞİ KOD

     /*   String str2="cumali besli mal kur Ul al";
        str2=str2.toUpperCase();
        String[] kro=str2.split(" ");

        System.out.println(Arrays.toString(kro));
        int count=0;

        for (int i = 0; i < kro.length; i++)
        {
            if (kro[i].contains("U"))
            {
                count++;
                System.out.println(kro[i]);
            }

        }
        System.out.println(count+" cumlede gecmektedir");*/

//diziyi sıraya sokma kod ile ve tekrar etmeyen sayıları yeni diziye atma
    /*    int[] dizi = {7, -25, 789, -25, 7, 12, -58, 99};
        int[] yeniDizi = new int[dizi.length];
        int art = 0;
        int sabit = 0;

        for (int i = 0; i < dizi.length; i++)
        {
            for (int j = i+1; j < dizi.length; j++)
            {
                if (dizi[i]>dizi[j])
                {
                    sabit=dizi[i];
                    dizi[i]=dizi[j];
                    dizi[j]=sabit;

                }
            }
        }
        System.out.println(Arrays.toString(dizi));


        for (int i = 0; i < dizi.length; i++)
        {
            for (int j = i+1; j < dizi.length; j++)
            {
                if (varMi(yeniDizi,dizi[i]))
                {
                    yeniDizi[art++]=dizi[i];
                }
            }
        }

        System.out.println(Arrays.toString(yeniDizi));*/

        /* String str="Strinbuilder4 javada* bir classdır. String oluşturmaya yarar";
        str=str.replaceAll("[^A-Za-z ]", "");
        System.out.println(str);

        String[] dizi=str.split(" ");
        for (String w:dizi)
        {
            if (w.endsWith("r"))
            {
                System.out.print(w+"");
            }
        }
        System.out.println();*/



//Soru 6) Verilen bir Array'den isten degere eşit olan elamanlari kaldirip, kalanlari yeni bir Array olarak yazdiran bir method yaziniz

 /*       int[][] cokBoyutluDizi = {{2, 3, 5, 9, 13}, {37, 54, 79, 99, 113, 555, 1337}, {0, -7, -9, -117, -5, 25, 17}};
        int[] silinecekDizi = {5, 17, -9, 0, 54};
        List<List<Integer>> yeniCokBoyutluListe = new ArrayList<>();
        int cokBoyutluDiziFullLength = 0;
        int silinecekIndex = 0;

        for(int i = 0; i < cokBoyutluDizi.length; i++)
        {
            cokBoyutluDiziFullLength += cokBoyutluDizi[i].length;
        }

        boolean[] silineceklerIndeksi = new boolean[cokBoyutluDiziFullLength];

        for(int i = 0; i < silinecekDizi.length; i++)
        {
            for(int j = 0; j < cokBoyutluDizi.length; j++)
            {
                if(silineceklerIndeksi[silinecekIndex])
                    continue;
                for(int k = 0; k < cokBoyutluDizi[j].length; k++)
                {
                    if(cokBoyutluDizi[j][k] == silinecekDizi[i])
                    {
                        silineceklerIndeksi[silinecekIndex] = true;
                    }
                    silinecekIndex++;
                }
            }
            silinecekIndex = 0;
        }

        silinecekIndex = 0;
        List<Integer> yeniListeElemalari;
        for(int i = 0; i < cokBoyutluDizi.length; i++)
        {
            yeniListeElemalari = new ArrayList<>();
            for(int j = 0; j < cokBoyutluDizi[i].length; j++)
            {
                if(!silineceklerIndeksi[silinecekIndex])
                    yeniListeElemalari.add(cokBoyutluDizi[i][j]);
                silinecekIndex++;
            }
            yeniCokBoyutluListe.add(yeniListeElemalari);
        }

        System.out.println(yeniCokBoyutluListe);*/



  /*    int[]dizi = {54, 3, 5, 9, 13, 37, 54, 79, 99, 113, 555, 17};
        int[] silinecekDizi = {5, 17, -9, 0, 54};
        List<Integer> yeniListe = new ArrayList<>();

        int counter = 0;


        boolean[] silineceklerIndeksiDizi = new boolean[dizi.length];

        for (int i = 0; i < silinecekDizi.length; i++)
        {
            for (int j = 0; j < dizi.length; j++)
            {
                if (silinecekDizi[i]==dizi[j])
                {
                    silineceklerIndeksiDizi[counter]=true;
                }
                counter++;//silinecek indexi içerde gezdirion kendine esit olanları true yapıor index bittiğinde cıkıyor sıfırlıon digeri gezdirior
            }counter=0;
        }
        System.out.println(Arrays.toString(silineceklerIndeksiDizi));

        counter=0;

        for (int i = 0; i < dizi.length; i++)
        {
            if (!silineceklerIndeksiDizi[counter])
            {
                yeniListe.add(dizi[i]);

            }
            counter++;
        }
        System.out.println(yeniListe);*/


  /*    int[]dizi = {54,99, 5, 54, 13, 37, 555, 79, 99, 113, 555, 17};
        List<Integer> yeniListe = new ArrayList<>();

        boolean[] silineceklerIndeksiDizi = new boolean[dizi.length];
        int counter = 0;

        for (int i = 0; i < dizi.length; i++)
        {
            for (int j = i+1; j < dizi.length; j++)
            {
                if (dizi[i]==dizi[j])
                {
                    silineceklerIndeksiDizi[counter]=true;
                }counter++;
            }counter=0;
        }

        counter=0;
        System.out.println(Arrays.toString(silineceklerIndeksiDizi));


        for (int i = 0; i < dizi.length; i++)
        {
            if (!silineceklerIndeksiDizi[counter])
            {
                yeniListe.add(dizi[i]);
            }
            counter++;
        }
        System.out.println(yeniListe);*/

        //tekrarsızları yazdırma kısayol

     /*   int[]dizi = {54,99, 5, 54, 13, 37, 555, 79, 99, 113, 555, 17};
        List<Integer> yeniListe = new ArrayList<>();

        int counter = 0;

        for (int w:dizi)
        {
            if (!yeniListe.contains(w))
            {
                yeniListe.add(w);
            }
        }
        System.out.println(yeniListe);*/


    }

}
