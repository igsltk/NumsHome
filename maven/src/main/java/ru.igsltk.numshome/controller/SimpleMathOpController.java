package ru.igsltk.numshome;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class SimpleMathOpController {

	@GetMapping("/sum")
	public ResponseEntity calculateSum(
								@RequestParam Double a,
								@RequestParam Double b) {
		try {
			String sum = Double.toString(a+b);
			return ResponseEntity.ok().body(sum);
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("Error!");
		}
	}

	@GetMapping("/sub")
	public ResponseEntity calculateSub(
								@RequestParam Double a,
								@RequestParam Double b) {
		try {
			String sub = Double.toString(a-b);
			return ResponseEntity.ok().body(sub);
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("Error!");
		}
	}

	@GetMapping("/div")
	public ResponseEntity calculateDiv(
								@RequestParam Double a,
								@RequestParam Double b) {
		try {
			String div = Double.toString(a/b);
			return ResponseEntity.ok().body(div);
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("Error!");
		}
	}

	@GetMapping("/mod")
	public ResponseEntity calculateMod(
								@RequestParam Double a,
								@RequestParam Double b) {
		try {
			String mod = Double.toString(a%b);
			return ResponseEntity.ok().body(mod);
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("Error!");
		}
	}

}