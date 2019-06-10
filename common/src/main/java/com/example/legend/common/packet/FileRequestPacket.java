package com.example.legend.common.packet;

import com.example.legend.common.Constants;


public class FileRequestPacket extends AbstractPacket<String> {

    public FileRequestPacket(String path) {
        super(path);
    }

    public FileRequestPacket(String path, long length) {
        super(path, length);
    }

    @Override
    public String type() {
        return Constants.FILE_REQUEST;
    }
}
