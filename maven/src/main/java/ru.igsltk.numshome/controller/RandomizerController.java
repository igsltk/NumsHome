package ru.igsltk.numshome;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class RandomizerController {

	@GetMapping("/rand")
	public ResponseEntity getJustRand() {
		try {
			Map<String, String> data = new HashMap<>();
			String randNum = Double.toString(Math.random());
			data.put("rand", randNum);
			return ResponseEntity.ok().body(data);
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("Error!");
		}
	}
	
	@GetMapping("/rand/fromto")
	public ResponseEntity getRandFromTo(
								@RequestParam Double min,
								@RequestParam Double max) {
		try {
			Map<String, String> data = new HashMap<>();
			String randNum = Double.toString(min + Math.random() * max);
			data.put("rand", randNum);
			return ResponseEntity.ok().body(data);
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("Error!");
		}
	}

	@GetMapping("/rand/fixed")
	public ResponseEntity getFixedRand(@RequestParam Integer numOfSimbols) {
		try {
			Map<String, String> data = new HashMap<>();
			int min = (int) Math.pow(10, numOfSimbols - 1);
			int max = (int) Math.pow(10, numOfSimbols) - 1;
			String randNum = Integer.toString((int) (min + Math.random() * (max - min + 1)));
			data.put("rand", randNum);
			return ResponseEntity.ok().body(data);
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("Error!");
		}
	}
	
}