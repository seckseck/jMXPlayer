package src.Model;

import java.util.Vector;


public class GraphicInstanceGroup {
    private String description;
    private Vector<GraphicInstance> instances;
    private int index = -1;
    
    public GraphicInstanceGroup(String description) {
        this.instances = new Vector<GraphicInstance>();
        this.setDescription(description);
    }
    
    public void setGroupSize(int maxSize) {
        this.instances.setSize(maxSize);
    }
    
    public Vector<GraphicInstance> getInstances() {
    	return instances;
    }
    
    public void addInstance(GraphicInstance instance){
    	if (instances.capacity() == instances.size()) {
    		instances.setSize(instances.size() * 2);
    	}
    	
    	this.instances.add(instance);
    }

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public GraphicInstance getNextInstance() {
		try {
			return instances.get(this.index + 1);
		} catch (ArrayIndexOutOfBoundsException e) {
			return null;
		}
	}
	
	public GraphicInstance getCurrentInstance() {
		try {
			return instances.get(this.index);
		} catch (ArrayIndexOutOfBoundsException e) {
			return null;
		}
	}

	public GraphicInstance getPreviousInstance() {
		try {
			return instances.get(this.index - 1);
		} catch (ArrayIndexOutOfBoundsException e) {
			return null;
		}
	}

}