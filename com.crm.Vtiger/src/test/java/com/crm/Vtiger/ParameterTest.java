package com.crm.Vtiger;

import org.testng.annotations.Test;

public class ParameterTest 
{
   @Test
   public void parameterValue()
   {
	   System.out.println(System.getProperty("browser"));
	   System.out.println(System.getProperty("url"));
	   System.out.println(System.getProperty("username"));
	   System.out.println(System.getProperty("password"));
	   
	}
}
