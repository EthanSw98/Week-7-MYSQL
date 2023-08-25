package projects;

import projects.dao.DbConnection;

public class ProjectApp {

	public ProjectApp() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		DbConnection.getConnection();

	}

}
