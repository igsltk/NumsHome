package ru.igsltk.numshome;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.lang.Math;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class TrigonomOpController {

	@GetMapping("/cos")
	public ResponseEntity calculateCos(@RequestParam Double a) {
		try {
			Map<String, String> data = new HashMap<>();
			String cos = Double.toString(Math.cos(a));
			data.put("cos", cos);
			return ResponseEntity.ok().body(data);
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("Error!");
		}
	}

	@GetMapping("/sin")
	public ResponseEntity calculateSin(@RequestParam Double a) {
		try {
			Map<String, String> data = new HashMap<>();
			String sin = Double.toString(Math.sin(a));
			data.put("sin", sin);
			return ResponseEntity.ok().body(data);
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("Error!");
		}
	}

	@GetMapping("/tan")
	public ResponseEntity calculateTan(@RequestParam Double a) {
		try {
			Map<String, String> data = new HashMap<>();
			String tan = Double.toString(Math.tan(a));
			data.put("tan", tan);
			return ResponseEntity.ok().body(data);
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("Error!");
		}
	}

	@GetMapping("/ctan")
	public ResponseEntity calculateCtan(@RequestParam Double a) {
		try {
			Map<String, String> data = new HashMap<>();
			String ctan = Double.toString(1/Math.tan(a));
			data.put("ctan", ctan);
			return ResponseEntity.ok().body(data);
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("Error!");
		}
	}

}