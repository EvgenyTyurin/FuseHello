package evgenyt.fuse_hello;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.apache.tika.Tika;

/**
 * File processor bean
 * @author tey
 */

public class MyBean {
	
	// Process file body using Tika
	public String process(String msg) {
		Tika tika = new Tika();
		try {
			InputStream stream = new ByteArrayInputStream(msg.getBytes());
			msg = tika.parseToString(stream);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return msg;
	}
}
