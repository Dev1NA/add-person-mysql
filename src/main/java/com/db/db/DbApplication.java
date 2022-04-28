package com.db.db;

import com.db.db.repo.Repo;
import com.db.db.repo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class DbApplication implements CommandLineRunner {
	private Repo repo;
	@Autowired
	public void initRepo(Repo repo) {
		this.repo = repo;
	}

	public static void main(String[] args) {
		SpringApplication.run(DbApplication.class, args);
	}

		@Override
		public void run (String...args) throws Exception {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter user's name");
		String name = input.nextLine();

		System.out.println("Enter user's login");
		String login = input.nextLine();

		repo.save(new User(name, login));

	}
}
