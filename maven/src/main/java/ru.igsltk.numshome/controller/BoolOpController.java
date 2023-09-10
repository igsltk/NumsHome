package ru.igsltk.numshome;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class BoolOpController {

	@GetMapping("/isequal")
	public ResponseEntity isEqual(
								@RequestParam Double a,
								@RequestParam Double b) {
		try {
			Map<String, String> data = new HashMap<>();
			boolean result = false;
			if (Double.valueOf(a).equals(Double.valueOf(b))) {
				result = true;
			}
			data.put("bool", Boolean.toString(result));
			return ResponseEntity.ok().body(data);
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("Error!");
		}
	}

}