package CyberSoftJavaBackEndJava12.gira.common.until;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHeader {
	public static ResponseEntity<Object> getResponse(Object content, HttpStatus status) {
		Map<String, Object> map = new HashMap<>();
		map.put("content", map);
		map.put("errors", map);
		map.put("timestamp", LocalDate.now());
		map.put("status", status.value());

		return new ResponseEntity<Object>(map, status);

	}

}
