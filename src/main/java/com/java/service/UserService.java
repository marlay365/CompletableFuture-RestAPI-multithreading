package com.java.service;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.web.multipart.MultipartFile;

import com.java.dto.User;

public interface UserService {
	public CompletableFuture<List<User>> saveUser(MultipartFile file) throws Exception;
	public CompletableFuture<List<User>> findAllUsers();
	public List<User> parseCSVFile(final MultipartFile file) throws Exception;
}
