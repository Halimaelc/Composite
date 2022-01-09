package componenet;

public abstract class Component {
	int level;
	String name;
	public int getLevel() {
		return level;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String tabulation(int level) {
		level=this.level;
		String tab = null;
		for (int i = 0; i < level; i++) {
			tab+="\t";
			}
		return tab;
		}
	
	public abstract String view();

}
