package main;

import java.util.List;
import persistence.PersistenceUtil;
import entity.Subscriber;


public class SubscriberDAO {
	
	public static void main(String[] args){
		SubscriberDAO config = new SubscriberDAO();
	}

	public SubscriberDAO(){
		createSubscriber("Tom", "secret123");
		viewSubscriber();
	}


	public void viewSubscriber(){
		List<Subscriber> subscribers = PersistenceUtil.findAllSubscribers();
		for(Subscriber s:subscribers){
			System.out.println("Subscriber "+s.getUsername()+ " exists.");
		}
	}
	
	public void createSubscriber(String name, String password){
		Subscriber subscriber = new Subscriber(name, password);
		PersistenceUtil.persist(subscriber);
		System.out.println("Subscriber registered");
	}
			

}
