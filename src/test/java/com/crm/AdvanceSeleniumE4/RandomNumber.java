package com.crm.AdvanceSeleniumE4;

import java.util.Random;

import org.testng.annotations.Test;

public class RandomNumber {
@Test
public void main() {
	Random r=new Random();
      int number = r.nextInt(1000);
      System.out.println(number);
    
}

}
