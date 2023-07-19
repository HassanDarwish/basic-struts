package basic_struts.action;

import com.opensymphony.xwork2.ActionSupport;

import basic_struts.model.MessageStore;

public class HelloWorld extends ActionSupport {
	
	private MessageStore messageStore;
	private String name;
	private String customGretting;
	
	
	public String getCustomGretting() {
		return customGretting;
	}

	public void setCustomGretting(String customGretting) {
		this.customGretting = customGretting;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MessageStore getMessageStore() {
		return messageStore;
	}

	public void setMessageStore(MessageStore messageStore) {
		this.messageStore = messageStore;
	}


	public String execute() {
		
		messageStore=new MessageStore();
		setCustomGretting(getName());
		
		return "SUCCESS";
	}
	
	
	

}
