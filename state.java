package location;

public class state extends country{
	private String sname;

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "state [sname=" + sname + "]";
	}
	
	

}
