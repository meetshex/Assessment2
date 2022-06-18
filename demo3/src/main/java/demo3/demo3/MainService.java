package demo3.demo3;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

@Service
public class MainService {

	@Resource
	private MobileRepository mobileRepository;

	@Resource
	private AppRepository appRepository;
		
	//POST AND GET
	
	public Mobile saveMobile(Mobile mobile1) {
		return mobileRepository.save(mobile1);
	}
	
	public List<Mobile> getMobile(){
		return mobileRepository.findAll();
	}
	
	// POST AND GET END
	
	public App saveApp(App app) {
		return appRepository.save(app);
	}
	
	public List<App> getApp(){
		return appRepository.findAll();
	}
	
	public List<MobAppDto> getAllMobApp() {
		List<MobAppDto> list = mobileRepository.allMobAppData();
		list.forEach(l -> System.out.println(l));
		return list;
	}
	
	public MobAppDto getAppMobDataByName(String name){
		return mobileRepository.findMobAppByName(name);
	}
}