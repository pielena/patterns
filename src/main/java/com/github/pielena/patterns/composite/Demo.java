package com.github.pielena.patterns.composite;

public class Demo {

    public static void main(String[] args) {
        Directory documents = new Directory("documents");
        Directory images = new Directory("images");
        Directory texts = new Directory("texts");

        File presentation1 = new File("presentation1.pdf");
        File image1 = new File("image1.jpg");
        File image2 = new File("image1.jpg");
        File text1 = new File("text1.txt");

        documents.add(presentation1);
        documents.add(images);
        documents.add(texts);
        images.add(image1);
        images.add(image2);
        texts.add(text1);

        documents.ls();
    }
}
