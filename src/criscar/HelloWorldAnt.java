package criscar;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class HelloWorldAnt {
	public static Logger log = Logger.getLogger(HelloWorldAnt.class);

	public static void main(String[] args) {
		BasicConfigurator.configure();
		log.debug("Hi there from the logger");
		//System.out.println("Hello World from Ant and Log4j");
		log.info("Hello World from Ant");
	}

}