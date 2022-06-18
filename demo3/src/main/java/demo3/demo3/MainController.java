package demo3.demo3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@Autowired
	private MainService mainService;
	
	
	//GET and POST 
	
	@PostMapping("/addMobile")
	public Mobile addMobile(@RequestBody Mobile mobile1) {
	     return mainService.saveMobile(mobile1);	
	}
	
	
	@GetMapping("/AllMobiles")
	public List<Mobile> findAllMobile(){
		return mainService.getMobile();
	}
	
	
	//For App
	
	@PostMapping("/addApp")
	public App addApp(@RequestBody App app1) {
	     return mainService.saveApp(app1);	
	}
	
	@GetMapping("/AllApp")
	public List<App> findAllApp(){
		return mainService.getApp();
	}
	
	
	//GET and POST END

	@GetMapping("/AllMobApp")
	public ResponseEntity<List<MobAppDto>> getAllMobAppData() {
		return new ResponseEntity<List<MobAppDto>>(mainService.getAllMobApp(), HttpStatus.OK);
	}

	@GetMapping("/MobApp/{name}")
	public MobAppDto findMobAppByName(@PathVariable String name) {
		return mainService.getAppMobDataByName(name);
	}
	
}