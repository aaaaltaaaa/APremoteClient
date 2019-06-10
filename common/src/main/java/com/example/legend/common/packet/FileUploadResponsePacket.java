package com.example.legend.common.packet;

import com.example.legend.common.Constants;


public class FileUploadResponsePacket extends AbstractPacket<String> {

    public FileUploadResponsePacket(String path, long offset, long length) {
        super(path, offset, length);
    }

    @Override
    public String type() {
        return Constants.FILE_UPLOAD_RESPONSE;
    }
}
