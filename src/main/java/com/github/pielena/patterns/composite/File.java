package com.github.pielena.patterns.composite;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class File implements FileNode {
    private String name;

    @Override
    public void ls() {
        System.out.println("    File: " + name);
    }
}
