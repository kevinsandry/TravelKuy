package travelkuy.view;

import travelkuy.controller.TravelkuyController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TravelkuyView {

    public void createView() {
        TravelkuyController controller = new TravelkuyController();
        Scanner in = new Scanner(System.in);
        boolean isRightInputValueInMainMenu = false;
        boolean isRightInputValueInThirdSubMenu = false;

        int opt = 0;

            while (!isRightInputValueInMainMenu) {
               while (opt!=4) {
                    try {
                        System.out.println();
                    System.out.println("==========SELAMAT DATANG DI TRAVELKUY==========");
                    System.out.println("Menu: ");
                    System.out.println("1. Lihat Promo Tiket Pesawat");
                    System.out.println("2. Pesan Tiket Pesawat");
                    System.out.println("3. Informasi Destinasi Wisata");
                    System.out.println("4. Keluar");
                    System.out.println("Masukkan pilihan anda: ");
                    opt = in.nextInt();
                    isRightInputValueInMainMenu = true;

                    switch (opt) {

                        case 1:
                            controller.displayTiket();
                            break;

                        case 2:
                            controller.displayTiket();
                            in.nextLine();
                            String name, phone;
                            int pilihan = 0;
                            boolean isRightInputValue = false;
                            System.out.println("Nama            : ");
                            name = in.nextLine();
                            do {
                                System.out.println("Nomor Telepon   : ");
                                phone = in.nextLine();
                            } while (!controller.isValidPhoneNumber(phone));

                           do {
                                try {
                                    System.out.println("Pilihan Tiket   : ");
                                    pilihan = in.nextInt();
//                                    isRightInputValue = true;
                                } catch (InputMismatchException e) {
                                    in.next();
                                    System.out.println("Masukkan input berupa angka\n");
                                }
                             }while (!controller.isValidOptionValueWhenSelectingTicket(pilihan));
                            controller.pesanTiket(pilihan, name, phone);
                            break;

                        case 3:
                            int opsi = 0;

                            while (!isRightInputValueInThirdSubMenu || opsi >5) {
                                try {

                                    System.out.println("Temukan destinasi wisata di provinsi berikut ini: ");
                                    System.out.println("1. Jawa Timur");
                                    System.out.println("2. Yogyakarta");
                                    System.out.println("3. Sumatera Utara");
                                    System.out.println("4. Sumatera Barat");
                                    System.out.println("5. Jawa Barat");
                                    System.out.println("Pilih (1-5): ");
                                    opsi = in.nextInt();
                                    isRightInputValueInThirdSubMenu = true;
                                    switch (opsi) {
                                        case 1:
                                            controller.displayDestinasiWisata(1);
                                            break;

                                        case 2:
                                            controller.displayDestinasiWisata(2);
                                            break;

                                        case 3:
                                            controller.displayDestinasiWisata(3);
                                            break;

                                        case 4:
                                            controller.displayDestinasiWisata(4);
                                            break;

                                        case 5:
                                            controller.displayDestinasiWisata(5);
                                            break;

                                    }
                                    if(opsi>5) {
                                        System.out.println("Masukkan angka 1-5!");
                                    }

                                } catch (InputMismatchException e) {
                                    in.next();
                                    System.out.println("Masukkan input berupa angka!\n");
                                }
                            }
                            break;
                        case 4:
                            System.out.println("Terima Kasih Telah Memakai Aplikasi Kami");
                            break;

                        default:
                            System.out.println("Masukkan Angka 1-4!");
                    }
                } catch (InputMismatchException e) {
                    in.next();
                    System.out.println("Masukkan input berupa angka!\n");
                }
            }

            }


    }
}

