package ru.igsltk.numshome;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class SimpleMathOpController {

	@GetMapping("/sum")
	public ResponseEntity calculateSum(
								@RequestParam Double a,
								@RequestParam Double b) {
		try {
			Map<String, String> data = new HashMap<>();
			String sum = Double.toString(a+b);
			data.put("sum", sum);
			return ResponseEntity.ok().body(data);
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("Error!");
		}
	}

	@GetMapping("/sub")
	public ResponseEntity calculateSub(
								@RequestParam Double a,
								@RequestParam Double b) {
		try {
			Map<String, String> data = new HashMap<>();
			String sub = Double.toString(a-b);
			data.put("sub", sub);
			return ResponseEntity.ok().body(data);
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("Error!");
		}
	}

	@GetMapping("/div")
	public ResponseEntity calculateDiv(
								@RequestParam Double a,
								@RequestParam Double b) {
		try {
			Map<String, String> data = new HashMap<>();
			String div = Double.toString(a/b);
			data.put("div", div);
			return ResponseEntity.ok().body(data);
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("Error!");
		}
	}

	@GetMapping("/mod")
	public ResponseEntity calculateMod(
								@RequestParam Double a,
								@RequestParam Double b) {
		try {
			Map<String, String> data = new HashMap<>();
			String mod = Double.toString(a%b);
			data.put("mod", mod);
			return ResponseEntity.ok().body(data);
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("Error!");
		}
	}

}