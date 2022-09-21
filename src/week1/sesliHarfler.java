package week1;

public class sesliHarfler {

	public static void main(String[] args) {

		char harf = 'Ö';

        switch (harf) {
            case 'A':
            case 'ı':
            case 'o':
            case 'u':
                System.out.println("Kalın sesli harfler");
                break;
            default:
                System.out.println("İnce sesli harfler");
        }
	}

}
