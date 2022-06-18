package demo3.demo3;

public class MobAppDto {

	private String mob_Name;
	private String app_Name;
	
	public MobAppDto(String mob_Name, String app_Name) {
		this.mob_Name = mob_Name;
		this.app_Name = app_Name;
			}

	//getters and setters

	public String getMob_Name() {
		return mob_Name;
	}

	public void setMob_Name(String mob_Name) {
		this.mob_Name = mob_Name;
	}

	public String getApp_Name() {
		return app_Name;
	}

	public void setApp_Name(String app_Name) {
		this.app_Name = app_Name;
	}

	public MobAppDto() {
		super();
	}

	@Override
	public String toString() {
		return "MobAppDto [mob_Name=" + mob_Name + ", app_Name=" + app_Name + "]";
	}

}
