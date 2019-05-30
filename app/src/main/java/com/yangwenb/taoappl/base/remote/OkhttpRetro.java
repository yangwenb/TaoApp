package com.yangwenb.taoappl.base.remote;

import com.yangwenb.taoappl.BuildConfig;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/*@  Yangwenbin
 *${DATA} $ {TIME}
 */public class OkhttpRetro {
    private static final long TIMEOUT = 20000;
    private static volatile TaoService sTaoService;

    public static TaoService getTaoService(String urlPath) {
        if (sTaoService == null) {
            synchronized (OkhttpRetro.class) {
                if (sTaoService == null) {
                    HttpLoggingInterceptor httplogging = new HttpLoggingInterceptor();
                    if (BuildConfig.DEBUG) {
                        httplogging.setLevel(HttpLoggingInterceptor.Level.BODY);
                    } else {
                        httplogging.setLevel(HttpLoggingInterceptor.Level.NONE);
                    }

                    OkHttpClient okHttpClient = new OkHttpClient.Builder()
                            .addInterceptor(httplogging)
                            .connectTimeout(TIMEOUT, TimeUnit.SECONDS)
                            .writeTimeout(TIMEOUT, TimeUnit.SECONDS)
                            .readTimeout(TIMEOUT, TimeUnit.SECONDS)
                            .build();

                    Retrofit retrofit = new Retrofit.Builder()
                            .client(okHttpClient)
                            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                            .addConverterFactory(GsonConverterFactory.create())
                            .baseUrl(urlPath)
                            .build();
                    sTaoService = retrofit.create(TaoService.class);
                }
            }
        }
        return sTaoService;
    }
}
