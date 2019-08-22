package com.ambarwat.moeslimislamic;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DataDoa extends AppCompatActivity {

    // Deklarasi Variable
    private TextView Getdoa, Getarab, Getbaca, Getarti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_doa);

        getSupportActionBar().setTitle("Doa Harian");
        Getdoa = findViewById(R.id.getdoa);
        Getarab = findViewById(R.id.getarab);
        Getbaca = findViewById(R.id.getbaca);
        Getarti = findViewById(R.id.getarti);
        showData();
    }

    @SuppressLint("SetTextI18n")
    private void showData() {
        // Mendapatkan Nama Doa dari Activity sebelumnya
        String doa = getIntent().getExtras().getString("MyName");

        // Menentukan identitas yang ditampilkan berdasarkan doa yang dipilih
        switch (doa) {
            case "Doa Niat Wudhu":
                Getdoa.setText("Doa Niat Wudhu");
                Getarab.setText("نَوَيْتُ الْوُضُوْءَ لِرَفْعِ الْحَدَثِ اْلاَصْغَرِ فَرْضًا لِلّٰهِ تَعَالَىُ");
                Getbaca.setText("Nawaitul whudu-a lirof'il hadatsii ashghori fardhon lillaahi ta'aalaa");
                Getarti.setText("Artinya : \"Saya niat berwudhu untuk menghilangkan hadast kecil fardu (wajib) karena Allah ta'ala\"");
                break;

            case "Doa Setelah Wudhu":
                Getdoa.setText("Doa Setelah Wudhu");
                Getarab.setText("اَشْهَدُ اَنْ لاَّاِلَهَ اِلاَّاللهُ وَحْدَهُ لاَشَرِيْكَ لَهُ وَاَشْهَدُ اَنَّ مُحَمَّدًاعَبْدُهُ وَرَسُوْلُهُ. اَللّٰهُمَّ اجْعَلْنِىْ مِنَ التَّوَّابِيْنَ وَاجْعَلْنِىْ مِنَ الْمُتَطَهِّرِيْنَ، وَجْعَلْنِيْ مِنْ عِبَادِكَ الصَّالِحِيْنَُ");
                Getbaca.setText("Asyhadu allaa ilaaha illalloohu wahdahuu laa syariika lahu wa asyhadu anna muhammadan ‘abduhuuwa rosuuluhuu, alloohummaj’alnii minat tawwaabiina waj’alnii minal mutathohhiriina, waj'alnii min 'ibadikash shaalihiina");
                Getarti.setText("Artinya: \"Aku bersaksi, tidak ada Tuhan selain Allah Yang Maha Esa, tidak ada sekutu bagi-Nya, dan aku mengaku bahwa Nabi Muhammad itu adalah hamba dan Utusan Allah. Ya Allah, jadikanlah aku dari golongan orang-orang yang bertaubat dan jadikanlah aku dari golongan orang-orang yang suci dan jadikanlah aku dari golongan hamba-hamba Mu yang shaleh\"");
                break;

            case "Doa Akan Membaca Al-Qur'an":
                Getdoa.setText("Doa Akan Membaca Al-Qur'an");
                Getarab.setText("اَللّٰهُمَّ افْتَحْ عَلَىَّ حِكْمَتَكَ وَانْشُرْ عَلَىَّ رَحْمَتَكَ وَذَكِّرْنِىْ مَانَسِيْتُ يَاذَاالْجَلاَلِ وَاْلاِكْرَامُِ");
                Getbaca.setText("Alloohummaftah 'alayya hikmataka wansyur 'alayya rohmataka wa dzakkirnii maanasiitu yaa dzal jalaali wal ikhroomi");
                Getarti.setText("Artinya : \"Ya Allah bukakanlah hikmahMu padaku, bentangkanlah rahmatMu padaku dan ingatkanlah aku terhadap apa yang aku lupa, wahai Dzat yang memiliki keagungan dan kemuliaan.\"");
                break;

            case "Doa Setelah Membaca Al-Qur'an":
                Getdoa.setText("Doa Setelah Membaca Al-Qur'an");
                Getarab.setText("اَللّٰهُمَّ ارْحَمْنِىْ بِالْقُرْآنِ. وَاجْعَلْهُ لِىْ اِمَامًا وَنُوْرًا وَّهُدًى وَّرَحْمَةً. اَللّٰهُمَّ ذَكِّرْنِىْ مِنْهُ مَانَسِيْتُ وَعَلِّمْنِىْ مِنْهُ مَاجَهِلْتُ. وَارْزُقْنِىْ تِلاَ وَتَهُ آنَآءَ اللَّيْلِ وَاَطْرَافَ النَّهَارٍ. وَاجْعَلْهُ لِىْ حُجَّةً يَارَبَّ الْعَالَمِيْنَ");
                Getbaca.setText("Allahummarhamnii bil qur'aani. waj'alhu lii imaaman wa nuuran wa hudan wa rohman. Allahumma dzakkirnii minhu maa nasiitu wa'allimnii minhu maa jahiltu. wazuqnii tilaa watahu aanaa-al laili wa athroofan nahaari. waj'alhu lii hujjatan yaa robbal 'aalamiina");
                Getarti.setText("Artinya : \"Ya Allah, rahmatilah aku dengan Al-Quran yang agung, jadikanlah ia bagiku ikutan cahaya petunjuk rahmat. Ya Allah, ingatkanlah apa yang telah aku lupa dan ajarkan kepadaku apa yang tidak aku ketahui darinya, anugerahkanlah padaku kesempatan membacanya pada sebagian malam dan siang, jadikanlah ia hujjah yang kuat bagiku, wahai Tuhan seru sekalian alam.\"");
                break;

            case "Doa Masuk Masjid":
                Getdoa.setText("Doa Masuk Masjid");
                Getarab.setText("اَللّٰهُمَّ افْتَحْ لِيْ اَبْوَابَ رَحْمَتِكَُ");
                Getbaca.setText("Allahummaf tahlii abwaaba rohmatik");
                Getarti.setText("Artinya: \"Ya Allah, bukalah untukku pintu-pintu rahmat-Mu\"");
                break;

            case "Doa Keluar Masjid":
                Getdoa.setText("Doa Keluar Masjid");
                Getarab.setText("اَللّٰهُمَّ اِنِّى اَسْأَلُكَ مِنْ فَضْلِكََُ");
                Getbaca.setText("Allahumma innii asaluka min fadlik");
                Getarti.setText("Artinya: \"Ya Allah, sesungguhnya aku memohon keutamaan dari-Mu\"");
                break;

            case "Doa Memohon Ilmu Yang Bermanfaat":
                Getdoa.setText("Doa Memohon Ilmu Yang Bermanfaat");
                Getarab.setText("اَللّٰهُمَّ اِنِّى اَسْأَلُكَ عِلْمًا نَافِعًا وَرِزْقًا طَيِّبًا وَعَمَلاً مُتَقَبَّلاًَُ");
                Getbaca.setText("Alloohumma innii as-aluka 'ilmaan naafi'aan wa rizqoon thoyyibaan wa 'amalaan mutaqobbalaan");
                Getarti.setText("Artinya: \"Ya Allah, sesungguhnya aku mohon kepada-Mu ilmu yang berguna, rezki yang baik dan amal yang baik Diterima. (H.R. Ibnu Majah)\"");
                break;

            case "Doa Masuk Rumah":
                Getdoa.setText("Doa Masuk Rumah");
                Getarab.setText("اَللّٰهُمَّ اِنّىْ اَسْأَلُكَ خَيْرَالْمَوْلِجِ وَخَيْرَالْمَخْرَجِ بِسْمِ اللهِ وَلَجْنَا وَبِسْمِ اللهِ خَرَجْنَا وَعَلَى اللهِ رَبّنَا تَوَكَّلْنَاَُ");
                Getbaca.setText("Allahumma innii as-aluka khoirol mauliji wa khoirol makhroji bismillaahi wa lajnaa wa bismillaahi khorojnaa wa'alallohi robbina tawakkalnaa");
                Getarti.setText("Artinya: \"Ya Allah, sesungguhnya aku mohon kepada-Mu baiknya tempat masuk dan baiknya tempat keluar dengan menyebut nama Allah kami masuk, dan dengan menyebut nama Allah kami keluar dan kepada Allah Tuhan kami, kami bertawakkal\"");
                break;

            case "Doa Keluar Rumah":
                Getdoa.setText("Doa Keluar Rumah");
                Getarab.setText("بِسْمِ اللهِ تَوَكَّلْتُ عَلَى اللهِ لاَحَوْلَ وَلاَقُوَّةَ اِلاَّ بِاللهَُ");
                Getbaca.setText("Bismillaahi tawakkaltu 'alalloohi laa hawlaa walaa quwwata illaa bilaahi");
                Getarti.setText("Artinya: \"Dengan menyebut nama Allah aku bertawakal kepada Allah, tiada daya kekuatan melainkan dengan pertologan Allah.\"");
                break;

            case "Doa Masuk Kamar Mandi":
                Getdoa.setText("Doa Masuk Kamar Mandi");
                Getarab.setText("اَللّٰهُمَّ اِنّىْ اَعُوْذُبِكَ مِنَ الْخُبُثِ وَالْخَبَآئِثَُِ");
                Getbaca.setText("Alloohumma Innii a'uudzubika minal khubutsi wal khoaaitsi");
                Getarti.setText("Artinya: \"Ya Allah, aku berlindung pada-Mu dari godaan syetan  laki-laki dan setan perempuan\"");
                break;

            case "Doa Keluar Kamar Mandi":
                Getdoa.setText("Doa Keluar Kamar Mandi");
                Getarab.setText("غُفْرَانَكَ الْحَمْدُ ِللهِ الَّذِىْ اَذْهَبَ عَنّى اْلاَذَى وَعَافَانِىْ");
                Getbaca.setText("Ghufraanaka. Alhamdulillaahil ladzii adzhaba ‘annjil adzaa wa’aafaanii");
                Getarti.setText("Artinya: \"Dengan mengharap ampunanMu, segala puji milik Allah yang telah menghilangkan kotoran dari badanku dan yang telah menyejahterakan.\"");
                break;

            case "Doa Sebelum Tidur":
                Getdoa.setText("Doa Sebelum Tidur");
                Getarab.setText("بِسْمِكَ اللّٰهُمَّ اَحْيَا وَاَمُوْتَُُِ");
                Getbaca.setText("Bismikallohumma ahya wa amuutu");
                Getarti.setText("Artinya: \"Dengan menyebut nama-Mu ya Allah, aku hidup dan aku mati\"");
                break;

            case "Doa Bangun Tidur":
                Getdoa.setText("Doa Bangun Tidur");
                Getarab.setText("اَلْحَمْدُ ِللهِ الَّذِىْ اَحْيَانَا بَعْدَمَآ اَمَاتَنَا وَاِلَيْهِ النُّشُوْرَُُُِ");
                Getbaca.setText("Alhamdu lillahil ladzii ahyaanaa ba'da maa amaa tanaa wa ilahin nusyuuru");
                Getarti.setText("Artinya : \"Segala puji bagi Allah yang telah menghidupkan kami sesudah kami mati (membangunkan dari tidur) dan hanya kepada-Nya kami dikembalikan\"");
                break;

            case "Doa Sebelum Makan":
                Getdoa.setText("Doa Sebelum Makan");
                Getarab.setText("اَللّٰهُمَّ بَارِكْ لَنَا فِيْمَا رَزَقْتَنَا وَقِنَا عَذَابَ النَّارِ");
                Getbaca.setText("Alloohumma barik lanaa fiimaa razatanaa waqinaa 'adzaa bannar");
                Getarti.setText("Artinya: \"Ya Allah, berkahilah kami dalam rezeki yang telah Engkau berikan kepada kami dan peliharalah kami dari siksa api neraka\"");
                break;

            case "Doa Sesudah Makan":
                Getdoa.setText("Doa Sesudah Makan");
                Getarab.setText("اَلْحَمْدُ ِللهِ الَّذِىْ اَطْعَمَنَا وَسَقَانَا وَجَعَلَنَا مُسْلِمِيْنََُُِ");
                Getbaca.setText("Alhamdu lillaahil ladzii ath'amanaa wa saqoonaa wa ja'alnaa muslimiin");
                Getarti.setText("Artinya: \"Segala puji bagi Allah yang telah memberi makan kami dan minuman kami, serta menjadikan kami sebagai orang-orang islam\"");
        }
    }
}
