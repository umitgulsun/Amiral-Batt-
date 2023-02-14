package ornek;

import java.util.ArrayList;
import java.util.List;

public class CokluArrayPratikler
{
    public static void main(String[] args)
    {


        //dolar 3,2 *4,2 ile carpılıp toplanacak kod
     /*   String[][] dizi = {{"$12", "$22", "$0"}, {"*9", "*40", "$1"}, {"*12", "$2", "$0"}};
        double toplam = 0;

        for (String[] dizi2 : dizi)
        {
            for (String str : dizi2)
            {
                if (str.contains("$"))
                {
                    str = str.replace("$", "");
                    double yenidolars = Double.parseDouble(str);
                    toplam += yenidolars * 3.2;
                }
                else if (str.contains("*"))
                {
                    str = str.replace("*", "");
                    double yeniyidiz = Double.parseDouble(str);
                    toplam += yeniyidiz * 4.2;
                }
            }
        }
        System.out.println(toplam);*/

        /*  //belli bir sayıdan sonraki en kucuk veya en buyuk sayıyı karsılastırarak bulma kodu
        int[][] dizi = {{3, 2, 61}, {-7, 6}, {9, 3},{8}};
        int max=dizi[0][0];
        int min=dizi[0][0];

        for (int[] w:dizi)
        {
            for (int sayi: w)
            {
                if (sayi>0)
                {
                    max=Math.max(sayi,max);
                    min=Math.min(sayi,min);
                }
            }
        }
        System.out.println(min);*/


        //dış dizinin ilk elemanı ile içteki dizilerin toplamını veren kod
       /* int[][] dizi = {{3, 2, 6}, {7, 6}, {9, 3},{8}};

        int toplam = 0;

        for (int i = 0; i < dizi.length ; i++)
        {
            for (int j = 0; j < dizi[i].length; j++)
            {
                toplam+=dizi[i][j];
            }
            for (int j = 0; j < dizi.length; j++)
            {
                toplam +=dizi[i][j];
                System.out.println(toplam);
                toplam=0;
                break;
            }
        }*/


        //4 soruluk bir sınavda cevap anahtarı verilmiş işaretlediklerim dogru cevap sayısı
      /*  char[][] cavaplarDizi = {{'A'}, {'B'}, {'C'},{'C'}};
        char[] diziiIsaretlediklerim={'C','B','E','C'};
        int toplam=0;
        int counter=0;
        int carpim=1;

        for (int i = 0; i < cavaplarDizi.length; i++)
        {
            for (int j = 0; j < cavaplarDizi[i].length; j++)
            {
                System.out.println(cavaplarDizi[i][j]+"="+diziiIsaretlediklerim[i]);
                if (cavaplarDizi[i][j]==diziiIsaretlediklerim[i])
                {
                    counter++;
                }
            }
            System.out.println();
        }
        System.out.println(counter);*/


        //dış dizinin ilk elemanı ile içteki dizilerin toplamını baska diziye atan kod
     /*   int[][] dizi = {{3, 2, 6}, {7, 6}, {9, 3},{8}};
        int toplam=0;
        int[] dizison=new int[dizi.length];
        int sabit=0;

        for (int i = 0; i < dizi.length; i++)
        {
             toplam+=dizi[i][0];
            for (int j = 0; j < dizi[i].length; j++)
            {
                toplam+=dizi[i][j];
            }dizison[sabit++]=toplam;
            toplam=0;

        } System.out.println(Arrays.toString(dizison));*/


        /* int[][] dizi1 = {{1}, {4, 5, 6}, {8, 10},{8}};
        int[][] dizi2 = {{3, 2, 6}, {7, 6}, {9, 3}};

        int toplam = 0;
        if (dizi1.length> dizi2.length)
        {
            for (int i = 0; i < dizi2.length ; i++)
            {
                if (dizi1[i].length> dizi2[i].length)
                {
                    for (int j = 0; j < dizi2[i].length; j++)
                    {
                        toplam=dizi1[i][j]+dizi2[i][j];
                        System.out.println(toplam);
                        toplam=0;
                    }
                }else{
                    for (int j = 0; j < dizi1[i].length; j++)
                    {
                        toplam=dizi1[i][j]+dizi2[i][j];
                        System.out.println(toplam);
                        toplam=0;
                    }

                }
            }
        }

//maths metoduyla yukarıdaki kodu kısa olarak yazımı aşagıdaki kod

        int[][] dizi1 = {{1, 2, 5}, {4, 5, 6}, {8, 10},{8}};
        int[][] dizi2 = {{3, 2, 6}, {7, 6}, {9, 3}};

        int toplam = 0;
        int disUzunluklardanKisaOlani = Math.min(dizi1.length, dizi2.length);
        int icDiziAnlikUzunluk;
        for (int i = 0; i < disUzunluklardanKisaOlani; i++)
        {
            icDiziAnlikUzunluk = Math.min(dizi1[i].length, dizi2[i].length);
            for (int j = 0; j < icDiziAnlikUzunluk; j++)
            {
                toplam = dizi1[i][j] + dizi2[i][j];
                System.out.println(toplam);
            }
        }*/


//        for (int i = 0; i < dizi1.length; i++)
//        {
//            for (int j = 0; j < dizi2[i].length; j++)
//            {
//                if (dizi1[i].length>dizi2[j].length)
//                {
//
//                        toplam=dizi1[i][j]+dizi2[i][j];
//                        System.out.println(toplam);
//                        toplam=0;
//
//                }
//                else
//                {
//                        toplam=dizi1[i][j]+dizi2[i][j];
//                        System.out.println(toplam);
//                        toplam=0;
//                }
//            }
//        }


        //iç dizideki son elemanlarının carpımı uzun yol
    /*    int[][] dizi3 = {{1,2,4}, {4,5}, {8,3}};
        int carpim=1;
        for (int i = 0; i < dizi3.length; i++)
        {
            for (int j = dizi3[i].length-1; j < dizi3[i].length; j++)
            {
                carpim*=dizi3[i][j];
            }
        }

        System.out.println(carpim);*/
        //coklu dizideki kısayol son elemanları carpım
     /*   int[][] dizi3 = {{1,2,4}, {4,5}, {7}};
        int carpim=1;

        for (int i = 0; i < dizi3.length; i++)
        {
            carpim*=dizi3[i][dizi3[i].length-1];
        }
        System.out.println(carpim);*/


//coklu arrayin icindeki dizileri carpıp coklu arraye atma
    /*    int[][] dizi = {{1,2,4}, {4,5}, {7}};
        int carpim=1;
        int[][] dizi3 = new int[dizi.length][1] ;

        for (int i = 0; i < dizi.length; i++)
        {
            for (int j = 0; j < dizi[i].length; j++)
            {
                carpim *= dizi[i][j];
            }
            dizi3[i][0] = carpim;
            carpim = 1;
        }
        System.out.println(Arrays.deepToString(dizi3));*/

        //ic dizideki sayıları topla tekdizili yeni array oluştur
       /* int[][] dizi = {{1,2,3,4}, {4, 5,6}, {8, 3}};
        int[] ydizi=new int[dizi.length];
        int sabit=0;
        int toplam=0;

        for (int[] w:dizi)
        {
            for (int sayi:w)
            {
                toplam+=sayi;
            }
            ydizi[sabit++]=toplam;
            toplam=0;
        }

        System.out.println(Arrays.toString(ydizi));*/










    }
}
