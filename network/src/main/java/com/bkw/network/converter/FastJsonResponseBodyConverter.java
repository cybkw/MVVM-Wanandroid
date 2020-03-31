package com.bkw.network.converter;

import com.alibaba.fastjson.JSON;

import java.io.IOException;
import java.lang.reflect.Type;

import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.Okio;
import retrofit2.Converter;

/**
 * FastJson响应体转换器
 *
 * @param <T>
 */
public class FastJsonResponseBodyConverter<T> implements Converter<ResponseBody, T> {

    private final Type type;

    public FastJsonResponseBodyConverter(Type type) {
        this.type = type;
    }

    /**
     * 转换方法
     *
     * @param value
     * @return
     * @throws IOException
     */
    @Override
    public T convert(ResponseBody value) throws IOException {
        BufferedSource bufferedSource = Okio.buffer(value.source());
        String str = bufferedSource.readUtf8();
        bufferedSource.close();
        return JSON.parseObject(str, type);
    }
}
