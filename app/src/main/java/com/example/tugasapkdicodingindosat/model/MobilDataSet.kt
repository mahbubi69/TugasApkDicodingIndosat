package com.example.tugasapkdicodingindosat.model

import android.media.midi.MidiOutputPort
import com.example.tugasapkdicodingindosat.R

class MobilDataSet {

    fun listMobil(): ArrayList<Mobil> {
        val datalistMobil = ArrayList<Mobil>()


        datalistMobil.add(
            Mobil(
                img = R.drawable.galardo,
                nama = "Lamborgini Galardo",
                tahun = "2013",
                detail = "Mobil Galardo adalah sebuah mobil sport yang dibuat oleh Lamborghini, sebuah mobil yang paling laku di perusahaan dengan 10.000 unit yang telah dibuat dalam 7 tahun produksi pertamanya dan 14.022 unit telah diproduksi selama masa produksinya.[1] Mobil ini dinamakan setelah nama seekor banteng petarung yang terkenal.[2] Pada tanggal 25 November 2013, Gallardo terakhir telah keluar dari pabrik; mobil ini adalah Gallardo LP 570-4 Spyder Performante dalam warna merah yang dinamakan Rosso Mars yang telah dibeli oleh seorang kolektor"
            )

        )

        datalistMobil.add(
            Mobil(
                img = R.drawable.alphard,
                nama = "Toyota Alphard",
                tahun = "2002",
                detail = "Pada awalnya, mobil ini ditujukan hanya untuk pasar domestik Jepang saja, namun seiring berjalannya waktu, banyak orang di luar Jepang yang berminat untuk memilikinya sehingga diputuskan untuk diproduksi secara massal pada tahun 2002 dan pada tahun 2008 baru mulai masuk ke Indonesia."
            )
        )


        datalistMobil.add(
            Mobil(
                img = R.drawable.avansa,
                nama = "Avansa",
                tahun = "2003",
                detail = "Generasi pertama dari mobil Avanza lahir pada tahun 2003 lalu. Dua tahun awal, yaitu 2003 dan 2004 menjadi generasi pertama mobil Avanza dengan transmisi manual. Sedangkan pada tahun 2015 mobil Avanza transmisi otomatis resmi diluncurkan."
            )
        )

        datalistMobil.add(
            Mobil(
                img = R.drawable.inova,
                nama = "Inova",
                tahun = "2004",
                detail = "Nama Toyota Innova mulai diperkenalkan di tahun 2004. DNA mobil tetap menggunakan DNA Kijang yang menjadikan mobil satu ini generasi pertama dari seri mobil Toyota Innova. Perubahan tersebut membuat tampilan generasi kelima Toyota Innova lebih modern dan mewah dari sebelumnya"
            )
        )

        datalistMobil.add(
            Mobil(
                img = R.drawable.jazz,
                nama = "Jazz",
                tahun = "2001",
                detail = "Honda Jazz pertama kali diperkenalkan pada 2001. Nama Honda Jazz digunakan di Eropa, sebagian Asia, Australia, Oceania, Timur Tengah, dan Afrika"
            )
        )

        datalistMobil.add(
            Mobil(
                img = R.drawable.jeep,
                nama = "Jeep",
                tahun = "1941",
                detail = "Sejarah mobil Jeep dimulai dari 1941, Mulanya dari model Willys MA. Kendaraan ini diciptakan buat tentara, begitu pula dengan Willys MB yang lahir pada tahun yang sama. Versi Willys dengan spesifikasi sipil, CJ (Civilian Jeep), juga lahir pada tahun yang sama"
            )
        )

        datalistMobil.add(
            Mobil(
                img = R.drawable.livina,
                nama = "Livina",
                tahun = "2009",
                detail = "Nissan Livina adalah mobil MPV kompak buatan Nissan yang dirakit di China, Indonesia, Brasil dan Filipina. Grand Livina adalah versi panjang 7-seater yang berbentuk MPV, sedangkan Livina adalah hatchback 5-seater. Versi hatchback tersedia dalam dua varian yaitu XR dan X-Gear."
            )
        )

        datalistMobil.add(
            Mobil(
                img = R.drawable.pajero,
                nama = "Pajero",
                tahun = "1982",
                detail = "Pajero meluncur pertama kali ke publik pada 1982. Saat itu, mobil 4WD begitu digandrungi. Melihat pasar yang tumbuh Mitsubishi Motors Corporation (MMC) lantas memperkenalkan sejumlah model canggih berbasis 4WD, termasuk minivan Chariot dan sedan Galant."
            )
        )

        datalistMobil.add(
            Mobil(
                img = R.drawable.panter,
                nama = "Panter",
                tahun = "1991",
                detail = "Pada generasi awal, Panther hadir dengan mesin diesel berkapasitas 2.300 cc. Saat itu Panther tersedia dalam beberapa varian seperti Royale pada era 1990-an, LS, Touring dan Grand Touring, serta pikap Isuzu Panther."
            )
        )

        datalistMobil.add(
            Mobil(
                img = R.drawable.rx_8,
                nama = "Rx_8",
                tahun = "2001",
                detail = "Mazda RX-8 adalah mobil sport yang diproduksi Mazda Motor Corporation. Diperkenalkan tahun 2001 di North American International Auto Show"
            )
        )

        return datalistMobil
    }

}