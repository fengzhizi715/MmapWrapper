package com.safframework.mmap;

/**
 * Created by tony on 2018/11/12.
 */
public class MmapException extends RuntimeException {

    private static final long serialVersionUID = -5532591914683027029L;

    public MmapException(String msg){
        super(msg);
        System.out.println("[The error maybe]:" + msg );
    }
}
