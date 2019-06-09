package com.example.legend.common;

/**
 * @author Legend
 * @data by on 19-5-12.
 * @description
 */
public interface ReceiveCallback<T> {


    void receiveMessage(T t);
}
