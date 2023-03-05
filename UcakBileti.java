import java.util.Scanner;
public class UcakBileti {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double mesafe;
        double mesafeUcreti;
        int yolculutipi;
        double indirim;
        double ucret;

        System.out.print("Ucacagınız Mesafeyi KM Cinsinden Giriniz : ");
        mesafe = input.nextInt();

        mesafeUcreti = mesafe * 0.10;

        System.out.print("Yolculuk Tipini Seciniz \n 1-Tek Yon \n 2-Gidis-Donus");
        yolculutipi = input.nextInt();

        switch (yolculutipi) {

            case 1:

                int yas;

                System.out.print("Lutfen Yolcunun Yasini Giriniz : ");
                yas = input.nextInt();

                if (yas<12) {

                    indirim = mesafeUcreti * 50/100;
                    ucret = mesafeUcreti - indirim;

                    System.out.print("Odeyeceginiz Ucret : " + ucret );


                }

                else if (yas>=12 && yas<=24) {

                    indirim = mesafeUcreti * 10/100;
                    ucret = mesafeUcreti - indirim;

                    System.out.print("Odeyeceginiz Ucret : " + ucret );
                }

                else if (yas > 24 && yas < 65) {

                    ucret = mesafeUcreti;
                    System.out.print("Odeyeceginiz Ucret : " + ucret);
                }

                else if (yas>=65  ) {

                    indirim = mesafeUcreti * 30/100;
                    ucret = mesafeUcreti - indirim;

                    System.out.print("Odeyeceginiz Ucret : " + ucret );
                }



                break;


            case 2:

                System.out.print("Lutfen Yolcunun Yasini Giriniz : ");
                yas = input.nextInt();

                if (yas<=12) {

                    indirim = mesafeUcreti * 50/100 * 20/100 ;
                    ucret = (mesafeUcreti - indirim)*2 ;

                    System.out.print("Odeyeceginiz Ucret : " + ucret );


                }

                else if(yas > 12 && yas<=24) {

                    indirim = mesafeUcreti * 10/100 * 20/100 ;
                    ucret = (mesafeUcreti - indirim)*2 ;

                    System.out.print("Odeyeceginiz Ucret : " + ucret );

                }

                else if (yas > 24 && yas < 65) {

                    ucret = mesafeUcreti*2;
                    System.out.print("Odeyeceginiz Ucret : " + ucret);
                }

                else if (yas>=65) {

                    indirim = mesafeUcreti * 30/100 * 20/100;
                    ucret = (mesafeUcreti - indirim)*2;

                    System.out.print("Odeyeceginiz Ucret : " + ucret );
                }

            break;

            default:
                System.out.print("YANLIS TUSLAMA YAPTINIZ !");
                break;




        }












    }
}
