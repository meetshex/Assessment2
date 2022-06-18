package demo3.demo3;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MobileRepository extends JpaRepository<Mobile, Integer> {

	@Query("SELECT new demo3.demo3.MobAppDto(m.name, a.appname) FROM Mobile m JOIN App a ON m.id = a.id") 
     List<MobAppDto> allMobAppData();

	@Query("SELECT new demo3.demo3.MobAppDto(m.name, a.appname) FROM Mobile m JOIN App a ON m.id = a.id AND m.name = :name") 
	MobAppDto findMobAppByName(@Param("name") String name);

}