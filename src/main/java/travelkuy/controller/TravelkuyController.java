package travelkuy.controller;

import travelkuy.model.TravelkuyModel;
import travelkuy.view.TravelkuyView;

public class TravelkuyController {
    private TravelkuyModel model;
    private TravelkuyView view;

    public TravelkuyController(TravelkuyModel model, TravelkuyView view) {
            this.model = model;
            this.view = view;
    }
    public TravelkuyController() {

    }

    public void createView() {
        view.createView();
    }

    public void displayTiket () {
        model = new TravelkuyModel();
        System.out.println("======================================================================================================");
        for (int i = 0; i < model.getAttributes().length; i++) {
            System.out.printf("||%-18s",model.getAttributes()[i]);
        }
        System.out.println("||");
        System.out.println("======================================================================================================");
        for (int j = 0; j <model.getTiketPesawat().length; j++) {
            for (int k = 0; k < 5; k++) {
                System.out.printf("||%-18s", model.getTiketPesawat()[j][k]);
            }
            System.out.println("||");
        }
        System.out.println("======================================================================================================");
        System.out.println("");
    }

    public void pesanTiket(int pilihan, String name, String phone) {
        model = new TravelkuyModel();
        model.setName(name);
        model.setPhone(phone);

        String maskapai = null, asal = null, tujuan = null, harga = null;
        if(pilihan==1) {
            maskapai = model.getTiketPesawat()[0][1];
            asal = model.getTiketPesawat()[0][2];
            tujuan = model.getTiketPesawat()[0][3];
            harga = model.getTiketPesawat()[0][4];
        }
        else if (pilihan==2) {
            maskapai = model.getTiketPesawat()[1][1];
            asal = model.getTiketPesawat()[1][2];
            tujuan = model.getTiketPesawat()[1][3];
            harga = model.getTiketPesawat()[1][4];
        }

        else if (pilihan==3) {
            maskapai = model.getTiketPesawat()[2][1];
            asal = model.getTiketPesawat()[2][2];
            tujuan = model.getTiketPesawat()[2][3];
            harga = model.getTiketPesawat()[2][4];
        }

        else if (pilihan==4) {
            maskapai = model.getTiketPesawat()[3][1];
            asal = model.getTiketPesawat()[3][2];
            tujuan = model.getTiketPesawat()[3][3];
            harga = model.getTiketPesawat()[3][4];

        }
        else if (pilihan==5) {
            maskapai = model.getTiketPesawat()[4][1];
            asal = model.getTiketPesawat()[4][2];
            tujuan = model.getTiketPesawat()[4][3];
            harga = model.getTiketPesawat()[4][4];
        }
        else if (pilihan==6) {
            maskapai = model.getTiketPesawat()[5][1];
            asal = model.getTiketPesawat()[5][2];
            tujuan = model.getTiketPesawat()[5][3];
            harga = model.getTiketPesawat()[5][4];
        }
        else
            System.out.println("Opsi tidak tersedia!");

        if(pilihan==1 || pilihan==2 || pilihan ==3 || pilihan==4 || pilihan==5 || pilihan==6) {
            System.out.println("====================INVOICE====================");
            System.out.println("Nama Pemesan: " + model.getName());
            System.out.println("No Telp     : " + model.getPhone());
            System.out.println("Maskapai    : " + maskapai);
            System.out.println("Asal        : " + asal);
            System.out.println("Tujuan      : " + tujuan);
            System.out.println("===============================================");
            System.out.println("Total       :" + harga);
        }

    }

    public boolean isValidPhoneNumber(String phone) {
        if (phone.matches("[0-9]*")) {
            return true;
        } else {
            System.out.println("Nomor telepon tidak valid!");
            System.out.println("Masukkan angka 0-9"+"\n");
            return false;
        }
    }

    public boolean isValidOptionValueInMainMenu(int opt) {
        String option = Integer.toString(opt);
        if (option.matches("[1-3]*")) {
            return true;
        } else {
            System.out.println("Masukkan angka 1-3"+"\n");
            return false;
        }
    }

    public boolean isValidOptionValueInThirdSubMenu(int opt) {
        String option = Integer.toString(opt);
        if (option.matches("[1-5]*")) {
            return true;
        } else {
            System.out.println("Masukkan angka 1-5"+"\n");
            return false;
        }
    }

    public boolean isValidOptionValueWhenSelectingTicket(int opt) {
        String option = Integer.toString(opt);
        if (option.matches("[1-6]*")) {
            return true;
        } else {
            System.out.println("Masukkan angka 1-6"+"\n");
            return false;
        }
    }


    public void displayDestinasiWisata(int pilihan) {
        model = new TravelkuyModel();

        if(pilihan==1) {
            for (String i : model.getWisataDiJatim().keySet()) {
                System.out.println(i);
                System.out.println(model.getWisataDiJatim().get(i));
                System.out.println();
            }
        }
        else if (pilihan==2) {
            for (String i : model.getWisataDiYogyakarta().keySet()) {
                System.out.println(i);
                System.out.println(model.getWisataDiYogyakarta().get(i));
                System.out.println();
            }
        }

        else if (pilihan==3) {
            for (String i : model.getWisataDiSumut().keySet()) {
                System.out.println(i);
                System.out.println(model.getWisataDiSumut().get(i));
                System.out.println();
            }
        }

        else if (pilihan==4) {
            for (String i : model.getWisataDiSumbar().keySet()) {
                System.out.println(i);
                System.out.println(model.getWisataDiSumbar().get(i));
                System.out.println();
            }

        }
        else if (pilihan==5) {
            for (String i : model.getWisataDiJabar().keySet()) {
                System.out.println(i);
                System.out.println(model.getWisataDiJabar().get(i));
                System.out.println();
            }
        }
    }

}
