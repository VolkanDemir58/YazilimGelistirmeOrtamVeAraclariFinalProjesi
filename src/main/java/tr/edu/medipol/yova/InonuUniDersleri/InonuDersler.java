package tr.edu.medipol.yova.InonuUniDersleri;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dersler")
public class InonuDersler {
	
	private static List<String> DERSLER = new ArrayList<>();
	{
		DERSLER.add("DİŞ HEKİMLİĞİ");
		DERSLER.add("ECZACILIK");
		DERSLER.add("HUKUK");
		DERSLER.add("SPOR BİLİMLERİ");
	}
	@GetMapping("/listele")
	public List<String>listele(){
		return DERSLER;
	}
	@PostMapping("/ekle")
	public boolean ekle(@RequestBody String dersAd) {
		DERSLER.add(dersAd);
		return true;
	}
}
