package travelkuy.model;

import java.util.HashMap;
public class TravelkuyModel {

    private String name, phone;
    private String [] attributes = {"No.", "Maskapai", "Asal", "Tujuan", "Harga Promo"};
    private String [][] tiketPesawat = {
                                        {"1. ","Lion Air","Jakarta (CGK)","Malang (MLG)","Rp. 450000"},
                                        {"2. ", "Garuda Indonesia", "Jakarta(CGK)", "Surabaya (SUB)", "Rp. 900000"},
                                        {"3. ", "Batik Air", "Jakarta(HLP)", "Pekanbaru (PKU)", "Rp. 910000" },
                                        {"4. ", "Wings Air", "Surabaya (SUB)", "Bandung (BDO)", "Rp. 550000"},
                                        {"5. ", "Citilink", "Medan (KNO)", "Yogyakarta (JOG)", "Rp. 1500000"},
                                        {"6. ", "Garuda Indonesia", "Jakarta (CGK)", "Padang (PDG)", "Rp. 2000000"}
                                       };

    private HashMap<String, String> wisataDiJatim = new HashMap<String, String>();
    private HashMap<String, String> wisataDiYogyakarta = new HashMap<String, String>();
    private HashMap<String, String> wisataDiSumut = new HashMap<String, String>();
    private HashMap<String, String> wisataDiSumbar = new HashMap<String, String>();
    private HashMap<String, String> wisataDiJabar = new HashMap<String, String>();

