package ru.igsltk.numshome;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.lang.Math;

@RestController
@RequestMapping("/api")
public class TrigonomOpController {

	@GetMapping("/cos")
	public ResponseEntity calculateCos(@RequestParam Double a) {
		try {
			String cos = Double.toString(Math.cos(a));
			return ResponseEntity.ok().body(cos);
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("Error!");
		}
	}

	@GetMapping("/sin")
	public ResponseEntity calculateSin(@RequestParam Double a) {
		try {
			String sin = Double.toString(Math.sin(a));
			return ResponseEntity.ok().body(sin);
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("Error!");
		}
	}

	@GetMapping("/tan")
	public ResponseEntity calculateTan(@RequestParam Double a) {
		try {
			String tan = Double.toString(Math.tan(a));
			return ResponseEntity.ok().body(tan);
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("Error!");
		}
	}

	@GetMapping("/ctan")
	public ResponseEntity calculateCtan(@RequestParam Double a) {
		try {
			String ctan = Double.toString(1/Math.tan(a));
			return ResponseEntity.ok().body(ctan);
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("Error!");
		}
	}

}