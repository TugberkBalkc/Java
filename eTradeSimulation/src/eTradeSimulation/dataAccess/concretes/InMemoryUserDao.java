package eTradeSimulation.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import eTradeSimulation.dataAccess.abstracts.IUserDao;
import eTradeSimulation.entites.concretes.User;

public class InMemoryUserDao implements IUserDao {
	
	User user1 = new User(1,"Engin","Demiroð","demirog@gmail.com","engin123","05325323232");
	User user2 = new User(2,"Özgür","Öztürk","ozturk@gmail.com","ozgur123","05355353535");
	User user3 = new User(3,"Ahmet","Gemici","gemici@gmail.com","gemici123","05425424242");
	ArrayList<User> users = new ArrayList<>();
	public InMemoryUserDao() {
		users.add(user1);
		users.add(user2);
		users.add(user3);
	}
	@Override
	public List<User> getAll() {
		return this.users;
	}
	@Override
	public void add(User entity) {
		users.add(entity);
	}
	@Override
	public void delete(User entity) {
		users.remove(entity);
	}
	@Override
	public User getByEmail(String email) {
		User tempUser = null;
		for(User user : users) {
			if(user.getEmail() == email) {
				tempUser = user;
			}
		}
		if(tempUser == null) {
			System.out.println("<User Has not Found>");
		}
		return tempUser;
	}

	


}