    public TravelkuyModel() {
        //jatim
        wisataDiJatim.put("Gunung Bromo", "Gunung yang terletak di Probolinggo ini menawarkan 3 pesona yang tidak bisa ditolak dengan mudah. Pertama" + "\n" +
                "adalah lautan pasir yang luas. Berjalan dari parkiran hingga ke puncak gunung akan membuat Anda seperti" + "\n" +
                "berada di gurun pasir. Kedua adalah pemandangan dari jauh yang Instaram-able. Dari kawasan Penanjakan Anda bisa" + "\n" +
                "menyaksikan matahari terbit yang menembus kabut.");

        wisataDiJatim.put("Museum Angkut", "Museum Angkut masih terletak di kawasan Kota Batu yang merupakan pusat wisata Jawa Timur. Tempat wisata " + "\n" +
                "di Jawa Timur ini menawarkan aneka koleksi kendaraan untuk angkutan dari zaman kuno hingga modern. Ada aneka " + "\n" +
                "sepeda, motor, mobil, hingga miniatur pesawat terbang yang dipajang untuk menarik banyak wisatawan.");

        wisataDiJatim.put("Kawah Ijen", "Kawah Ijen telah berhasil menjadi ikon kedua dari Jawa Timur yang ketenarannya tidak kalah dengan Bali. " + "\n" +
                "Terletak di kawasan Banyuwangi, kawah dari gunung yang terus mengeluarkan belerang ini menjadi tujuan " + "\n" +
                "wisatawan yang ingin merasakan pendakian kecil sembari menyaksikan bentang alam yang menakjubkan.");

        wisataDiJatim.put("Candi Penataran", "Candi Penataran terletak di Kabupaten Lebar dan tidak jauh dari Gunung Kelud. Kompleks candi yang dibangun " + "\n" +
                "oleh 3 generasi kerajaan ini merupakan yang terbesar di Jawa Timur. Wisatawan bisa menyaksikan altar utama, " + "\n" +
                "bangunan candi naga, candi angka tahun hingga petirtaan yang terletak di bagian belakang.");

        wisataDiJatim.put("Gili Labak", "Setelah berkutat di kawasan Pulau Utama, sekarang kita akan berlanjut ke kawasan Madura yang ternyata juga " + "\n" +
                "menawarkan destinasi menarik. Di kawasan Sumenep terdapat sebuah pulau bernama Gili Labak yang keindahannya " + "\n" +
                "bisa menyamai Gili Trawangan yang ada di kawasan Lombok, Nusa Tenggara Timur.");

        //jogja
        wisataDiYogyakarta.put("Candi Borobudur", "Candi Borobudur sudah sangat terkenal di dunia. Candi ini masuk kedalam daftar Warisan Dunia UNESCO. Candi ini " + "\n" +
                "merupakan Candi Budha terbesar dan terlengkap di dunia. Dilihat dari atas, bentuk Candi Borobudur menyerupai bunga " + "\n" +
                "teratai, yang akan sangat indah bila dilihat pada saat matahari terbit atau terbenam.");

        wisataDiYogyakarta.put("Candi Prambanan", "Candi lainnya yang terkenal adalah Candi Prambanan. Terletak sekitar 17Km dari pusat kota Yogyakarta, Candi Prambanan " + "\n" +
                "merupakan candi Hindu terbesar di Indonesia. Candi ini memiliki relief yang menceritakan kisah mengenai Ramayana dan " + "\n" +
                "Krishnayana.");

        wisataDiYogyakarta.put("Jalan Malioboro", "Jalan paling terkenal di Yogyakarta adalah Jalan Malioboro. Di sepanjang jalan ini terdapat toko-toko dan pedagang kaki " + "\n" +
                "lima yang menjual berbagai macam barang, dari pakaian, kerajinan tangan sampai makanan. Salah satu hal yang khas mengenai " + "\n" +
                "Malioboro adalah penjual makanan lesehan.");

        wisataDiYogyakarta.put("Pantai Parangtritis", "Pantai Parangtritis merupakan pantai paling terkenal di Yogyakarta, itulah sebabnya mengapa pantai ini selalu ramai pengunjung. " + "\n" +
                "Pantai ini memiliki ombak yang cukup besar dan kuat. Di tempat ini Anda juga dapat mencoba bermain paralayang di Bukit Parangdong. " + "\n" +
                "Pantai Parangtritis terletak 25 Km dari pusat kota Yogyakarta.");

        wisataDiYogyakarta.put("Goa Pindul", "Goa Pindul merupakan goa yang terkenal dengan kegiatan cave tubing-nya. Goa ini memiliki panjang 350 meter, lebarnya skitar 5 meter " + "\n" +
                "dan kedalaman air anata 5 sampai 12 meter. Goa ini terdiri dari 3 zona yaitu zona terang, zona remang dan zona gelap.");

        //sumut
        wisataDiSumut.put("Danau Toba", "Merupakan danau kawah kebanggaan Sumatera Utara sekaligus kebanggaan Indonesia. Danau Toba adalah danau berkawah seluas 1.145 kilometer" + "\n" +
                "persegi. Danau ini diperkirakan terbentuk dari letusan supervolcano Gunung Toba yang terjadi sekitar 74.000 tahun yang lalu.");
        wisataDiSumut.put("Pulau Samosir", "Di tengah Danau Toba terdapat Pulau Samosir dengan ketinggian 1.000 mdpl. Di pulau ini juga terdapat berbagai obyek wisata seperti makam " + "\n" +
                "yang terbuat dari batu yang telah berusia sekitar 500 tahun dan desa-desa dengan rumah adat tradisional serta kebudayaan Batak Toba yang " + "\n" +
                "unik dan kuno.");
        wisataDiSumut.put("Istana Maimun", "Istana Maimun merupakan istana peninggalan kerajaan Deli yang dipimpin Sultan Al Rasyid Perkasa Alamsyah pada tahun 1973. Istana Maimun " + "\n" +
                "sempat ditempati oleh 4 Sultan Melayu yang memerintah saat itu.");
        wisataDiSumut.put("Pantai Gawu Soyo", "Pantai Gawu Soyo adalah satu-satunya pantai berwarna pink di pulau Sumatera. Pantai Gawu Soyo sebenarnya memiliki legenda tersendiri, yaitu " + "\n" +
                "pada dahulu kala terjadi pertumpahan darah di pantai hingga membuat pasir di pantai ini menjadi merah.");
        wisataDiSumut.put("Air Terjun Sipiso-piso", "Tempat wisata di Sumatera Utara yang ikonik lainnya adalah Air Terjun Sipiso-piso. Air terjun ini merupakan salah satu air terjun tertinggi di " + "\n" +
                "Indonesia dengan ketinggian 120 meter. Tak jauh dari lokasi Danau Toba, Air terjun yang berada pada ketinggian 800 meter ini terbentuk dari sungai " + "\n" +
                "bawah tanah di plato Karo yang mengalir melalui sebuah gua disisi kawah danau Toba.");
        
        //sumbar
        wisataDiSumbar.put("Kelok Sembilan","Desain flyover (jembatan layang) Kelok Sembilan yang begitu unik dan dikeliling pegunungan yang hijau, membuat setiap orang yang melintasinya berdecak " + "\n" +
                "kagum. Flyover Kelok Sembilan ini berada di Kabupaten Limapuluh Kota atau berdekatan dengan perbatasan Sumatera Barat-Riau.");
        wisataDiSumbar.put("Lembah Harau", "Merupakan adalah sebuah ngarai dekat kota Payakumbuh di kabupaten Limapuluh Koto, provinsi Sumatra Barat. Lembah Harau diapit dua bukit cadas terjal " + "\n" +
                "dengan ketinggian mencapai 150 meter berupa batu pasir yang terjal berwarna-warni, dengan ketinggian 100 sampai 500 meter.");
         wisataDiSumbar.put("Jam Gadang", "Jam Gadang adalah nama untuk menara jam yang terletak di pusat kota Bukittinggi, Sumatra Barat, Indonesia. Menara jam ini memiliki jam dengan ukuran " + "\n" +
                "besar di empat sisinya sehingga dinamakan Jam Gadang, sebutan bahasa Minangkabau yang berarti \"jam besar\".");
        wisataDiSumbar.put("Pantai Padang", "Pantai Padang atau populer dengan sebutan Taplau adalah sebuah pantai yang terletak di Kota Padang, Sumatra Barat. Pantai ini terletak pada kawasan padat " + "\n" +
                "perkotaan di Kecamatan Padang Barat, dan membentang dari daerah Purus hingga muara Batang Arau.");
        wisataDiSumbar.put("Masjid Raya Sumatera Barat", "Masjid terbesar di Minangkabau ini, menjadi ikon baru bagi Kota Padang dalam menarik minat wisatawan untuk melakukan wisata religi. Arsitektur "  + "\n" +
                "dan kemegahan Masjid Raya Sumatera Barat ini membuat setiap orang melihatnya, mengabdikannya dengan berfoto bersama. Bahkan akhir-akhir di momen"+ "\n" +
                "mudik lebaran  ini, banyak parantau yang pulang sengaja melewati jalur pusat kota demi ingin singgah di masjid megah tersebut.");
        
        //jabar
        wisataDiJabar.put("Gunung Tangkuban Perahu","Gunung Tangkuban Perahu merupakan salah satu situs wisata terkenal di Indonesia. Terletak di daerah Lembang, sekitar 20 kilometer di utara Kota Bandung, " +"\n" +
                "gunung yang bentuknya menyerupai perahu terbalik ini selalu padat pengunjung pada akhir pekan dan waktu liburan.");
        wisataDiJabar.put("Kawah Putih Ciwidey", "Kawah yang terletak di daerah Ciwidey sekitar 50 Km di selatan Bandung ini merupakan kawah vulkanik dengan tanah yang berwarna putih akibat kandungan " +"\n" +
                "belerang pada tanahnya tersebut. Airnya yang berwarna cerah dan terkadang berubah warna merupakan keunikan dari kawah itu sendiri.");
        wisataDiJabar.put("Kampung Naga", "Kampung Naga yang terkenal di Kabupaten Tasikmalaya ini menyajikan budaya kearifan lokal yang unik. Tata letak dan arsitektur rumah yang terletak di " +"\n" +
                "Desa Neglasari ini masih terjaga keasliannya secara alami dari dulu hingga kini.");
        wisataDiJabar.put("Taman Buah Mekarsari", "Taman Buah Mekarsari merupakan tempat agrowisata buatan seluas 264 ha yang terletak di di Kecamatan Cileungsi, Kabupaten Bogor, Jawa Barat.");
        wisataDiJabar.put("Alun-Alun Kota Bandung", "Alun-alun Bandung adalah pusat kota Bandung yang dicirikan oleh sebidang tanah yang luas. Di sekelilingnya ada bangunan-bangunan fungsional. " +"\n" +
                "Tempatnya ada di dekat Grote Postweg.");
    }

    public String[] getAttributes() {
        return attributes;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[][] getTiketPesawat() {
        return tiketPesawat;
    }

    public HashMap<String, String> getWisataDiJatim() {
        return wisataDiJatim;
    }

    public HashMap<String, String> getWisataDiYogyakarta() {
        return wisataDiYogyakarta;
    }

    public HashMap<String, String> getWisataDiSumut() {
        return wisataDiSumut;
    }

    public HashMap<String, String> getWisataDiSumbar() {
        return wisataDiSumbar;
    }

    public HashMap<String, String> getWisataDiJabar() {
        return wisataDiJabar;
    }
}
