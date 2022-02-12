package com.example.javatechassignment.files.storage.responses;

import com.example.javatechassignment.files.metadata.Metadata;

import lombok.Value;

@Value
public class GetFileResponse {
    Long fileId;
    String currentFileName;
    String originalFileName;
    Long fileSize;
    String fileExtension;
    byte[] content;

    public GetFileResponse(Metadata metadata, byte[] content) {
        this.fileId = metadata.getId();
        this.currentFileName = metadata.getCurrentName();
        this.originalFileName = metadata.getOriginalName();
        this.fileSize = metadata.getSize();
        this.fileExtension = metadata.getExtension();
        this.content = content;
    }
}
