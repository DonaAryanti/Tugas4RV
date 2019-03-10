package com.example.myapplication;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class BarbiePresenter {

    Context context ;
    List<BarbieModel> barbieModels = new ArrayList<>();
    MainView view ;

    public BarbiePresenter (MainView view, Context context){
        this.view=view;
        this.context=context;
    }
    public void setData (){
        BarbieModel barbie;

        barbie= new BarbieModel("Barbie Swan Lake",R.drawable.barbieswanlake, "Rothbart si penyihir jahat mengubah Odette menjadi seekor angsa. Ratu Peri pun menyelamatkannya dan mengatakan bahwa ia akan berwujud manusia di malam hari, dan berubah menjadi angsa di siang hari.");
        barbieModels.add(barbie);
        barbie= new BarbieModel("Barbie Diamond Castle",R.drawable.diamondcastle, "Liana dan Alexa adalah sahabat baik dan selalu suka membantu. Seorang wanita tua memberi mereka cermin ajaib dan kemudian dimulailah petualangan mereka ke Istana Diamond, rumah dari segala musik.");
        barbieModels.add(barbie);
        barbie= new BarbieModel("Barbie Fairytale",R.drawable.fairytale, "Barbie datang ke Paris dan mendapati rumah mode bibinya berada di ambang kebangkrutan. Lalu ia bertemu dengan tiga makhluk ajaib dan menggunakan kekuatan mereka untuk membantu bibinya.");
        barbieModels.add(barbie);
        barbie= new BarbieModel("Barbie Magic The Rainbow",R.drawable.magictherainbow, "Barbie berperan sebagai Elina, peri magang bergabung dengan kaumnya yang lain untuk membuat pelangi musim semi pertama. Meskipun peri saling terikat, Laverna jahat mencoba menghentikan upaya mereka.");
        barbieModels.add(barbie);
        barbie= new BarbieModel("Barbie Pink Shoes",R.drawable.pinkshoes, "Film ini mengisahkan Kristyn & Hailey, dua sahabat yang bercita-cita menjadi penari balet sempurna. Sepasang sepatu merah muda ajaib membawa mereka berdua ke dalam dunia mistis yang penuh petualangan.");
        barbieModels.add(barbie);
        barbie= new BarbieModel("The Island Barbie",R.drawable.theislandbarbie, "arbie disini berperan sebagai Putri Rosella, yang terdampar di sebuah pulau, dan tumbuh dewasa tanpa menyadari siapa dia sebenarnya.");
        barbieModels.add(barbie);
        barbie= new BarbieModel("Barbie The Pearl Princess",R.drawable.thepearlprincess, "Ikuti kisah Barbie, putri duyung yang dibesarkan oleh bibinya, memiliki kekuatan magis untuk mengendalikan mutiara sekaligus melakukan berbagai aksi ajaib.");
        barbieModels.add(barbie);
        barbie= new BarbieModel("Barbie Thumbelina ",R.drawable.thumbelina, "Kenalkan teman baru Barbie, seorang gadis kecil bernama Thumbelina, yang hidup selaras dengan alam di dunia sihir Twillerbees - tersembunyi di antara bunga-bunga liar nan indah.");
        barbieModels.add(barbie);

        view.onSucces(barbieModels);
    }
}
