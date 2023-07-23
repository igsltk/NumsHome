package ru.igsltk.numshome;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class FuncOpController {

	@GetMapping("/discriminant")
	public ResponseEntity calculateDiscriminant(
								@RequestParam Double b,
								@RequestParam Double a,
								@RequestParam Double c) {
		try {
			Map<String, String> data = new HashMap<>();
			String discriminant = Double.toString(b*b-4*a*c);
			data.put("disc", discriminant);
			return ResponseEntity.ok().body(data);
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("Error!");
		}
	}

}