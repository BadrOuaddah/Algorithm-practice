package com.badr.algorithm;

import org.junit.Assert;
import org.junit.Test;
import java.util.ArrayList;

public class JavaInstanceOfKeywordTest {

    JavaInstanceOfKeyword javaInstanceOfKeyword = new JavaInstanceOfKeyword();
    @Test
    public void whenOnlyListHasStudentInstanceShouldReturnCorrectResult() {
        ArrayList list = new ArrayList();
        list.add(new Student_inst());
        String result =  javaInstanceOfKeyword.count(list);
        Assert.assertEquals("1 0 0",result);
    }

    @Test
    public void whenOnlyListHasHackerInstanceShouldReturnCorrectResult(){
        ArrayList list = new ArrayList();
        list.add(new Hacker());
        String result =  javaInstanceOfKeyword.count(list);
        Assert.assertEquals("0 0 1",result);
    }

    @Test
    public void whenOnlyListhasAllInstancesShouldReturnCorrectResult(){
        ArrayList list = new ArrayList();
        list.add(new Student_inst());
        list.add(new Rockstar());
        list.add(new Hacker());
        String result =  javaInstanceOfKeyword.count(list);
        Assert.assertEquals("1 1 1",result);
    }
}