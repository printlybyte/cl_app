package com.xlxs.cl_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.lzy.okgo.OkGo;
import com.lzy.okgo.cache.CacheMode;
import com.lzy.okgo.callback.StringCallback;
import com.lzy.okgo.model.HttpHeaders;
import com.lzy.okgo.model.Response;

import java.io.UnsupportedEncodingException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OkGo.<String>get(ConstantUtils.baseurl)                            // 请求方式和请求url
                .tag(this)                       // 请求的 tag, 主要用于取消对应的请求
                .cacheKey("cacheKey")            // 设置当前请求的缓存key,建议每个不同功能的请求设置一个
                .cacheMode(CacheMode.NO_CACHE)    // 缓存模式，详细请看缓存介绍
                //  .cacheTime(3000)//缓存时间
                .params("fid","20")
                .params("page","1")
                .headers(HeadersUtils.getHeaders())
                .params("search","")
                .execute(new StringCallback() {

                    @Override
                    public void onSuccess(Response<String> response) {
                        String result=   response.body();
                        String as = "";
                        try {
                            as = new String(result.getBytes("ISO-8859-1"),"gb2312");
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                        }



                        try {
                              as=new String(result.getBytes(),"utf-8");
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                        }
                        Log.i("testre",  response.body() +as);
                        Log.i("testre",  "=========="  +as);
                        try {
                            Log.i("testre", String.valueOf(response.body().getBytes("gbk")));
                        } catch (UnsupportedEncodingException e) {
                            e.printStackTrace();
                        }


                    }

                    @Override
                    public void onError(Response<String> response) {
                        super.onError(response);

                        Log.i("testre",response.body());
                    }
                });
    }

    public   String toGBK(String source) throws UnsupportedEncodingException {
        StringBuilder sb = new StringBuilder();
        byte[] bytes = source.getBytes("GBK");
        for(byte b : bytes) {
            sb.append("%" + Integer.toHexString((b & 0xff)).toUpperCase());
        }

        return sb.toString();
    }

}
