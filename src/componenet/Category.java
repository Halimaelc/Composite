package componenet;

import java.util.ArrayList;
import java.util.List;

public class Category extends Component{
	List<Component> components= new ArrayList<>();
	
	
	//pour ajouter les componenets a la liste cree.
	void addComponant(Component c){

		components.add(c);
		}
	
	
	//pour afficher la liste des componenets.
	@Override
	public String view() {
		String res=this.name;
		for(Component comp:components)
			res+=comp.view();
		
		return tabulation(this.level)+res;
		//Product product;
		//for (int i = 0; i < components.size(); i++) {
			//Category cat = components.get(i);
			//System.out.println(cat);
			
		}
		
		
			

		
	}
	


