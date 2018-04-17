package com.xcheng.retrofit;

import retrofit2.Callback;

/**
 * 创建时间：2018/4/8
 * 编写人： chengxin
 * 功能描述：添加重载方法{@link Call2#enqueue(Object, Callback2)}方法
 */
public interface Call2<T> extends retrofit2.Call<T> {

    /**
     * @throws UnsupportedOperationException if called this method
     */
    @Override
    void enqueue(Callback<T> callback);

    /**
     * @param tag       请求的tag
     * @param callback2 请求的回调
     */
    void enqueue(Object tag, Callback2<T> callback2);

    @Override
    Call2<T> clone();
}