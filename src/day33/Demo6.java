package day33;

import org.testng.Reporter;
import org.testng.annotations.Test;


/*1. can we run multiple testng class at a shot?
Yes, by using testng suite
2. what is testng suite?
it is an xml file which contains list of testng class
3. how to create tesng.xml?
a. right click on class/package/src
b. goto testng>convert to testng click finish

4. imp tag
 <suite> <test> <classes> <class>*/
public class Demo6 extends BaseTest {
	//BC BM Test AM AC
	@Test
	public void createUser() {
		  Reporter.log("createUser",true);
	 }
}
