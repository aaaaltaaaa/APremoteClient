package com.example.legend.common.packet;


import com.example.legend.common.Constants;


public class FileDownloadRequestPacket extends AbstractPacket<String> {

    public FileDownloadRequestPacket(String path, long offset, long length) {
        super(path, offset, length);
    }

    @Override
    public String type() {
        return Constants.FILE_DOWNLOAD_REQUEST;
    }

}
