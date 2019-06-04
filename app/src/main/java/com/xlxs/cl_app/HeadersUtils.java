package com.xlxs.cl_app;

import com.lzy.okgo.model.HttpHeaders;

/**
 * ============================================
 * 描  述：
 * 包  名：com.xlxs.cl_app
 * 类  名：HeadersUtils
 * 创建人：lgd
 * 创建时间：2019/6/4 15:00
 * ============================================
 **/
public class HeadersUtils {

    private HeadersUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    public static HttpHeaders getHeaders(){
        HttpHeaders httpHeaders=new HttpHeaders();
        httpHeaders.put("Host","private70.ghuws.win");
        httpHeaders.put("Connection","keep-alive");
        httpHeaders.put("Upgrade-Insecure-Requests","1");
        httpHeaders.put("User-Agent","Mozilla/5.0 (Linux; Android 9; ALP-AL00 Build/HUAWEIALP-AL00; wv) AppleWebKit/537.36 (KHTML, like Gecko) Version/4.0 Chrome/71.0.3578.99 Mobile Safari/537.36");
        httpHeaders.put("Accept","text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8");
//        httpHeaders.put("Accept-Encoding","gzip,deflate");
        httpHeaders.put("Accept-Language","zh-CN,en-GB;q=0.9,zh-TW;q=0.8,en-US;q=0.7");
        httpHeaders.put("Cookie","ismob=1; hiddenface=; __cfduid=d2b601843c2ba00e20696caa0b92c47931532129636; UM_distinctid=16879958dc365-0d08bc2936586a-573c4f3b-38400-16879958dc818c; cssNight=; 227c9_lastvisit=0%091554971930%09%2Fread.php%3Ftid%3D3493208; CNZZDATA950900=cnzz_eid%3D416402323-1532126844-%26ntime%3D1555028696");
        httpHeaders.put("X-Requested-With","com.cl.newt66y");
        httpHeaders.put("Content-Type","text/html; charset=utf-8");

        return httpHeaders;
    }



}
