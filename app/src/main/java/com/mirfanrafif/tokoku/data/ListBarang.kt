package com.mirfanrafif.tokoku.data

object ListBarang {
    private val namaBarang = listOf(
        "Ale-Ale",
        "Kopikap",
        "Mi Kremes",
        "Sonice",
        "Makroni Bintang",

        "Aqua Botol",
        "Okky Jelly Drink",
        "Pensil 2B",
        "Penghapus",
        "Ballpoint"
    )

    private val harga = listOf(
        1000,
        500,
        500,
        1000,
        500,

        2000,
        1000,
        2000,
        700,
        3000
    )

    private val foto = listOf(
        "https://icdn.happyfresh.com/t/s_wide,c_fit/spree/images/attachments/e4d6ab3aa88846465ad454212ed928b310f18312-original.jpg",
        "https://jumbo.co.id/wp-content/uploads/2020/07/8.jpeg",
        "https://assets.klikindomaret.com/share/20028585/20028585_1.jpg",
        "https://id-test-11.slatic.net/p/692fcfe9016f266cc818831f3c079f48.jpg",
        "https://s3.bukalapak.com/img/363339184/large/MAKARONI_3_BINTANG.jpg",

        "https://ecs7.tokopedia.net/img/cache/700/product-1/2019/2/28/49422932/49422932_d4332be4-4580-47cd-b6af-cbac2323b808_700_700.jpg",
        "https://icdn.happyfresh.com/t/s_large,c_fit/spree/images/attachments/35234e93c717b3b57248f7fa15939f06902bac33-original.jpg",
        "https://ecs7.tokopedia.net/img/cache/700/product-1/2017/1/31/11008411/11008411_b4134504-d8f2-46d1-8990-223a7a7b3f2c_500_500.jpg",
        "https://www.static-src.com/wcsstore/Indraprastha/images/catalog/full//100/MTA-7747444/joyko_penghapus_eraser_joyko_putih_kecil_-_2_pcs_-_full02_pny9qwdl.jpg",
        "https://cdn.shopify.com/s/files/1/2214/2683/products/joyko-ballpoint-gel-pen-track-0-5mm-gp-252-black-office-stationery-toko-atk_791_1024x1024.jpg?v=1543355856"
    )

    val dataBarang = ArrayList<Barang>().apply {
        for(index in namaBarang.indices) {
            val barang = Barang(
                nama = namaBarang.get(index),
                harga = harga.get(index),
                foto = foto.get(index))
            add(barang)
        }

    }


}