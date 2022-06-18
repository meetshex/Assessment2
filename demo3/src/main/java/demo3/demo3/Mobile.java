package demo3.demo3;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "mobile")
public class Mobile implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "mobilename")
	private String mobilename;

	@OneToMany(targetEntity = App.class, mappedBy = "id", orphanRemoval = false, fetch = FetchType.LAZY)
	private Set<App> apps;

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobilename() {
		return mobilename;
	}

	public void setMobilename(String mobilename) {
		this.mobilename = mobilename;
	}

	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Mobile(int id, String name, String mobilename, Set<App> apps) {
		super();
		this.id = id;
		this.name = name;
		this.mobilename = mobilename;
		this.apps = apps;
	}

	public Mobile() {
		super();
	}

	public Set<App> getApps() {
		return apps;
	}

	public void setApps(Set<App> apps) {
		this.apps = apps;
	}
	

	}