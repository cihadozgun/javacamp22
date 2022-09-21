package week1;

public class miniProjeAsalSayi {

	public static void main(String[] args) {

		int number = 5;
        int remainder = number % 2;
        //System.out.println(remainder);
        boolean isPrime = true;

        if (number==1) {
            System.out.println(number + " asal bir sayı değildir. ");
            return;
        }

        if (number<1) {
            System.out.println(" Geçersiz Sayi ");
            
        }

        for (int i=2; i<number;i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(number + " asal bir sayıdır. ");
        } else  {
            System.out.println(number + " asal bir sayı değildir. ");
        }
	}

}
