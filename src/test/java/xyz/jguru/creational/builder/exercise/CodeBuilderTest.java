package xyz.jguru.creational.builder.exercise;

import org.junit.Assert;
import org.junit.Test;

public class CodeBuilderTest {

    private String preprocess(String text)
    {
        return text.replace("\r\n", "\n").trim();
    }

    @Test
    public void emptyTest() {
        CodeBuilder cb = new CodeBuilder("Foo");
        Assert.assertEquals("public class Foo\n{\n}",
                preprocess(cb.toString()));
    }

    @Test
    public void personTest()
    {
        CodeBuilder cb = new CodeBuilder("Person")
                .addField("name", "String")
                .addField("age", "int");
        Assert.assertEquals("public class Person\n{\n" +
                        "  public String name;\n" +
                        "  public int age;\n}",
                preprocess(cb.toString()));
    }
}