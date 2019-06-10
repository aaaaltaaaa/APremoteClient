package com.example.legend.common.packet;

import com.example.legend.common.Constants;


public class FileDownloadResponsePacket extends AbstractPacket<String> {

    public FileDownloadResponsePacket(String name, long offset, long length) {
        super(name, offset, length);
    }

    @Override
    public String type() {
        return Constants.FILE_DOWNLOAD_RESPONSE;
    }
}
