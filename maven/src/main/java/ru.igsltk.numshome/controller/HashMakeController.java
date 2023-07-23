package ru.igsltk.numshome;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class HashMakeController {

	@GetMapping("/hash")
	public ResponseEntity calculateHash(
								@RequestParam String hashType,
								@RequestParam String textToHash) {
		try {
			Map<String, String> data = new HashMap<>();
			MessageDigest digest = MessageDigest.getInstance(hashType);
			byte[] hashedBytes = digest.digest(textToHash.getBytes("UTF-8"));
			StringBuffer stringBuffer = new StringBuffer();
			for (int i = 0; i < hashedBytes.length; i++) {
            	stringBuffer.append(Integer.toString((hashedBytes[i] & 0xff) + 0x100, 16)
                    .substring(1));
        	}
        	String hash = stringBuffer.toString();
        	data.put("hash", hash);
			return ResponseEntity.ok().body(data);
		} catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
			return ResponseEntity.badRequest().body("No Such Algorithm!");
		} catch(Exception e) {
			return ResponseEntity.badRequest().body("Error!");
		}
	}

}