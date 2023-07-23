package com.github.pielena.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileNode {
    private String name;
    private List<FileNode> includedFiles;

    public Directory(String name) {
        this.name = name;
        includedFiles = new ArrayList<>();
    }

    public void add(FileNode file) {
        includedFiles.add(file);
    }

    @Override
    public void ls() {
        System.out.println("Directory: " + name);
        includedFiles.forEach(FileNode::ls);
    }
}
