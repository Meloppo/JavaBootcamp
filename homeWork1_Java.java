public class App {
    public static void main(String[] args) throws Exception {
       //#region 5.ders
        System.out.println("Hello, World!");
//#endregion
        //#region 6. Ders
        int studentNumber = 12;
        String message = "Öğrenci Sayım:";
        System.out.println(message+studentNumber);
        //#endregion
    //#region 8. Ders Conditionals
        
        int sayi = 20;
        if (sayi<20) {
            System.out.println("Sayı 20'den kucuktur");
        }
        else if(sayi>20){
            System.out.println("Sayı 20'den büyüktür");
        }
        else if(sayi == 20){
            System.out.println("Sayı 20'dir");
        }
        //#endregion

        //#region Ders 9 

        int sayi1 = 20;
        int sayi2 = 21;
        int sayi3 = 22;
        int enBuyukSayi = sayi1;

    if (enBuyukSayi<sayi2) {
        enBuyukSayi = sayi2;
    }
    if (enBuyukSayi<sayi3) {
        enBuyukSayi = sayi3;
    }
        //#endregion
        //#region Switch-case ders 10
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("A aldınız.");
                break;
            case 'B':
            case 'C':
                System.out.println("B veya C aldınız.");
                break;
            case 'D':
                System.out.println("D aldınız");
                break;
            case 'F':
                System.out.println("F aldınız");
                break;
            default:
                System.out.println("geçersiz not girdiniz.");
                break;
        }
        //#endregion

        //#region Ders 11,12,13 Loops

        // for 
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("for bitti.");

        // while 
        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i += 2;
        }
        System.out.println("While bitti.");

        // do-While 
        int j = 100;
        do {
            System.out.println(j);
            j += 2;
        } while (j < 10);
        System.out.println("do-While bitti.");
        //#endregion
        //#region 14. Ders Arrays
        String[] ogrenciler = new String[4];
        ogrenciler[0] = "Engin";
        ogrenciler[1] = "Derin";
        ogrenciler[2] = "Salih";
        ogrenciler[3] = "Ahmet";
        for (int k = 0; k < ogrenciler.length; k++) {
            System.out.println(ogrenciler[i]);
        }

        for (var ogrenci : ogrenciler) {
            System.out.println(ogrenci);
        }// bu yapi foreach gibi

        //#endregion
        //#region Ders 15 Recap Demo2
        double[] myList = { 1.2, 3.1, 3.2, 5.6 };
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("En Büyük : " + max);
        System.out.println("Toplam : " + total);
        //#endregion
        //#region 16. ders Çok boyutlu arrayler
            String[][] sehirler= new String [3][3];
            sehirler[0][0]="İstanbul";
            sehirler[0][1]="Bursa";
            sehirler[0][2]="Bilecik";
            sehirler[1][0]="Ankara";
            sehirler[1][1]="Konya";
            sehirler[1][2]="Kırşehir";
            sehirler[2][0]="Diyarbakır";
            sehirler[2][1]="Şanlıurfa";
            sehirler[2][2]="Elazığ";
            
            for(int m=0;i<=2;m++) {
    System.out.println("----------------");
    for(int l=0;l<=2;l++) {
        System.out.println(sehirler[m][l]);
    }
        }

        //#endregion
    //#region Strings
    String mesaj = "Bugün hava çok kötü.";
    String mesaj2= "    Bugün hava çok rahatsız ediciymiş ";
    System.out.println(mesaj);
    System.out.println("Eleman sayısı: "+mesaj.length());
    System.out.println("5.eleman: "+mesaj.charAt(4));
    System.out.println(mesaj.concat(" YAŞASIN!"));
    System.out.println(mesaj.startsWith("u"));
    System.out.println(mesaj.endsWith("."));
    
    char[] karakterler= new char [5];
    mesaj.getChars(0, 5, karakterler, 0);
    System.out.println(karakterler);
    System.out.println(mesaj.indexOf("a"));
    System.out.println(mesaj.lastIndexOf("."));
        
    System.out.println("-----------");
    //2.kısım 
    String yeniMesaj= mesaj.replace(' ', '_');
    System.out.println(yeniMesaj);
    
    System.out.println(mesaj.substring(5,10));
    
    for(String kelime : mesaj.split(" ")) {
        System.out.println(kelime);
    }
    
    System.out.println(mesaj.toLowerCase());
    System.out.println(mesaj.toUpperCase());
    System.out.println(mesaj2.trim());
    

    //#endregion
    //#region Asal mı?
    int number = 77;
		if(number==2) {System.out.println("Sayınız Asaldır.");return;}
		if(number<=1) {System.out.println("Geçersiz Bir Sayı Girdiniz.");return;}
		
		
		boolean isPrime = true;
		
		for (int x=2;x<number;x++) {
			if (number%x==0) {
				isPrime=false;
				}
		}

		if (isPrime) {System.out.println("Asal.");
			
		}
		else { System.out.println("Asal Değil.");
			
		}
    //#endregion





    }
}
