package week1;

public class recapDemo1 {

	public static void main(String[] args) {

		int sayi1 = 20;
        int sayi2 = 10;
        int sayi3 = 30;

        String mesaj= "En büyük sayı : ";

        if (sayi1>sayi2 && sayi1>sayi3){
            System.out.println(mesaj + sayi1);
            
        } else if (sayi2>sayi1 && sayi2>sayi3) {
            System.out.println(mesaj + sayi2);
            
        } else {
            System.out.println(mesaj  + sayi3);
        }
	}

}
