package com.example.legend.common.packet;

import com.example.legend.common.AvatarFile;
import com.example.legend.common.Constants;

import java.util.List;



public class FileListResponsePacket extends AbstractPacket<List<AvatarFile>> {

    public FileListResponsePacket(List<AvatarFile> data) {
        super(data);
    }

    public FileListResponsePacket(List<AvatarFile> data, int identifier) {
        super(data, identifier);
    }

    @Override
    public String type() {
        return Constants.FILE_LIST_RESPONSE;
    }
}
