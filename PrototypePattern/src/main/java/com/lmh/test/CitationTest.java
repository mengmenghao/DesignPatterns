package com.lmh.test;

/**
 * @author lmh
 * @description: 一句话描述该类的功能
 * @projectName: DesignPatterns
 * @className: CitationTest
 * @createDate: 2023/9/25 12:24
 */
public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        Citation citation = new Citation();
        citation.setName("aa");
        citation.setAge(new Citation());
        Citation clone = citation.clone();
        clone.setName("vvv");
        System.out.println(citation);
        System.out.println(clone);
        citation.show();
        clone.show();
    }
}
