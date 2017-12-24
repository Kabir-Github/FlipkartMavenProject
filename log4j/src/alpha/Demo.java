package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Demo {

	private static Logger log = LogManager.getLogger(Demo.class.getName());

	public static void main(String[] args) {

		log.debug("I am debugging");
		log.error("Error found");
		log.info("object is present");
		log.fatal("this is fatal");

	}

}
