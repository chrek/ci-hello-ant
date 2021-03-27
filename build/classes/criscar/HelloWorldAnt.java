package criscar;
//import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class HelloWorldAnt {
	public static Logger log = Logger.getLogger(HelloWorldAnt.class);

	public static void main(String[] args) {
		//BasicConfigurator.configure();
		 //PropertiesConfigurator is used to configure logger from properties file
		PropertyConfigurator.configure("src/log4j.properties");
		log.debug("Hi there from the logger");
		//System.out.println("Hello World from Ant and Log4j");
		log.info("Hello World from Ant");
	}
}