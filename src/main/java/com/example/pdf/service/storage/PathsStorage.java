package com.example.pdf.service.storage;

import org.springframework.stereotype.Component;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

@Component
public class PathsStorage {
    private final Path storageRoot = Paths.get("src", "main", "resources", "pdf-service");
    ;
    private Path uploadRootDir;
    private Path uploadFilePath;
    private List<Path> uploadFilesPath = new ArrayList<>();

    public Path getStorageRoot() {
        return storageRoot;
    }

    public Path getUploadRootDir() {
        return uploadRootDir;
    }

    public void setUploadRootDir(Path uploadRootDir) {
        this.uploadRootDir = uploadRootDir;
    }

    public Path getUploadFilePath() {
        return uploadFilePath;
    }

    public void setUploadFilePath(Path uploadFilePath) {
        this.uploadFilePath = uploadFilePath;
    }

    public List<Path> getUploadFilesPath() {
        return uploadFilesPath;
    }

    public void setUploadFilesPath(List<Path> uploadFilesPath) {
        this.uploadFilesPath = uploadFilesPath;
    }
}
