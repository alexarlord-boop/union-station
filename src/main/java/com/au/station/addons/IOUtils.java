package com.au.station.addons;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class IOUtils {
    private String srcLink;
    private String snkLink;
    private String data;

    public IOUtils(String srcLink, String snkLink) {
        this.srcLink = srcLink;
        this.snkLink = snkLink;
        this.data = "";
    }

    public void setDataFromTrainFile(String dataFromTrainFile) {
        this.data = dataFromTrainFile;
    }

    public String getDataFromTrainFile() {
        return this.data;
    }

    public void readTrainFile() throws IOException {
        Path path = Paths.get(this.srcLink);

        try (Stream<String> lines = Files.lines(path)) {
            String data = lines.collect(Collectors.joining("\n"));
            setDataFromTrainFile(data);
        }


    }

    public void writeTrainFile(String trainData) {
        Path path = Paths.get(this.snkLink);
        byte[] strToBytes = trainData.getBytes();
        try {
            Files.write(path, strToBytes);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public String getSrcLink() {
        return srcLink;
    }

    public void setSrcLink(String srcLink) {
        this.srcLink = srcLink;
    }

    public String getSnkLink() {
        return snkLink;
    }

    public void setSnkLink(String snkLink) {
        this.snkLink = snkLink;
    }
}
