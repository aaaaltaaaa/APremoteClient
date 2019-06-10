package com.example.legend.common.packet;

import com.example.legend.common.Constants;


public class FileResponsePacket extends AbstractPacket<String> {

    public FileResponsePacket(String data, long length) {
        super(data, length);
    }

    @Override
    public String type() {
        return Constants.FILE_RESPONSE;
    }
}
